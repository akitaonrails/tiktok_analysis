package kotlin.jvm.internal;

import X.C09AY;
import X.C0HH4;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS220S0000000_31 extends C09AY implements Function0 {
    public final int $t;

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

    public static final Object invoke$0(AwS220S0000000_31 awS220S0000000_31) {
        return new C0HH4();
    }

    public static final Object invoke$1(AwS220S0000000_31 awS220S0000000_31) {
        return new Object() { // from class: X.166K
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS220S0000000_31(Context context, int i) {
        super(0);
        this.$t = i;
    }
}
