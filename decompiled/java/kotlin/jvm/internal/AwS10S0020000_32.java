package kotlin.jvm.internal;

import X.C09AY;
import X.C190Z;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS10S0020000_32 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S0020000_32 awS10S0020000_32, Object obj) {
        return C190Z.LJFF((C190Z) obj, 0, awS10S0020000_32.z0, false, null, awS10S0020000_32.z1, 381);
    }

    public static final Object invoke$1(AwS10S0020000_32 awS10S0020000_32, Object obj) {
        return C190Z.LJFF((C190Z) obj, 0, awS10S0020000_32.z0, false, null, awS10S0020000_32.z1, 381);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0020000_32(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
