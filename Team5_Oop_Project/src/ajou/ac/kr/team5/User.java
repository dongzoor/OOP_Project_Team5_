package ajou.ac.kr.team5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class User{
	
	
	public void Save(ArrayList<Member> memberlist) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("user.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(memberlist);
        
        fos.close();
        oos.close();
        
	}
	
	public ArrayList<Member> Load (ArrayList<Member> memberlist) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("user.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        memberlist = (ArrayList<Member>)ois.readObject();
        
        fis.close();
        ois.close();
       
        return memberlist;
	
	}
	
	public static void show(ArrayList<Member> memberlist) {
       
        System.out.println(" 전체 학생 출력");
        System.out.println("==========================================================");
        for (Member student : memberlist) {
            System.out.format("id : %s 이름 : %s 나이 : %d \n",student.getId(), student.getName(), student.getAge());
        }
        System.out.println("==========================================================");
    }
	public static void main(String[] args) throws Exception {
		
		ArrayList<Member> memberlist = new ArrayList();
		ArrayList<Member> checklist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		User user = new User();
		String id;
		String password;
		
		System.out.println("Hello, Student!");
		System.out.print("ID: ");
		id = sc.nextLine();
		System.out.print("PASSWORD: ");
		password = sc.nextLine();
		

		if(checklist.contains(id) == false){ //가입이 안돼있으면,
			
			System.out.print("NAME: ");
			String name = sc.next();
			
			System.out.print("AGE: ");
			int age = sc.nextInt();
			
			Member member = new Member(id,password,name,age);
			
			memberlist.add(member);

			user.Save(memberlist);
		}
			
		user.show(memberlist);
		
	}

}