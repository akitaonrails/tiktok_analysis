package kotlin.jvm.internal;

import X.C07M6;
import X.C09AY;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS110S1000000_26 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return this.s0;
            case 1:
                return this.s0;
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$2(AwS110S1000000_26 awS110S1000000_26) {
        C07M6.LIZ(new AwS167S1100000_18(C2097608Jq.LJIIJ(new Pair("obj_id", awS110S1000000_26.s0)), (Map<String, String>) "fp_sdk_payment_homepage_click", (String) 17));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS110S1000000_26(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
