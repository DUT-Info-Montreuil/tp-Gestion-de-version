package fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.quetes;

import fr.iut.montreuil.S05_R08.tp01_GestionVersion.controleur.SoundPlayer;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.Joueur;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.acteurs.Acteur;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.acteurs.Pnj;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.items.Armes.Shuriken;
import fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.ressources.Ressource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class QuestLine {
    private ObservableList<Quete> quetes;
    private Joueur joueur;

    public QuestLine(Joueur j){
        joueur = j;
        quetes = FXCollections.observableArrayList();
        quetes.add(new TalkQuete("Chapitre 0 - Les titans approchent", "Qu'est-ce que veut le commandant ? Une mission pendant l'attaque des Titans ?", 10, "Équipement tridimensionnel", 1, "Eren Yeager"));
        quetes.add(new TalkQuete("Chapitre 1 - La bataille commence", "Si vous voulez survivre, il va falloir maîtriser votre équipement tridimensionnel et affronter les Titans. Prêt à vous battre ?", 5, "Tuer des Titans", 1, "Mikasa Ackerman"));
        quetes.add(new TalkQuete("Chapitre 1 - La bataille commence", "'Hé là-bas, soldat ! Vous avez besoin de ravitaillement. Allez voir le logisticien pour obtenir du gaz et des lames.'\nApprovisionnez-vous au magasin.", 5, "Gaz et lames", 1, "Logisticien"));
        quetes.add(new LootQuete("Chapitre 1 - La bataille commence", "'Nous avons besoin de ressources pour réparer nos équipements. Allez chercher du matériel dans la forêt.'\nCollectez des matériaux dans la forêt.", 10, "Bois", 1, "Forêt", 3));
        quetes.add(new TalkQuete("Chapitre 1 - La bataille commence", "'Nous avons besoin de ces matériaux pour réparer notre équipement tridimensionnel. Apportez-les au forgeron.'\nApportez les matériaux au forgeron.", 40, "Matériaux", 3, "Forgeron"));

        quetes.add(new TalkQuete("Chapitre 2 - Mystères des Titans", "Interrogez le prisonnier au sous-sol sur les secrets des Titans.", 10, "", 0, "Prisonnier"));
        quetes.add(new TalkQuete("Chapitre 2 - Mystères des Titans", "Interrogez le chercheur sur les découvertes récentes concernant les Titans.", 10, "", 0, "Chercheur"));
        quetes.add(new KillQuete("Chapitre 2 - Mystères des Titans", "'Je peux vous révéler des informations sur les Titans, mais d'abord, tuez 2 Titans errants.'\nTuez 2 Titans errants.", 5, "", 0, "Titan errant", 2));
        quetes.add(new KillQuete("Chapitre 2 - Mystères des Titans", "Tuez 2 Titans anormaux.", 5, "", 0, "Titan anormal", 2));
        quetes.add(new TalkQuete("Chapitre 2 - Mystères des Titans", "Rapportez les informations aux chercheurs.", 50, "Rapport", 3, "Chercheur"));

        quetes.add(new TalkQuete("Chapitre 3 - Confrontation avec le Titan colossal", "'Nous devons découvrir la vérité derrière le Titan colossal. Interrogez le commandant sur notre prochaine mission.'", 5, "Mission spéciale", 1, "Commandant Erwin"));
        quetes.add(new KillQuete("Chapitre 3 - Confrontation avec le Titan colossal", "'Pour prouver votre valeur, tuez 2 Titans blindés au nord.'\nTuez 2 Titans blindés.", 5, "", 0, "Titan blindé", 2));
        quetes.add(new TalkQuete("Chapitre 3 - Confrontation avec le Titan colossal", "Rapportez au commandant après avoir éliminé les Titans blindés.", 100, "Rapport de mission", 3, "Commandant Erwin"));
        quetes.add(new KillQuete("Chapitre 3 - Confrontation avec le Titan colossal", "'Les Titans blindés sont vaincus ? Impressionnant. Maintenant, éliminez 3 Titans colossaux pour assurer notre survie.'\nTuez 3 Titans colossaux.", 10, "", 0, "Titan colossal", 3));
        quetes.add(new TalkQuete("Chapitre 3 - Confrontation avec le Titan colossal", "Rapportez au commandant après avoir éliminé les Titans colossaux.", 150, "Rapport de mission", 2, "Commandant Erwin"));
        quetes.add(new LootQuete("Chapitre 3 - Confrontation avec le Titan colossal", "'Nos équipements sont endommagés. Obtenez des matériaux pour les réparer.'\nCollectez 3 matériaux de réparation.", 10, "", 0, "Matériaux de réparation", 3));
        quetes.add(new TalkQuete("Chapitre 3 - Confrontation avec le Titan colossal", "Rapportez les matériaux de réparation au commandant.", 200, "Matériaux de réparation", 1, "Commandant Erwin"));

        quetes.add(new TalkQuete("Chapitre 4 - Au-delà du mur", "'Un groupe de Titans se dirige vers le mur. Rendez-vous à l'extérieur et aidez-nous à les arrêter.'\nRejoignez le groupe de combat au mur.", 5, "0", 0, "Chef d'escouade"));
        quetes.add(new KillQuete("Chapitre 4 - Au-delà du mur", "'Tuez les deux Titans aux portes du poste avancé !'\nTuez 2 Titans aux portes du poste avancé.", 10, "", 0, "Titan", 2));
        quetes.add(new TalkQuete("Chapitre 4 - Au-delà du mur", "Rapportez au chef d'escouade après avoir sécurisé le poste avancé.", 50, "Ravitaillement", 1, "Chef d'escouade"));
        quetes.add(new LootQuete("Chapitre 4 - Au-delà du mur", "'Notre défense a besoin de renforts. Coupez 4 bûches pour réparer les barricades.'\nCoupez 4 bûches.", 15, "", 0, "Bûches", 4));
        quetes.add(new TalkQuete("Chapitre 4 - Au-delà du mur", "Rapportez les bûches au chef d'escouade.", 50, "Ravitaillement", 1, "Chef d'escouade"));
        quetes.add(new KillQuete("Chapitre 4 - Au-delà du mur", "'Tuez 3 Titans enragés qui menacent notre position.'\nTuez 3 Titans enragés.", 10, "", 0, "Titan enragé", 3));
        quetes.add(new TalkQuete("Chapitre 4 - Au-delà du mur", "Rapportez au chef d'escouade après avoir éliminé les Titans enragés.", 200, "Ravitaillement", 3, "Chef d'escouade"));
        quetes.add(new TalkQuete("Chapitre 4 - Au-delà du mur", "'Vous avez tenu bon ! Mais il y a plus à découvrir à l'ouest du mur. Continuez d'explorer.'\nExplorez l'ouest du mur pour obtenir des informations.", 10, "", 0, "Éclaireur"));
        quetes.add(new TalkQuete("Chapitre 4 - Au-delà du mur", "'J'ai trouvé le livre de l'histoire ancienne ! Je dois le ramener. Retournez au mur.'\nRapportez le livre de l'histoire ancienne.", 100, "Livre de l'histoire ancienne", 2, "Éclaireur"));
        quetes.add(new TalkQuete("Chapitre 4 - Au-delà du mur", "'Vous avez le livre de l'histoire ancienne ! C'est incroyable ! Le commandant doit être informé.'\nRapportez au commandant après avoir trouvé le livre de l'histoire ancienne.", 30, "Rapport de mission", 1, "Commandant Erwin"));

        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "'Vous avez le livre de l'histoire ancienne... Laissez-moi le toucher.'\n*Le commandant examine le livre...*\n'Le monde a caché un sens primordial à la naissance... Comment est-ce possible ?'\nDiscutez avec le commandant.", 30, "", 0, "Commandant Erwin"));
        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "'J'ai toujours senti qu'il manquait quelque chose. Quelque chose d'essentiel. Tout cela doit être lié aux visions à l'ouest. Allez enquêter.'\nDirigez-vous vers l'ouest et menez une enquête.", 30, "", 0, "Éclaireur"));
        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "Parlez à la fille aux cheveux sales.", 30, "", 0, "Fille aux cheveux sales"));
        quetes.add(new KillQuete("Chapitre 5 - Révélation sur les Titans", "'Je n'aurais jamais pensé demander de l'aide à quelqu'un comme vous, mais je n'ai pas le choix... Les Titans commencent à envahir mon espace !'\nTuez 2 Titans enragés.", 10, "", 0, "Titan enragé", 2));
        quetes.add(new KillQuete("Chapitre 5 - Révélation sur les Titans", "'Qu'est-ce que c'est que ce monument ? Personne n'a remarqué ça ? Je vais essayer de dégager la zone et en parler à la fille.'\nTuez 2 Titans anormaux au nord de la maison de la fille.", 10, "", 0, "Titan anormal", 2));
        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "Retournez voir la fille aux cheveux sales.", 200, "Nourriture", 3, "Fille aux cheveux sales"));
        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "'Un monument à l'ouest ? Bien sûr ! Seul le détenteur du livre de l'histoire ancienne ressent ce que les autres ignorent ! Vous êtes l'élu !'\nDiscutez avec le commandant après avoir découvert le monument.", 30, "", 0, "Commandant Erwin"));
        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "'Il est temps de sauver ce monde. Entrez dans le monument ! Prenez le portail à l'ouest de celui-ci. Bonne chance, héros...'\nTuez l'esprit maléfique dans le cauchemar.", 10, "Niveau", 1, "Esprit maléfique"));
        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "'Je dois sortir d'ici au plus vite !'\nAllez parler à l'esprit du cauchemar.", 30, "", 0, "Esprit du cauchemar"));
        quetes.add(new TalkQuete("Chapitre 5 - Révélation sur les Titans", "'Héros, vous avez sauvé ce monde du cauchemar. L'humanité a retrouvé ce qui lui avait été volé. La vision. Vous avez redonné vie à ce monde. Merci.'\nRemerciez l'esprit.", 1000, "Niveau", 1, "Esprit"));

    }


    public ObservableList<Quete> getQuetes() {
        return quetes;
    }

    public void completeQuest(){
        if(getQueteActuelle().getRecompenseObjet().equals("Shuriken"))
            joueur.setArmeDistance(new Shuriken());
        if(getQueteActuelle().getRecompenseObjet().equals("Niveau"))
            joueur.lvlUp();
        else if(!getQueteActuelle().getRecompenseObjet().equals(""))
            joueur.getInventaire().ajouterObjet(getQueteActuelle().getRecompenseObjet(), getQueteActuelle().getQuantiteObjet());
        joueur.getInventaire().ajouterOr(getQueteActuelle().getRecompenseOr());
        quetes.remove(0);
        SoundPlayer.playSpecificSound("quest.wav");
    }

    public Quete getQueteActuelle(){
        if(quetes.isEmpty())
            return null;
        return quetes.get(0);
    }

    public void killTracker(Acteur a){
        if(!(getQueteActuelle() instanceof KillQuete))
            return;
        KillQuete quete = (KillQuete) getQueteActuelle();
        if(a.getClass().getSimpleName().equals(quete.getEnnemyToKill())){
            quete.addCount(1);
        }
        if(quete.getCount()>=quete.getNbKills()){
            completeQuest();
        }
    }

    public void ressourceTracker(Ressource r) {
        if(!(getQueteActuelle() instanceof LootQuete))
            return;
        LootQuete quete = (LootQuete) getQueteActuelle();
        if(r.getClass().getSimpleName().equals(quete.getRessourceToGet())){
            quete.addCount(1);
        }
        if(quete.getCount()>=quete.getNbRessource()){
            completeQuest();
        }
    }

    public void talkTracker(Acteur a) {
        if(!(getQueteActuelle() instanceof TalkQuete))
            return;
        TalkQuete quete = (TalkQuete) getQueteActuelle();
        if(a instanceof Pnj && ((Pnj) a).getNom().equals(quete.getPnjName())) {
            completeQuest();
        }
    }
}
