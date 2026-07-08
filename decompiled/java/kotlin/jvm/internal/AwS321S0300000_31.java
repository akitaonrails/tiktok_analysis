package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C15ZI;
import X.C15ZO;
import X.C15ZV;
import X.C1909107dp;
import X.C20361314ln;
import X.C20422414ve;
import X.C20540515Zb;
import X.InterfaceC1631620sYq;
import X.InterfaceC20422714vh;
import X.InterfaceC20422914vj;
import X.InterfaceC20541015Zg;
import X.InterfaceC634840OvC;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS321S0300000_31 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS321S0300000_31(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super Map<Object, ? extends Object>, Unit> interfaceC1631620sYq2, C15ZO c15zo, C20540515Zb c20540515Zb) {
        super(3);
        this.$t = c20540515Zb;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
        this.l2 = c15zo;
    }

    public static final Object invoke$0(AwS321S0300000_31 awS321S0300000_31, Object obj, Object obj2, Object obj3) {
        String containerID;
        List list = (List) obj3;
        CompletionBlock completionBlock = (CompletionBlock) awS321S0300000_31.l0;
        ((C20422414ve) awS321S0300000_31.l1).getClass();
        InterfaceC634840OvC interfaceC634840OvC = ((C20422414ve) awS321S0300000_31.l1).IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC20422914vj.class, containerID);
        C20422414ve c20422414ve = (C20422414ve) awS321S0300000_31.l1;
        C20361314ln c20361314ln = (C20361314ln) awS321S0300000_31.l2;
        InterfaceC20422914vj interfaceC20422914vj = (InterfaceC20422914vj) xBaseModelLIZJ;
        InterfaceC634840OvC interfaceC634840OvC2 = c20422414ve.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        InterfaceC20422714vh interfaceC20422714vh = (InterfaceC20422714vh) C1909107dp.LIZJ(InterfaceC20422714vh.class, containerID2);
        interfaceC20422714vh.setDescList(c20361314ln.LJ);
        interfaceC20422714vh.setUrl((String) C13LP.LJJJLL(list));
        interfaceC20422914vj.setUiConfig(interfaceC20422714vh);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS321S0300000_31 awS321S0300000_31, Object obj, Object obj2, Object obj3) throws JSONException {
        String str;
        Object obj4;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        Map map = (Map) obj3;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS321S0300000_31.l0;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), map);
        }
        JSONObject jSONObject = new JSONObject();
        C15ZI c15zi = ((C15ZO) awS321S0300000_31.l1).LJIIJ;
        if (c15zi != null) {
            str = c15zi.LIZ;
        } else {
            str = null;
        }
        JSONObject jSONObjectPut = jSONObject.put("trigger_key", str).put("strategy_key", ((C15ZO) awS321S0300000_31.l1).LIZ).put("timerbox_key", ((C20540515Zb) awS321S0300000_31.l2).LIZ).put("is_uploaded", zBooleanValue ? 1 : 0).put("uploaded_success", zBooleanValue2 ? 1 : 0);
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
    public AwS321S0300000_31(CompletionBlock completionBlock, CompletionBlock<InterfaceC20422914vj> completionBlock2, C20422414ve c20422414ve, C20361314ln c20361314ln) {
        super(3);
        this.$t = c20361314ln;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
        this.l2 = c20422414ve;
    }
}
