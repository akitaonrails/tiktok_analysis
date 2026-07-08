package kotlin.jvm.internal;

import X.C09AY;
import X.C1618940sEO;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS1S0003000_24 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f967i0;
    public int i1;
    public int i2;

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

    public static final Object invoke$0(AwS1S0003000_24 awS1S0003000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Gate] filtered strategy=");
        sbLIZ.append(awS1S0003000_24.f967i0);
        sbLIZ.append(" reason=unwatched_below_threshold unwatched=");
        sbLIZ.append(awS1S0003000_24.i1);
        sbLIZ.append(" threshold=");
        sbLIZ.append(awS1S0003000_24.i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS1S0003000_24 awS1S0003000_24) {
        int iIntValue;
        int iIntValue2;
        C1618940sEO c1618940sEO = C1618940sEO.LIZ;
        int i = awS1S0003000_24.f967i0;
        Integer numValueOf = Integer.valueOf(awS1S0003000_24.i1);
        Integer numValueOf2 = Integer.valueOf(awS1S0003000_24.i2);
        c1618940sEO.getClass();
        if (C1618940sEO.LIZLLL.compareAndSet(false, true)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = C1618940sEO.LIZIZ.get();
            }
            c2344009Gk.LIZJ(iIntValue, "change_count");
            c2344009Gk.LIZJ(i, "trigger_type");
            if (numValueOf2 != null) {
                iIntValue2 = numValueOf2.intValue();
            } else {
                iIntValue2 = C1618940sEO.LIZJ.get();
            }
            c2344009Gk.LIZJ(iIntValue2, "cache_change_count");
            C20684815ws.LJIILLIIL("inbox_badge_change", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0003000_24(int i, int i2, int i3, int i4) {
        super(0);
        this.$t = i4;
        this.f967i0 = i;
        this.i1 = i2;
        this.i2 = i3;
    }
}
