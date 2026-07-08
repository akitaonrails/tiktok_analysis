package kotlin.jvm.internal;

import X.AbstractC1066890drz;
import X.AbstractC707180Roa;
import X.C09AY;
import X.C1066900ds0;
import X.C1392540mLE;
import X.C1393590mMv;
import X.C2344009Gk;
import X.C712520RxC;
import X.InterfaceC1393560mMs;
import X.InterfaceC1631620sYq;
import X.InterfaceC705550Rlx;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS24S0600000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS24S0600000_21 awS24S0600000_21) {
        C712520RxC c712520RxC = (C712520RxC) awS24S0600000_21.l2;
        C1393590mMv c1393590mMv = (C1393590mMv) awS24S0600000_21.l3;
        InterfaceC705550Rlx interfaceC705550Rlx = (InterfaceC705550Rlx) awS24S0600000_21.l4;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS24S0600000_21.l5;
        C1393590mMv.LJIILJJIL((AbstractC707180Roa) awS24S0600000_21.l1, interfaceC705550Rlx, (InterfaceC1393560mMs) awS24S0600000_21.l0, c712520RxC, c1393590mMv, interfaceC1631620sYq);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S0600000_21 awS24S0600000_21) {
        if (((AbstractC707180Roa) awS24S0600000_21.l0).LJIIJJI()) {
            AbstractC707180Roa abstractC707180Roa = (AbstractC707180Roa) awS24S0600000_21.l0;
            C712520RxC c712520RxC = (C712520RxC) awS24S0600000_21.l1;
            String strLJIIJ = abstractC707180Roa.LJIIJ(C1392540mLE.LIZIZ(c712520RxC, (InterfaceC1393560mMs) awS24S0600000_21.l2, ((C1393590mMv) awS24S0600000_21.l3).LJI(c712520RxC)));
            C1393590mMv c1393590mMv = (C1393590mMv) awS24S0600000_21.l3;
            C1066900ds0 c1066900ds0 = c1393590mMv.LIZIZ;
            if (c1066900ds0 != null) {
                c1393590mMv.LJIIIIZZ(c1066900ds0, new AwS71S1000000_21(strLJIIJ, 3));
            }
            InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) awS24S0600000_21.l2;
            AbstractC1066890drz abstractC1066890drz = (AbstractC1066890drz) interfaceC1393560mMs;
            C712520RxC c712520RxC2 = (C712520RxC) awS24S0600000_21.l1;
            boolean zLJI = ((C1393590mMv) awS24S0600000_21.l3).LJI(c712520RxC2);
            String str = "click_anchor";
            if (!Intrinsics.LJFF(strLJIIJ, "click_anchor")) {
                str = "click_list";
            }
            C2344009Gk c2344009GkLIZ = C1392540mLE.LIZ(interfaceC1393560mMs, c712520RxC2, str, zLJI);
            HashMap<String, String> showContentInfo = ((AbstractC707180Roa) awS24S0600000_21.l0).getShowContentInfo();
            if (showContentInfo != null) {
                for (Map.Entry<String, String> entry : showContentInfo.entrySet()) {
                    c2344009GkLIZ.LJFF(entry.getKey(), entry.getValue());
                }
            }
            abstractC1066890drz.LJJIIJ(c2344009GkLIZ);
        } else {
            C712520RxC c712520RxC3 = (C712520RxC) awS24S0600000_21.l1;
            C1393590mMv c1393590mMv2 = (C1393590mMv) awS24S0600000_21.l3;
            InterfaceC705550Rlx interfaceC705550Rlx = (InterfaceC705550Rlx) awS24S0600000_21.l4;
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS24S0600000_21.l5;
            C1393590mMv.LJIILJJIL((AbstractC707180Roa) awS24S0600000_21.l0, interfaceC705550Rlx, (InterfaceC1393560mMs) awS24S0600000_21.l2, c712520RxC3, c1393590mMv2, interfaceC1631620sYq);
            C1393590mMv c1393590mMv3 = (C1393590mMv) awS24S0600000_21.l3;
            C1066900ds0 c1066900ds02 = c1393590mMv3.LIZIZ;
            if (c1066900ds02 != null) {
                c1393590mMv3.LJIIIIZZ(c1066900ds02, AFwS259S0000000_21.get$arr$(350));
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS24S0600000_21(X.AbstractC707180Roa r3, X.InterfaceC705550Rlx r4, X.InterfaceC1393560mMs r5, X.C712520RxC r6, X.C1393590mMv r7, kotlin.jvm.internal.AwS318S0300000_21 r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            if (r9 == 0) goto L16
            r1 = r2
            r1.l0 = r3
            r1.l1 = r6
            r1.l2 = r5
            r1.l3 = r7
            r1.l4 = r4
            r1.l5 = r8
            r0 = 0
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r6
            r1.l3 = r7
            r1.l4 = r4
            r1.l5 = r8
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS24S0600000_21.<init>(X.0Roa, X.0Rlx, X.0mMs, X.0RxC, X.0mMv, kotlin.jvm.internal.AwS318S0300000_21, int):void");
    }
}
