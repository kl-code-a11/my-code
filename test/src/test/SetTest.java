package test;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {
	    public static void main(String[] args) {
	        UpdateStu stu1=new UpdateStu("������",01);
	        UpdateStu stu2=new UpdateStu("���ʽ�",02);
	        UpdateStu stu3=new UpdateStu("��Ԫ��",03);
	        UpdateStu stu4=new UpdateStu("���",04);
	        TreeSet<UpdateStu> tree=new TreeSet<>();//�򼯺���Ӷ���
	        tree.add(stu1);
	        tree.add(stu2);
	        tree.add(stu3);
	        tree.add(stu4);
	        Iterator<UpdateStu> iterator= tree.iterator();
	        System.out.println("Set�����е�����Ԫ��:");
	        while(iterator.hasNext()){
	            UpdateStu stu=(UpdateStu) iterator.next();//��������
	            System.out.println(stu.getId()+" "+stu.getName());
	        }
	        iterator=tree.headSet(stu2).iterator();//��ȡ����stu2֮ǰ�Ķ���
	        System.out.println("��ȡǰ�沿�ֵļ���:");
	        while (iterator.hasNext()){
	            UpdateStu stu=(UpdateStu)iterator.next();
	            System.out.println(stu.getId()+" "+stu.getName());
	        }


	    }
	}



