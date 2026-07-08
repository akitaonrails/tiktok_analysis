package zoo;

import X.InterfaceC21645219nO;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes34.dex */
public final class b extends a {
    public static final PointF LJIILIIL = new PointF();
    public final InterfaceC21645219nO LJI;
    public PointF LJII;
    public PointF LJIIIIZZ;
    public final PointF LJIIIZ;
    public int LJIIJ;
    public PointF LJIIJJI;
    public int LJIIL;

    public final float LJI() {
        MotionEvent motionEvent = this.LIZJ;
        if (motionEvent == null) {
            return -1.0f;
        }
        return motionEvent.getX();
    }

    public final float LJII() {
        MotionEvent motionEvent = this.LIZJ;
        if (motionEvent == null) {
            return -1.0f;
        }
        return motionEvent.getY();
    }

    public static PointF LJFF(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            x += motionEvent.getX(i);
            y += motionEvent.getY(i);
        }
        float f = pointerCount;
        return new PointF(x / f, y / f);
    }

    @Override // zoo.a
    public final void LJ(MotionEvent motionEvent) {
        PointF pointF;
        super.LJ(motionEvent);
        MotionEvent motionEvent2 = this.LIZIZ;
        this.LJII = LJFF(motionEvent);
        this.LJIIIIZZ = LJFF(motionEvent2);
        if (motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = LJIILIIL;
        } else {
            PointF pointF2 = this.LJII;
            float f = pointF2.x;
            PointF pointF3 = this.LJIIIIZZ;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.LJIIJJI = pointF;
        PointF pointF4 = this.LJIIIZ;
        pointF4.x += pointF.x;
        pointF4.y += pointF.y;
    }

    public b(Context context, InterfaceC21645219nO interfaceC21645219nO) {
        super(context);
        this.LJI = interfaceC21645219nO;
        this.LJIIIZ = new PointF();
        this.LJIIJJI = new PointF();
    }

    @Override // zoo.a
    public final void LIZ(MotionEvent motionEvent, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else {
                if (this.LIZIZ == null) {
                    this.LIZIZ = MotionEvent.obtain(motionEvent);
                }
                LJ(motionEvent);
                if (this.LIZLLL / this.LJ <= 0.67f) {
                    return;
                }
                this.LJIIL = motionEvent.getPointerCount();
                if (!this.LJI.LLLZLZ(this)) {
                    return;
                }
                this.LIZIZ.recycle();
                this.LIZIZ = MotionEvent.obtain(motionEvent);
                return;
            }
        }
        this.LJI.LJFF(this);
        LIZLLL();
    }

    @Override // zoo.a
    public final void LIZIZ(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2;
        float x;
        if (i != 0) {
            if (i != 2 || (motionEvent2 = this.LIZIZ) == null) {
                return;
            }
            if (Math.abs(motionEvent.getX() - motionEvent2.getX()) < this.LJIIJ && Math.abs(motionEvent.getY() - motionEvent2.getY()) < this.LJIIJ) {
                return;
            }
            InterfaceC21645219nO interfaceC21645219nO = this.LJI;
            MotionEvent motionEvent3 = this.LIZIZ;
            float y = -1.0f;
            if (motionEvent3 == null) {
                x = -1.0f;
            } else {
                x = motionEvent3.getX();
            }
            MotionEvent motionEvent4 = this.LIZIZ;
            if (motionEvent4 != null) {
                y = motionEvent4.getY();
            }
            interfaceC21645219nO.LLLLLLLLL(this, x, y);
            this.LJFF = true;
            return;
        }
        LIZLLL();
        PointF pointF = this.LJIIIZ;
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        this.LIZIZ = MotionEvent.obtain(motionEvent);
        LJ(motionEvent);
    }
}
