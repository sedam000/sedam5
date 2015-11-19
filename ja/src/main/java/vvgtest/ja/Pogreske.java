package vvgtest.ja;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Pogreske implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("PogreskaID")
   private java.lang.Long id_pogreske;
   @org.kie.api.definition.type.Label("naslov pogreske")
   private java.lang.String naslov_pogreske;
   @org.kie.api.definition.type.Label("opis pogreske")
   private java.lang.String opis_pogreske;
   @org.kie.api.definition.type.Label("pogreska status")
   private Statusi_pogresaka id_sts_pogreske;
   @org.kie.api.definition.type.Label("programer,analiticar ")
   private java.lang.String zaduzena_osoba;
   @org.kie.api.definition.type.Label("verzija")
   private java.lang.String verzija_aplikacije;
   @org.kie.api.definition.type.Label("TestnaSkriptaID")
   private Testne_sripte id_test_skripte;
   @org.kie.api.definition.type.Label("Testni korak")
   private java.lang.String testni_korak;
   @org.kie.api.definition.type.Label(value = "obavijstiti")
   private java.lang.String obavijestiti;

   public Pogreske()
   {
   }

   public java.lang.Long getId_pogreske()
   {
      return this.id_pogreske;
   }

   public void setId_pogreske(java.lang.Long id_pogreske)
   {
      this.id_pogreske = id_pogreske;
   }

   public java.lang.String getNaslov_pogreske()
   {
      return this.naslov_pogreske;
   }

   public void setNaslov_pogreske(java.lang.String naslov_pogreske)
   {
      this.naslov_pogreske = naslov_pogreske;
   }

   public java.lang.String getOpis_pogreske()
   {
      return this.opis_pogreske;
   }

   public void setOpis_pogreske(java.lang.String opis_pogreske)
   {
      this.opis_pogreske = opis_pogreske;
   }

   public java.lang.String getZaduzena_osoba()
   {
      return this.zaduzena_osoba;
   }

   public void setZaduzena_osoba(java.lang.String zaduzena_osoba)
   {
      this.zaduzena_osoba = zaduzena_osoba;
   }

   public java.lang.String getVerzija_aplikacije()
   {
      return this.verzija_aplikacije;
   }

   public void setVerzija_aplikacije(java.lang.String verzija_aplikacije)
   {
      this.verzija_aplikacije = verzija_aplikacije;
   }

   public java.lang.String getTestni_korak()
   {
      return this.testni_korak;
   }

   public void setTestni_korak(java.lang.String testni_korak)
   {
      this.testni_korak = testni_korak;
   }

   public vvgtest.ja.Statusi_pogresaka getId_sts_pogreske()
   {
      return this.id_sts_pogreske;
   }

   public void setId_sts_pogreske(vvgtest.ja.Statusi_pogresaka id_sts_pogreske)
   {
      this.id_sts_pogreske = id_sts_pogreske;
   }

   public vvgtest.ja.Testne_sripte getId_test_skripte()
   {
      return this.id_test_skripte;
   }

   public void setId_test_skripte(vvgtest.ja.Testne_sripte id_test_skripte)
   {
      this.id_test_skripte = id_test_skripte;
   }

   public java.lang.String getObavijestiti()
   {
      return this.obavijestiti;
   }

   public void setObavijestiti(java.lang.String obavijestiti)
   {
      this.obavijestiti = obavijestiti;
   }

   public Pogreske(java.lang.Long id_pogreske, java.lang.String naslov_pogreske,
         java.lang.String opis_pogreske,
         vvgtest.ja.Statusi_pogresaka id_sts_pogreske,
         java.lang.String zaduzena_osoba, java.lang.String verzija_aplikacije,
         vvgtest.ja.Testne_sripte id_test_skripte,
         java.lang.String testni_korak, java.lang.String obavijestiti)
   {
      this.id_pogreske = id_pogreske;
      this.naslov_pogreske = naslov_pogreske;
      this.opis_pogreske = opis_pogreske;
      this.id_sts_pogreske = id_sts_pogreske;
      this.zaduzena_osoba = zaduzena_osoba;
      this.verzija_aplikacije = verzija_aplikacije;
      this.id_test_skripte = id_test_skripte;
      this.testni_korak = testni_korak;
      this.obavijestiti = obavijestiti;
   }

}