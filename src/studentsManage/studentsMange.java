package studentsManage;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class studentsMange {
    public static void main(String[] args) {

        ArrayList<student> array = new ArrayList<>();

        while (true){
            System.out.println("————欢迎来到学生系统————");
            System.out.println("1.添加学生");
            System.out.println("2.修改学生");
            System.out.println("3.删除学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");
            System.out.println("请输入操作：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();


            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("修改学生");
                    break;
                case "3":
                    System.out.println("删除学生");
                    deleteStudents(array);
                    break;
                case "4":
                    System.out.println("查看学生");
                    findAllStudents(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<student> array){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号：");
        String sid = sc.nextLine();
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        System.out.println("请输入地址：");
        String address = sc.nextLine();

        student s = new student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("录入成功");
    }

    public static void findAllStudents(ArrayList<student> array){
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i=0 ; i<array.size() ; i++){
            student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());



        }



    }

    public static void deleteStudents(ArrayList<student> array){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生");
        String sid = sc.nextLine();

        for (int i=0; i<array.size() ; i++){
            student s = array.get(i);
            if (s.getSid().equals(sid)){
                array.remove(i);
                break;
            }
        }

        System.out.println("删除学生成功");
    }

}

