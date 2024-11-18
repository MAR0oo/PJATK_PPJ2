package GUI02_home;

public interface TerrainMap {
    enum TerrainType{
        Desert,
        Ocean,
        Mountain
    }

    void changeTerrain(TerrainType type);
    void createCatastrophe();

}
