package com.ss.android.ugc.aweme.pspimpl;

import X.AbstractC2343909Gj;
import X.C0AQ8;
import X.C11S5;
import X.C13BV;
import X.C1491150ouH;
import X.C1502030pBp;
import X.C1510610pPf;
import X.C2097608Jq;
import X.C842540X3k;
import X.InterfaceC626120Oh8;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pspapi.IClientAiRequest;
import com.ss.android.ugc.aweme.pspapi.IPSPDataService;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToAppLog;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToGlobalStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionStoreValueToFeatureCenter;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiScene;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategy;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackage;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_all_response;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMActionModel;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMPackageModel;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMSceneModel;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMStrategyModel;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PSPDataServiceImpl implements IPSPDataService {
    public final Map<String, Object> LIZ;
    public final String LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0pBp] */
    @Override // com.ss.android.ugc.aweme.pspapi.IPSPDataService
    public final C1502030pBp LIZJ() {
        return new AbstractC2343909Gj() { // from class: X.0pBp
            @Override // X.AbstractC2343909Gj
            public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                if (Intrinsics.LJFF(type, cai_sync_all_response.class)) {
                    return new InterfaceC1501660pBE() { // from class: X.0pBq
                        @Override // X.InterfaceC1501660pBE
                        public final Object LIZ(Object obj) {
                            try {
                                return cai_sync_all_response.ADAPTER.decode(((TypedInput) obj).in());
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }
                    };
                }
                return null;
            }
        };
    }

    public PSPDataServiceImpl() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        new ArrayList();
        this.LIZIZ = "https://api.tiktokv.com/";
        Keva keva = C1491150ouH.LIZ;
        linkedHashMap.put("strategy_req", C2097608Jq.LJI(new Pair("cookie", C1491150ouH.LIZ.getString("cai_strategy_cookie", ""))));
        linkedHashMap.put("value_req", new HashMap());
    }

    @Override // com.ss.android.ugc.aweme.pspapi.IPSPDataService
    public final C13BV LIZ() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.pspapi.IPSPDataService
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.pspapi.IPSPDataService
    public final Map<String, Object> LJ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.pspapi.IPSPDataService
    public final void LIZLLL(C842540X3k c842540X3k, IClientAiRequest iClientAiRequest, final C1510610pPf c1510610pPf) throws JSONException {
        if (!((Boolean) C0AQ8.LIZ.getValue()).booleanValue()) {
            c1510610pPf.invoke(null, -5, null);
        } else {
            iClientAiRequest.requestAllClientAIData(c842540X3k).LJL(C11S5.LIZ()).LIZIZ(new InterfaceC626120Oh8<cai_sync_all_response>() { // from class: X.1Bkz
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_err_code", -1);
                    jSONObject.put("e_message", th.getMessage());
                    Keva keva = C1491150ouH.LIZ;
                    jSONObject.put("req_last_store_code", keva.getInt("cai_last_req_store_code", 0));
                    keva.storeInt("cai_last_req_store_code", 0);
                    this.LL.getClass();
                    Function2<? super EnumC1153320g7O, ? super JSONObject, Unit> function2 = C2213421Bk4.LJII;
                    if (function2 != null) {
                        function2.invoke(EnumC1153320g7O.CENTER_INFO, jSONObject);
                    }
                    c1510610pPf.invoke(null, -1, th.getMessage());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v24 */
                /* JADX WARN: Type inference failed for: r1v26, types: [byte[]] */
                /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
                @Override // X.InterfaceC626120Oh8
                public final void onNext(cai_sync_all_response cai_sync_all_responseVar) throws JSONException {
                    int i;
                    int i2;
                    ArrayList arrayList;
                    int i3;
                    ?? String;
                    cai_sync_all_response cai_sync_all_responseVar2 = cai_sync_all_responseVar;
                    JSONObject jSONObject = new JSONObject();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Integer num = cai_sync_all_responseVar2.strategy_resp.update_type;
                    if (num != null && num.intValue() == 0) {
                        i2 = -3;
                    } else {
                        List<CaiScene> list = cai_sync_all_responseVar2.strategy_resp.scene_updates;
                        if (list != null && !list.isEmpty()) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        List<CaiStrategyPackage> list2 = cai_sync_all_responseVar2.strategy_resp.package_updates;
                        if (list2 == null || list2.isEmpty()) {
                            i |= 2;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (CaiStrategyPackage caiStrategyPackage : list2) {
                            Integer num2 = caiStrategyPackage.engine_type;
                            Integer num3 = caiStrategyPackage.content_type;
                            if (num3 != null) {
                                if (num3.intValue() == 3) {
                                    String = caiStrategyPackage.content.string(Charset.defaultCharset());
                                    if (String.length() == 0) {
                                        i |= 8;
                                    } else {
                                        linkedHashMap.put(caiStrategyPackage.id, new TTMPackageModel(caiStrategyPackage.id, num2.intValue(), caiStrategyPackage.size.intValue(), caiStrategyPackage.md5, String, 0L, num3.intValue(), null, caiStrategyPackage.runtime_type.intValue()));
                                    }
                                } else if (num3.intValue() == 1) {
                                    String = caiStrategyPackage.content.toByteArray();
                                    if (String.length == 0) {
                                        i |= 8;
                                    } else {
                                        linkedHashMap.put(caiStrategyPackage.id, new TTMPackageModel(caiStrategyPackage.id, num2.intValue(), caiStrategyPackage.size.intValue(), caiStrategyPackage.md5, String, 0L, num3.intValue(), null, caiStrategyPackage.runtime_type.intValue()));
                                    }
                                }
                            }
                            i |= 4;
                        }
                        for (CaiScene caiScene : list) {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            TTMSceneModel tTMSceneModel = new TTMSceneModel(caiScene.key, arrayList2, arrayList3, caiScene.user_related.booleanValue(), null, 0);
                            C1518020pbc.LIZ(caiScene.key, null, caiScene.streams, arrayList3);
                            List<CaiStrategy> list3 = caiScene.strategies;
                            if (list3 == null || list3.isEmpty()) {
                                i |= 16;
                            }
                            for (CaiStrategy caiStrategy : list3) {
                                String str = caiStrategy.key;
                                String str2 = caiStrategy.strategy_package;
                                List<CaiAction> list4 = caiStrategy.actions;
                                if (list4 != null) {
                                    arrayList = new ArrayList();
                                    int i4 = 0;
                                    for (CaiAction caiAction : list4) {
                                        Integer num4 = caiAction.action_type;
                                        CaiActionEmitEventToAppLog caiActionEmitEventToAppLog = caiAction.emit_event_to_applog;
                                        if (caiActionEmitEventToAppLog != null) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("key", caiActionEmitEventToAppLog.event_type_name);
                                            jSONObject2.put("par", caiActionEmitEventToAppLog.extra_param_json);
                                            i3 = i4 + 1;
                                            arrayList.add(new TTMActionModel(str, num4.intValue(), C786410Ut5.J3(jSONObject2), i4));
                                        } else {
                                            CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream = caiAction.emit_event_to_global_stream;
                                            if (caiActionEmitEventToGlobalStream != null) {
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put("key", caiActionEmitEventToGlobalStream.event_type_name);
                                                jSONObject3.put("par", caiActionEmitEventToGlobalStream.extra_param_json);
                                                i3 = i4 + 1;
                                                arrayList.add(new TTMActionModel(str, num4.intValue(), C786410Ut5.J3(jSONObject3), i4));
                                            } else {
                                                CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter = caiAction.store_value_to_feature_center;
                                                if (caiActionStoreValueToFeatureCenter != null) {
                                                    JSONObject jSONObject4 = new JSONObject();
                                                    jSONObject4.put("featureKey", caiActionStoreValueToFeatureCenter.feature_key);
                                                    jSONObject4.put("sourceType", caiActionStoreValueToFeatureCenter.source_type.intValue());
                                                    jSONObject4.put("featureGroupKey", caiActionStoreValueToFeatureCenter.producer_key);
                                                    i3 = i4 + 1;
                                                    arrayList.add(new TTMActionModel(str, num4.intValue(), C786410Ut5.J3(jSONObject4), i4));
                                                } else {
                                                    CaiActionManageScene caiActionManageScene = caiAction.manage_scene;
                                                    if (caiActionManageScene != null) {
                                                        CaiActionManageScene.StrategyOperation strategyOperation = caiActionManageScene.strategy_operation;
                                                        JSONObject jSONObject5 = new JSONObject();
                                                        jSONObject5.put("strategy_key", strategyOperation.strategy_key);
                                                        jSONObject5.put("operator", strategyOperation.operator.intValue());
                                                        int iIntValue = num4.intValue();
                                                        String strJ3 = C786410Ut5.J3(jSONObject5);
                                                        i3 = i4 + 1;
                                                        arrayList.add(new TTMActionModel(str, iIntValue, strJ3, i4));
                                                    } else {
                                                        arrayList.add(new TTMActionModel(str, num4.intValue(), null, i4));
                                                        i4++;
                                                    }
                                                }
                                            }
                                        }
                                        i4 = i3;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(new TTMStrategyModel(str, (TTMPackageModel) linkedHashMap.get(str2), arrayList));
                                C1518020pbc.LIZ(caiScene.key, str, caiStrategy.streams, arrayList3);
                            }
                            TTMStrategyCenterManagerImpl.LIZ.LJIIIIZZ(tTMSceneModel);
                        }
                        Keva keva = C1491150ouH.LIZ;
                        keva.storeInt("cai_last_req_store_code", 1);
                        int iLJII = TTMStrategyCenterManagerImpl.LIZ.LJII(jSONObject);
                        keva.storeInt("cai_last_req_store_code", 0);
                        if (iLJII == -2) {
                            i2 = i | 32;
                        } else if (iLJII == -3) {
                            i2 = i | 64;
                        } else if (iLJII == -4) {
                            i2 = i | 128;
                        } else {
                            i2 = -5;
                            if (i != -5) {
                                i2 = i;
                            }
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (i2 == 0) {
                        Keva keva2 = C1491150ouH.LIZ;
                        C1491150ouH.LIZ.storeString("cai_strategy_cookie", cai_sync_all_responseVar2.strategy_resp.cookie);
                    }
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("req_err_code", i2);
                    jSONObject6.put("req_store_const_time", jCurrentTimeMillis2 - jCurrentTimeMillis);
                    Keva keva3 = C1491150ouH.LIZ;
                    jSONObject6.put("req_last_store_code", keva3.getInt("cai_last_req_store_code", 0));
                    jSONObject6.put("e_message", jSONObject);
                    keva3.storeInt("cai_last_req_store_code", 0);
                    this.LL.getClass();
                    Function2<? super EnumC1153320g7O, ? super JSONObject, Unit> function2 = C2213421Bk4.LJII;
                    if (function2 != null) {
                        function2.invoke(EnumC1153320g7O.CENTER_INFO, jSONObject6);
                    }
                    InterfaceC1631620sYq<cai_sync_all_response, Integer, String, Unit> interfaceC1631620sYq = c1510610pPf;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke(cai_sync_all_responseVar2, Integer.valueOf(i2), null);
                    }
                }
            });
        }
    }
}
