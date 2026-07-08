package com.ss.android.ugc.aweme.feed.util;

import X.AbstractC827810Wdf;
import X.AnonymousClass1455;
import X.C01GW;
import X.C01TT;
import X.C0CNO;
import X.C15O7;
import X.C1602350rnd;
import X.C1602480rnq;
import X.C1610890s1P;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C464190IIf;
import X.C844470XAv;
import X.InterfaceC1564100qnw;
import X.InterfaceC1602420rnk;
import X.InterfaceC1610880s1O;
import X.InterfaceC472980Igi;
import X.InterfaceC472990Igj;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYCepCallbackMode;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LiveHotReloadCepManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS139S1200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveHotReloadCepManager implements InterfaceC1564100qnw, HostSetupListener, PTYPackageCallback {
    public final InterfaceC1602420rnk callback;
    public InterfaceC1610880s1O cepService;
    public volatile boolean isRegistered;
    public volatile boolean packageInit;
    public static final C1610890s1P Companion = new Object() { // from class: X.0s1P
    };
    public static final int $stable = 8;
    public static final C01GW<LiveHotReloadCepManager$Companion$EMPTY_CALLBACK$2$1> EMPTY_CALLBACK$delegate = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(147));
    public final C01GW cepRuleList$delegate = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(149));
    public final C01GW asyncEvent$delegate = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(148));
    public final C01GW pitayaCore$delegate = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(150));
    public final C01GW callBack$delegate = C452501pT.LIZIZ(new AwS568S0100000_24(this, 425));

    private final boolean getAsyncEvent() {
        return ((Boolean) this.asyncEvent$delegate.getValue()).booleanValue();
    }

    private final List<String> getCepRuleList() {
        return (List) this.cepRuleList$delegate.getValue();
    }

    public final PTYCepCallback getCallBack() {
        return (PTYCepCallback) this.callBack$delegate.getValue();
    }

    public final InterfaceC1610880s1O getCepService() {
        if (this.cepService == null) {
            this.cepService = getPitayaCep();
        }
        return this.cepService;
    }

    public final InterfaceC1610880s1O getPitayaCep() {
        AnonymousClass1455.LIZ.getClass();
        if (!AnonymousClass1455.LJII()) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
        if (featureCore != null) {
            return featureCore.getCepCore();
        }
        return null;
    }

    public final InterfaceC472980Igi getPitayaCore() {
        return (InterfaceC472980Igi) this.pitayaCore$delegate.getValue();
    }

    @Override // X.InterfaceC1564100qnw
    public void init() {
        HostSetupWatcher.INSTANCE.registerHostSetupListener(this);
    }

    public final void registerCallback() {
        if (this.isRegistered || !(!getCepRuleList().isEmpty())) {
            return;
        }
        for (String str : getCepRuleList()) {
            InterfaceC1610880s1O cepService = getCepService();
            if (cepService != null) {
                cepService.LIZ("live_fyp_update_trigger", str, getCallBack(), PTYCepCallbackMode.SUCCESS_AND_ERROR);
            }
        }
        this.isRegistered = true;
        this.callback.LIZJ();
    }

    @Override // X.InterfaceC1564100qnw
    public void release() {
        HostSetupWatcher.INSTANCE.unregisterHostSetupListener(this);
        if (this.isRegistered && (!getCepRuleList().isEmpty())) {
            for (String str : getCepRuleList()) {
                InterfaceC1610880s1O cepService = getCepService();
                if (cepService != null) {
                    cepService.LIZIZ("live_fyp_update_trigger", str);
                }
            }
        }
    }

    public final boolean getPackageInit() {
        return this.packageInit;
    }

    @Override // X.InterfaceC1564100qnw
    public boolean isInit() {
        return this.isRegistered;
    }

    public final boolean isRegistered() {
        return this.isRegistered;
    }

    public LiveHotReloadCepManager(InterfaceC1602420rnk interfaceC1602420rnk) {
        this.callback = interfaceC1602420rnk;
    }

    public final int getHotReloadType(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1364330198) {
            if (iHashCode != -1314372325) {
                if (iHashCode == 2048581931 && str.equals("timed_trigger_rule")) {
                    return 4;
                }
                return -1;
            }
            if (str.equals("will_appear_trigger")) {
                return 5;
            }
            return -1;
        }
        if (str.equals("slide_trigger")) {
            return 3;
        }
        return -1;
    }

    @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
    public void onHostSetup(boolean z) {
        if (z) {
            registerCallback();
        }
    }

    public final void runTask(PTYCepResult pTYCepResult) throws JSONException {
        Map<String, String> stringMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String ruleName = pTYCepResult.getRuleName();
        linkedHashMap.put("rule_name", ruleName);
        new JSONObject();
        if (Intrinsics.LJFF(ruleName, "delte_trigger")) {
            if ((!pTYCepResult.getMatchedEventsSequences().isEmpty()) && ((JSONArray) ListProtector.get(pTYCepResult.getMatchedEventsSequences(), 0)).length() > 0) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject((JSONArray) ListProtector.get(pTYCepResult.getMatchedEventsSequences(), 0), 0);
                if (Intrinsics.LJFF(jSONObject.optString("name", ""), "live_card_hot_refresh_remove_key")) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                    if (jSONObjectOptJSONObject != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params_log_map");
                        if (jSONObjectOptJSONObject2 != null && (stringMap = toStringMap(jSONObjectOptJSONObject2)) != null) {
                            linkedHashMap.putAll(stringMap);
                        }
                        jSONObjectOptJSONObject.put("is_delete", true);
                        runTaskWithPitaya(jSONObjectOptJSONObject, linkedHashMap, ruleName);
                        return;
                    }
                    logFailReason(linkedHashMap, 105, null);
                    return;
                }
                logFailReason(linkedHashMap, 100, null);
                return;
            }
            logFailReason(linkedHashMap, 101, null);
            return;
        }
        if (getCepRuleList().contains(ruleName)) {
            C01TT.LIZLLL(new AwS139S1200000_24(this, (LiveHotReloadCepManager) ruleName, (String) linkedHashMap, (Map<String, String>) 3));
        } else {
            logFailReason(linkedHashMap, 106, null);
        }
    }

    public final void setPackageInit(boolean z) {
        this.packageInit = z;
    }

    public final void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public final Map<String, String> toStringMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveClientAIService", e);
        }
        return linkedHashMap;
    }

    private final void onEventInternal(String str, JSONObject jSONObject) {
        if (getAsyncEvent()) {
            C0CNO.LIZ(C15O7.LJI, new AwS139S1200000_24(this, str, jSONObject, 2));
            return;
        }
        InterfaceC1610880s1O cepService = getCepService();
        if (cepService == null) {
            return;
        }
        cepService.onEvent(str, jSONObject);
    }

    public final boolean gapBlockForRealTime(int i, int i2) {
        int i3 = C1602480rnq.LIZ().gapBlockRealTime;
        if (i3 > 0 && i2 != -1 && i - i2 <= i3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1564100qnw
    public boolean onEvent(String str, JSONObject jSONObject) {
        if (this.isRegistered && getCepService() != null) {
            onEventInternal(str, jSONObject);
            return true;
        }
        return false;
    }

    public final void logFailReason(Map<String, String> map, int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode:");
        sbLIZ.append(i);
        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str != null && map != null) {
            map.put("detail_error_code", str);
        }
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("livesdk_preview_card_hot_update", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.feed.util.LiveHotReloadCepManager$onEvent$1] */
    @Override // X.InterfaceC1564100qnw
    public void onEvent(String str, JSONObject jSONObject, final Function2<? super Boolean, ? super String, Unit> function2) {
        if (this.isRegistered && getCepService() != null) {
            if (this.packageInit) {
                onEventInternal(str, jSONObject);
                function2.invoke(Boolean.TRUE, CardStruct.IStatusCode.DEFAULT);
                return;
            } else {
                getPitayaCore().LJ(new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.feed.util.LiveHotReloadCepManager.onEvent.1
                    @Override // com.bytedance.pitaya.api.PTYPackageCallback
                    public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                        if (z) {
                            LiveHotReloadCepManager.this.setPackageInit(true);
                            function2.invoke(Boolean.TRUE, CardStruct.IStatusCode.DEFAULT);
                            return;
                        }
                        if (pTYError != null && pTYError.getCode() == PTYErrorCode.PACKAGE_NOT_READY.getCode()) {
                            InterfaceC472980Igi pitayaCore = LiveHotReloadCepManager.this.getPitayaCore();
                            LiveHotReloadCepManager.Companion.getClass();
                            pitayaCore.LIZJ(LiveHotReloadCepManager.EMPTY_CALLBACK$delegate.getValue());
                        }
                        function2.invoke(Boolean.FALSE, "4");
                    }
                });
                return;
            }
        }
        function2.invoke(Boolean.FALSE, "3");
    }

    @Override // com.bytedance.pitaya.api.PTYPackageCallback
    public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
        if (z) {
            this.packageInit = true;
        }
    }

    public final void runTaskWithPitaya(final JSONObject jSONObject, final Map<String, String> map, final String str) {
        C1602350rnd.LIZ.getClass();
        C1602350rnd.LIZ(3, map);
        getPitayaCore().LIZLLL("tt_live_hot_reload", jSONObject, new InterfaceC472990Igj() { // from class: X.0rnb
            @Override // X.InterfaceC472990Igj
            public final void LIZ(C1093210eYR c1093210eYR) {
                String strValueOf;
                Integer numValueOf;
                C1602350rnd c1602350rnd = C1602350rnd.LIZ;
                Map<String, String> map2 = map;
                c1602350rnd.getClass();
                C1602350rnd.LIZ(4, map2);
                JSONObject jSONObject2 = c1093210eYR.LIZIZ;
                int code = 0;
                if (jSONObject2 != null) {
                    Map<String, String> map3 = map;
                    JSONObject jSONObject3 = jSONObject;
                    LiveHotReloadCepManager liveHotReloadCepManager = this;
                    int iOptInt = jSONObject2.optInt("error_code", -1);
                    String str2 = null;
                    if (jSONObject2.optBoolean("need_reload", false)) {
                        String str3 = map3.get("group_error_type");
                        List<String> listLIZ = C120100cx.LIZ(C1602440rnm.LIZ(jSONObject2.optString("hot_reload_queue_types")));
                        List<String> listLIZ2 = C120100cx.LIZ(C1602440rnm.LIZ(jSONObject2.optString("hot_reload_old_reqs")));
                        List<String> listLIZ3 = C120100cx.LIZ(C1602440rnm.LIZ(jSONObject2.optString("hot_reload_lives")));
                        if (str3 == null) {
                            ArrayList arrayList = (ArrayList) listLIZ;
                            if (arrayList.contains("") || arrayList.contains(CardStruct.IStatusCode.DEFAULT)) {
                                str2 = "1200";
                            }
                            map3.put("group_error_type", str2);
                        }
                        if (!map3.containsKey("to_replace_size")) {
                            map3.put("to_replace_size", String.valueOf(((ArrayList) listLIZ3).size()));
                        }
                        map3.put("reload_link", "1");
                        int iOptInt2 = jSONObject3.optInt("replace_index");
                        ArrayList arrayList2 = (ArrayList) listLIZ2;
                        int size = arrayList2.size();
                        if (size != ((ArrayList) listLIZ).size()) {
                            if (iOptInt2 <= size) {
                                listLIZ2 = arrayList2.subList(iOptInt2, size);
                            } else {
                                listLIZ2 = new ArrayList<>();
                            }
                        }
                        liveHotReloadCepManager.callback.LIZIZ(jSONObject2, map3, listLIZ, listLIZ2, listLIZ3);
                        return;
                    }
                    PTYError pTYError = c1093210eYR.LIZJ;
                    if (pTYError != null && (numValueOf = Integer.valueOf(pTYError.getCode())) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(iOptInt);
                        sbLIZ.append('_');
                        sbLIZ.append(numValueOf);
                        strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strValueOf = String.valueOf(iOptInt);
                    }
                    liveHotReloadCepManager.logFailReason(map3, 102, strValueOf);
                    return;
                }
                String str4 = str;
                JSONObject jSONObject4 = jSONObject;
                Map<String, String> map4 = map;
                LiveHotReloadCepManager liveHotReloadCepManager2 = this;
                if ((C1602480rnq.LIZ().errorHandle & 2) == 2 && Intrinsics.LJFF(str4, "delte_trigger")) {
                    List<String> listLIZ4 = C120100cx.LIZ(C1602440rnm.LIZ(jSONObject4.optString("slate_group_type")));
                    List<String> listLIZ5 = C120100cx.LIZ(C1602440rnm.LIZ(jSONObject4.optString("live_feed_list")));
                    List<String> listLIZ6 = C120100cx.LIZ(C1602440rnm.LIZ(jSONObject4.optString("hot_reload_old_reqs")));
                    ArrayList arrayList3 = (ArrayList) listLIZ4;
                    int size2 = arrayList3.size();
                    ArrayList arrayList4 = (ArrayList) listLIZ5;
                    int size3 = arrayList4.size();
                    ArrayList arrayList5 = (ArrayList) listLIZ6;
                    int size4 = arrayList5.size();
                    int iOptInt3 = jSONObject4.optInt("replace_index");
                    if (iOptInt3 >= 0 && iOptInt3 <= size2 && iOptInt3 <= size3 && iOptInt3 <= size4) {
                        List<String> listSubList = arrayList3.subList(iOptInt3, size2);
                        List<String> listSubList2 = arrayList4.subList(iOptInt3, size3);
                        List<String> listSubList3 = arrayList5.subList(iOptInt3, size4);
                        if (!map4.containsKey("to_replace_size")) {
                            map4.put("to_replace_size", String.valueOf(listSubList2.size()));
                        }
                        map4.put("reload_link", "5");
                        liveHotReloadCepManager2.callback.LIZIZ(jSONObject4, map4, listSubList, listSubList3, listSubList2);
                    }
                }
                PTYError pTYError2 = c1093210eYR.LIZJ;
                if (pTYError2 != null) {
                    code = pTYError2.getCode();
                }
                liveHotReloadCepManager2.logFailReason(map4, 103, String.valueOf(code));
            }
        }, new C464190IIf(0L, 63));
    }
}
