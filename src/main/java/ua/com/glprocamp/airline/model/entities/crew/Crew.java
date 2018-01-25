package ua.com.glprocamp.airline.model.entities.crew;

import ua.com.glprocamp.airline.model.entities.IBuilder;

import java.util.List;

public class Crew {

    private String pilot;
    private List<String> personal;

    public static class Builder implements IBuilder<Crew> {
        Crew crew = new Crew();

        public Builder setPersonal(List<String> personal){
            crew.personal = personal;
            return this;
        }

        public Builder setPilot(String pilot){
            crew.pilot = pilot;
            return this;
        }


        public Crew build() {
            return crew;
        }
    }


    private Crew() {
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public List<String> getPersonal() {
        return personal;
    }

    public void setPersonal(List<String> personal) {
        this.personal = personal;
    }


    @Override
    public String toString() {
        return "Crew";
    }
}
