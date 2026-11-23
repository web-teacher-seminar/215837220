public class Pair {
    public String key;
    public int value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Pair(String key, int val) {
        this.key = key;
        value = val;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        return key + "=" + value;
    }
}
