package kotlin.jvm.internal;

import X.C09AY;
import X.C1170180gYa;
import X.C1488830oqX;
import X.C1545060qJE;
import X.C1547320qMs;
import X.InterfaceC1547330qMt;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AwS17S2300000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
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

    public static final Object invoke$0(AwS17S2300000_23 awS17S2300000_23) throws JSONException {
        Object objLIZ;
        C1547320qMs c1547320qMs;
        Object obj;
        Map map;
        C1547320qMs c1547320qMs2;
        Map<String, Object> data;
        Map<String, Object> data2;
        InterfaceC1547330qMt interfaceC1547330qMtRoot = ((InterfaceC1547330qMt) awS17S2300000_23.l2).root();
        if (interfaceC1547330qMtRoot != null) {
            interfaceC1547330qMtRoot.getType();
        }
        ((InterfaceC1547330qMt) awS17S2300000_23.l2).getNodeName();
        JSONObject jSONObject = new JSONObject();
        InterfaceC1547330qMt interfaceC1547330qMt = (InterfaceC1547330qMt) awS17S2300000_23.l2;
        String str = awS17S2300000_23.s0;
        String str2 = awS17S2300000_23.s1;
        C1545060qJE c1545060qJE = (C1545060qJE) awS17S2300000_23.l3;
        Map<String, Object> params = interfaceC1547330qMt.getParams();
        Object obj2 = null;
        if (params != null) {
            c1545060qJE.getClass();
            objLIZ = C1545060qJE.LIZ(params);
        } else {
            objLIZ = null;
        }
        jSONObject.put("params", objLIZ);
        jSONObject.put("name", str);
        boolean z = interfaceC1547330qMt instanceof C1547320qMs;
        if (z) {
            c1547320qMs = (C1547320qMs) interfaceC1547330qMt;
        } else {
            c1547320qMs = null;
        }
        if (c1547320qMs == null || (data2 = c1547320qMs.getData()) == null || (obj = data2.get("next")) == null) {
            if (z && (c1547320qMs2 = (C1547320qMs) interfaceC1547330qMt) != null && (data = c1547320qMs2.getData()) != null) {
                obj2 = data.get("callback");
            }
            if (!(obj2 instanceof Map) || (map = (Map) obj2) == null || (obj = map.get(str2)) == null) {
                obj = "undefined";
            }
        }
        jSONObject.put("next", obj);
        JSONObject jSONObject2 = new JSONObject();
        C1545060qJE c1545060qJE2 = (C1545060qJE) awS17S2300000_23.l3;
        Object obj3 = awS17S2300000_23.l4;
        c1545060qJE2.getClass();
        jSONObject2.put("results", C1545060qJE.LIZ(obj3));
        return new C1488830oqX(jSONObject2);
    }

    public static final Object invoke$1(AwS17S2300000_23 awS17S2300000_23) throws JSONException {
        Object objLIZ;
        C1547320qMs c1547320qMs;
        Object obj;
        Map map;
        C1547320qMs c1547320qMs2;
        Map<String, Object> data;
        Map<String, Object> data2;
        InterfaceC1547330qMt interfaceC1547330qMtRoot = ((InterfaceC1547330qMt) awS17S2300000_23.l2).root();
        if (interfaceC1547330qMtRoot != null) {
            interfaceC1547330qMtRoot.getType();
        }
        ((InterfaceC1547330qMt) awS17S2300000_23.l2).getNodeName();
        JSONObject jSONObject = new JSONObject();
        InterfaceC1547330qMt interfaceC1547330qMt = (InterfaceC1547330qMt) awS17S2300000_23.l2;
        String str = awS17S2300000_23.s0;
        String str2 = awS17S2300000_23.s1;
        C1545060qJE c1545060qJE = (C1545060qJE) awS17S2300000_23.l3;
        Map<String, Object> params = interfaceC1547330qMt.getParams();
        Object obj2 = null;
        if (params != null) {
            c1545060qJE.getClass();
            objLIZ = C1545060qJE.LIZ(params);
        } else {
            objLIZ = null;
        }
        jSONObject.put("params", objLIZ);
        jSONObject.put("name", str);
        boolean z = interfaceC1547330qMt instanceof C1547320qMs;
        if (z) {
            c1547320qMs = (C1547320qMs) interfaceC1547330qMt;
        } else {
            c1547320qMs = null;
        }
        if (c1547320qMs == null || (data2 = c1547320qMs.getData()) == null || (obj = data2.get("next")) == null) {
            if (z && (c1547320qMs2 = (C1547320qMs) interfaceC1547330qMt) != null && (data = c1547320qMs2.getData()) != null) {
                obj2 = data.get("callback");
            }
            if (!(obj2 instanceof Map) || (map = (Map) obj2) == null || (obj = map.get(str2)) == null) {
                obj = "undefined";
            }
        }
        jSONObject.put("next", obj);
        JSONObject jSONObject2 = new JSONObject();
        C1545060qJE c1545060qJE2 = (C1545060qJE) awS17S2300000_23.l3;
        C1170180gYa c1170180gYa = (C1170180gYa) awS17S2300000_23.l4;
        c1545060qJE2.getClass();
        jSONObject2.put("results", C1545060qJE.LIZ(c1170180gYa));
        return new C1488830oqX(jSONObject2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2300000_23(InterfaceC1547330qMt interfaceC1547330qMt, String str, String str2, C1545060qJE c1545060qJE, C1170180gYa c1170180gYa, int i) {
        super(0);
        this.$t = i;
        this.l2 = interfaceC1547330qMt;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c1545060qJE;
        this.l4 = c1170180gYa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S2300000_23(InterfaceC1547330qMt interfaceC1547330qMt, String str, String str2, C1545060qJE c1545060qJE, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l2 = interfaceC1547330qMt;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = c1545060qJE;
        this.l4 = obj;
    }
}
