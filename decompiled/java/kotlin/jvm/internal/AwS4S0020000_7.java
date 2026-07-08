package kotlin.jvm.internal;

import X.C09AY;
import X.C0JMP;
import X.C479290Iqt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS4S0020000_7 extends C09AY implements Function1 {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0020000_7(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = false;
    }

    public static final Object invoke$0(AwS4S0020000_7 awS4S0020000_7, Object obj) {
        return C0JMP.LIZ((C0JMP) obj, null, 0, null, null, 0, awS4S0020000_7.z0, awS4S0020000_7.z1, 31);
    }

    public static final Object invoke$1(AwS4S0020000_7 awS4S0020000_7, Object obj) {
        return new C479290Iqt(((C479290Iqt) obj).LL + 1, true, awS4S0020000_7.z0, awS4S0020000_7.z1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0020000_7(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
