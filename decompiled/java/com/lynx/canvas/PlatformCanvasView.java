package com.lynx.canvas;

import X.C1288370jdD;
import X.C2188811AlT;
import X.EnumC1285200jY6;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes21.dex */
public class PlatformCanvasView {
    public float LIZIZ;
    public String LIZJ;
    public WeakReference<KryptonApp> LIZLLL;
    public long LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public Rect LJIIIZ;
    public Boolean LIZ = Boolean.FALSE;
    public float LJIIJ = 0.0f;
    public boolean LJIIJJI = false;

    private native long nativeCreateCanvasView(String str, long j, int i, int i2);

    private native void nativeDestroyCanvasView(long j);

    private native void nativeDispatchTouchEvent(long j, ByteBuffer byteBuffer);

    private native void nativeOnSurfaceChanged(long j, int i, int i2);

    private native void nativeOnSurfaceCreated(long j, long j2, int i, int i2, int i3);

    private native void nativeOnSurfaceDestroyed(long j);

    private native void nativeViewLayoutUpdate(long j, int i, int i2, int i3, int i4, int i5, int i6);

    public final void LIZJ() {
        long j = this.LJ;
        if (j == 0) {
            return;
        }
        this.LJ = 0L;
        nativeDestroyCanvasView(j);
    }

    public final void LJI() {
        long j = this.LJ;
        if (j == 0) {
            return;
        }
        this.LJIIJJI = false;
        nativeOnSurfaceDestroyed(j);
    }

    public final void LIZIZ(ByteBuffer byteBuffer) {
        long j = this.LJ;
        if (j != 0) {
            nativeDispatchTouchEvent(j, byteBuffer);
        }
    }

    public final int LJII(float f) {
        return (int) (((f / this.LIZIZ) * this.LJIIJ) + 0.5f);
    }

