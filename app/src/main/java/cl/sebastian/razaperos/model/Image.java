package cl.sebastian.razaperos.model;

public class Image {

    private String image;
    private String breedname;

    public Image(String image, String breedname) {
        this.image = image;
        this.breedname = breedname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBreedname() {
        return breedname;
    }

    public void setBreedname(String breedname) {
        this.breedname = breedname;
    }
}
