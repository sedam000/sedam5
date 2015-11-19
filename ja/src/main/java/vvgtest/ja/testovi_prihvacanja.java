package vvgtest.ja;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class testovi_prihvacanja implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("testPrihvacanjaID")
   private testovi_prihvacanja id_test_prih;
   @org.kie.api.definition.type.Label("TestnaSkriptaID")
   private Testne_sripte id_testne_sripte;
   @org.kie.api.definition.type.Label("ZahtjevID")
   private Zahtjevi id_zahtjeva;
   @org.kie.api.definition.type.Label("naziv testa prihvacanja")
   private java.lang.String naziv;
   @org.kie.api.definition.type.Label("stabilna verzija aplikacija")
   private java.lang.String verzije_aplikacija;
   @org.kie.api.definition.type.Label("naziv aplikacije")
   private java.lang.String naziv_aplikacija;
   @org.kie.api.definition.type.Label("opis")
   private java.lang.String opis_testa_prihvacanja;
   @org.kie.api.definition.type.Label("izvjestaj o spremnosti za produkciju")
   private Izvjestaji id_izvjestaja;
   @org.kie.api.definition.type.Label("korisnik")
   private Korisnici id_korisnika;

   public testovi_prihvacanja()
   {
   }

   public java.lang.String getNaziv()
   {
      return this.naziv;
   }

   public void setNaziv(java.lang.String naziv)
   {
      this.naziv = naziv;
   }

   public java.lang.String getVerzije_aplikacija()
   {
      return this.verzije_aplikacija;
   }

   public void setVerzije_aplikacija(java.lang.String verzije_aplikacija)
   {
      this.verzije_aplikacija = verzije_aplikacija;
   }

   public java.lang.String getNaziv_aplikacija()
   {
      return this.naziv_aplikacija;
   }

   public void setNaziv_aplikacija(java.lang.String naziv_aplikacija)
   {
      this.naziv_aplikacija = naziv_aplikacija;
   }

   public java.lang.String getOpis_testa_prihvacanja()
   {
      return this.opis_testa_prihvacanja;
   }

   public void setOpis_testa_prihvacanja(
         java.lang.String opis_testa_prihvacanja)
   {
      this.opis_testa_prihvacanja = opis_testa_prihvacanja;
   }

   public vvgtest.ja.testovi_prihvacanja getId_test_prih()
   {
      return this.id_test_prih;
   }

   public void setId_test_prih(vvgtest.ja.testovi_prihvacanja id_test_prih)
   {
      this.id_test_prih = id_test_prih;
   }

   public vvgtest.ja.Testne_sripte getId_testne_sripte()
   {
      return this.id_testne_sripte;
   }

   public void setId_testne_sripte(vvgtest.ja.Testne_sripte id_testne_sripte)
   {
      this.id_testne_sripte = id_testne_sripte;
   }

   public vvgtest.ja.Zahtjevi getId_zahtjeva()
   {
      return this.id_zahtjeva;
   }

   public void setId_zahtjeva(vvgtest.ja.Zahtjevi id_zahtjeva)
   {
      this.id_zahtjeva = id_zahtjeva;
   }

   public vvgtest.ja.Izvjestaji getId_izvjestaja()
   {
      return this.id_izvjestaja;
   }

   public void setId_izvjestaja(vvgtest.ja.Izvjestaji id_izvjestaja)
   {
      this.id_izvjestaja = id_izvjestaja;
   }

   public vvgtest.ja.Korisnici getId_korisnika()
   {
      return this.id_korisnika;
   }

   public void setId_korisnika(vvgtest.ja.Korisnici id_korisnika)
   {
      this.id_korisnika = id_korisnika;
   }

   public testovi_prihvacanja(vvgtest.ja.testovi_prihvacanja id_test_prih,
         vvgtest.ja.Testne_sripte id_testne_sripte,
         vvgtest.ja.Zahtjevi id_zahtjeva, java.lang.String naziv,
         java.lang.String verzije_aplikacija, java.lang.String naziv_aplikacija,
         java.lang.String opis_testa_prihvacanja,
         vvgtest.ja.Izvjestaji id_izvjestaja, vvgtest.ja.Korisnici id_korisnika)
   {
      this.id_test_prih = id_test_prih;
      this.id_testne_sripte = id_testne_sripte;
      this.id_zahtjeva = id_zahtjeva;
      this.naziv = naziv;
      this.verzije_aplikacija = verzije_aplikacija;
      this.naziv_aplikacija = naziv_aplikacija;
      this.opis_testa_prihvacanja = opis_testa_prihvacanja;
      this.id_izvjestaja = id_izvjestaja;
      this.id_korisnika = id_korisnika;
   }

}