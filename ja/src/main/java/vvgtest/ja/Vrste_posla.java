package vvgtest.ja;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Vrste_posla implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Vrsta posla")
   private java.lang.Integer id_vrste_posla;
   @org.kie.api.definition.type.Label(value = "Zahtjevi")
   private java.lang.String zahtjevi;
   @org.kie.api.definition.type.Label(value = "Analiza")
   private java.lang.String analiza;
   @org.kie.api.definition.type.Label(value = "Testiranje")
   private java.lang.String testiranje;
   @org.kie.api.definition.type.Label(value = "Programiranje")
   private java.lang.String programiranje;
   @org.kie.api.definition.type.Label(value = "Odabrano")
   private boolean odabrano;

   public Vrste_posla()
   {
   }

   public java.lang.Integer getId_vrste_posla()
   {
      return this.id_vrste_posla;
   }

   public void setId_vrste_posla(java.lang.Integer id_vrste_posla)
   {
      this.id_vrste_posla = id_vrste_posla;
   }

   public java.lang.String getZahtjevi()
   {
      return this.zahtjevi;
   }

   public void setZahtjevi(java.lang.String zahtjevi)
   {
      this.zahtjevi = zahtjevi;
   }

   public java.lang.String getAnaliza()
   {
      return this.analiza;
   }

   public void setAnaliza(java.lang.String analiza)
   {
      this.analiza = analiza;
   }

   public java.lang.String getTestiranje()
   {
      return this.testiranje;
   }

   public void setTestiranje(java.lang.String testiranje)
   {
      this.testiranje = testiranje;
   }

   public java.lang.String getProgramiranje()
   {
      return this.programiranje;
   }

   public void setProgramiranje(java.lang.String programiranje)
   {
      this.programiranje = programiranje;
   }

   public boolean isOdabrano()
   {
      return this.odabrano;
   }

   public void setOdabrano(boolean odabrano)
   {
      this.odabrano = odabrano;
   }

   public Vrste_posla(java.lang.Integer id_vrste_posla,
         java.lang.String zahtjevi, java.lang.String analiza,
         java.lang.String testiranje, java.lang.String programiranje,
         boolean odabrano)
   {
      this.id_vrste_posla = id_vrste_posla;
      this.zahtjevi = zahtjevi;
      this.analiza = analiza;
      this.testiranje = testiranje;
      this.programiranje = programiranje;
      this.odabrano = odabrano;
   }

}