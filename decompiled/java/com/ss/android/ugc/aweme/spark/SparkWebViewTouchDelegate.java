package com.ss.android.ugc.aweme.spark;

import X.C01GW;
import X.C09CT;
import X.C1038820d8i;
import X.C1541810qDz;
import X.C1AF0;
import X.C341940Daq;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1541560qDa;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.s;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SparkWebViewTouchDelegate implements InterfaceC1541560qDa {
    public final WebKitView LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public View.OnTouchListener LIZLLL;
    public final boolean LJ;
    public DisableInterceptRegion[] LJFF;
    public boolean LJI;
    public long LJII;
    public final C01GW LJIIIIZZ;

    public static final class DisableInterceptRegion {

        @C09CT("height")
        public final double height;

        @C09CT("width")
        public final double width;

        @C09CT("x")
        public final double x;

        @C09CT("y")
        public final double y;

        public DisableInterceptRegion() {
            this(Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        }

        public DisableInterceptRegion(double d, double d2, double d3, double d4) {
            this.x = d;
            this.y = d2;
            this.width = d3;
            this.height = d4;
        }
    }

    @Override // X.InterfaceC1541560qDa
    public final boolean LIZ() {
        return System.currentTimeMillis() - this.LJII < this.LIZ.getTimeInterval();
    }

    @Override // X.InterfaceC1541560qDa
    public final boolean LIZIZ(boolean z) {
        if (this.LIZJ) {
            if (this.LIZIZ && z) {
                return true;
            }
            return false;
        }
        throw new C1541810qDz("An operation is not implemented");
    }

    public final void LIZJ(C1038820d8i c1038820d8i) {
        String strLJIL;
        n nVarLJIILIIL = GsonProtectorUtils.parse(new p(), C786410Ut5.J3(c1038820d8i.LIZ)).LJIILIIL();
        k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("eventName");
        DisableInterceptRegion[] disableInterceptRegionArr = null;
        if (kVarLJJIIZ != null) {
            strLJIL = kVarLJJIIZ.LJIL();
        } else {
            strLJIL = null;
        }
        if (Intrinsics.LJFF(strLJIL, "disableIntercept")) {
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("data");
            if (kVarLJJIIZ2 != null) {
                try {
                    disableInterceptRegionArr = (DisableInterceptRegion[]) GsonProtectorUtils.fromJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), kVarLJJIIZ2, DisableInterceptRegion[].class);
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
            this.LJFF = disableInterceptRegionArr;
        }
    }

    @Override // X.InterfaceC1541560qDa
    public final void onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.LJ) {
            this.LIZ.requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.LJI = false;
            this.LIZ.getLocationInWindow(new int[2]);
            int iLIZIZ = C341940Daq.LIZIZ(motionEvent.getRawX() - r2[0]);
            int iLIZIZ2 = C341940Daq.LIZIZ(motionEvent.getRawY() - r2[1]);
            DisableInterceptRegion[] disableInterceptRegionArr = this.LJFF;
            if (disableInterceptRegionArr != null) {
                for (DisableInterceptRegion disableInterceptRegion : disableInterceptRegionArr) {
                    double d = iLIZIZ;
                    double d2 = disableInterceptRegion.x;
                    if (d >= d2 && d <= d2 + disableInterceptRegion.width) {
                        double d3 = iLIZIZ2;
                        double d4 = disableInterceptRegion.y;
                        if (d3 >= d4 && d3 <= d4 + disableInterceptRegion.height) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                this.LJI = z;
            } else {
                z = false;
                this.LJI = z;
            }
        }
        if (this.LJI) {
            this.LIZ.requestDisallowInterceptTouchEvent(true);
        }
        if (this.LIZ.getCanTouch()) {
            ((GestureDetector) this.LJIIIIZZ.getValue()).onTouchEvent(motionEvent);
            View.OnTouchListener onTouchListener = this.LIZLLL;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this.LIZ, motionEvent);
            }
        }
        if (this.LIZJ) {
            if (!this.LIZIZ) {
                if (motionEvent.getAction() == 2) {
                    return;
                }
            } else {
                this.LIZ.requestDisallowInterceptTouchEvent(true);
            }
            throw new C1541810qDz("An operation is not implemented");
        }
        throw new C1541810qDz("An operation is not implemented");
    }

    public SparkWebViewTouchDelegate(WebKitView webKitView, boolean z, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 16) != 0 ? false : z;
        this.LIZ = webKitView;
        this.LIZIZ = z2;
        this.LIZJ = false;
        this.LIZLLL = null;
        this.LJ = z;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1047));
    }
}
