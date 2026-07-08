package kotlin.jvm.internal;

import X.C09AY;
import X.C0XWJ;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS56S2100000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS56S2100000_13 awS56S2100000_13) {
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = awS56S2100000_13.s0;
        String str2 = awS56S2100000_13.s1;
        Boolean bool = Boolean.TRUE;
        c0xwj.getClass();
        C0XWJ.LJIILLIIL(str, str2, true, bool, null);
        ((Function0) awS56S2100000_13.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS56S2100000_13 awS56S2100000_13) {
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = awS56S2100000_13.s0;
        String str2 = awS56S2100000_13.s1;
        Boolean bool = Boolean.FALSE;
        c0xwj.getClass();
        C0XWJ.LJIILLIIL(str, str2, true, bool, null);
        ((Function0) awS56S2100000_13.l2).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S2100000_13(String str, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = null;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S2100000_13(String str, String str2, String str3, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
