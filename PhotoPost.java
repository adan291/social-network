import java.util.ArrayList;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private String userName;
    private String fileName;
    private String caption;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String fileName, String caption)
    {
       userName = author;
       this.fileName = fileName;
       this.caption = caption;
       timeStamp = 0;
       likes = 0;
       comments = new ArrayList<>();
    }
    
    public void like()
    {
         likes++;
    }
    
    public void unLike()
    {
         if (likes-- < 0)
        {
            likes = 0;
        }
        else
        {
            likes--;
        }
    }
    
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    public String getImageFile()
    {
        String imageFile = "";
        return imageFile;
    }
    
    public String getCaption()
    {
        return caption;
    }
    
    public long getTimeStamp()
    {
        return timeStamp;
    }
    
    public void display()
    {
        System.out.println("Usuario: " + userName);
        System.out.println("Archivo: " + fileName);
        System.out.println("Título: " + caption);
        System.out.println("Enviado hace: " + (timeString(System.currentTimeMillis())));
        System.out.println(likes + " Me gusta ");
        if(comments.size() == 0)
        {
            System.out.println("No hay ningun comentario");            
        }
        else
        {
            System.out.println("Comentarios: ");
            for(int i = 0; i < comments.size(); i++)
            {
                System.out.println(i+1 + ": " + comments.get(i));
            }
        }
    }
   
    private String timeString(long time){
        long diferencia = time - timeStamp;
        int segundos = (int)diferencia/1000;
        int minutos = segundos/60;
        int horas = minutos/60;
        minutos -= horas*60;
        segundos -= minutos*60;

        String tiempo = " ";
        if(horas != 0)
        {
            tiempo += horas + " horas ";
        }
        if(minutos != 0)
        {
            tiempo += minutos + " minutos ";
        }
        tiempo += segundos + " segundos ";
        return tiempo;        
    }
    
}