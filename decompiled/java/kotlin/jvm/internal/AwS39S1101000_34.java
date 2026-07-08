package kotlin.jvm.internal;

import X.C09AY;
import X.C2237271ChR;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS39S1101000_34 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS39S1101000_34 awS39S1101000_34) {
        return Integer.valueOf(super/*X.1Ar1*/.getInt(awS39S1101000_34.s0, awS39S1101000_34.i2));
    }

    public static final Object invoke$1(AwS39S1101000_34 awS39S1101000_34) {
        super/*X.1Ar1*/.LIZJ(awS39S1101000_34.s0, awS39S1101000_34.i2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S1101000_34(C2237271ChR c2237271ChR, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c2237271ChR;
        this.s0 = str;
        this.i2 = i;
    }
}
