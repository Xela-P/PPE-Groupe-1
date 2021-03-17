package personnel;

public interface Passerelle 
{
	public GestionPersonnel getGestionPersonnel();
	public void sauvegarderGestionPersonnel(GestionPersonnel gestionPersonnel)  throws SauvegardeImpossible;
	public int insert(Ligue ligue) throws SauvegardeImpossible;
	public int insert(Employe ligue) throws SauvegardeImpossible;
	public void select_root(Employe root) throws SauvegardeImpossible;
	public void update(Employe employe) throws SauvegardeImpossible;
	public void set_admin(Employe employe) throws SauvegardeImpossible;
	public void remove(Employe employe) throws SauvegardeImpossible;
	public void remove(Ligue ligue) throws SauvegardeImpossible;
}
