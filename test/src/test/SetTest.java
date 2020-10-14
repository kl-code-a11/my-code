package test;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {
	    public static void main(String[] args) {
	        UpdateStu stu1=new UpdateStu("武则天",01);
	        UpdateStu stu2=new UpdateStu("狄仁杰",02);
	        UpdateStu stu3=new UpdateStu("李元芳",03);
	        UpdateStu stu4=new UpdateStu("李白",04);
	        TreeSet<UpdateStu> tree=new TreeSet<>();//向集合添加对象
	        tree.add(stu1);
	        tree.add(stu2);
	        tree.add(stu3);
	        tree.add(stu4);
	        Iterator<UpdateStu> iterator= tree.iterator();
	        System.out.println("Set集合中的所有元素:");
	        while(iterator.hasNext()){
	            UpdateStu stu=(UpdateStu) iterator.next();//遍历集合
	            System.out.println(stu.getId()+" "+stu.getName());
	        }
	        iterator=tree.headSet(stu2).iterator();//截取排在stu2之前的对象
	        System.out.println("截取前面部分的集合:");
	        while (iterator.hasNext()){
	            UpdateStu stu=(UpdateStu)iterator.next();
	            System.out.println(stu.getId()+" "+stu.getName());
	        }


	    }
	}



