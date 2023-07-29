import java.util.HashMap;
import java.util.Map;

public class RacaFactory {

    private static final Map<String, Raca> raceMap = new HashMap<>();

    static {
        raceMap.put("human", new HumanRace());
        raceMap.put("elf", new ElfRace());
        //acrescentar as outras
    }

    public Raca createRace(String raceType) {
        Raca raca = raceMap.get(raceType.toLowerCase());
        if (raca == null) {
            throw new IllegalArgumentException("Unknown race type: " + raceType);
        }
        return raca;
    }
}

