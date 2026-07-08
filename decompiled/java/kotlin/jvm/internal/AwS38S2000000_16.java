package kotlin.jvm.internal;

import X.C09AY;
import X.C1020020ceO;
import X.C2095008Iq;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public class AwS38S2000000_16 extends C09AY implements Function2 {
    public final int $t;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S2000000_16(String str, String str2, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }

    public static final Object invoke$0(AwS38S2000000_16 awS38S2000000_16, Object obj, Object obj2) {
        Long lLJIILIIL;
        C1020020ceO c1020020ceO = (C1020020ceO) obj;
        if (((Boolean) obj2).booleanValue()) {
            c1020020ceO.LIZLLL = awS38S2000000_16.s0;
            return c1020020ceO;
        }
        String str = awS38S2000000_16.s1;
        if (str != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str);
        } else {
            lLJIILIIL = null;
        }
        c1020020ceO.LJ.LIZIZ("ad_id", lLJIILIIL);
        return c1020020ceO;
    }

    public static final Object invoke$1(AwS38S2000000_16 awS38S2000000_16, Object obj, Object obj2) {
        C1020020ceO c1020020ceO = (C1020020ceO) obj;
        if (((Boolean) obj2).booleanValue()) {
            c1020020ceO.LIZLLL = awS38S2000000_16.s0;
            return c1020020ceO;
        }
        c1020020ceO.LJ.LIZIZ("ad_id", C2095008Iq.LJIILIIL(awS38S2000000_16.s1));
        return c1020020ceO;
    }

    public static final Object invoke$2(AwS38S2000000_16 awS38S2000000_16, Object obj, Object obj2) {
        C1020020ceO c1020020ceO = (C1020020ceO) obj;
        if (((Boolean) obj2).booleanValue()) {
            c1020020ceO.LIZLLL = awS38S2000000_16.s0;
            return c1020020ceO;
        }
        c1020020ceO.LJ.LIZIZ("ad_id", C2095008Iq.LJIILIIL(awS38S2000000_16.s1));
        return c1020020ceO;
    }
}
