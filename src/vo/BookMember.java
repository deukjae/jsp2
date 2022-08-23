package vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor	//vo Ŭ���� ��� ������Ƽ�� select ���� �ʴ´ٸ� �ʿ��մϴ�.
@ToString
public class BookMember {
	private String name;
	private String email;
	private String tel;
	private String password;
}
