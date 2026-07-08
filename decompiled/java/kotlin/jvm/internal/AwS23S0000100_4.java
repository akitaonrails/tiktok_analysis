package kotlin.jvm.internal;

import X.C09AY;
import X.C1736830vIX;
import X.C1834780xqW;
import X.C1863800ybK;
import X.C2188811AlT;
import X.C323870Cmn;
import X.C491001vg;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AwS23S0000100_4 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0000100_4(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS23S0000100_4 awS23S0000100_4, Object obj) {
        long j = awS23S0000100_4.j0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Do not have musics for ");
        sbLIZ.append(awS23S0000100_4.j0);
        return C1834780xqW.LIZ((C1834780xqW) obj, null, null, null, null, null, null, null, null, null, null, null, null, new C491001vg(new C323870Cmn(j, -1L, C2188811AlT.LIZIZ(sbLIZ), new Exception())), null, null, null, null, null, null, 520191);
    }

    public static final Object invoke$1(AwS23S0000100_4 awS23S0000100_4, Object obj) {
        return C1736830vIX.LIZ((C1736830vIX) obj, null, null, null, null, null, null, null, null, null, awS23S0000100_4.j0, null, null, null, null, 4128767);
    }

    public static final Object invoke$2(AwS23S0000100_4 awS23S0000100_4, Object obj) {
        ((C1863800ybK) obj).LIZLLL = Long.valueOf(awS23S0000100_4.j0);
        return Unit.LIZ;
    }
}
