package kotlin.jvm.internal;

import X.C09AY;
import X.C0M2E;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS21S1101000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S1101000_8 awS21S1101000_8, Object obj) {
        C0M2E c0m2e = C0M2E.LIZ;
        int i = awS21S1101000_8.i2;
        String str = awS21S1101000_8.s0;
        c0m2e.getClass();
        C0M2E.LIZIZ(i, "delete", str);
        ((Function0) awS21S1101000_8.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S1101000_8 awS21S1101000_8, Object obj) {
        C0M2E c0m2e = C0M2E.LIZ;
        int i = awS21S1101000_8.i2;
        String str = awS21S1101000_8.s0;
        c0m2e.getClass();
        C0M2E.LIZIZ(i, "keep", str);
        ((Function0) awS21S1101000_8.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S1101000_8 awS21S1101000_8, Object obj) {
        C0M2E c0m2e = C0M2E.LIZ;
        int i = awS21S1101000_8.i2;
        String str = awS21S1101000_8.s0;
        c0m2e.getClass();
        C0M2E.LIZIZ(i, "dismiss", str);
        ((Function0) awS21S1101000_8.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1101000_8(String str, int i, Function0 function0, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = function0;
    }
}
