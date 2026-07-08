package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS1S2001000_28 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS1S2001000_28 awS1S2001000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ComplianceServiceProvider.LJIJI().LJII(awS1S2001000_28.s0, awS1S2001000_28.s1, "pop", null, Integer.valueOf(awS1S2001000_28.i2), 0, Boolean.TRUE, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2001000_28 awS1S2001000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ComplianceServiceProvider.LJIJI().LJII(awS1S2001000_28.s0, awS1S2001000_28.s1, "pop", null, Integer.valueOf(awS1S2001000_28.i2), 0, Boolean.TRUE, null, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2001000_28(String str, String str2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i2 = i;
    }
}
