package kotlin.jvm.internal;

import X.C09AY;
import X.C1688900u3E;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AwS42S1101000_19 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS42S1101000_19 awS42S1101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1688900u3E.LJ(awS42S1101000_19.s0, (Function0) awS42S1101000_19.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS42S1101000_19.i2 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS42S1101000_19 awS42S1101000_19, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        LeakedGoPasswordlessActivity leakedGoPasswordlessActivity = (LeakedGoPasswordlessActivity) awS42S1101000_19.l1;
        String str = awS42S1101000_19.s0;
        leakedGoPasswordlessActivity.LLLLLZL(C341440Da2.LIZ(awS42S1101000_19.i2 | 1), (InterfaceC1680500tpg) obj, str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S1101000_19(LeakedGoPasswordlessActivity leakedGoPasswordlessActivity, String str, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = leakedGoPasswordlessActivity;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S1101000_19(String str, int i, Function0 function0, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.l1 = function0;
        this.i2 = i;
    }
}