    public final void LIZ(MotionEvent motionEvent, Rect rect, Rect rect2) {
        int actionIndex = motionEvent.getActionIndex();
        int i = 5;
        if (actionIndex >= 5) {
            return;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount <= 5) {
            i = pointerCount;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(112);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocateDirect.clear();
        byteBufferAllocateDirect.put((byte) motionEvent.getActionMasked());
        byteBufferAllocateDirect.put((byte) i);
        byteBufferAllocateDirect.put((byte) actionIndex);
        byteBufferAllocateDirect.put((byte) 1);
        byteBufferAllocateDirect.putInt((int) ((rect2.left / this.LIZIZ) + 0.5f));
        byteBufferAllocateDirect.putInt((int) ((rect2.top / this.LIZIZ) + 0.5f));
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        for (int i2 = 0; i2 < i; i2++) {
            float x = (rect.left - rect2.left) + motionEvent.getX(i2);
            float y = (rect.top - rect2.top) + motionEvent.getY(i2);
            byteBufferAllocateDirect.putInt(motionEvent.getPointerId(i2));
            byteBufferAllocateDirect.putFloat(x / this.LIZIZ);
            byteBufferAllocateDirect.putFloat(y / this.LIZIZ);
            byteBufferAllocateDirect.putFloat((motionEvent.getX(i2) + rawX) / this.LIZIZ);
            byteBufferAllocateDirect.putFloat((motionEvent.getY(i2) + rawY) / this.LIZIZ);
        }
        long j = this.LJ;
        if (j != 0) {
            nativeDispatchTouchEvent(j, byteBufferAllocateDirect);
        }
    }

    public final void LIZLLL(int i, int i2, Rect rect) {
        Rect rect2 = rect;
        int iLJII = i2;
        int iLJII2 = i;
        synchronized (this) {
            try {
                if (this.LJIIJ > 0.0f) {
                    Rect rect3 = new Rect(LJII(rect2.left), LJII(rect2.top), LJII(rect2.right), LJII(rect2.bottom));
                    iLJII2 = LJII(iLJII2);
                    iLJII = LJII(iLJII);
                    rect2 = rect3;
                }
                if (rect2.equals(this.LJIIIZ) && this.LJFF == iLJII2 && this.LJI == iLJII) {
                    return;
                }
                this.LJIIIZ = rect2;
                this.LJFF = iLJII2;
                this.LJI = iLJII;
                long j = this.LJ;
                if (j != 0) {
                    nativeViewLayoutUpdate(j, rect2.left, rect2.right, rect2.top, rect2.bottom, iLJII2, iLJII);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(long j, int i, int i2, EnumC1285200jY6 enumC1285200jY6) {
        synchronized (this) {
            try {
                if (i != 0 && i2 != 0) {
                    if (this.LJIIJ > 0.0f) {
                        i = LJII(i);
                        i2 = LJII(i2);
                    }
                    if (!this.LJIIJJI) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("notify surface created w ");
                        sbLIZ.append(i);
                        sbLIZ.append(" h ");
                        sbLIZ.append(i2);
                        sbLIZ.append(" scaleMode ");
                        sbLIZ.append(enumC1285200jY6);
                        C1288370jdD.LIZJ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ));
                        this.LJII = i;
                        this.LJIIIIZZ = i2;
                        LJFF(j, i, i2, enumC1285200jY6);
                        return;
                    }
                    if (this.LJII == i && this.LJIIIIZZ == i2) {
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("notify surface changed w ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" h ");
                    sbLIZ2.append(i2);
                    C1288370jdD.LIZJ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LJII = i;
                    this.LJIIIIZZ = i2;
                    long j2 = this.LJ;
                    if (j2 == 0) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("surface changed but mNativeCanvasViewPtr ");
                        sbLIZ3.append(this.LJ);
                        C1288370jdD.LIZIZ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ3));
                    } else {
                        nativeOnSurfaceChanged(j2, i, i2);
                    }
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("ignore notify surface changed w ");
                sbLIZ4.append(i);
                sbLIZ4.append(" h ");
                sbLIZ4.append(i2);
                sbLIZ4.append(" or platform view disposed");
                C1288370jdD.LIZJ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ4));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(long j, int i, int i2, EnumC1285200jY6 enumC1285200jY6) {
        if (i != 0 && i2 != 0) {
            long j2 = this.LJ;
            if (j2 != 0 && j != 0) {
                this.LJIIJJI = true;
                nativeOnSurfaceCreated(j2, j, i, i2, enumC1285200jY6.value);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("surface created but mNativeCanvasViewPtr ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(" glSurfacePtr ");
            sbLIZ.append(j);
            C1288370jdD.LIZIZ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ignore notify surface created w ");
        sbLIZ2.append(i);
        sbLIZ2.append(" h ");
        sbLIZ2.append(i2);
        C1288370jdD.LIZJ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final boolean LJIIIIZZ(String str, KryptonApp kryptonApp, float f, int i, int i2) {
        if (this.LIZ.booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Set name to initialized canvas with old name ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(" new name ");
            sbLIZ.append(str);
            C1288370jdD.LIZIZ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        this.LIZIZ = f;
        this.LIZJ = str;
        if (this.LJIIJ > 0.0f) {
            this.LJFF = LJII(i);
            this.LJI = LJII(i2);
            kryptonApp.LJIILJJIL(this.LJIIJ);
        } else {
            this.LJFF = i;
            this.LJI = i2;
        }
        this.LIZLLL = new WeakReference<>(kryptonApp);
        if (!Krypton.LIZIZ().LIZ) {
            C1288370jdD.LIZLLL("PlatformCanvasView", "initCanvasInternal but krypton do not init.");
        } else {
            KryptonApp kryptonApp2 = this.LIZLLL.get();
            if (kryptonApp2 == null) {
                C1288370jdD.LIZLLL("PlatformCanvasView", "krypton app has been released.");
            } else {
                long jLJFF = kryptonApp2.LJFF();
                if (jLJFF == 0) {
                    C1288370jdD.LIZLLL("PlatformCanvasView", "canvas app has been destroyed.");
                } else {
                    this.LJ = nativeCreateCanvasView(this.LIZJ, jLJFF, this.LJFF, this.LJI);
                    this.LIZ = Boolean.TRUE;
                    return true;
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init canvas internal failed ");
        sbLIZ2.append(str);
        C1288370jdD.LIZIZ("PlatformCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }
}
