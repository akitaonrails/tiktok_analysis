package zoo;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes34.dex */
public abstract class a {
    public final Context LIZ;
    public MotionEvent LIZIZ;
    public MotionEvent LIZJ;
    public float LIZLLL;
    public float LJ;
    public boolean LJFF;

    public abstract void LIZ(MotionEvent motionEvent, int i);

    public abstract void LIZIZ(MotionEvent motionEvent, int i);

    public void LIZLLL() {
        MotionEvent motionEvent = this.LIZIZ;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.LIZIZ = null;
        }
        MotionEvent motionEvent2 = this.LIZJ;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.LIZJ = null;
        }
        this.LJFF = false;
    }

    public a(Context context) {
        this.LIZ = context;
    }

    public final void LIZJ(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (!this.LJFF) {
            LIZIZ(motionEvent, action);
        } else {
            LIZ(motionEvent, action);
        }
    }

    public void LJ(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.LIZIZ;
        MotionEvent motionEvent3 = this.LIZJ;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.LIZJ = null;
        }
        this.LIZJ = MotionEvent.obtain(motionEvent);
        motionEvent.getEventTime();
        motionEvent2.getEventTime();
        this.LIZLLL = motionEvent.getPressure(motionEvent.getActionIndex());
        this.LJ = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
