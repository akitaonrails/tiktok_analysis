package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0I03;
import X.C0I04;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS11S1210000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS11S1210000_6 awS11S1210000_6, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C0I03((C0I04) awS11S1210000_6.l1, awS11S1210000_6.s0, awS11S1210000_6.z3, true, (Function0) awS11S1210000_6.l2);
        c062p.LIZIZ = "comment_sticker_input_service";
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S1210000_6 awS11S1210000_6, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C0I03((C0I04) awS11S1210000_6.l1, awS11S1210000_6.s0, awS11S1210000_6.z3, false, (Function0) awS11S1210000_6.l2);
        c062p.LIZIZ = "comment_sticker_input_service";
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S1210000_6(C0I04 c0i04, C0I04 c0i042, String str, boolean z, Function0<Boolean> function0) {
        super(1);
        this.$t = function0;
        this.l1 = c0i04;
        this.s0 = c0i042;
        this.z3 = str;
        this.l2 = z;
    }
}
