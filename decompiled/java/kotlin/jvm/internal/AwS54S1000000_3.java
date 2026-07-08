package kotlin.jvm.internal;

import X.C09AY;
import X.C2002407ss;
import X.C2007107td;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public class AwS54S1000000_3 extends C09AY implements Function1 {
    public final int $t;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S1000000_3(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS54S1000000_3 awS54S1000000_3, Object obj) {
        String str = awS54S1000000_3.s0;
        obj.getClass();
        return new C2007107td(str);
    }

    public static final Object invoke$1(AwS54S1000000_3 awS54S1000000_3, Object obj) {
        String str = awS54S1000000_3.s0;
        obj.getClass();
        return new C2002407ss(str);
    }

    public static final Object invoke$2(AwS54S1000000_3 awS54S1000000_3, Object obj) {
        String str = (String) obj;
        int iLJJIZ = a0.LJJIZ(str, ':', 0, false, 6);
        if (iLJJIZ > 0 && u.LJIJI(a0.LJLIIIL(str.substring(0, iLJJIZ)).toString(), awS54S1000000_3.s0, true)) {
            String string = a0.LJLIIIL(str.substring(iLJJIZ + 1)).toString();
            if (string.length() > 0) {
                return string;
            }
            return null;
        }
        return null;
    }
}
