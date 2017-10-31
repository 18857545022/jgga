package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.model.PiaokeMapper;
import ssm.pojo.PiaokePojo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PiaokeServiceImpl implements  PiaokeService {
    @Autowired
    private PiaokeMapper piaokeMapper;
    /**
     * 根据查询嫖客数据库返回数据
     * 已解决问题：一人多条件均符合,会出现多条数据,进行type=10,message拼凑整合
     * @param
     * @return
     */
    public Set<PiaokePojo> getPiaoke_hour(){
        List<PiaokePojo> list_piaoke = piaokeMapper.get_hour();
        //System.out.println(list_piaoke.toString());
        List<String> list_zjhm=piaokeMapper.getZjhm_hour_count();
        Set<PiaokePojo> set=new HashSet();
        changeDate(list_piaoke, list_zjhm, set);
        return set;
    }


    public Set<PiaokePojo> getPiaoke_month(int month){
        //获取month个月内的嫖客zjhms
        List<String> list_allpiaoke = piaokeMapper.getZjhm_month(month+"");
        //System.out.println("成功1");
        //获取多条件嫖客zjhm
        List<String> list_paiokeByCount=piaokeMapper.getZjhm_month_count(month);
        //System.out.println("成功2");
        Set<PiaokePojo> set=new HashSet();
        //遍历zjhms
        for(String a_zjhm:list_allpiaoke){
            boolean flag=false;
            //根据证件号码进行查找最新记录  条件:时间最大
            for(String c_zjhm:list_paiokeByCount){
                if(c_zjhm.equals(a_zjhm)){
                    flag=true;
                }
            }
            if(flag){
                PiaokePojo piaoke=new PiaokePojo();
                String[]arr=new String[4];
                //System.out.println(month+":"+a_zjhm);
                List<PiaokePojo> list_new = piaokeMapper.getNewByZjhm(month,a_zjhm);//获取该人最新数据
                //System.out.println(list_new.toString());
                //根据证件号码、时间最大值以及类型(1,2,3,4)进行message数据的填充
                for(int i=0;i<4;i++){
                    String str=piaokeMapper.getMessageByTypeAndZjhm(month, a_zjhm, i+1);
                    //System.out.println("成功3");
                    if(str!=null){
                        arr[i]=str;
                    }
                }
                //System.out.println("成功4");
                PiaokePojo p=list_new.get(0);
                //System.out.println("成功5");
                //进行数据的piaokePojo封装
                piaoke.setId(p.getId());
                piaoke.setCjsj(p.getCjsj());
                piaoke.setXm(p.getXm());
                piaoke.setZjhm(p.getZjhm());
                piaoke.setZz(p.getZz());
                piaoke.setXb(p.getXb());
                piaoke.setMz(p.getMz());
                piaoke.setCsrq(p.getCsrq());
                piaoke.setZjlx(p.getZjlx());
                piaoke.setJg(p.getJg());
                piaoke.setLast_fh(p.getLast_fh());
                piaoke.setLast_lgbm(p.getLast_lgbm());
                piaoke.setType(10);
                piaoke.setLast_lgmc(p.getLast_lgmc());
                piaoke.setMessage(Arrays.asList(arr).toString());
                set.add(piaoke);
            }else{
                List<PiaokePojo> list = piaokeMapper.getNewByZjhm(month, a_zjhm);
                set.add(list.get(0));
            }
        }
		/*if(set.isEmpty()){
			return "0";
		}*/
        return set;
    }

    /**
     * 进行对数据的处理:一人多数据
     * @param list_piaoke
     * @param list_zjhm
     * @param set
     */
    public void changeDate(List<PiaokePojo> list_piaoke,List<String> list_zjhm,Set<PiaokePojo> set){
        for(PiaokePojo piaoke:list_piaoke){
            boolean flag=false;
            for(String zjhm:list_zjhm){
                if(piaoke.getZjhm().equals(zjhm)){
                    flag=true;
                    break;
                }
            }

            if(flag){
                List<PiaokePojo> list = piaokeMapper.getPiaokeByZjhm(piaoke.getZjhm());
                //System.out.println("0:"+list.toString());
                String [] arr=new String[4];
                PiaokePojo update_piaoke=new PiaokePojo();
                //System.out.println(update_piaoke);
                for(int i=0;i<list.size();i++){
                    PiaokePojo p=list.get(i);
                    //System.out.println("0："+list.get(i));
                    if(p.getType()==1){
                        //System.out.println("1:"+p.getMessage());
                        arr[0]=p.getMessage();
                    }else if(p.getType()==2){
                        //System.out.println("2:"+p.getMessage());
                        arr[1]=p.getMessage();
                    }else if(p.getType()==3){
                        arr[2]=p.getMessage();
                    }else if(p.getType()==4){
                        arr[3]=p.getMessage();
                    }
                    if(i==0){
                        update_piaoke.setId(p.getId());
                        update_piaoke.setCjsj(p.getCjsj());
                        update_piaoke.setXm(p.getXm());
                        update_piaoke.setZjhm(p.getZjhm());
                        update_piaoke.setZz(p.getZz());
                        update_piaoke.setXb(p.getXb());
                        update_piaoke.setMz(p.getMz());
                        update_piaoke.setCsrq(p.getCsrq());
                        update_piaoke.setZjlx(p.getZjlx());
                        update_piaoke.setJg(p.getJg());
                        update_piaoke.setLast_fh(p.getLast_fh());
                        update_piaoke.setLast_lgbm(p.getLast_lgbm());
                        update_piaoke.setType(10);
                        update_piaoke.setLast_lgmc(p.getLast_lgmc());
                    }
                    //System.out.println("总:"+Arrays.asList(arr).toString());
                }
                //System.out.println(Arrays.asList(arr).toString());
                update_piaoke.setMessage(Arrays.asList(arr).toString());
                set.add(update_piaoke);
            }else{
                set.add(piaoke);
            }
        }

    }

}
