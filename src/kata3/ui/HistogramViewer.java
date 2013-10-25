package kata3.ui;

import kata3.model.Histogram;

public class HistogramViewer<Key> {
    
    Histogram<Key> histogram;

    public HistogramViewer(Histogram histogram) {
        this.histogram = histogram;
    }

    public void show(){
        for (Key key : histogram.keySet()) {
            System.out.println(key + ":" + histogram.get(key));
            
            
        }
    }
    
}
