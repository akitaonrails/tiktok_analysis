package kotlin.jvm.internal;

import X.C09AY;
import X.C2237271ChR;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS26S1110000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS26S1110000_34 awS26S1110000_34) {
        return Boolean.valueOf(super/*X.1Ar1*/.getBoolean(awS26S1110000_34.s0, awS26S1110000_34.z2));
    }

    public static final Object invoke$1(AwS26S1110000_34 awS26S1110000_34) {
        super/*X.1Ar1*/.LIZLLL(awS26S1110000_34.s0, awS26S1110000_34.z2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S1110000_34(C2237271ChR c2237271ChR, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c2237271ChR;
        this.s0 = str;
        this.z2 = z;
    }
}
