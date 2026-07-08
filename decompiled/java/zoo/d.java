package zoo;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes34.dex */
public abstract class d extends a {
    public final float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;

    public d(Context context) {
        super(context);
        this.LJI = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    @Override // zoo.a
    public void LJ(MotionEvent motionEvent) {
        float x;
        float y;
        super.LJ(motionEvent);
        MotionEvent motionEvent2 = this.LIZIZ;
        float x2 = motionEvent2.getX(0);
        float y2 = motionEvent2.getY(0);
        if (motionEvent2.getPointerCount() >= 2) {
            x = motionEvent2.getX(1);
            y = motionEvent2.getY(1);
        } else {
            x = 0.0f;
            y = 0.0f;
        }
        this.LJII = x - x2;
        this.LJIIIIZZ = y - y2;
        float x3 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            x = motionEvent.getX(1);
            y = motionEvent.getY(1);
        }
        this.LJIIIZ = x - x3;
        this.LJIIJ = y - y3;
    }

    public final boolean LJFF(MotionEvent motionEvent) {
        float x;
        boolean z;
        boolean z2;
        float f = this.LIZ.getResources().getDisplayMetrics().widthPixels;
        float f2 = this.LJI;
        float f3 = f - f2;
        float f4 = r1.heightPixels - f2;
        float f5 = this.LJIIJJI;
        float f6 = f2 - f5;
        float f7 = f3 + f5;
        float f8 = f4 + f5;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float x2 = motionEvent.getX() - motionEvent.getRawX();
        float y = 0.0f;
        if (1 < motionEvent.getPointerCount()) {
            x = motionEvent.getX(1) - x2;
        } else {
            x = 0.0f;
        }
        float y2 = motionEvent.getY() - motionEvent.getRawY();
        if (1 < motionEvent.getPointerCount()) {
            y = motionEvent.getY(1) - y2;
        }
        if (rawX >= f6 && rawY >= f6 && rawX <= f7 && rawY <= f8) {
            z = false;
        } else {
            z = true;
        }
        if (x >= f6 && y >= f6 && x <= f7 && y <= f8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            return z2 ? true : true;
        }
        if (z2) {
            return true;
        }
        return false;
    }
}
