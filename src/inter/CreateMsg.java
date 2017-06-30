package inter;

import java.util.Date;

public abstract class CreateMsg {
	
	public String user;
	public String msg;
	
	public CreateMsg(String user) {
		this.user = user;
	}

	public String createMsg(String msg) {
		return this.msg = String.format("%s (%s): %s", new Date(), this.user, msg);
	}
	
	
}
