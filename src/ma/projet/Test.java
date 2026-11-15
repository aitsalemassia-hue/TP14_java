package ma.projet;

import ma.projet.entities.Machine;
import ma.projet.entities.Salle;
import ma.projet.service.MachineService;
import ma.projet.service.SalleService;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SalleService salleService = new SalleService();
        MachineService machineService = new MachineService();

        // 1. Création et ajout des salles
        Salle s1 = new Salle(1, "A1", "Salle Informatique");
        Salle s2 = new Salle(2, "B2", "Salle Réseau");
        salleService.ajouter(s1);
        salleService.ajouter(s2);

        // 2. Création et ajout des machines
        Machine m1 = new Machine(1, "PC-DELL-01", new Date(), s1);
        Machine m2 = new Machine(2, "PC-HP-02", new Date(), s1);
        Machine m3 = new Machine(3, "SERV-IBM-01", new Date(), s2);
        Machine m4 =new Machine(4,"SWITCH-04",new Date(),s2);
        

        machineService.ajouter(m1);
        machineService.ajouter(m2);
        machineService.ajouter(m3);
        machineService.ajouter(m4);

        // 3. Affichage des machines de la salle A1
        System.out.println("=> Machines dans la salle A1 ");
        List<Machine> machinesA1 = machineService.getMachinesBySalle(1);
        for (int i = 0; i < machinesA1.size(); i++) {
            System.out.println(machinesA1.get(i));
        }
        System.out.println("\n");
        
        
        // 4. Affichage des machines de la salle B2
        System.out.println("=> Machines dans la salle A1 ");
        List<Machine> machinesB2 = machineService.getMachinesBySalle(2);
        for (int i = 0; i < machinesB2.size(); i++) {
            System.out.println(machinesB2.get(i));
        }
        System.out.println("\n");
        //5. Test de modificaion 
        m1.setRef("PC-DELL-PRO");
        machineService.modifier(m1);
        System.out.println("=> Après modification de m1 ");
        System.out.println(machineService.getById(1));
        System.out.println("\n");
        // 6. Test de suppression
        machineService.supprimer(m3);
        System.out.println("=>  Liste de toutes les machines après suppression ");
        List<Machine> toutes = machineService.getAll();
        for (int i = 0; i < toutes.size(); i++) {
            System.out.println(toutes.get(i));
        
        }
        System.out.println("\n");
}
}