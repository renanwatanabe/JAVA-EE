package meupackage;

public class WizardVO {
	
	private String nick;
	private Integer level;
	private String guild;

	public WizardVO(String nick, Integer level, String guild) {
		super();
		this.nick = nick;
		this.level = level;
		this.guild = guild;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getGuild() {
		return guild;
	}
	public void setGuild(String guild) {
		this.guild = guild;
	}
}