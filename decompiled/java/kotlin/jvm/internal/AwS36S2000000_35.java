package kotlin.jvm.internal;

import X.C09AY;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2276431E8j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS36S2000000_35 extends C09AY implements Function0 {
    public final int $t;
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

    public static final Object invoke$0(AwS36S2000000_35 awS36S2000000_35) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZ(awS36S2000000_35.s0, awS36S2000000_35.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS36S2000000_35 awS36S2000000_35) {
        C2276431E8j.LIZ(awS36S2000000_35.s0, 3, null, awS36S2000000_35.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S2000000_35(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
