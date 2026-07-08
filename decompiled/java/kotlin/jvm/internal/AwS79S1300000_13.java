package kotlin.jvm.internal;

import X.C09AY;
import X.C0DQV;
import X.C0VJY;
import X.C0WG5;
import X.C0XL0;
import X.C20144713rx;
import X.C2097608Jq;
import X.C795640VJa;
import X.C820360WGc;
import X.C820370WGd;
import X.C825920Wac;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.hybrid.external.gateway.impl.HybridExternalGatewayPumbaa6Impl;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS79S1300000_13 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS79S1300000_13 awS79S1300000_13) {
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("eventName", awS79S1300000_13.s0));
        Map map = (Map) awS79S1300000_13.l1;
        if (map != null) {
            mapLJIIJ.putAll(C0DQV.LIZLLL(map, "eventValue"));
        }
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "AppsFlyer";
        c820360WGc.LIZIZ = "logEvent";
        c820360WGc.LIZJ = mapLJIIJ;
        c820360WGc.LIZ(C825920Wac.LIZ((Cert) awS79S1300000_13.l2));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new AwS129S1200000_13((Context) awS79S1300000_13.l3, (Context) awS79S1300000_13.s0, (String) awS79S1300000_13.l1, (Map<String, ? extends Object>) 0));
    }

    public static final Object invoke$1(AwS79S1300000_13 awS79S1300000_13) {
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("name", awS79S1300000_13.s0));
        Bundle bundle = (Bundle) awS79S1300000_13.l1;
        if (bundle != null) {
            mapLJIIJ.putAll(C0DQV.LIZIZ(bundle, "params"));
        }
        C820360WGc c820360WGc = new C820360WGc();
        c820360WGc.LIZ = "Firebase";
        c820360WGc.LIZIZ = "logEvent";
        c820360WGc.LIZJ = mapLJIIJ;
        c820360WGc.LIZ(C825920Wac.LIZ((Cert) awS79S1300000_13.l2));
        return C0XL0.LIZ(new C820370WGd(c820360WGc), new AwS129S1200000_13((C0WG5) awS79S1300000_13.l3, awS79S1300000_13.s0, (Bundle) awS79S1300000_13.l1, 2));
    }

    public static final Object invoke$2(AwS79S1300000_13 awS79S1300000_13) {
        return C795640VJa.LIZLLL(awS79S1300000_13.s0, (Map) awS79S1300000_13.l1, ((HybridExternalGatewayPumbaa6Impl) awS79S1300000_13.l2).LIZIZ, (JSONObject) awS79S1300000_13.l3, C0VJY.SPEC_STATUS_RULE_RESULT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S1300000_13(Context context, C20144713rx c20144713rx, String str, Map map, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = map;
        this.l2 = c20144713rx;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS79S1300000_13(String str, Bundle bundle, C20144713rx c20144713rx, C0WG5 c0wg5, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = bundle;
        this.l2 = c20144713rx;
        this.l3 = c0wg5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS79S1300000_13(String str, String str2, Map<String, String> map, HybridExternalGatewayPumbaa6Impl hybridExternalGatewayPumbaa6Impl, JSONObject jSONObject) {
        super(0);
        this.$t = jSONObject;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = map;
        this.l3 = hybridExternalGatewayPumbaa6Impl;
    }
}
