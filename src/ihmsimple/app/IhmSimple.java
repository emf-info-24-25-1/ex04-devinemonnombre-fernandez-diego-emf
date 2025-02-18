package ihmsimple.app;

import ihmsimple.ctrl.Controller;
import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;

public class IhmSimple {
    
    /**
     * Méthode principale de l'application qui instancie les objets MVC et les relie
     * entre eux.
     * Voir le diagramme de séquence pour l'implémentation e cette méthode.
     * 
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Controller refCtrl = new Controller();
        ServiceDevine refServiceDevine = new ServiceDevine();
        View refView = new View();
        refCtrl.setRefView(refView);
        refCtrl.setRefServiceDevine(refServiceDevine);
        refServiceDevine.setRefCtrl(refCtrl);
        refView.setRefCtrl(refCtrl);
        refCtrl.start();
    }

}
