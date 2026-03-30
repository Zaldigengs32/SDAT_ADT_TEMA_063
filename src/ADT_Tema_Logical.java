public abstract class ADT_Tema_Logical {
    protected String namaTema;
    protected String warnaDasar;
    protected String warnaAksen;
    protected boolean isDarkMode;

    public abstract void setNamaTema(String namaTema);
    public abstract String getNamaTema();
    
    public abstract void setWarnaDasar(String warnaDasar);
    public abstract String getWarnaDasar();
    
    public abstract void setWarnaAksen(String warnaAksen);
    public abstract String getWarnaAksen();
    
    public abstract void setDarkMode(boolean isDarkMode);
    public abstract boolean isDarkMode();

    public abstract void show();
    public abstract void display();
}