package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C700970ReZ;
import X.C701370RfD;
import X.C708120Rq6;
import X.C786410Ut5;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS66S0100100_11 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS66S0100100_11 awS66S0100100_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(awS66S0100100_11.j1);
        sbLIZ.append(" --- ");
        sbLIZ.append(((C700970ReZ) awS66S0100100_11.l0).LIZJ);
        sbLIZ.append(" --- doRecoverPolicyAction start --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS66S0100100_11 awS66S0100100_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(awS66S0100100_11.j1);
        sbLIZ.append(" --- ");
        sbLIZ.append(((C701370RfD) awS66S0100100_11.l0).LLILZIL);
        sbLIZ.append(" --- doRecoverFcpPolicy start --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS66S0100100_11 awS66S0100100_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(awS66S0100100_11.j1);
        sbLIZ.append(" --- ");
        sbLIZ.append(((C701370RfD) awS66S0100100_11.l0).LLILZIL);
        sbLIZ.append(" --- doRecoverFcpPolicy end --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS66S0100100_11 awS66S0100100_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C708120Rq6.LIZ((View) awS66S0100100_11.l0));
        sbLIZ.append(" onFirstContentfulPaint: ");
        sbLIZ.append(awS66S0100100_11.j1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0100100_11(long j, C700970ReZ c700970ReZ, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = c700970ReZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0100100_11(long j, C701370RfD c701370RfD, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = c701370RfD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0100100_11(long j, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.j1 = j;
    }
}
