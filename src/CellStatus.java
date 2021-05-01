public enum CellStatus {
    WATER("🌊"), EMPTY("🌫"), HITED_WARSHIP("🔥"), WARSHIP("⚓️"), NIMBUS("🔳");

    private String name;

    CellStatus(String name) {
        this.name = name;
    }
}
