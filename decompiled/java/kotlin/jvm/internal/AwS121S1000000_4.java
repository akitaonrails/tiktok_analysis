package kotlin.jvm.internal;

import X.C09AY;
import X.C20684815ws;
import X.C2344009Gk;
import X.C735930Str;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS121S1000000_4 extends C09AY implements Function2 {
    public final int $t;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS121S1000000_4(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS121S1000000_4 awS121S1000000_4, Object obj, Object obj2) {
        Map map = (Map) obj2;
        String str = awS121S1000000_4.s0;
        if (str == null) {
            str = "";
        }
        map.put("screen_type", str);
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09Gk] */
    public static final Object invoke$1(AwS121S1000000_4 awS121S1000000_4, Object obj, Object obj2) {
        ?? BooleanValue;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ?? c2344009Gk = new C2344009Gk();
        C735930Str.LIZ(c2344009Gk, (List) obj, awS121S1000000_4.s0);
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        if (boolValueOf != null) {
            BooleanValue = boolValueOf.booleanValue();
        } else {
            BooleanValue = 0;
        }
        c2344009Gk.LIZJ(BooleanValue, "is_success");
        C20684815ws.LJIILLIIL("urlless_aweme_fetch_complete", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
