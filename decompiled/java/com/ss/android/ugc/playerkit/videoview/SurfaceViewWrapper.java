package com.ss.android.ugc.playerkit.videoview;

import X.C0C83;
import X.C0FV2;
import X.C1170404hy;
import X.C1473800oSI;
import X.C1473990oSb;
import X.C1474010oSd;
import X.C1474110oSn;
import X.C1474120oSo;
import X.C1474810oTv;
import X.C1481110oe5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1471580oOi;
import X.InterfaceC1473950oSX;
import X.InterfaceC1474000oSc;
import X.InterfaceC1474030oSf;
import X.InterfaceC1474060oSi;
import X.InterfaceC1474150oSr;
import X.InterfaceC1482650ogZ;
import X.InterfaceC1483990oij;
import X.RunnableC1474130oSp;
import X.RunnableC1474140oSq;
import X.SurfaceHolderCallbackC1473980oSa;
import Y.ARunnableS56S0300000_23;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes24.dex */
public class SurfaceViewWrapper implements InterfaceC1482650ogZ, InterfaceC1471580oOi, InterfaceC1483990oij {
    public static final String LLJJI;
    public static boolean LLJJIII;
    public static int LLJJIJI;
    public static int LLJJIJIIJIL;
    public final SurfaceView LL;
    public final Set<InterfaceC1473950oSX> LLILLJJLI;
    public boolean LLILLL;
    public final InterfaceC1474150oSr LLILZ;
    public C1474110oSn LLILZIL;
    public InterfaceC1474000oSc LLILZLL;
    public final SurfaceHolderCallbackC1473980oSa LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final RunnableC1474140oSq LLJI;
    public final RunnableC1474130oSp LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ View Hk() {
        return null;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJFF() {
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIIIIZZ(boolean z) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJIIIZ(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIL() {
        this.LLILLL = false;
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIILIIL(String str, boolean z) {
    }

    @Override // X.InterfaceC1483990oij
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // X.InterfaceC1482650ogZ
    public final int LJIILL() {
        return 1;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIJ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJIL(SurfaceView surfaceView) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJJ(C1170404hy c1170404hy) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void release() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void resume() {
    }

    static {
        LLJJI = ((Boolean) C1474810oTv.LJJLIIIJILLIZJL.getValue()).booleanValue() ? "SurfaceViewWrapper<init>" : "UNKNOWN";
        LLJJIJI = 0;
        LLJJIJIIJIL = 0;
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean Da() {
        return this.LL.getHolder().getSurface().isValid();
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIIZILJ() {
        LJIJJLI("triggerRefreshSurface");
    }

    public final void LJJII() {
        if (((Boolean) C1474810oTv.t2.getValue()).booleanValue() && Build.VERSION.SDK_INT == 29) {
            C1474110oSn c1474110oSn = new C1474110oSn();
            this.LLILZIL = c1474110oSn;
            SurfaceView surfaceView = this.LL;
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("proxyPositionChangeListener， surface = ");
                sbLIZ.append(surfaceView.getHolder().getSurface());
                C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
            }
            c1474110oSn.LJIIIIZZ = surfaceView;
            c1474110oSn.LJ = Boolean.valueOf(((Boolean) C1474810oTv.u2.getValue()).booleanValue());
            c1474110oSn.LJFF = Boolean.valueOf(((Boolean) C1474810oTv.v2.getValue()).booleanValue());
            c1474110oSn.LJI = Boolean.valueOf(((Boolean) C1474810oTv.w2.getValue()).booleanValue());
            c1474110oSn.LJII = Boolean.valueOf(((Boolean) C1474810oTv.x2.getValue()).booleanValue());
            try {
                if (C1474110oSn.LJIILL == null) {
                    Field declaredField = SurfaceView.class.getDeclaredField("mPositionListener");
                    C1474110oSn.LJIILL = declaredField;
                    declaredField.setAccessible(true);
                }
                if (c1474110oSn.LIZ == null) {
                    c1474110oSn.LIZ = C1474110oSn.LJIILL.get(surfaceView);
                }
                if (C1474110oSn.LJIIZILJ == null) {
                    Field declaredField2 = View.class.getDeclaredField("mRenderNode");
                    C1474110oSn.LJIIZILJ = declaredField2;
                    declaredField2.setAccessible(true);
                }
                if (C1474110oSn.LJIILLIIL == null) {
                    C1474110oSn.LJIILLIIL = Class.forName("android.graphics.RenderNode");
                }
                if (C1474110oSn.LJIJJ == null) {
                    C1474110oSn.LJIJJ = Class.forName("android.graphics.RenderNode$PositionUpdateListener");
                }
                if (C1474110oSn.LJIJI == null) {
                    Method declaredMethod = C1474110oSn.LJIILLIIL.getDeclaredMethod("addPositionUpdateListener", C1474110oSn.LJIJJ);
                    C1474110oSn.LJIJI = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (C1474110oSn.LJIJ == null) {
                    Method declaredMethod2 = C1474110oSn.LJIILLIIL.getDeclaredMethod("removePositionUpdateListener", C1474110oSn.LJIJJ);
                    C1474110oSn.LJIJ = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                if (C1474110oSn.LJIJJLI == null) {
                    Class cls = C1474110oSn.LJIJJ;
                    Class<?> cls2 = Integer.TYPE;
                    Method declaredMethod3 = cls.getDeclaredMethod("positionChanged", Long.TYPE, cls2, cls2, cls2, cls2);
                    C1474110oSn.LJIJJLI = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                if (C1474110oSn.LJIL == null) {
                    Method declaredMethod4 = C1474110oSn.LJIJJ.getDeclaredMethod("positionLost", Long.TYPE);
                    C1474110oSn.LJIL = declaredMethod4;
                    declaredMethod4.setAccessible(true);
                }
                if (c1474110oSn.LIZIZ == null) {
                    c1474110oSn.LIZIZ = Proxy.newProxyInstance(C1474110oSn.LJIJJ.getClassLoader(), new Class[]{C1474110oSn.LJIJJ}, new C1474120oSo(c1474110oSn, surfaceView));
                }
                C1474110oSn.LJIJ.invoke(C1474110oSn.LJIIZILJ.get(surfaceView), c1474110oSn.LIZ);
                if (c1474110oSn.LJI.booleanValue()) {
                    C1474110oSn.LJIJI.invoke(C1474110oSn.LJIIZILJ.get(surfaceView), new Object());
                } else {
                    C1474110oSn.LJIJI.invoke(C1474110oSn.LJIIZILJ.get(surfaceView), c1474110oSn.LIZIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LL.getHolder().addCallback(this.LLIZ);
        this.LL.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0oRc
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onViewAttachedToWindow， surface = ");
                    sbLIZ2.append(this.LL.getSurface());
                    C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Surface surface;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onViewDetachedFromWindow， surface = ");
                    sbLIZ2.append(this.LL.getSurface());
                    C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (!((Boolean) C1474810oTv.D4.getValue()).booleanValue()) {
                    C1471640oOo.LIZ.remove(this.LL.LL.getHolder().getSurface());
                    if (C1474810oTv.LJJJJLI() && (surface = this.LL.LL.getHolder().getSurface()) != null) {
                        C1471640oOo.LIZIZ.remove(surface);
                    }
                    C1471640oOo.LJ.remove(this.LL.LL.getHolder().getSurface());
                    C1471640oOo.LIZLLL(this.LL.LL.getHolder().getSurface());
                }
                this.LL.LLJILJIL = false;
            }
        });
    }

    @Override // X.InterfaceC1482650ogZ
    public final Surface getSurface() {
        return this.LL.getHolder().getSurface();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void onPagePause() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPagePause, surface = ");
            sbLIZ.append(getSurface());
            C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLIZLLLIL = true;
        this.LLJ = false;
        C1474110oSn c1474110oSn = this.LLILZIL;
        if (c1474110oSn == null || !c1474110oSn.LJFF.booleanValue()) {
            return;
        }
        c1474110oSn.LJIIJ = true;
    }

    @Override // X.InterfaceC1483990oij
    public final boolean LIZIZ() {
        return Da();
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean LJIJI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1482650ogZ
    public final View getView() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oSa] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oSq] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0oSp] */
    public SurfaceViewWrapper(C1473990oSb c1473990oSb) {
        this.LLILLJJLI = new LinkedHashSet();
        this.LLIZ = new SurfaceHolder.Callback() { // from class: X.0oSa
            /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
            @Override // android.view.SurfaceHolder.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void surfaceCreated(android.view.SurfaceHolder r7) {
                /*
                    Method dump skipped, instruction units count: 500
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolderCallbackC1473980oSa.surfaceCreated(android.view.SurfaceHolder):void");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Surface surface;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("surfaceDestroyed, surface = ");
                    sbLIZ.append(surfaceHolder.getSurface());
                    sbLIZ.append(", mSurfaceView:");
                    sbLIZ.append(this.LL.LL);
                    C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (C1472280oPq.LIZLLL()) {
                    InterfaceC1472350oPx interfaceC1472350oPxLIZIZ = C1472280oPq.LIZIZ(surfaceHolder.getSurface());
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("surfaceDestroyed mSurfaceControlSession:");
                        sbLIZ2.append(interfaceC1472350oPxLIZIZ);
                        C1481110oe5.LIZIZ("SurfaceViewWrapper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (interfaceC1472350oPxLIZIZ != null) {
                        interfaceC1472350oPxLIZIZ.LIZIZ(null, 0, 0);
                    }
                }
                if (((Boolean) C1474810oTv.Q2.getValue()).booleanValue()) {
                    SurfaceViewWrapper surfaceViewWrapper = this.LL;
                    SurfaceView surfaceView = surfaceViewWrapper.LL;
                    if (surfaceView instanceof C1473990oSb) {
                        C1473990oSb c1473990oSb2 = (C1473990oSb) surfaceView;
                        if (c1473990oSb2.LLILLJJLI) {
                            c1473990oSb2.LLILLJJLI = false;
                            surfaceViewWrapper.LLJ = true;
                            return;
                        }
                    }
                }
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                InterfaceC1474000oSc interfaceC1474000oSc = this.LL.LLILZLL;
                if (interfaceC1474000oSc != null) {
                    interfaceC1474000oSc.LIZLLL();
                }
                if (((Boolean) C1474810oTv.D4.getValue()).booleanValue()) {
                    C1471640oOo.LIZ.remove(this.LL.LL.getHolder().getSurface());
                    if (C1474810oTv.LJJJJLI() && (surface = this.LL.LL.getHolder().getSurface()) != null) {
                        C1471640oOo.LIZIZ.remove(surface);
                    }
                    C1471640oOo.LJ.remove(this.LL.LL.getHolder().getSurface());
                    C1471640oOo.LIZLLL(this.LL.LL.getHolder().getSurface());
                }
                this.LL.LLJ = true;
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("surfaceChanged, surface = ");
                    sbLIZ.append(surfaceHolder.getSurface());
                    sbLIZ.append(", widthXheight: ");
                    sbLIZ.append(i2);
                    sbLIZ.append("X");
                    sbLIZ.append(i3);
                    sbLIZ.append(", mSurfaceView:");
                    sbLIZ.append(this.LL.LL);
                    C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (C1472280oPq.LIZLLL()) {
                    InterfaceC1472350oPx interfaceC1472350oPxLIZIZ = C1472280oPq.LIZIZ(surfaceHolder.getSurface());
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("surfaceChanged mSurfaceControlSession:");
                        sbLIZ2.append(interfaceC1472350oPxLIZIZ);
                        C1481110oe5.LIZIZ("SurfaceViewWrapper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (interfaceC1472350oPxLIZIZ != null && interfaceC1472350oPxLIZIZ.LIZ(this.LL.LL)) {
                        interfaceC1472350oPxLIZIZ.LIZIZ(this.LL.LL.getSurfaceControl(), Integer.valueOf(this.LL.LL.getWidth()), Integer.valueOf(this.LL.LL.getHeight()));
                    }
                }
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LLF(i2, i3);
                }
            }
        };
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = new Runnable() { // from class: X.0oSq
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                Rect rectLJJIFFI;
                C1C7U.LIZ("SurfaceViewWrapper@341d.<field>$2");
                try {
                    SurfaceViewWrapper surfaceViewWrapper = this.LL;
                    SurfaceView surfaceView = surfaceViewWrapper.LL;
                    if (surfaceView != null && !surfaceViewWrapper.LLJILJILJ && (rectLJJIFFI = surfaceViewWrapper.LJJIFFI(surfaceView)) != null && (rectLJJIFFI.isEmpty() || rectLJJIFFI.centerX() < C0FV2.LIZIZ(surfaceView.getContext()))) {
                        C786410Ut5.LLIIII(surfaceView, 4);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SurfaceViewWrapper@341d.<field>$2");
            }
        };
        this.LLJIJIL = new Runnable() { // from class: X.0oSp
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                Rect rectLJJIFFI;
                C1C7U.LIZ("SurfaceViewWrapper@341d.<field>$3");
                try {
                    SurfaceViewWrapper surfaceViewWrapper = this.LL;
                    SurfaceView surfaceView = surfaceViewWrapper.LL;
                    if (surfaceView != null && !surfaceViewWrapper.LLJILJILJ && (rectLJJIFFI = surfaceViewWrapper.LJJIFFI(surfaceView)) != null && rectLJJIFFI.centerX() < C0FV2.LIZIZ(surfaceView.getContext())) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("SurfaceView", "SurfaceViewWrapper, abnormal case, unselected SurfaceView still on screen, try set gone/visible");
                        }
                        C786410Ut5.LLIIII(surfaceView, 8);
                        C786410Ut5.LLIIII(surfaceView, 0);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SurfaceViewWrapper@341d.<field>$3");
            }
        };
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        c1473990oSb.setRelatedSurfaceHolder(this);
        this.LL = c1473990oSb;
        LJJII();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void Dn(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLJJLI.add(interfaceC1473950oSX);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJ(InterfaceC1474030oSf interfaceC1474030oSf) {
        C1474010oSd.LIZ(this.LL, interfaceC1474030oSf);
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJI(String str) {
        this.LLJILJIL = true;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJII(InterfaceC1474000oSc interfaceC1474000oSc) {
        this.LLILZLL = interfaceC1474000oSc;
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIIJJI(InterfaceC1473950oSX interfaceC1473950oSX) {
        if (this.LLILLJJLI.contains(interfaceC1473950oSX)) {
            return;
        }
        this.LLILLJJLI.add(interfaceC1473950oSX);
    }

    @Override // X.InterfaceC1483990oij
    public final void LJIJJ(FrameLayout frameLayout) {
        if (this.LL.getParent() == frameLayout) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        if (this.LL.getParent() == frameLayout) {
            C786410Ut5.U5(this.LL, layoutParams);
        } else if (C1474810oTv.LJJZ()) {
            C0C83.INS.waitRunOnMain(new ARunnableS56S0300000_23(this, frameLayout, layoutParams, 32));
        } else {
            C1473800oSI.LIZ(this.LL);
            frameLayout.addView(this.LL, layoutParams);
        }
    }

    @Override // X.InterfaceC1471580oOi
    public final void LJIJJLI(String str) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshSurfaceDirectly, reason = ");
            sbLIZ.append(str);
            sbLIZ.append(", surface = ");
            sbLIZ.append(getSurface());
            C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.LLIIII(this.LL, 8);
        C786410Ut5.LLIIII(this.LL, 0);
    }

    public final void LJJI(boolean z) {
        if (z && C1474810oTv.LLLFFI()) {
            Context context = this.LL.getContext();
            if (LLJJIJIIJIL <= 0) {
                LLJJIJIIJIL = C0FV2.LIZ(context);
            }
            float f = LLJJIJIIJIL * 4;
            KeyEvent.Callback callback = this.LL;
            if (callback instanceof InterfaceC1474060oSi) {
                ((InterfaceC1474060oSi) callback).LJIIJJI(f, "SurfaceViewWrapper");
                return;
            } else {
                C786410Ut5.dd(this.LL, f);
                return;
            }
        }
        Context context2 = this.LL.getContext();
        if (LLJJIJI <= 0) {
            LLJJIJI = C0FV2.LIZIZ(context2);
        }
        float f2 = LLJJIJI * 4;
        KeyEvent.Callback callback2 = this.LL;
        if (callback2 instanceof InterfaceC1474060oSi) {
            ((InterfaceC1474060oSi) callback2).LJIIIIZZ(f2, "SurfaceViewWrapper");
        } else {
            C786410Ut5.Ic(this.LL, f2);
        }
    }

    public final Rect LJJIFFI(View view) {
        try {
            Field declaredField = SurfaceView.class.getDeclaredField("mRTLastReportedPosition");
            declaredField.setAccessible(true);
            return (Rect) declaredField.get(view);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJLJLLL(String str) {
        SurfaceView surfaceView = this.LL;
        if (surfaceView instanceof C1473990oSb) {
            ((C1473990oSb) surfaceView).setPageName(str);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void jj(boolean z) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageResume, surface = ");
            sbLIZ.append(getSurface());
            C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z) {
            if (this.LLIZLLLIL && !this.LLJ) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("SurfaceView", "resetSurfaceViewIfNeed, found abnormal case");
                }
                if (((Boolean) C1474810oTv.z0.getValue()).booleanValue()) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("SurfaceView", "resetSurfaceViewIfNeed, abnormal case and call SurfaceView GONE/VISIBLE");
                    }
                    C786410Ut5.LLIIII(this.LL, 8);
                    C786410Ut5.LLIIII(this.LL, 0);
                }
            }
            this.LLIZLLLIL = false;
        }
        C1474110oSn c1474110oSn = this.LLILZIL;
        if (c1474110oSn != null && c1474110oSn.LJFF.booleanValue()) {
            c1474110oSn.LJIIJ = false;
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void q3(boolean z) {
        if (!this.LLJILJILJ) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onScrollEnd, translate away the surface = ");
                sbLIZ.append(getSurface());
                C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
            }
            LJJI(false);
            if (this.LLJJ) {
                HandlerHook.viewPost(this.LL, this.LLJIJIL);
                this.LLJJ = false;
            }
        }
        this.LLJILLL = false;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLJJLI.remove(interfaceC1473950oSX);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    @Override // X.InterfaceC1482650ogZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(boolean r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = X.C1481110oe5.LIZ
            r3 = 0
            java.lang.String r5 = "SurfaceView"
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onSelected, isSelected="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", hScrolling="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", surface="
            r1.append(r0)
            android.view.Surface r0 = r7.getSurface()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1481110oe5.LIZIZ(r5, r0)
        L2e:
            r2 = 0
            r1 = 33
            r4 = 1
            if (r8 == 0) goto L9b
            boolean r0 = r7.LLJILJIL
            if (r0 == 0) goto L4f
            boolean r0 = X.C1481110oe5.LIZ
            if (r0 == 0) goto L41
            java.lang.String r0 = "onSelected, return this surfaceview, try refreshsurface"
            X.C1481110oe5.LIZIZ(r5, r0)
        L41:
            r7.LLJILJIL = r3
            android.view.SurfaceView r6 = r7.LL
            r0 = 8
            X.C786410Ut5.LLIIII(r6, r0)
            android.view.SurfaceView r0 = r7.LL
            X.C786410Ut5.LLIIII(r0, r3)
        L4f:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L7f
            android.view.SurfaceView r1 = r7.LL
            X.0oSq r0 = r7.LLJI
            com.bytedance.bpea.transmit.hook.HandlerHook.viewRemoveCallbacks(r1, r0)
            android.view.SurfaceView r0 = r7.LL
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L7f
            boolean r0 = X.C1481110oe5.LIZ
            if (r0 == 0) goto L6b
            java.lang.String r0 = "onSelected, set selected surfaceview visible"
            X.C1481110oe5.LIZIZ(r5, r0)
        L6b:
            android.view.SurfaceView r0 = r7.LL
            int r1 = r0.getVisibility()
            r0 = 4
            if (r1 != r0) goto L95
            android.view.SurfaceView r1 = r7.LL
            boolean r0 = r1 instanceof X.C1473990oSb
            if (r0 == 0) goto L95
            X.0oSb r1 = (X.C1473990oSb) r1
            r1.LIZLLL(r3, r4)
        L7f:
            android.view.SurfaceView r1 = r7.LL
            boolean r0 = r1 instanceof X.InterfaceC1474060oSi
            if (r0 == 0) goto L8f
            X.0oSi r1 = (X.InterfaceC1474060oSi) r1
            java.lang.String r0 = "SurfaceViewWrapper"
            r1.LJIIIIZZ(r2, r0)
        L8c:
            r7.LLJILJILJ = r8
            return
        L8f:
            android.view.SurfaceView r0 = r7.LL
            X.C786410Ut5.Ic(r0, r2)
            goto L8c
        L95:
            android.view.SurfaceView r0 = r7.LL
            X.C786410Ut5.LLIIII(r0, r3)
            goto L7f
        L9b:
            boolean r0 = X.C1474810oTv.LJLJJLL()
            if (r0 != 0) goto La5
            r7.LJJI(r3)
            goto L8c
        La5:
            boolean r0 = r7.LLJILLL
            if (r0 != 0) goto Lc4
            android.view.SurfaceView r0 = r7.LL
            float r0 = r0.getTranslationX()
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 != 0) goto Lb8
            r7.LJJI(r3)
        Lb8:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L8c
            android.view.SurfaceView r1 = r7.LL
            X.0oSq r0 = r7.LLJI
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r1, r0)
            goto L8c
        Lc4:
            r7.LLJJ = r4
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper.u(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oSq] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oSp] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0oSa, android.view.SurfaceHolder$Callback] */
    public SurfaceViewWrapper(int i, int i2, ViewGroup viewGroup) {
        int i3;
        int iLIZIZ;
        this.LLILLJJLI = new LinkedHashSet();
        ?? r2 = new SurfaceHolder.Callback() { // from class: X.0oSa
            /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
            @Override // android.view.SurfaceHolder.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void surfaceCreated(android.view.SurfaceHolder r7) {
                /*
                    Method dump skipped, instruction units count: 500
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolderCallbackC1473980oSa.surfaceCreated(android.view.SurfaceHolder):void");
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Surface surface;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("surfaceDestroyed, surface = ");
                    sbLIZ.append(surfaceHolder.getSurface());
                    sbLIZ.append(", mSurfaceView:");
                    sbLIZ.append(this.LL.LL);
                    C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (C1472280oPq.LIZLLL()) {
                    InterfaceC1472350oPx interfaceC1472350oPxLIZIZ = C1472280oPq.LIZIZ(surfaceHolder.getSurface());
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("surfaceDestroyed mSurfaceControlSession:");
                        sbLIZ2.append(interfaceC1472350oPxLIZIZ);
                        C1481110oe5.LIZIZ("SurfaceViewWrapper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (interfaceC1472350oPxLIZIZ != null) {
                        interfaceC1472350oPxLIZIZ.LIZIZ(null, 0, 0);
                    }
                }
                if (((Boolean) C1474810oTv.Q2.getValue()).booleanValue()) {
                    SurfaceViewWrapper surfaceViewWrapper = this.LL;
                    SurfaceView surfaceView = surfaceViewWrapper.LL;
                    if (surfaceView instanceof C1473990oSb) {
                        C1473990oSb c1473990oSb2 = (C1473990oSb) surfaceView;
                        if (c1473990oSb2.LLILLJJLI) {
                            c1473990oSb2.LLILLJJLI = false;
                            surfaceViewWrapper.LLJ = true;
                            return;
                        }
                    }
                }
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                InterfaceC1474000oSc interfaceC1474000oSc = this.LL.LLILZLL;
                if (interfaceC1474000oSc != null) {
                    interfaceC1474000oSc.LIZLLL();
                }
                if (((Boolean) C1474810oTv.D4.getValue()).booleanValue()) {
                    C1471640oOo.LIZ.remove(this.LL.LL.getHolder().getSurface());
                    if (C1474810oTv.LJJJJLI() && (surface = this.LL.LL.getHolder().getSurface()) != null) {
                        C1471640oOo.LIZIZ.remove(surface);
                    }
                    C1471640oOo.LJ.remove(this.LL.LL.getHolder().getSurface());
                    C1471640oOo.LIZLLL(this.LL.LL.getHolder().getSurface());
                }
                this.LL.LLJ = true;
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i22, int i32) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("surfaceChanged, surface = ");
                    sbLIZ.append(surfaceHolder.getSurface());
                    sbLIZ.append(", widthXheight: ");
                    sbLIZ.append(i22);
                    sbLIZ.append("X");
                    sbLIZ.append(i32);
                    sbLIZ.append(", mSurfaceView:");
                    sbLIZ.append(this.LL.LL);
                    C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (C1472280oPq.LIZLLL()) {
                    InterfaceC1472350oPx interfaceC1472350oPxLIZIZ = C1472280oPq.LIZIZ(surfaceHolder.getSurface());
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("surfaceChanged mSurfaceControlSession:");
                        sbLIZ2.append(interfaceC1472350oPxLIZIZ);
                        C1481110oe5.LIZIZ("SurfaceViewWrapper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (interfaceC1472350oPxLIZIZ != null && interfaceC1472350oPxLIZIZ.LIZ(this.LL.LL)) {
                        interfaceC1472350oPxLIZIZ.LIZIZ(this.LL.LL.getSurfaceControl(), Integer.valueOf(this.LL.LL.getWidth()), Integer.valueOf(this.LL.LL.getHeight()));
                    }
                }
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LLF(i22, i32);
                }
            }
        };
        this.LLIZ = r2;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJI = new Runnable() { // from class: X.0oSq
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                Rect rectLJJIFFI;
                C1C7U.LIZ("SurfaceViewWrapper@341d.<field>$2");
                try {
                    SurfaceViewWrapper surfaceViewWrapper = this.LL;
                    SurfaceView surfaceView = surfaceViewWrapper.LL;
                    if (surfaceView != null && !surfaceViewWrapper.LLJILJILJ && (rectLJJIFFI = surfaceViewWrapper.LJJIFFI(surfaceView)) != null && (rectLJJIFFI.isEmpty() || rectLJJIFFI.centerX() < C0FV2.LIZIZ(surfaceView.getContext()))) {
                        C786410Ut5.LLIIII(surfaceView, 4);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SurfaceViewWrapper@341d.<field>$2");
            }
        };
        this.LLJIJIL = new Runnable() { // from class: X.0oSp
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                Rect rectLJJIFFI;
                C1C7U.LIZ("SurfaceViewWrapper@341d.<field>$3");
                try {
                    SurfaceViewWrapper surfaceViewWrapper = this.LL;
                    SurfaceView surfaceView = surfaceViewWrapper.LL;
                    if (surfaceView != null && !surfaceViewWrapper.LLJILJILJ && (rectLJJIFFI = surfaceViewWrapper.LJJIFFI(surfaceView)) != null && rectLJJIFFI.centerX() < C0FV2.LIZIZ(surfaceView.getContext())) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("SurfaceView", "SurfaceViewWrapper, abnormal case, unselected SurfaceView still on screen, try set gone/visible");
                        }
                        C786410Ut5.LLIIII(surfaceView, 8);
                        C786410Ut5.LLIIII(surfaceView, 0);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SurfaceViewWrapper@341d.<field>$3");
            }
        };
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        View view = (View) viewGroup.getParent();
        if (view != null) {
            InterfaceC1474150oSr interfaceC1474150oSr = (InterfaceC1474150oSr) view.getTag(R.id.vbj);
            this.LLILZ = interfaceC1474150oSr;
            if (interfaceC1474150oSr != null) {
                SurfaceView surfaceViewLIZ = interfaceC1474150oSr.LIZ();
                this.LL = surfaceViewLIZ;
                surfaceViewLIZ.getHolder().addCallback(r2);
                return;
            }
        }
        if (((Boolean) C1474810oTv.o2.getValue()).booleanValue() && !LLJJIII) {
            iLIZIZ = C0FV2.LIZIZ(viewGroup.getContext());
            if (i > 0 && i2 > 0 && iLIZIZ > 0) {
                i3 = (i2 * iLIZIZ) / i;
            } else {
                i3 = -1;
                iLIZIZ = -1;
            }
            LLJJIII = true;
        } else {
            i3 = -1;
            iLIZIZ = -1;
        }
        C1473990oSb c1473990oSb = new C1473990oSb(viewGroup.getContext());
        c1473990oSb.setRelatedSurfaceHolder(this);
        this.LL = c1473990oSb;
        if (viewGroup instanceof FrameLayout) {
            c1473990oSb.LIZJ(new FrameLayout.LayoutParams(iLIZIZ, i3, 17), LLJJI);
            viewGroup.addView(c1473990oSb, 0);
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLIZIZ, i3);
            layoutParams.addRule(13, -1);
            c1473990oSb.LIZJ(layoutParams, LLJJI);
            viewGroup.addView(c1473990oSb, 0);
        } else {
            c1473990oSb.LIZJ(new ViewGroup.LayoutParams(iLIZIZ, i3), LLJJI);
            viewGroup.addView(c1473990oSb, 0);
        }
        LJJII();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIJ(float f, int i, int i2, int i3) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onScrolling, translate back the surface = ");
            sbLIZ.append(getSurface());
            C1481110oe5.LIZIZ("SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!this.LLJILJILJ && this.LL.getVisibility() != 0) {
            C786410Ut5.LLIIII(this.LL, 0);
        }
        KeyEvent.Callback callback = this.LL;
        if (callback instanceof InterfaceC1474060oSi) {
            ((InterfaceC1474060oSi) callback).LJIIIIZZ(0.0f, "SurfaceViewWrapper");
        } else {
            C786410Ut5.Ic(this.LL, 0.0f);
        }
        this.LLJILLL = true;
    }
}
