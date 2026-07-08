package kotlin.jvm.internal;

import X.C09AY;
import X.C1346950l9h;
import X.C1347990lBN;
import X.C1348130lBb;
import X.C1348140lBc;
import X.C1352050lHv;
import X.C291001Au;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS5S0020000_21 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0020000_21(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
        this.z1 = z;
    }

    public static final Object invoke$0(AwS5S0020000_21 awS5S0020000_21, Object obj) {
        return C1347990lBN.LIZ((C1347990lBN) obj, null, new C1348130lBb(awS5S0020000_21.z0, awS5S0020000_21.z1), false, false, null, 239);
    }

    public static final Object invoke$1(AwS5S0020000_21 awS5S0020000_21, Object obj) {
        return C1347990lBN.LIZ((C1347990lBN) obj, new C1348140lBc(awS5S0020000_21.z0, awS5S0020000_21.z1), null, false, false, null, 253);
    }

    public static final Object invoke$2(AwS5S0020000_21 awS5S0020000_21, Object obj) {
        boolean z;
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        if (!awS5S0020000_21.z0 && awS5S0020000_21.z1) {
            z = true;
        } else {
            z = false;
        }
        return C1346950l9h.LIZ(c1346950l9h, null, false, 0, 0, null, z, false, false, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, false, false, null, null, false, null, -33);
    }

    public static final Object invoke$3(AwS5S0020000_21 awS5S0020000_21, Object obj) {
        return C1352050lHv.LIZ((C1352050lHv) obj, null, null, null, false, 0, null, null, null, null, false, null, new C291001Au(new Pair(Boolean.valueOf(awS5S0020000_21.z0), Boolean.valueOf(awS5S0020000_21.z1))), null, false, false, false, 1015807);
    }

    public static final Object invoke$4(AwS5S0020000_21 awS5S0020000_21, Object obj) {
        return C1346950l9h.LIZ((C1346950l9h) obj, null, false, 0, 0, null, false, false, false, null, null, null, new C291001Au(new Pair(Boolean.valueOf(awS5S0020000_21.z0), Boolean.valueOf(awS5S0020000_21.z1))), null, false, null, null, null, false, false, null, false, false, false, false, false, null, null, false, null, -4097);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0020000_21(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
