package kotlin.jvm.internal;

import X.C09AY;
import X.C1275404yu;
import X.C194A;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS44S0001000_32 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1001i0;

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
    public AwS44S0001000_32(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f1001i0 = i;
    }

    public static final Object invoke$0(AwS44S0001000_32 awS44S0001000_32, Object obj) {
        return C194A.LIZ((C194A) obj, awS44S0001000_32.f1001i0, false, false, false, false, null, false, false, 510);
    }

    public static final Object invoke$1(AwS44S0001000_32 awS44S0001000_32, Object obj) {
        boolean z;
        if (awS44S0001000_32.f1001i0 != -1) {
            z = true;
        } else {
            z = false;
        }
        obj.getClass();
        return new C1275404yu(z);
    }
}
