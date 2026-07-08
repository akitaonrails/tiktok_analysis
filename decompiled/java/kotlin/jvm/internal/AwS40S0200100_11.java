package kotlin.jvm.internal;

import X.C09AY;
import X.C0RQ5;
import X.C2188811AlT;
import X.C238400w2;
import X.C700970ReZ;
import X.C701010Red;
import X.C786410Ut5;
import X.EnumC697300RWu;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS40S0200100_11 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS40S0200100_11 awS40S0200100_11) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(awS40S0200100_11.j2);
        sbLIZ.append(" --- ");
        C700970ReZ c700970ReZ = ((C701010Red) awS40S0200100_11.l0).node;
        if (c700970ReZ != null) {
            str = c700970ReZ.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" --- FcpReleaseTask#compute end, duration: ");
        sbLIZ.append(awS40S0200100_11.j2 - ((C238400w2) awS40S0200100_11.l1).element);
        sbLIZ.append(" --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS40S0200100_11 awS40S0200100_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableMockExcuteAB ");
        sbLIZ.append((C0RQ5) awS40S0200100_11.l0);
        sbLIZ.append('_');
        sbLIZ.append((EnumC697300RWu) awS40S0200100_11.l1);
        sbLIZ.append(" , time: ");
        sbLIZ.append(awS40S0200100_11.j2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0200100_11(long j, C701010Red c701010Red, C238400w2 c238400w2, int i) {
        super(0);
        this.$t = i;
        this.j2 = j;
        this.l0 = c701010Red;
        this.l1 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0200100_11(C0RQ5 c0rq5, EnumC697300RWu enumC697300RWu, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0rq5;
        this.l1 = enumC697300RWu;
        this.j2 = j;
    }
}
