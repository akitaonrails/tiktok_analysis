package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0BYT;
import X.C0P90;
import X.C0Q68;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C123100dR;
import X.C1237404sm;
import X.C189200o6;
import X.C1ER1;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C212367188v;
import X.C21244318Bt;
import X.C2188811AlT;
import X.C2196708j7;
import X.C651970Phj;
import X.C651980Phk;
import X.C663340Q0e;
import X.C663480Q0s;
import X.C663660Q1k;
import X.C682350Qpd;
import X.C786410Ut5;
import X.EnumC663360Q0g;
import X.InterfaceC1019840ce6;
import X.InterfaceC1541990qEH;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchOpenSchemaMethod extends BaseBridgeMethod {
    public final C663340Q0e helper;
    public final String name;
    public static final C663480Q0s Companion = new Object() { // from class: X.0Q0s
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public SearchOpenSchemaMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "searchOpenSchema";
        this.helper = new C663340Q0e(c1051660dTQ, getName(), EnumC663360Q0g.STABLE);
    }

    private final Map<String, String> jsonObjToMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        return linkedHashMap;
    }

    public final void putExtraData(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("log_params");
        if (jSONObjectOptJSONObject != null) {
            linkedHashMap.putAll(jsonObjToMap(jSONObjectOptJSONObject));
        }
        C682350Qpd.LIZ.getClass();
        HashMap<String, String> map = C682350Qpd.LJIIJJI;
        map.clear();
        map.putAll(linkedHashMap);
        C651970Phj.LLILLL.getClass();
        C651980Phk.LJFF(linkedHashMap, false);
    }

    private final void preCheckLoginStatusIfNecessary(JSONObject jSONObject, Function0<Unit> function0) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("bundle_params")) != null && jSONObjectOptJSONObject.optBoolean("click_on_live_card") && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C1ER1.LIZIZ.O0(function0, null);
        } else {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        View viewE1;
        Map<String, String> mapJsonObjToMap;
        String strLIZIZ;
        String strLIZIZ2;
        if (this.helper.LIZ(interfaceC1019840ce6)) {
            return;
        }
        try {
            if (((IECommerceArchService) ServiceManager.get().getService(IECommerceArchService.class)).LIZ()) {
                String strOptString = jSONObject.optString("schema");
                InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) this.contextProviderFactory.LIZIZ(InterfaceC1541990qEH.class);
                String strLIZIZ3 = null;
                if (interfaceC1541990qEH != null) {
                    viewE1 = interfaceC1541990qEH.e1();
                } else {
                    viewE1 = null;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("page_data");
                if (jSONObjectOptJSONObject != null) {
                    mapJsonObjToMap = jsonObjToMap(jSONObjectOptJSONObject);
                } else {
                    mapJsonObjToMap = null;
                }
                if (C0BYT.LIZ() && mapJsonObjToMap == null) {
                    try {
                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("log_params");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (jSONObjectOptJSONObject2 != null) {
                            try {
                                strLIZIZ = C0Q68.LIZIZ("search_id", jSONObjectOptJSONObject2);
                            } catch (Exception e) {
                                e = e;
                                mapJsonObjToMap = linkedHashMap;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            strLIZIZ = null;
                        }
                        if (jSONObjectOptJSONObject2 != null) {
                            strLIZIZ2 = C0Q68.LIZIZ("search_result_id", jSONObjectOptJSONObject2);
                        } else {
                            strLIZIZ2 = null;
                        }
                        if (jSONObjectOptJSONObject2 != null) {
                            strLIZIZ3 = C0Q68.LIZIZ("search_entrance", jSONObjectOptJSONObject2);
                        }
                        if (strLIZIZ != null) {
                            linkedHashMap.put("search_id", strLIZIZ);
                        }
                        if (strLIZIZ2 != null) {
                            linkedHashMap.put("search_result_id", strLIZIZ2);
                        }
                        if (strLIZIZ3 != null) {
                            linkedHashMap.put("search_entrance", strLIZIZ3);
                        }
                        mapJsonObjToMap = linkedHashMap;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                setBtmCD(strOptString, viewE1, mapJsonObjToMap);
            }
            int i = C663660Q1k.LIZ[getHybridType().ordinal()];
            if (i != 1 && i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported engine type: ");
                sbLIZ.append(getHybridType());
                interfaceC1019840ce6.LIZ(0, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            preCheckLoginStatusIfNecessary(jSONObject, new AwS254S0300000_10(this, jSONObject, interfaceC1019840ce6, 5));
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            interfaceC1019840ce6.LIZ(0, e3.getMessage());
        }
    }

    public final void openSchemaWithOpt(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context activityById;
        boolean z;
        boolean zIsEmpty;
        Map linkedHashMap;
        String string;
        View viewE1;
        Iterator<String> itKeys;
        String strOptString = jSONObject.optString("schema");
        String strOptString2 = jSONObject.optString("reactId");
        Bundle bundle = new Bundle();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bundle_params");
        if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObjectOptJSONObject.opt(next);
                if (objOpt != null) {
                    if (Intrinsics.LJFF("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", next) && C2095008Iq.LJIIJJI(objOpt.toString()) != null) {
                        bundle.putInt(next, CastIntegerProtector.parseInt(objOpt.toString()));
                    } else {
                        C786410Ut5.LJJJI(next, objOpt.toString(), bundle);
                    }
                }
            }
        }
        if (TextUtils.isEmpty(strOptString2)) {
            activityById = getContext();
        } else {
            activityById = getActivityById(strOptString2);
        }
        SAFHelper.LIZ.getClass();
        Context contextLJ = SAFHelper.LJ(activityById);
        if (strOptString2 != null && strOptString2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if ((!z) && strOptString2 != null) {
            contextLJ = getActivityById(strOptString2);
        }
        if (TextUtils.isEmpty(strOptString)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid schema param: ");
            sbLIZ.append(strOptString);
            interfaceC1019840ce6.LIZ(-3, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!(contextLJ instanceof Activity)) {
            interfaceC1019840ce6.LIZ(0, "Context is not valid activity");
            return;
        }
        if (C2196708j7.LIZ(contextLJ, strOptString)) {
            interfaceC1019840ce6.LIZ(0, "search top1 plugin unavailable");
            return;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extra");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            String strOptString3 = jSONObjectOptJSONObject2.optString("btm");
            if (strOptString3 != null && strOptString3.length() != 0) {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("bcm");
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                C21244318Bt c21244318Bt = new C21244318Bt();
                c21244318Bt.LIZ = strOptString3;
                InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) this.contextProviderFactory.LIZIZ(InterfaceC1541990qEH.class);
                if (interfaceC1541990qEH != null) {
                    viewE1 = interfaceC1541990qEH.e1();
                } else {
                    viewE1 = null;
                }
                c21244318Bt.LIZIZ = PageFinder.via(viewE1);
                BcmParams.Companion.getClass();
                c21244318Bt.LIZJ = C212367188v.LIZIZ(jSONObjectOptJSONObject3);
                String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
                if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                    Uri.Builder builderBuildUpon = UriProtector.parse(strOptString).buildUpon();
                    builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                    strOptString = builderBuildUpon.build().toString();
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("log_params");
            if (C123100dR.LIZ(null)) {
                zIsEmpty = ((List) C1237404sm.LIZIZ.getValue()).contains(null);
            } else {
                zIsEmpty = true ^ ((List) C1237404sm.LIZIZ.getValue()).isEmpty();
            }
            if (zIsEmpty && jSONObjectOptJSONObject4 != null) {
                Object objOpt2 = jSONObjectOptJSONObject4.opt("pass_through_log_params");
                if (objOpt2 == null || !(objOpt2 instanceof Map)) {
                    objOpt2 = null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (!(objOpt2 instanceof Map) || (linkedHashMap = (Map) objOpt2) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Map map = (Map) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key2 = entry2.getKey();
                        Object value = entry2.getValue();
                        if (value == null || (string = value.toString()) == null) {
                            string = "";
                        }
                        arrayList.add(new Pair(key2, string));
                    }
                    linkedHashMap2.put(key, new LinkedHashMap(C2097608Jq.LJIILLIIL(arrayList)));
                }
                C651970Phj.LLILLL.getClass();
                C651980Phk.LJ(linkedHashMap2);
                jSONObjectOptJSONObject4.remove("pass_through_log_params");
            }
            SmartRoute smartRoute = new SmartRoute(contextLJ);
            smartRoute.withUrl(strOptString);
            smartRoute.withParam(bundle);
            smartRoute.withCallback(new AbsOpenResultCallback() { // from class: X.0Q0r
                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onSuccess(Intent intent) {
                    interfaceC1019840ce6.onSuccess(new JSONObject());
                }

                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onFail(String str, String str2) {
                    InterfaceC1019840ce6 interfaceC1019840ce62 = interfaceC1019840ce6;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("open url ");
                    if (str == null) {
                        str = "";
                    }
                    sbLIZ2.append(str);
                    sbLIZ2.append(" with error: ");
                    if (str2 == null) {
                        str2 = "";
                    }
                    sbLIZ2.append(str2);
                    interfaceC1019840ce62.LIZ(0, C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
            C0P90.LIZ.getClass();
            String strOptString4 = jSONObject.optString("log_params");
            if (C123100dR.LIZ(strOptString4)) {
                smartRoute.withParam("log_params_json_string", strOptString4);
            }
            smartRoute.open();
        }
    }

    private final void setBtmCD(String str, View view, Map<String, String> map) {
        Object c098200Yq;
        Object c098200Yq2;
        if (str != null && str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            try {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_c_code");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            try {
                c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_d_code");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            String str3 = (String) obj;
            if (view != null) {
                if (str2 != null || str3 != null || map != null) {
                    IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                    if (str2 == null) {
                        str2 = "c0";
                    }
                    if (str3 == null) {
                        str3 = "d0";
                    }
                    iEcomSearchService.LJJLIIJ(view, str2, str3, map, null);
                }
            }
        }
    }
}
