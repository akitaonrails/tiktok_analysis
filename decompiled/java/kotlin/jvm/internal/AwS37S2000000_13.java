package kotlin.jvm.internal;

import X.C09AY;
import X.C0XWJ;
import X.C846430XIj;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public class AwS37S2000000_13 extends C09AY implements Function2 {
    public final int $t;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S2000000_13(String str, String str2, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }

    public static final Object invoke$0(AwS37S2000000_13 awS37S2000000_13, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Integer num = (Integer) obj2;
        if (!C846430XIj.LIZIZ()) {
            C0XWJ c0xwj = C0XWJ.LIZ;
            String str = awS37S2000000_13.s0;
            String str2 = awS37S2000000_13.s1;
            Boolean bool = Boolean.TRUE;
            c0xwj.getClass();
            C0XWJ.LJIILLIIL(str, str2, zBooleanValue, bool, num);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S2000000_13 awS37S2000000_13, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Integer num = (Integer) obj2;
        if (!C846430XIj.LIZIZ()) {
            C0XWJ c0xwj = C0XWJ.LIZ;
            String str = awS37S2000000_13.s0;
            String str2 = awS37S2000000_13.s1;
            Boolean bool = Boolean.FALSE;
            c0xwj.getClass();
            C0XWJ.LJIILLIIL(str, str2, zBooleanValue, bool, num);
        }
        return Unit.LIZ;
    }
}
