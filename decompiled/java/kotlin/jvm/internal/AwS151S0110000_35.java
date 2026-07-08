package kotlin.jvm.internal;

import X.C09AY;
import X.C15CK;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2255631DQj;
import X.C2255641DQk;
import X.C2268161DqA;
import X.C500260Jjc;
import X.C769520UGo;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS151S0110000_35 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS151S0110000_35 awS151S0110000_35) {
        super/*android.view.ViewGroup*/.requestDisallowInterceptTouchEvent(awS151S0110000_35.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS151S0110000_35 awS151S0110000_35) {
        super/*android.widget.FrameLayout*/.requestDisallowInterceptTouchEvent(awS151S0110000_35.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS151S0110000_35 awS151S0110000_35) {
        C15CK c15ck = (C15CK) ((C2268161DqA) awS151S0110000_35.l0).LIZLLL.gg0(C769520UGo.class);
        String strLJIIL = null;
        boolean z = false;
        if (c15ck == null) {
            String str = ((C2268161DqA) awS151S0110000_35.l0).LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setMediaOverlay, scene:");
            sbLIZ.append(((C2268161DqA) awS151S0110000_35.l0).LIZJ());
            sbLIZ.append(", startFlag: ");
            sbLIZ.append(((C2268161DqA) awS151S0110000_35.l0).LJFF);
            sbLIZ.append(", isMediaOverlay:");
            sbLIZ.append(awS151S0110000_35.z1);
            sbLIZ.append(", anchorRTCView: ");
            sbLIZ.append((String) null);
            sbLIZ.append(", result:");
            sbLIZ.append(false);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            try {
                C2268161DqA c2268161DqA = (C2268161DqA) awS151S0110000_35.l0;
                if (c2268161DqA.LJFF) {
                    boolean z2 = awS151S0110000_35.z1;
                    if (c15ck.LIZIZ(c2268161DqA)) {
                        View view = c15ck.LIZIZ;
                        if (view instanceof SurfaceView) {
                            ((SurfaceView) view).setZOrderMediaOverlay(z2);
                        }
                        z = true;
                    }
                }
                String str2 = ((C2268161DqA) awS151S0110000_35.l0).LJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setMediaOverlay, scene:");
                sbLIZ2.append(((C2268161DqA) awS151S0110000_35.l0).LIZJ());
                sbLIZ2.append(", startFlag: ");
                sbLIZ2.append(((C2268161DqA) awS151S0110000_35.l0).LJFF);
                sbLIZ2.append(", isMediaOverlay:");
                sbLIZ2.append(awS151S0110000_35.z1);
                sbLIZ2.append(", anchorRTCView: ");
                View view2 = c15ck.LIZIZ;
                if (view2 != null) {
                    strLJIIL = C500260Jjc.LJIIL(view2);
                }
                sbLIZ2.append(strLJIIL);
                sbLIZ2.append(", result:");
                sbLIZ2.append(z);
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str3 = ((C2268161DqA) awS151S0110000_35.l0).LJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setMediaOverlay, scene:");
                sbLIZ3.append(((C2268161DqA) awS151S0110000_35.l0).LIZJ());
                sbLIZ3.append(", startFlag: ");
                sbLIZ3.append(((C2268161DqA) awS151S0110000_35.l0).LJFF);
                sbLIZ3.append(", isMediaOverlay:");
                sbLIZ3.append(awS151S0110000_35.z1);
                sbLIZ3.append(", anchorRTCView: ");
                View view3 = c15ck.LIZIZ;
                if (view3 != null) {
                    strLJIIL = C500260Jjc.LJIIL(view3);
                }
                sbLIZ3.append(strLJIIL);
                sbLIZ3.append(", result:");
                sbLIZ3.append(false);
                C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS151S0110000_35 awS151S0110000_35) {
        C15CK c15ck = (C15CK) ((C2268161DqA) awS151S0110000_35.l0).LIZLLL.gg0(C769520UGo.class);
        String strLJIIL = null;
        boolean zLJ = false;
        if (c15ck == null) {
            String str = ((C2268161DqA) awS151S0110000_35.l0).LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVisible, scene:");
            sbLIZ.append(((C2268161DqA) awS151S0110000_35.l0).LIZJ());
            sbLIZ.append(", startFlag: ");
            sbLIZ.append(((C2268161DqA) awS151S0110000_35.l0).LJFF);
            sbLIZ.append(", visible:");
            sbLIZ.append(awS151S0110000_35.z1);
            sbLIZ.append(", anchorRTCView: ");
            sbLIZ.append((String) null);
            sbLIZ.append(", result:");
            sbLIZ.append(false);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            try {
                C2268161DqA c2268161DqA = (C2268161DqA) awS151S0110000_35.l0;
                if (c2268161DqA.LJFF) {
                    zLJ = c15ck.LJ(c2268161DqA, awS151S0110000_35.z1);
                }
                String str2 = ((C2268161DqA) awS151S0110000_35.l0).LJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setVisible, scene:");
                sbLIZ2.append(((C2268161DqA) awS151S0110000_35.l0).LIZJ());
                sbLIZ2.append(", startFlag: ");
                sbLIZ2.append(((C2268161DqA) awS151S0110000_35.l0).LJFF);
                sbLIZ2.append(", visible:");
                sbLIZ2.append(awS151S0110000_35.z1);
                sbLIZ2.append(", anchorRTCView: ");
                View view = c15ck.LIZIZ;
                if (view != null) {
                    strLJIIL = C500260Jjc.LJIIL(view);
                }
                sbLIZ2.append(strLJIIL);
                sbLIZ2.append(", result:");
                sbLIZ2.append(zLJ);
                C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str3 = ((C2268161DqA) awS151S0110000_35.l0).LJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setVisible, scene:");
                sbLIZ3.append(((C2268161DqA) awS151S0110000_35.l0).LIZJ());
                sbLIZ3.append(", startFlag: ");
                sbLIZ3.append(((C2268161DqA) awS151S0110000_35.l0).LJFF);
                sbLIZ3.append(", visible:");
                sbLIZ3.append(awS151S0110000_35.z1);
                sbLIZ3.append(", anchorRTCView: ");
                View view2 = c15ck.LIZIZ;
                if (view2 != null) {
                    strLJIIL = C500260Jjc.LJIIL(view2);
                }
                sbLIZ3.append(strLJIIL);
                sbLIZ3.append(", result:");
                sbLIZ3.append(false);
                C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
                throw th;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0110000_35(C2255631DQj c2255631DQj, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2255631DQj;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0110000_35(C2255641DQk c2255641DQk, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2255641DQk;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS151S0110000_35(C2268161DqA c2268161DqA, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2268161DqA;
        this.z1 = z;
    }
}
