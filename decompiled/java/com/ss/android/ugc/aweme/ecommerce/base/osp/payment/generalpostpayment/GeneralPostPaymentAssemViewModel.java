package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment;

import X.C002G;
import X.C003M;
import X.C1717040umc;
import X.C2095008Iq;
import X.C23250099c;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ReportUserActionRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class GeneralPostPaymentAssemViewModel extends AssemViewModel<C003M> {
    public long LLILLJJLI;
    public Map<String, Object> LL = new LinkedHashMap();
    public String LLILLL = "return";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C003M(0);
    }

    public final Map<String, Object> xQ2() {
        Integer numValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) C002G.LIZ(this.LL)).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (Intrinsics.LJFF(key, "is_auto")) {
                if (value instanceof Integer) {
                    numValueOf = (Integer) value;
                } else if (value instanceof Long) {
                    numValueOf = Integer.valueOf((int) ((Number) value).longValue());
                } else if (value instanceof Boolean) {
                    numValueOf = Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
                } else if (value instanceof String) {
                    numValueOf = C2095008Iq.LJIIJJI((String) value);
                }
                if (numValueOf != null) {
                    linkedHashMap.put(key, Integer.valueOf(numValueOf.intValue()));
                }
            } else {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    public final void vQ2(Map<String, Object> map) {
        Integer numLJIIJJI;
        Object obj = this.LL.get("cashier_original_track_id");
        if ((obj instanceof String) && obj != null) {
            map.put("cashier_original_track_id", obj);
        }
        Object obj2 = this.LL.get("rendering_num");
        if (obj2 instanceof Number) {
            map.put("rendering_num", Integer.valueOf(((Number) obj2).intValue()));
        } else if ((obj2 instanceof String) && (numLJIIJJI = C2095008Iq.LJIIJJI((String) obj2)) != null) {
            map.put("rendering_num", Integer.valueOf(numLJIIJJI.intValue()));
        }
        Object obj3 = this.LL.get("checkout_type");
        if ((obj3 instanceof String) && obj3 != null) {
            map.put("checkout_type", obj3);
        }
    }

    public final Map<String, Object> wQ2(String str, String str2) {
        Object obj = this.LL.get("enter_from");
        if (!(obj instanceof String)) {
            obj = null;
        }
        Object obj2 = "";
        if (obj == null) {
            obj = this.LL.get("source_enter_from");
            if (!(obj instanceof String) || obj == null) {
                obj = this.LL.get("enter_from_info");
                if (!(obj instanceof String) || obj == null) {
                    obj = "";
                }
            }
        }
        Object obj3 = this.LL.get("busi_line");
        if (!(obj3 instanceof String) || obj3 == null) {
            obj3 = "";
        }
        Object obj4 = this.LL.get("country_code");
        if ((obj4 instanceof String) && obj4 != null) {
            obj2 = obj4;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", obj);
        linkedHashMap.put("busi_line", obj3);
        linkedHashMap.put("country_code", obj2);
        linkedHashMap.put("page_id", str);
        linkedHashMap.put("previous_page_id", str2);
        vQ2(linkedHashMap);
        Object obj5 = this.LL.get("payment_method_id");
        if ((obj5 instanceof String) && obj5 != null) {
            linkedHashMap.put("payment_method_id", obj5);
        }
        return linkedHashMap;
    }

    public final void yQ2(GeneralPostPaymentGuideModel generalPostPaymentGuideModel, String str, String str2, Function0<Unit> function0) {
        String str3;
        String str4 = generalPostPaymentGuideModel.host;
        if (str4 != null && str4.length() != 0 && (str3 = generalPostPaymentGuideModel.token) != null && str3.length() != 0) {
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1717040umc(generalPostPaymentGuideModel, new ReportUserActionRequest(generalPostPaymentGuideModel.merchantId, generalPostPaymentGuideModel.merchantUserId, str, str2), function0, null), 3);
        }
    }
}
