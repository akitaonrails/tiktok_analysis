package kotlin.jvm.internal;

import X.C09AY;
import X.C1548870qPN;
import X.C1707840uXm;
import X.C1717190umr;
import X.C786410Ut5;
import X.InterfaceC1716260ulM;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AwS200S1100000_26 extends C09AY implements Function2 {
    public final int $t;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS200S1100000_26(C1707840uXm c1707840uXm, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c1707840uXm;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS200S1100000_26 awS200S1100000_26, Object obj, Object obj2) throws JSONException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1707840uXm c1707840uXm = (C1707840uXm) awS200S1100000_26.l1;
        String str = awS200S1100000_26.s0;
        c1707840uXm.getClass();
        C1548870qPN c1548870qPN = new C1548870qPN();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_session_id", str);
        jSONObject.put("action_type", "AFTER_PAYMENT_BIND_RETAIN");
        jSONObject.put("result", zBooleanValue);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, obj2);
        c1548870qPN.LJ("pipo_post_payment_bind_retain_result", C786410Ut5.J3(jSONObject));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS200S1100000_26 awS200S1100000_26, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            ((InterfaceC1716260ulM) awS200S1100000_26.l1).LIZJ(null, awS200S1100000_26.s0, null);
        } else {
            ((InterfaceC1716260ulM) awS200S1100000_26.l1).LIZ(obj2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS200S1100000_26(C1717190umr c1717190umr, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c1717190umr;
        this.s0 = str;
    }
}
