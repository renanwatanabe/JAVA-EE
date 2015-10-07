package meupackage;

public class WizardVO {
	private Long id;
	private String nick;
	private Integer level;
	private String guild;

	public WizardVO(){
		
	}
	public WizardVO(Long id,String nick, Integer level, String guild) {
		super();
		this.id = id;
		this.nick = nick;
		this.level = level;
		this.guild = guild;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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