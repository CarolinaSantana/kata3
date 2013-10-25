package kata3.control;

import kata3.model.HistogramBuilder;
import kata3.ui.HistogramViewer;

public class HistogramControl<Key> {

    public void execute (Key[] array) {
        HistogramBuilder<Key> builder = new HistogramBuilder();
        builder.calculateHistogram(array);
        HistogramViewer<Key> viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
    
}
