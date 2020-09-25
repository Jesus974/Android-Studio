/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essai;

/**
 *
 * @author Daniel
 */
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class SerializerPersonneXML {

  public static void main(final String argv[]) {
    final Personne personne = new Personne("Dupond", "Jean", 175, new Date());
    personne.addChanteur(new Personne("Collins", "Phil", 170, new Date()));
    //personne.addChanteur("trust");
    XMLEncoder encoder = null;
    
    // mettre l'objet personne au formal xml
    try {
      encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("personne.xml")));
        System.out.println("Répertoire courant " + System.getProperty("user.dir")); // pour info
      encoder.writeObject(personne);
      encoder.flush();
    } 
    catch (final java.io.IOException e) {
      e.printStackTrace();
    } 
    finally {
      if (encoder != null) {
        encoder.close();
      }
    }
    
    // récupérer le contenu du fichier xml
     XMLDecoder decoder = null;

    try {
      decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("personne.xml")));
      Personne personne2 = (Personne) decoder.readObject();
      System.out.println(personne2);
    } 
    catch (final Exception e) {
      e.printStackTrace();
    } 
    finally {
      if (decoder != null) {
        decoder.close();
      }
    }
    
  }
}
