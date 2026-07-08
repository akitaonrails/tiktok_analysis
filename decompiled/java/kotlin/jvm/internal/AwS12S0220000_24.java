package kotlin.jvm.internal;

import X.AbstractC1609640rzO;
import X.C09AY;
import X.C1579450rCh;
import X.C1579990rDZ;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS12S0220000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
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

    public static final Object invoke$0(AwS12S0220000_24 awS12S0220000_24) {
        C1579450rCh c1579450rChLIZ = C1579450rCh.LIZ((C1579450rCh) awS12S0220000_24.l0, null, null, new C1579990rDZ(awS12S0220000_24.z2, !awS12S0220000_24.z3), null, null, null, 59);
        if (awS12S0220000_24.z3) {
            ((BaseSeriesSkyLightVM) awS12S0220000_24.l1).setStateImmediate(new AwS603S0100000_24(c1579450rChLIZ, 3));
        } else {
            ((BaseSeriesSkyLightVM) awS12S0220000_24.l1).setState(new AwS603S0100000_24(c1579450rChLIZ, 4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S0220000_24 awS12S0220000_24) {
        ((AbstractC1609640rzO) awS12S0220000_24.l0).LJIILIIL(awS12S0220000_24.l1, awS12S0220000_24.z2, awS12S0220000_24.z3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0220000_24(C1579450rCh c1579450rCh, boolean z, boolean z2, BaseSeriesSkyLightVM baseSeriesSkyLightVM, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1579450rCh;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = baseSeriesSkyLightVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0220000_24(AbstractC1609640rzO abstractC1609640rzO, Object obj, boolean z, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1609640rzO;
        this.l1 = obj;
        this.z2 = z;
        this.z3 = z2;
    }
}
