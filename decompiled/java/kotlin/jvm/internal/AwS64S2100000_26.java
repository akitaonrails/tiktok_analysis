package kotlin.jvm.internal;

import X.C03XW;
import X.C09AY;
import X.C1548870qPN;
import X.C1711340udQ;
import X.InterfaceC1725110uzd;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierRouterInterceptor;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class AwS64S2100000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
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

    public static final Object invoke$0(AwS64S2100000_26 awS64S2100000_26) {
        CashierRouterInterceptor cashierRouterInterceptor = (CashierRouterInterceptor) awS64S2100000_26.l2;
        String str = awS64S2100000_26.s0;
        String str2 = awS64S2100000_26.s1;
        cashierRouterInterceptor.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pay_request_id", str2);
        linkedHashMap.put("reason", "NEW_BIND");
        C1548870qPN c1548870qPN = new C1548870qPN();
        C1711340udQ.LIZ.getClass();
        c1548870qPN.LJ(str, C1711340udQ.LJ(linkedHashMap));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS64S2100000_26 awS64S2100000_26) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = awS64S2100000_26.s0;
        String str2 = awS64S2100000_26.s1;
        jSONObject.put("action_type", str);
        jSONObject.put("ui_type", str2);
        jSONObject.put("reason", "click_button");
        InterfaceC1725110uzd interfaceC1725110uzd = (InterfaceC1725110uzd) awS64S2100000_26.l2;
        if (interfaceC1725110uzd != null) {
            interfaceC1725110uzd.LIZ(C03XW.ON_CLOSE, jSONObject);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S2100000_26(InterfaceC1725110uzd interfaceC1725110uzd, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = interfaceC1725110uzd;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S2100000_26(CashierRouterInterceptor cashierRouterInterceptor, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = cashierRouterInterceptor;
        this.s0 = str;
        this.s1 = str2;
    }
}
