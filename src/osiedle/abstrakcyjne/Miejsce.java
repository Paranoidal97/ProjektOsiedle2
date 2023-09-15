package osiedle.abstrakcyjne;

import java.util.UUID;

public abstract class Miejsce {
    private int powierzchnia;
    private String id;

    public Miejsce(int powierzchnia) {
        this.powierzchnia = powierzchnia;
        this.id = UUID.randomUUID().toString();
    }

    public int getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(int powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public String getId() {
        return id;
    }

}
