package r1k;

import X.AbstractC21664519qV;
import X.InterfaceC1645720sva;
import android.graphics.PointF;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.ss.android.vesdk.VETouchPointer;

/* JADX INFO: loaded from: classes26.dex */
public class a extends AbstractC21664519qV {
    public final InterfaceC1645720sva LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZLL;
    public final int LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public Pair<Float, Float> LLJILJIL;
    public float LLILZ = 1.0f;
    public float LLILZIL = 1.0f;
    public final PointF LLJI = new PointF(-2.0f, -2.0f);
    public final PointF LLJIJIL = new PointF();

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LIZIZ(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        PointF pointF = this.LLJIJIL;
        PointF pointFLJIILLIIL = LJIILLIIL(pointF.x, pointF.y);
        InterfaceC1645720sva interfaceC1645720sva = this.LL;
        if (interfaceC1645720sva != null) {
            interfaceC1645720sva.co(pointFLJIILLIIL.x, pointFLJIILLIIL.y);
            return true;
        }
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LJIIIZ(float f) {
        this.LL.Ao(-f, 6.0f);
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LJJLIIIJLJLI(float f) {
        this.LL.Ao(-f, 6.0f);
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean LLLLJI(float f) {
        this.LLILZ = 1.0f;
        this.LLILZIL = 1.0f;
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onDown(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        InterfaceC1645720sva interfaceC1645720sva = this.LL;
        PointF pointF = this.LLJIJIL;
        interfaceC1645720sva.no(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 0, 0);
        this.LLJ = true;
        return false;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.LLILZIL * scaleGestureDetector.getScaleFactor();
        this.LLILZIL = scaleFactor;
        this.LL.mo59do(scaleFactor / this.LLILZ, 3.0f);
        this.LLILZ = this.LLILZIL;
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        PointF pointF = this.LLJIJIL;
        PointF pointFLJIILLIIL = LJIILLIIL(pointF.x, pointF.y);
        this.LL.Do(pointFLJIILLIIL.x, pointFLJIILLIIL.y);
        return true;
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onUp(MotionEvent motionEvent) {
        LJIIZILJ(motionEvent.getX(), motionEvent.getY());
        InterfaceC1645720sva interfaceC1645720sva = this.LL;
        PointF pointF = this.LLJIJIL;
        interfaceC1645720sva.no(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 2, 0);
        this.LLJ = false;
        return false;
    }

    public a(InterfaceC1645720sva interfaceC1645720sva, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.LL = interfaceC1645720sva;
        this.LLILLJJLI = marginLayoutParams.width;
        this.LLILLL = marginLayoutParams.height;
        this.LLILZLL = marginLayoutParams.getMarginStart();
        this.LLIZ = marginLayoutParams.topMargin;
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LIZJ(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        PointF pointF = this.LLJIJIL;
        PointF pointFLJIILLIIL = LJIILLIIL(pointF.x, pointF.y);
        this.LL.Do(pointFLJIILLIIL.x, pointFLJIILLIIL.y);
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LJI(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC1645720sva interfaceC1645720sva = this.LL;
        PointF pointF = this.LLJIJIL;
        interfaceC1645720sva.no(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 0, 0);
        this.LLJ = true;
        this.LLJILJIL = new Pair<>(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)));
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LJIIIIZZ(MotionEvent motionEvent, int[] iArr) {
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC1645720sva interfaceC1645720sva = this.LL;
        PointF pointF = this.LLJIJIL;
        interfaceC1645720sva.no(pointF.x / this.LLILLJJLI, pointF.y / this.LLILLL, 2, 0);
        this.LLJ = false;
    }

    @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
    public final void LJIIJ(MotionEvent motionEvent, int[] iArr) {
        Pair<Float, Float> pair;
        LJIILIIL(motionEvent, iArr);
        if (motionEvent.getPointerCount() != 2) {
            return;
        }
        if (this.LLJ && (pair = this.LLJILJIL) != null) {
            this.LLJI.x = ((Float) pair.first).floatValue() + iArr[0];
            this.LLJI.y = ((Float) this.LLJILJIL.second).floatValue() + iArr[1];
            this.LLJ = false;
        }
        float x = (motionEvent.getX(1) + iArr[0]) - this.LLJI.x;
        float y = (motionEvent.getY(1) + iArr[1]) - this.LLJI.y;
        LJIIZILJ(motionEvent.getX(1) + iArr[0], motionEvent.getY(1) + iArr[1]);
        InterfaceC1645720sva interfaceC1645720sva = this.LL;
        PointF pointF = this.LLJIJIL;
        float f = pointF.x;
        int i = this.LLILLJJLI;
        float f2 = pointF.y;
        int i2 = this.LLILLL;
        interfaceC1645720sva.fo(f / i, f2 / i2, x / i, y / i2, 1.0f);
        this.LLJI.x = motionEvent.getX(1) + iArr[0];
        this.LLJI.y = motionEvent.getY(1) + iArr[1];
        Pair<Float, Float> pair2 = this.LLJILJIL;
        if (pair2 != null && ((Float) pair2.first).floatValue() + iArr[0] != this.LLIZLLLIL) {
            this.LLIZLLLIL = ((Float) this.LLJILJIL.first).floatValue() + iArr[0];
        }
    }

    @Override // X.AbstractC21664519qV
    public final void LJIILL(VETouchPointer vETouchPointer, int i) {
        LJIIZILJ(vETouchPointer.getX(), vETouchPointer.getY());
        vETouchPointer.setX(this.LLJIJIL.x / this.LLILLJJLI);
        vETouchPointer.setY(this.LLJIJIL.y / this.LLILLL);
        this.LL.Ch(vETouchPointer, i);
    }

    public final PointF LJIILLIIL(float f, float f2) {
        PointF pointF = new PointF();
        pointF.x = f / this.LLILLJJLI;
        pointF.y = f2 / this.LLILLL;
        return pointF;
    }

    public final void LJIIZILJ(float f, float f2) {
        this.LLJIJIL.set(f, f2);
        this.LLJIJIL.offset(-this.LLILZLL, -this.LLIZ);
    }

    @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LLJ) {
            this.LLJI.x = motionEvent.getX();
            this.LLJI.y = motionEvent.getY();
            this.LLJ = false;
        }
        float x = motionEvent2.getX() - this.LLJI.x;
        float y = motionEvent2.getY() - this.LLJI.y;
        LJIIZILJ(motionEvent2.getX(), motionEvent2.getY());
        InterfaceC1645720sva interfaceC1645720sva = this.LL;
        PointF pointF = this.LLJIJIL;
        float f3 = pointF.x;
        float f4 = this.LLILLJJLI;
        float f5 = pointF.y;
        float f6 = this.LLILLL;
        interfaceC1645720sva.fo(f3 / f4, f5 / f6, x / f4, y / f6, 1.0f);
        this.LLJI.x = motionEvent2.getX();
        this.LLJI.y = motionEvent2.getY();
        if (motionEvent != null && motionEvent.getX() != this.LLIZLLLIL) {
            this.LLIZLLLIL = motionEvent.getX();
            return true;
        }
        return true;
    }

    public a(InterfaceC1645720sva interfaceC1645720sva, int i, int i2, int i3, int i4) {
        this.LL = interfaceC1645720sva;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZLL = i3;
        this.LLIZ = i4;
    }
}
