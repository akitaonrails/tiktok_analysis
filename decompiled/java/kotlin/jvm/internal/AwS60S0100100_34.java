package kotlin.jvm.internal;

import X.C09AY;
import X.C1306060k5k;
import X.C2192231Aqz;
import X.C2239731ClP;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS60S0100100_34 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS60S0100100_34 awS60S0100100_34, Object obj) {
        int iIntValue;
        Number number = (Number) ((C1306060k5k) obj).LIZ("preload_count");
        if (number != null) {
            iIntValue = number.intValue();
        } else {
            iIntValue = 0;
        }
        C2239731ClP c2239731ClP = (C2239731ClP) awS60S0100100_34.l0;
        if (iIntValue <= 0) {
            iIntValue = 2;
        }
        c2239731ClP.LJIJI = iIntValue;
        c2239731ClP.LJIIJ = awS60S0100100_34.j1;
        c2239731ClP.LJIIJ(-1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS60S0100100_34 awS60S0100100_34, Object obj) {
        super/*X.1Ar1*/.LJIIIIZZ((String) obj, awS60S0100100_34.j1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S0100100_34(long j, C2192231Aqz c2192231Aqz, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2192231Aqz;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S0100100_34(C2239731ClP c2239731ClP, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2239731ClP;
        this.j1 = j;
    }
}
