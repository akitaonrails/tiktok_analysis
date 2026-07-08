package kotlin.jvm.internal;

import X.C09AY;
import X.C0XWJ;
import X.C846430XIj;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS38S2100000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS38S2100000_13 awS38S2100000_13, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = awS38S2100000_13.s0;
        String str2 = awS38S2100000_13.s1;
        Boolean bool = Boolean.TRUE;
        Integer numValueOf = Integer.valueOf(iIntValue);
        c0xwj.getClass();
        C0XWJ.LJIILLIIL(str, str2, false, bool, numValueOf);
        ((Function1) awS38S2100000_13.l2).invoke(-1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS38S2100000_13 awS38S2100000_13, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (!C846430XIj.LIZIZ()) {
            C0XWJ c0xwj = C0XWJ.LIZ;
            String str = awS38S2100000_13.s0;
            String str2 = awS38S2100000_13.s1;
            Boolean bool = Boolean.TRUE;
            Integer numValueOf = Integer.valueOf(iIntValue);
            c0xwj.getClass();
            C0XWJ.LJIILLIIL(str, str2, false, bool, numValueOf);
            ((Function1) awS38S2100000_13.l2).invoke(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS38S2100000_13 awS38S2100000_13, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = awS38S2100000_13.s0;
        String str2 = awS38S2100000_13.s1;
        Boolean bool = Boolean.FALSE;
        Integer numValueOf = Integer.valueOf(iIntValue);
        c0xwj.getClass();
        C0XWJ.LJIILLIIL(str, str2, false, bool, numValueOf);
        ((Function1) awS38S2100000_13.l2).invoke(Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS38S2100000_13(String str, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = null;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS38S2100000_13(String str, String str2, String str3, Function1<? super Integer, Unit> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
