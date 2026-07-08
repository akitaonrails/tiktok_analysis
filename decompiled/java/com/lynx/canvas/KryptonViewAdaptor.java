package com.lynx.canvas;

import X.C1288370jdD;
import X.EnumC1285200jY6;
import X.InterfaceC1288240jd0;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonViewAdaptor;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonViewAdaptor {
    public final EnumC1285200jY6 LIZ;
    public WeakReference<InterfaceC1288240jd0> LIZIZ;
    public PlatformCanvasView LIZJ;
    public long LIZLLL;
    public Rect LJ;

    public native long nativeCreateSurface(Surface surface);

    public KryptonViewAdaptor(EnumC1285200jY6 enumC1285200jY6) {
        this.LIZ = enumC1285200jY6;
    }

    public final void LIZIZ(KryptonApp kryptonApp) {
        InterfaceC1288240jd0 interfaceC1288240jd0 = this.LIZIZ.get();
        if (interfaceC1288240jd0 == null) {
            C1288370jdD.LIZIZ("KryptonViewAdaptor", "ignore setup, surfaceView has been released");
            return;
        }
        this.LIZJ.LJIIIIZZ("miniGame", kryptonApp, interfaceC1288240jd0.getDensity(), interfaceC1288240jd0.getWidth(), interfaceC1288240jd0.getHeight());
        Surface surface = interfaceC1288240jd0.LJJZZI().getSurface();
        synchronized (this) {
            try {
                if (this.LIZLLL == 0 && surface != null && surface.isValid()) {
                    C1288370jdD.LIZJ("KryptonViewAdaptor", "create surface for surfaceCreated event missed.");
                    this.LIZLLL = nativeCreateSurface(surface);
                }
                this.LIZJ.LJ(this.LIZLLL, interfaceC1288240jd0.getWidth(), interfaceC1288240jd0.getHeight(), this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0jd2] */
    public static KryptonViewAdaptor LIZ(final InterfaceC1288240jd0 interfaceC1288240jd0, EnumC1285200jY6 enumC1285200jY6) {
        if (interfaceC1288240jd0 == 0) {
            C1288370jdD.LIZJ("KryptonViewAdaptor", "surface view should not be null");
            return null;
        }
        final KryptonViewAdaptor kryptonViewAdaptor = new KryptonViewAdaptor(enumC1285200jY6);
        kryptonViewAdaptor.LIZIZ = new WeakReference<>(interfaceC1288240jd0);
        kryptonViewAdaptor.LIZJ = new PlatformCanvasView();
        interfaceC1288240jd0.LJJZZI().addCallback(new SurfaceHolder.Callback() { // from class: X.0jcz
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                synchronized (this.LL) {
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("surfaceCreated, holder: ");
                        sbLIZ.append(surfaceHolder);
                        sbLIZ.append(" with surface mode: ");
                        sbLIZ.append(this.LL.LIZ.value);
                        C1288370jdD.LIZJ("KryptonViewAdaptor", C2188811AlT.LIZIZ(sbLIZ));
                        KryptonViewAdaptor kryptonViewAdaptor2 = this.LL;
                        kryptonViewAdaptor2.LIZLLL = kryptonViewAdaptor2.nativeCreateSurface(surfaceHolder.getSurface());
                        InterfaceC1288240jd0 interfaceC1288240jd02 = this.LL.LIZIZ.get();
                        if (interfaceC1288240jd02 != null) {
                            KryptonViewAdaptor kryptonViewAdaptor3 = this.LL;
                            kryptonViewAdaptor3.LIZJ.LJ(kryptonViewAdaptor3.LIZLLL, interfaceC1288240jd02.getWidth(), interfaceC1288240jd02.getHeight(), this.LL.LIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                synchronized (this.LL) {
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("surfaceDestroyed, holder: ");
                        sbLIZ.append(surfaceHolder);
                        C1288370jdD.LIZJ("KryptonViewAdaptor", C2188811AlT.LIZIZ(sbLIZ));
                        this.LL.LIZJ.LJI();
                        this.LL.LIZLLL = 0L;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                synchronized (this.LL) {
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("surfaceChanged, holder: ");
                        sbLIZ.append(surfaceHolder);
                        sbLIZ.append(", format: ");
                        sbLIZ.append(i);
                        sbLIZ.append(", width: ");
                        sbLIZ.append(i2);
                        sbLIZ.append(", height:");
                        sbLIZ.append(i3);
                        C1288370jdD.LIZJ("KryptonViewAdaptor", C2188811AlT.LIZIZ(sbLIZ));
                        KryptonViewAdaptor kryptonViewAdaptor2 = this.LL;
                        kryptonViewAdaptor2.LIZJ.LJ(kryptonViewAdaptor2.LIZLLL, i2, i3, kryptonViewAdaptor2.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        });
        interfaceC1288240jd0.LJJZZIII(new View.OnTouchListener() { // from class: X.0jd2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && view != null && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int width = interfaceC1288240jd0.getWidth();
                int height = interfaceC1288240jd0.getHeight();
                kryptonViewAdaptor.LIZJ.LIZ(motionEvent, new Rect(0, 0, width, height), new Rect(0, 0, width, height));
                return true;
            }
        });
        return kryptonViewAdaptor;
    }
}
