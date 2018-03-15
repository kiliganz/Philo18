package ur.moralmachine_altmann_ganz_schnell;


public class CardContent {

    public CardContent(int imageId, String description, String consequences){
        this.setConsequences(consequences);
        this.setDescription(description);
        this.setImageId(imageId);

    }

    private int imageId;
    private String description, consequences;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConsequences() {
        return consequences;
    }

    public void setConsequences(String consequences) {
        this.consequences = consequences;
    }
}
