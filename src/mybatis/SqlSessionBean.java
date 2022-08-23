package mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionBean {
/*
 * Mybatais ���̺귯���� SqlSession Ŭ������ SQL ����޼ҵ带 �����մϴ�.
 * SqlSesseionFactoryBuilder --> SqlSessionFactory ��ü ����
 *  --> dao Ŭ�������� SqlSession ��ü ����  : Ŭ���� ��������
 * 	SqlSession ��ü�� db sql�� �����մϴ�.
 * 
 * https://mybatis.org/mybatis-3/ko/getting-started.html ����� �ۼ��մϴ�.
 * String resource = "org/mybatis/example/mybatis-config.xml";
   InputStream inputStream = Resources.getResourceAsStream(resource);
   SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
 * 
 */
	public static SqlSessionFactory sqlSessionFactory;
	static {   //�������� static ������ ����˴ϴ�.
		String resource = "mybatis/mybatis-config.xml";    //mybatis ��������
		InputStream inputStream=null;			//������ �б����� �Է� ��Ʈ��
	
	
		try {
			inputStream = Resources.getResourceAsStream(resource);   //���ҽ� ���� �о����
		}catch(IOException e) {
			System.out.println("mybatis ���� ���� �б� �����Դϴ�.");
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);   
		//�о�� ���Ϸ� factory ����
	}
	
	public static SqlSessionFactory getSessionFactory() {    
		//**������ sqlSessionFactory �����ϴ� �޼ҵ� -> sql �����ϴ� ��ü
		return sqlSessionFactory;
	}
}
