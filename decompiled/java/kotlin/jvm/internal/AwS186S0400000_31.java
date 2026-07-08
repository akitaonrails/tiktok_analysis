package kotlin.jvm.internal;

import X.C09AY;
import X.C15ZI;
import X.C15ZU;
import X.C15ZV;
import X.C20540515Zb;
import X.InterfaceC1631620sYq;
import X.InterfaceC20541015Zg;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS186S0400000_31 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS186S0400000_31 awS186S0400000_31, Object obj, Object obj2, Object obj3) throws JSONException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS186S0400000_31.l0;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), obj3);
        }
        JSONObject jSONObjectPut = new JSONObject().put("trigger_key", ((C15ZI) awS186S0400000_31.l1).LIZ).put("strategy_key", ((C15ZU) awS186S0400000_31.l2).LJFF).put("timerbox_key", ((C20540515Zb) awS186S0400000_31.l3).LIZ).put("is_uploaded", zBooleanValue ? 1 : 0).put("uploaded_success", zBooleanValue2 ? 1 : 0);
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_sd_save_completion", null, jSONObjectPut);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS186S0400000_31 awS186S0400000_31, Object obj, Object obj2, Object obj3) throws JSONException {
        Object obj4;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        Map map = (Map) obj3;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS186S0400000_31.l0;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), map);
        }
        JSONObject jSONObjectPut = new JSONObject().put("trigger_key", ((C15ZI) awS186S0400000_31.l1).LIZ).put("strategy_key", ((C15ZU) awS186S0400000_31.l2).LJFF).put("timerbox_key", ((C20540515Zb) awS186S0400000_31.l3).LIZ).put("is_uploaded", zBooleanValue ? 1 : 0).put("uploaded_success", zBooleanValue2 ? 1 : 0);
        if (map != null && (obj4 = map.get("time_spent_total")) != null && (obj4 instanceof Integer)) {
            jSONObjectPut.put("time_spent_total", ((Number) obj4).intValue());
        }
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_sd_save_completion", null, jSONObjectPut);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS186S0400000_31(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super Map<Object, ? extends Object>, Unit> interfaceC1631620sYq2, C15ZI c15zi, C15ZU c15zu, C20540515Zb c20540515Zb) {
        super(3);
        this.$t = c20540515Zb;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
        this.l2 = c15zi;
        this.l3 = c15zu;
    }
}
