package kotlin.jvm.internal;

import X.C09AY;
import X.C2237271ChR;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS148S1200000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS148S1200000_34 awS148S1200000_34) {
        return super/*X.1Ar1*/.LJI(awS148S1200000_34.s0, (String[]) awS148S1200000_34.l2);
    }

    public static final Object invoke$1(AwS148S1200000_34 awS148S1200000_34) {
        return super/*X.1Ar1*/.getStringSet(awS148S1200000_34.s0, (Set) awS148S1200000_34.l2);
    }

    public static final Object invoke$2(AwS148S1200000_34 awS148S1200000_34) {
        super/*X.1Ar1*/.LJII(awS148S1200000_34.s0, (String[]) awS148S1200000_34.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS148S1200000_34 awS148S1200000_34) {
        super/*X.1Ar1*/.LJIIIZ(awS148S1200000_34.s0, (Set) awS148S1200000_34.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS148S1200000_34(C2237271ChR c2237271ChR, C2237271ChR c2237271ChR2, String str, Set<String> set) {
        super(0);
        this.$t = set;
        this.l1 = c2237271ChR;
        this.s0 = c2237271ChR2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1200000_34(C2237271ChR c2237271ChR, String str, String[] strArr, int i) {
        super(0);
        this.$t = i;
        this.l1 = c2237271ChR;
        this.s0 = str;
        this.l2 = strArr;
    }
}
