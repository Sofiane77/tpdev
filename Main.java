package org.ldv.sio;

public class Main {


    private static Adresse AdresseDomicile;
    private static Adresse AdresseLivraison;

    public static void main(String[] args, Object I) {
   AdresseDomicile = new Adresse ( rue:"3rue du clocher",ville:"Melun",codePostale: 77000);
   AdresseLivraison = new Adresse () ; rue:"2rue du cimetiere",ville:"Paris",codePostale: 75001;
   Client Un = new Client (nom:"Djikstra", prenom:"esger";Domicile,Livraison);

    System.out.println(Un.toString());

  Adresse dom2 =  new Adresse () rue:"14rue du Port", ville:"Nanterre",codePostale:92000);
    Client deux = new Client (nom:"Kernighan", prenom:"Brian";Domicile,Livraison null);

    if (deux.getLivraison()  I=null);
        System.out.println(deux.toString());
    else{
      System.out.println(deux.Domicile());
    }

    }
  }
}
