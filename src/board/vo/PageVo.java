package board.vo;

import lombok.Getter;
@Getter
public class PageVo {		//�Խ����� ��������ȣ ����� ����� ���� �ʿ��� ������ ��� �����մϴ�. (endPage,endNo �� ��������)
	private int currentPage;		//���� ������
	private int totalCount;			//���� ��ü ����. dao�� �޼ҵ� �ۼ��߽��ϴ�.
	private int pageSize;			//�Ѱ� �������� ������ �� ����
	
	private int totalPage;			//��ü ������ ����. totalCount�� pageSize �� ����մϴ�.
	private int startPage;			//���� ������ ���� �̿��ؼ� ����մϴ�.
	private int endPage;			//�� �ʿ����� �ʽ��ϴ�. .startPage ~ endPage �� ������ ����� ����ϴ�.

	private int startNo;
	private int endNo;
	
	public PageVo(int currentPage, int totalCount, int pageSize) {   //�ܺ�(�����Ͻ�����)���� �����ϰ� ���޵Ǵ°�.
		this.totalCount=totalCount;
		this.pageSize=pageSize;
		
		//totalCount = 367��, pageSize=10, totalPage =37
		//totalCount = 7��, pageSize=10, totalPage =1
		//totalCount = 200��, pageSize=10, totalPage =20
		totalPage = (int)Math.ceil((double)totalCount/pageSize); //(totalCount-1)/pageSize + 1; ��ſ� �ڸ��ø��޼ҵ� ceil ���
		
		//���������� ����(1~totalPage) �� ��ȿ���� üũ 
		this.currentPage= (currentPage < 1)? 1:currentPage;
		this.currentPage= (currentPage > totalPage)? totalPage:this.currentPage;
		
		//����Ŭ�� rownum ����� ��
		startNo=(this.currentPage-1)*pageSize+1;
		endNo = startNo +(pageSize-1);
		
		startPage = (this.currentPage-1)/10*10+1;		 //��������ȣ ����Ʈ 10���� 
		//���� �������� 57 , startPage =51
		//���� �������� 7 , startPage =1
		//���� �������� 156 , startPage =151
		//���� �������� 160 , startPage =151
		
		
		endPage = startPage+9;
		endPage = (endPage > totalPage) ? totalPage:endPage;
		System.out.println("Ȯ�� :" + this.currentPage +"/" + this.totalPage);
	}
}



