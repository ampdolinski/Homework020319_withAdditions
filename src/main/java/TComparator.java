import lombok.AllArgsConstructor;

import java.util.Comparator;

/**
 * @author Jacek Herrmann
 * Date: 2019-03-02
 */
@AllArgsConstructor
public class TComparator implements Comparator<Number> {
    private boolean rise;

    public int compare(Number o1, Number o2) {
        return rise ? compareVersion(o1, o2) : compareVersion(o2, o1);
    }

    private int compareVersion(Number o1, Number o2) {
        if (o1 instanceof Integer) {
            return Integer.compare(o1.intValue(), o2.intValue());
        }
        if (o1 instanceof Byte) {
            return Byte.compare(o1.byteValue(), o2.byteValue());
        }
        if (o1 instanceof Float) {
            return Float.compare(o1.floatValue(), o2.floatValue());
        }
        if (o1 instanceof Long) {
            return Long.compare(o1.longValue(), o2.longValue());
        }
        if (o1 instanceof Double) {
            return Double.compare(o1.doubleValue(), o2.doubleValue());
        }
        if (o1 instanceof Short) {
            return Short.compare(o1.shortValue(), o2.shortValue());
        }
        return 0;
    }
}
