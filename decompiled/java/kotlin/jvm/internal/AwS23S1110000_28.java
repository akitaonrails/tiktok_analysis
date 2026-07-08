package kotlin.jvm.internal;

import X.C01U6;
import X.C09AY;
import X.C1536660q5g;
import X.C1536670q5h;
import X.C1537820q7Y;
import X.C1538260q8G;
import X.C1619720sFe;
import X.C1893940zNw;
import X.C1893960zNy;
import X.C1899490zWt;
import X.C2261111Den;
import X.C23250099c;
import X.C328090Ctb;
import X.C786410Ut5;
import X.InterfaceC1897260zTI;
import X.InterfaceC1910160zo6;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.incentive.crossplatform.experiment.IncentiveJsLogicModuleConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS23S1110000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S1110000_28 awS23S1110000_28) {
        if (((IncentiveJsLogicModuleConfig) C1893960zNy.LIZIZ.getValue()).enable) {
            ((C1893940zNw) awS23S1110000_28.l1).getClass();
            C1537820q7Y c1537820q7Y = C1538260q8G.LIZ;
            C1536660q5g.LIZ.getClass();
            C1536670q5h.LIZ.getClass();
            if (!C1536670q5h.LIZJ) {
                c1537820q7Y.LJ(null);
            }
            C1893940zNw c1893940zNw = (C1893940zNw) awS23S1110000_28.l1;
            C23250099c.LIZLLL(c1893940zNw.LIZIZ, null, null, new C328090Ctb(c1893940zNw, awS23S1110000_28.z2, awS23S1110000_28.s0, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S1110000_28 awS23S1110000_28) {
        ((C1899490zWt) awS23S1110000_28.l1).setCloseViewStatus(false);
        final C1899490zWt c1899490zWt = (C1899490zWt) awS23S1110000_28.l1;
        String str = awS23S1110000_28.s0;
        boolean z = awS23S1110000_28.z2;
        C786410Ut5.LLZZLLIL(c1899490zWt.getSmartImageView(), 8);
        C786410Ut5.LLLLLIL(c1899490zWt.getNormalLottieView(), 8);
        C786410Ut5.LLLLZLL(c1899490zWt.getPendantBottomTextView(), 8);
        if (c1899490zWt.LLLILZLLLI) {
            C01U6.LIZLLL(new AwS429S0200000_28(c1899490zWt, (C1899490zWt) null, (Function1<? super Boolean, Unit>) 142));
        } else {
            C786410Ut5.LLLLLIL(c1899490zWt.getShrinkLottieView(), 8);
            C786410Ut5.LLZZLLIL(c1899490zWt.getSmallSmartImageView(), 0);
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LJII(str, c1899490zWt.getSmallSmartImageView(), new InterfaceC1910160zo6() { // from class: X.0zWw
                    @Override // X.InterfaceC1910160zo6
                    public final void onComplete() {
                        C1899490zWt c1899490zWt2 = c1899490zWt;
                        c1899490zWt2.LLLIIIL = true;
                        C786410Ut5.LJZI(c1899490zWt.LLLIIII ? 0 : 8, c1899490zWt2.getCloseView());
                        C1879340z0O c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(1);
                        if (c1879340z0OLIZ == null || !(c1879340z0OLIZ instanceof C1897750zU5)) {
                            C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                            C1894330zOZ.LIZ().LJJIIZI();
                        }
                        c1899490zWt.getClass();
                        C1899490zWt.LJIILLIIL(1);
                    }

                    @Override // X.InterfaceC1910160zo6
                    public final void onFailed(Throwable th) {
                        c1899490zWt.LLLIIIL = false;
                        C1899490zWt.LJIILLIIL(0);
                    }
                });
            }
        }
        C01U6.LIZIZ(new AwS572S0100000_28(c1899490zWt, 1026));
        if (c1899490zWt.getParent() != null) {
            float fLJIIL = c1899490zWt.LJIIL(z);
            c1899490zWt.getTransitionAnimator().LIZIZ();
            c1899490zWt.animate().cancel();
            C2261111Den transitionAnimator = c1899490zWt.getTransitionAnimator();
            transitionAnimator.getClass();
            C01U6.LIZLLL(new AwS0S0210001_35(transitionAnimator, (C2261111Den) z, (boolean) fLJIIL, (float) null, (Function0<Unit>) 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1110000_28(C1893940zNw c1893940zNw, boolean z, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1893940zNw;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1110000_28(C1899490zWt c1899490zWt, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1899490zWt;
        this.s0 = str;
        this.z2 = z;
    }
}
