public class CDBuilder {
   public CDType buildHondaCD() {
      CDType cds = new CDType();
      cds.addItem(new Honda());
      return cds;
   }

   public CDType buildMitsubishiCD() {
      CDType cds = new CDType();
      cds.addItem(new Mitsubishi());
      return cds;
   }

   public CDType buildHyundaiCD() {
      CDType cds = new CDType();
      cds.addItem(new Hyundai());
      return cds;
   }

   public CDType buildAudiCD() {
      CDType cds = new CDType();
      cds.addItem(new Audi());
      return cds;
   }

   public CDType buildMiniCooperCD() {
      CDType cds = new CDType();
      cds.addItem(new MiniCooper());
      return cds;
   }

   public CDType buildFerrariCdType() {
      CDType cds = new CDType();
      cds.addItem(new Ferrari());
      return cds;
   }

}// End of the CDBuilder class.