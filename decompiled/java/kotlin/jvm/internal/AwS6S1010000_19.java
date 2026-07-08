package kotlin.jvm.internal;

import X.C09AY;
import X.C1230460i7o;
import X.C291001Au;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS6S1010000_19 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AwS6S1010000_19 awS6S1010000_19, Object obj) {
        C1230460i7o c1230460i7o = (C1230460i7o) obj;
        boolean z = awS6S1010000_19.z1;
        String str = awS6S1010000_19.s0;
        if (str == null) {
            str = "";
        }
        return C1230460i7o.LIZ(c1230460i7o, null, 0, null, null, false, z, z, null, new C291001Au(str), null, null, 1695);
    }

    public static final Object invoke$1(AwS6S1010000_19 awS6S1010000_19, Object obj) {
        C1230460i7o c1230460i7o = (C1230460i7o) obj;
        boolean z = awS6S1010000_19.z1;
        String str = awS6S1010000_19.s0;
        if (str == null) {
            str = "";
        }
        return C1230460i7o.LIZ(c1230460i7o, null, 0, null, null, z, false, z, null, new C291001Au(str), null, null, 1711);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1010000_19(boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.s0 = str;
    }
}
