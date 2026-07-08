package com.ss.android.ugc.aweme.ecommerce.search.service;

import X.AbstractC664320Q3y;
import X.C0QOY;
import X.C0QP5;
import X.C1507790pL7;
import X.C668220QIy;
import X.C668230QIz;
import X.C668260QJc;
import X.C669560QOc;
import X.C671400QVe;
import X.C673320Qb4;
import X.EnumC673010QaZ;
import X.InterfaceC664330Q3z;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class MiddleForSearchFromEC implements IMiddleForSearchFromEC {
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LIZLLL() {
        C0QOY.LIZ(1);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJI() {
        C668260QJc.LIZJ = true;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIIIZZ() {
        C668260QJc.LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LIZ() {
        C673320Qb4.LIZ.getClass();
        C673320Qb4.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIIZ() {
        C668260QJc.LIZLLL = "";
        C668260QJc.LIZ = "";
        C668260QJc.LIZIZ = 0L;
        C668260QJc.LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIJ() {
        C673320Qb4.LIZ.getClass();
        if (C673320Qb4.LIZIZ != null) {
            System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final String LLIIIL() {
        return C0QOY.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJ(String str) {
        C0QOY.LIZ = str;
        C0QOY.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJFF(EnumC673010QaZ enumC673010QaZ) {
        C673320Qb4 c673320Qb4 = C673320Qb4.LIZ;
        C673320Qb4.LJIILLIIL(enumC673010QaZ);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJII(int i) {
        C668260QJc.LJ = i;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIL(String str) {
        C668260QJc.LIZ = str;
        C668260QJc.LIZIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LIZIZ(SearchResultParam searchResultParam, C669560QOc c669560QOc) {
        EcIntermediatePreload.Companion.getClass();
        C671400QVe.LIZ(searchResultParam, c669560QOc);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0QOW] */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LIZJ(String str, final JSONObject jSONObject) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Scene.SCENE_SERVICE, "jsb_click");
            jSONObject2.put("enter_from", str);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_search_request_trace", jSONObject2);
            ?? r2 = new AbstractC664320Q3y() { // from class: X.0QOW
                public final void LIZJ(C0QP5 c0qp5, CompletionBlock completionBlock) {
                    View view;
                    String str2 = "";
                    boolean zLJI = MethodIDManager.LJI(202554);
                    try {
                        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                        if (interfaceC634840OvC != null) {
                            view = interfaceC634840OvC.getView();
                        } else {
                            view = null;
                        }
                        C0QP3.LIZJ(view, c0qp5);
                        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC664330Q3z.class, null), "");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C798270VTd.LIZ("EcSearchKeywordChangeMethodNew", e);
                        String message = e.getMessage();
                        if (message != null) {
                            str2 = message;
                        }
                        C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }

                @Override // X.AbstractC1549150qPp
                public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                    boolean zLJI = MethodIDManager.LJI(202554);
                    LIZJ((C0QP5) xBaseParamModel, completionBlock);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }
            };
            jSONObject.put("enter_from", str);
            r2.LIZJ(new C0QP5() { // from class: X.0Q3x
                @Override // X.C0QP5
                public final Number getAvoidRecordHistory() {
                    return Integer.valueOf(jSONObject.optInt("avoid_record_history"));
                }

                @Override // X.C0QP5
                public final Map<String, Object> getEcomSearchParams() {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ecomSearchParams");
                    if (jSONObjectOptJSONObject != null) {
                        return JsonExtKt.toMap(jSONObjectOptJSONObject);
                    }
                    return null;
                }

                @Override // X.C0QP5
                public final String getEnterFrom() {
                    return jSONObject.optString("enter_from");
                }

                @Override // X.C0QP5
                public final String getEnterMethod() {
                    return jSONObject.optString("enterMethod");
                }

                @Override // X.C0QP5
                public final String getEventId() {
                    return jSONObject.optString("event_id");
                }

                @Override // X.C0QP5
                public final Map<String, Object> getExtra() {
                    return JsonExtKt.toMap(jSONObject.optJSONObject("extra"));
                }

                @Override // X.C0QP5
                public final String getIconType() {
                    return jSONObject.optString("icon_type");
                }

                @Override // X.C0QP5
                public final String getImprId() {
                    return jSONObject.optString("impr_id");
                }

                @Override // X.C0QP5
                public final String getKeyword() {
                    return jSONObject.optString("keyword");
                }

                @Override // X.C0QP5
                public final String getPenetrateInfo() {
                    return jSONObject.optString("penetrate_info");
                }

                @Override // X.C0QP5
                public final Number getSearchFrom() {
                    return Integer.valueOf(jSONObject.optInt("searchFrom"));
                }

                @Override // X.C0QP5
                public final String getSearchSourcePage() {
                    return jSONObject.optString("searchSourcePage");
                }

                @Override // X.C0QP5
                public final String getTabName() {
                    return jSONObject.optString("tab_name");
                }

                @Override // X.C0QP5
                public final String getType() {
                    return jSONObject.optString("type");
                }

                @Override // X.C0QP5
                public final String getWordsType() {
                    return jSONObject.optString("words_type");
                }

                @Override // X.C0QP5
                public final String isSarRecall() {
                    return jSONObject.optString("is_sar_recall");
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final JSONObject toJSON() {
                    return new JSONObject();
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return C2097608Jq.LJ();
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
                public final List<String> provideParamList() {
                    return C13BV.INSTANCE;
                }
            }, new CompletionBlock<InterfaceC664330Q3z>() { // from class: X.0Q41
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onSuccess(XBaseResultModel xBaseResultModel, String str2) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onFailure(int i, String str2, XBaseResultModel xBaseResultModel) {
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIJJI(Boolean bool, String str) {
        if (bool == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C668220QIy c668220QIy = new C668220QIy();
            c668220QIy.LIZ = jCurrentTimeMillis;
            ((HashMap) C668230QIz.LIZ).put(str, c668220QIy);
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C668220QIy c668220QIy2 = new C668220QIy();
        c668220QIy2.LIZ = jCurrentTimeMillis2;
        ((HashMap) C668230QIz.LIZ).put(str, c668220QIy2);
        c668220QIy2.LIZIZ = zBooleanValue;
    }
}
