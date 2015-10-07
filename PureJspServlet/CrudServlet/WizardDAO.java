package meupackage;

import java.util.ArrayList;
import java.util.List;

public class WizardDAO {

	{
		listaWizards = new ArrayList<WizardVO>();
		listaWizards.add(new WizardVO(1L,"Triat",99,"Dark Elves"));
		listaWizards.add(new WizardVO(2L,"Brenda",79,"Insanity"));
		listaWizards.add(new WizardVO(3L,"Flowers",99,"Dark Elves"));
		listaWizards.add(new WizardVO(4L,"Nishino",37,"Cookers"));
	}
	
	private static List<WizardVO> listaWizards;
	
	
	
	public List<WizardVO> buscarWizards(String Nick, String Level, String guild){
		return listaWizards;
	}
	
	public WizardVO obterWizardPor(Long id){
		WizardVO wizVO = null;
		for(WizardVO wiz : listaWizards){
			if(wiz.getId().equals(id)){
				wizVO = wiz;
				break;
			}
		}
		return wizVO;
	}
	
	public void deletarWizard(Long id){
		for(WizardVO wiz : listaWizards){
			if(wiz.getId().equals(id)){
				listaWizards.remove(wiz);
				break;
			}
		}
	}
}