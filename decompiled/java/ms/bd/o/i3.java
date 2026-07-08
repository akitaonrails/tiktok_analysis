package ms.bd.o;

import android.view.MotionEvent;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes14.dex */
public class i3 implements e3 {
    public final LinkedList<double[]> LL = new LinkedList<>();

    @Override // ms.bd.o.e3
    public final synchronized void LIZ(MotionEvent motionEvent, String str) {
        if (this.LL.size() >= 10) {
            this.LL.removeFirst();
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            this.LL.add(new double[]{motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getPointerCount() > 0 ? motionEvent.getToolType(0) : 1.0d, motionEvent.getFlags(), motionEvent.getDeviceId()});
        }
    }
}
