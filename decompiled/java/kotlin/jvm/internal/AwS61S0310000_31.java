package kotlin.jvm.internal;

import X.C09AY;
import X.C20360614lg;
import X.C20377014oK;
import X.C20663515tR;
import X.C20665215ti;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public class AwS61S0310000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
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

    public static final Object invoke$0(AwS61S0310000_31 awS61S0310000_31) {
        C20377014oK c20377014oK = (C20377014oK) awS61S0310000_31.l0;
        c20377014oK.LIZLLL.LJIIL(c20377014oK.LJFF, (Playbook) awS61S0310000_31.l1, (C20360614lg) awS61S0310000_31.l2, awS61S0310000_31.z3, c20377014oK.LJIIIIZZ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS61S0310000_31 r5) {
        /*
            boolean r0 = X.C20731216Ak.LIZ()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r5.l0
            X.15ti r0 = (X.C20665215ti) r0
            if (r0 == 0) goto L32
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r0 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r0
            int r0 = r0.getType()
            X.10jy r2 = X.C20641815pw.LIZ(r0)
            if (r2 == 0) goto L2f
            java.lang.Object r1 = r5.l2
            X.15tR r1 = (X.C20663515tR) r1
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r0 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r0
            X.15tU r1 = r2.LJIIIZ(r1, r0)
            if (r1 == 0) goto L2f
            java.lang.Object r0 = r5.l0
            X.15ti r0 = (X.C20665215ti) r0
            r0.LIZ(r1)
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            java.lang.Object r0 = r5.l2
            X.15tR r0 = (X.C20663515tR) r0
            java.lang.ref.WeakReference<X.15tS> r0 = r0.LL
            r4 = 0
            if (r0 == 0) goto L68
            java.lang.Object r0 = r0.get()
            X.15tS r0 = (X.InterfaceC20663615tS) r0
            if (r0 == 0) goto L68
            X.15ti r3 = r0.LJIILLIIL()
            if (r3 == 0) goto L68
            java.lang.Object r2 = r5.l1
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r2 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r2
            java.lang.Object r1 = r5.l2
            X.15tR r1 = (X.C20663515tR) r1
            int r0 = r2.getType()
            X.10jy r0 = X.C20641815pw.LIZ(r0)
            if (r0 == 0) goto L68
            X.15tU r0 = r0.LJIIIZ(r1, r2)
            if (r0 == 0) goto L68
            r3.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L2f
        L68:
            java.lang.Object r3 = r5.l2
            X.15tR r3 = (X.C20663515tR) r3
            boolean r2 = r5.z3
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r1 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r1
            java.lang.ref.WeakReference<X.15tS> r0 = r3.LL
            if (r0 == 0) goto L7a
            java.lang.Object r4 = r0.get()
        L7a:
            boolean r0 = r4 instanceof X.C20671715ul
            if (r0 == 0) goto L2f
            if (r2 != 0) goto L2f
            int r0 = r1.getType()
            X.10jy r0 = X.C20641815pw.LIZ(r0)
            if (r0 == 0) goto L2f
            X.15tU r0 = r0.LJIIIZ(r3, r1)
            if (r0 == 0) goto L2f
            android.view.View r1 = r0.LIZIZ
            int r0 = r0.LIZ
            X.C1276704z7.LIZ(r0, r1)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS61S0310000_31.invoke$1(kotlin.jvm.internal.AwS61S0310000_31):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0310000_31(C20377014oK c20377014oK, Playbook playbook, C20360614lg c20360614lg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20377014oK;
        this.l1 = playbook;
        this.l2 = c20360614lg;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0310000_31(C20665215ti c20665215ti, InnerPushMessage innerPushMessage, C20663515tR c20663515tR, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20665215ti;
        this.l1 = innerPushMessage;
        this.l2 = c20663515tR;
        this.z3 = z;
    }
}
