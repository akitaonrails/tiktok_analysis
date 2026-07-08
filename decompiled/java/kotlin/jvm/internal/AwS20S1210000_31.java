package kotlin.jvm.internal;

import X.C09AY;
import X.C15Y1;
import X.C15YE;
import X.C15YG;
import X.C15YK;
import X.C20663515tR;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS20S1210000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS20S1210000_31 r4) {
        /*
            java.lang.Object r0 = r4.l1
            X.15tR r0 = (X.C20663515tR) r0
            java.lang.ref.WeakReference<X.15tS> r0 = r0.LL
            if (r0 == 0) goto L48
            java.lang.Object r3 = r0.get()
            X.15tS r3 = (X.InterfaceC20663615tS) r3
        Le:
            boolean r0 = r3 instanceof X.C20663915tV
            if (r0 == 0) goto L3a
            r2 = r3
            X.15tV r2 = (X.C20663915tV) r2
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r0 = r2.LLILLJJLI
            int r1 = r0.getType()
            r0 = 21
            if (r1 != r0) goto L3a
            java.lang.Object r0 = r4.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r2.LLILZLL = r0
        L25:
            boolean r0 = r4.z3
            if (r0 == 0) goto L31
            if (r3 == 0) goto L2e
            r3.dismiss()
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            if (r3 == 0) goto L2e
            r1 = 0
            java.lang.String r0 = r4.s0
            r3.LJIJI(r0, r1)
            goto L2e
        L3a:
            boolean r0 = r3 instanceof X.C20671715ul
            if (r0 == 0) goto L25
            r1 = r3
            X.15ul r1 = (X.C20671715ul) r1
            java.lang.Object r0 = r4.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r1.LLJIJIL = r0
            goto L25
        L48:
            r3 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS20S1210000_31.invoke$0(kotlin.jvm.internal.AwS20S1210000_31):java.lang.Object");
    }

    public static final Object invoke$1(AwS20S1210000_31 awS20S1210000_31) {
        String str;
        C15YE.LIZ.getClass();
        C15YE.LJFF = false;
        if (awS20S1210000_31.z3) {
            C15YG c15yg = (C15YG) awS20S1210000_31.l1;
            String str2 = awS20S1210000_31.s0;
            c15yg.getClass();
            if (Intrinsics.LJFF(str2, "cold_launch")) {
                int i = C15Y1.LIZ[FamilyPairingManagerV2.LIZ.LIZIZ().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        str = "parent";
                    }
                } else {
                    str = "teen";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("role", str);
                C20684815ws.LJIILLIIL("fp_status", c2344009Gk.LIZ);
            }
            C15YK c15yk = (C15YK) awS20S1210000_31.l2;
            if (c15yk != null) {
                c15yk.onSuccess();
            }
        } else {
            C15YK c15yk2 = (C15YK) awS20S1210000_31.l2;
            if (c15yk2 != null) {
                c15yk2.onFailed(new Exception());
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS20S1210000_31(C20663515tR c20663515tR, C20663515tR c20663515tR2, Function0<Unit> function0, boolean z, String str) {
        super(0);
        this.$t = str;
        this.l1 = c20663515tR;
        this.l2 = c20663515tR2;
        this.z3 = function0;
        this.s0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1210000_31(boolean z, C15YG c15yg, String str, C15YK c15yk, int i) {
        super(0);
        this.$t = i;
        this.z3 = z;
        this.l1 = c15yg;
        this.s0 = str;
        this.l2 = c15yk;
    }
}
