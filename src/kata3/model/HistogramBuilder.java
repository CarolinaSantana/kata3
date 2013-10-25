package kata3.model;

public class HistogramBuilder<Key> {

    Histogram<Key> histogram = new Histogram();
        
    public Histogram calculateHistogram (Key[] array){
        for (Key key : array) {
            histogram.put(key, getFrecuency(key) +1);
        }
        return histogram;
    }    
    
    private Integer getFrecuency (Key key) {
        Integer frecuency = histogram.get(key);
        if (frecuency == null){
            return 0;
        }
        return frecuency;
    }

    public Histogram getHistogram() {
        return histogram;
    }
    
    
}
