package meupackage;

import java.util.ArrayList;
import java.util.List;

public class WizardDAO {

	public List<WizardVO> obterMassaWizards(){
		List<WizardVO> listaWizards = new ArrayList<WizardVO>();
		listaWizards.add(new WizardVO("Triat",99,"Dark Elves"));
		listaWizards.add(new WizardVO("Brenda",79,"Insanity"));
		listaWizards.add(new WizardVO("Flowers",99,"Dark Elves"));
		return listaWizards;
	}
	
	public List<WizardVO> buscarWizards(String Nick, String Level, String guild){
		List<WizardVO> listaWizards = new ArrayList<WizardVO>();
		listaWizards.add(new WizardVO("Triat",99,"Dark Elves"));
		return listaWizards;
	}
}
