package com.ss.android.ugc.tiktok.pns.upc;

import X.AbstractC19994813Le;
import X.C01WI;
import X.C01WJ;
import X.C01WL;
import X.C0BXR;
import X.C100C;
import X.C13BV;
import X.C1518760pco;
import X.C1518770pcp;
import X.C159700jL;
import X.C267820Aea;
import X.C830030WhF;
import X.InterfaceC829930Wh5;
import android.os.Bundle;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService;
import com.ss.android.ugc.tiktok.pns.upc.config.SampleData;
import com.ss.android.ugc.tiktok.pns.upc.config.UPCNetworkReportingConfigData;
import com.ss.android.ugc.tiktok.pns.upc.config.UPCSignalSampleConfig;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PNSUpcServiceImpl implements IPNSUpcService {
    @Override // com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService
    public final void LIZJ() {
        C159700jL c159700jL = C159700jL.LIZ;
        c159700jL.getClass();
        UPCNetworkReportingConfigData uPCNetworkReportingConfigData = (UPCNetworkReportingConfigData) C159700jL.LIZJ.getValue();
        if (uPCNetworkReportingConfigData != null && uPCNetworkReportingConfigData.enableUpcNetworkReporting && C159700jL.LIZIZ.compareAndSet(false, true)) {
            C100C.LIZ.LJI().LIZ(c159700jL);
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService
    public final void initialize() {
        if (C0BXR.LIZ() && ((Boolean) C267820Aea.LIZ.getValue()).booleanValue()) {
            C830030WhF.LIZ.getClass();
            if (C830030WhF.LIZIZ == null) {
                TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0WhE
                    @Override // X.InterfaceC829930Wh5
                    public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                        if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
                            C830030WhF.LIZ.getClass();
                            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("pns_upc_feature_detector", null, null, new AbstractC830880Wic() { // from class: X.0WhB
                                @Override // X.AbstractC830880Wic
                                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                                    String string;
                                    Map map;
                                    Integer numValueOf;
                                    HashMap map2;
                                    String str;
                                    Map map3;
                                    IGatekeeperService iGatekeeperService;
                                    Object obj;
                                    boolean zBooleanValue;
                                    String str2;
                                    Boolean bool;
                                    Map map4;
                                    Set<Map.Entry> setEntrySet;
                                    String str3;
                                    Object value;
                                    String str4;
                                    Map map5;
                                    Map map6;
                                    Long l;
                                    C830030WhF c830030WhF = C830030WhF.LIZ;
                                    String str5 = interfaceC805220ViK.LIZLLL().LIZIZ;
                                    String strName = interfaceC805220ViK.LIZIZ().name();
                                    Object objLIZJ = interfaceC805220ViK.LIZJ();
                                    if (objLIZJ == null || (string = objLIZJ.toString()) == null) {
                                        string = "";
                                    }
                                    c830030WhF.getClass();
                                    int i = 2;
                                    C20684815ws.LJIILLIIL("upc_metrics_info", C2097608Jq.LJIIIIZZ(new Pair("step", "psp_strategy_action"), new Pair("psp_scene", "pns_upc_feature_detector"), new Pair("psp_strategy", str5), new Pair("action_state_code", strName), new Pair("action_result", string)));
                                    if (interfaceC805220ViK.LIZIZ() != EnumC1910390zoT.CelResult) {
                                        return;
                                    }
                                    Object objLIZJ2 = interfaceC805220ViK.LIZJ();
                                    HashMap map7 = null;
                                    Object obj2 = null;
                                    if ((objLIZJ2 instanceof Map) && (map = (Map) objLIZJ2) != null) {
                                        try {
                                            Object obj3 = map.get("need_trigger_upc_signal");
                                            if ((obj3 instanceof Long) && (l = (Long) obj3) != null) {
                                                numValueOf = Integer.valueOf((int) l.longValue());
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            numValueOf = 0;
                                        }
                                        if (numValueOf != null && numValueOf.intValue() == 1) {
                                            Object obj4 = map.get("upc_capability_type");
                                            if (!(obj4 instanceof String)) {
                                                obj4 = null;
                                            }
                                            if (Intrinsics.LJFF(obj4, EnumC046600Eu.BUSINESS_VISIT.getTypeName())) {
                                                Object obj5 = map.get(Scene.SCENE_SERVICE);
                                                if ((obj5 instanceof String) && (str4 = (String) obj5) != null) {
                                                    Object obj6 = map.get("extra");
                                                    if (obj6 instanceof Map) {
                                                        map5 = (Map) obj6;
                                                    } else {
                                                        map5 = null;
                                                    }
                                                    Object obj7 = map.get("log_extra");
                                                    if (obj7 instanceof Map) {
                                                        map6 = (Map) obj7;
                                                    } else {
                                                        map6 = null;
                                                    }
                                                    C01WM c01wm = new C01WM(str4, map5, map6);
                                                    C1518550pcT c1518550pcT = C1518550pcT.LIZ;
                                                    UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel("upc_business_visit_v2", c01wm, null);
                                                    Map mapLJ = C2097608Jq.LJ();
                                                    c1518550pcT.getClass();
                                                    C1518550pcT.LJI(userCommunicationProcessorModel, null, mapLJ);
                                                    C830030WhF.LIZ.getClass();
                                                    C20684815ws.LJIILLIIL("upc_metrics_info", C2097608Jq.LJIIIIZZ(new Pair("step", "actionExecute"), new Pair("scene_key", str4)));
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Intrinsics.LJFF(obj4, EnumC046600Eu.RISK_PERCEPTION.getTypeName())) {
                                                Object obj8 = map.get("upc_validator_type");
                                                if (!(obj8 instanceof String) || obj8 == null) {
                                                    obj8 = "";
                                                }
                                                if (Intrinsics.LJFF(obj8, EnumC1995207ri.PUMBAA.getTypeName())) {
                                                    Object obj9 = map.get(Scene.SCENE_SERVICE);
                                                    String str6 = "";
                                                    if (obj9 instanceof String) {
                                                        String str7 = (String) obj9;
                                                        str6 = "";
                                                        if (str7 != null) {
                                                            str6 = str7;
                                                        }
                                                    }
                                                    Object obj10 = map.get("extra");
                                                    if (obj10 instanceof Map) {
                                                        map4 = (Map) obj10;
                                                    } else {
                                                        map4 = null;
                                                    }
                                                    Object obj11 = map.get("log_extra");
                                                    if (!(obj11 instanceof Map)) {
                                                        obj11 = null;
                                                    }
                                                    new Object() { // from class: X.0WhH
                                                    }.getClass();
                                                    if (str6.length() != 0) {
                                                        PrivacyEvent.Companion.getClass();
                                                        PrivacyEvent privacyEventLIZ = C0WRC.LIZ(str6, "1PSDK");
                                                        if (map4 != null && (setEntrySet = map4.entrySet()) != null) {
                                                            for (Map.Entry entry : setEntrySet) {
                                                                Object key = entry.getKey();
                                                                if ((key instanceof String) && (str3 = (String) key) != null && (value = entry.getValue()) != null) {
                                                                    if (value instanceof String) {
                                                                        privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.String, value));
                                                                    } else if (value instanceof Long) {
                                                                        privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Long, value));
                                                                    } else if (value instanceof Boolean) {
                                                                        privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Bool, value));
                                                                    } else if (value instanceof Double) {
                                                                        privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Double, value));
                                                                    } else {
                                                                        privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Any, value));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        long jNanoTime = System.nanoTime();
                                                        long j = LSPassThroughRecordSizeConfig.DEFAULT;
                                                        List<C0WRN> listHandleEvent = EventPipeline.handleEvent(privacyEventLIZ, null);
                                                        C20684815ws.LJIILLIIL("upc_metrics_info", C2097608Jq.LJIIIIZZ(new Pair("step", "strategy_execute"), new Pair("scene_key", str6), new Pair("strategy_excute_time", String.valueOf((System.nanoTime() / j) - (jNanoTime / j)))));
                                                        for (C0WRN c0wrn : listHandleEvent) {
                                                            String str8 = c0wrn.LIZ.LIZIZ;
                                                            if (str8.length() != 0) {
                                                                String str9 = c0wrn.LIZIZ;
                                                                Pair[] pairArr = new Pair[i];
                                                                pairArr[0] = new Pair(Scene.SCENE_SERVICE, str6);
                                                                pairArr[1] = new Pair("policy_id", str9);
                                                                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                                                                if (map4 != null) {
                                                                    mapLJIIJ.put("extra", map4);
                                                                }
                                                                if (obj11 != null) {
                                                                    mapLJIIJ.put("log_extra", obj11);
                                                                }
                                                                C13DA c13da = new C13DA();
                                                                Iterator<T> it2 = c0wrn.LIZ.LIZJ.entrySet().iterator();
                                                                while (it2.hasNext()) {
                                                                    Map.Entry entry2 = (Map.Entry) it2.next();
                                                                    String str10 = (String) entry2.getKey();
                                                                    Object value2 = entry2.getValue();
                                                                    if (str10.length() > 0 && value2 != null) {
                                                                        c13da.put(str10, value2);
                                                                    }
                                                                }
                                                                Map mapBuild = c13da.build();
                                                                C1227904rF.LIZ.getClass();
                                                                UserCommunicationProcessorModel userCommunicationProcessorModel2 = new UserCommunicationProcessorModel(str8, C1227904rF.LJI(mapLJIIJ), null);
                                                                C1518550pcT.LIZ.getClass();
                                                                C1518550pcT.LJI(userCommunicationProcessorModel2, null, mapBuild);
                                                                new Object() { // from class: X.0WhH
                                                                }.getClass();
                                                                C20684815ws.LJIILLIIL("upc_metrics_info", C2097608Jq.LJIIIIZZ(new Pair("step", "action_execute"), new Pair("scene_key", str6), new Pair("policy_id", str9), new Pair("action_id", str8)));
                                                            }
                                                            i = 2;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Intrinsics.LJFF(obj8, EnumC1995207ri.PPF.getTypeName())) {
                                                    Object obj12 = map.get(Scene.SCENE_SERVICE);
                                                    if (!(obj12 instanceof String) || (str = (String) obj12) == null) {
                                                        str = "";
                                                    }
                                                    Object obj13 = map.get("extra");
                                                    if (obj13 instanceof Map) {
                                                        map3 = (Map) obj13;
                                                    } else {
                                                        map3 = null;
                                                    }
                                                    boolean z = map.get("log_extra") instanceof Map;
                                                    new Object() { // from class: X.0WhG
                                                    }.getClass();
                                                    if (str.length() != 0 && (iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null)) != null) {
                                                        boolean zLJII = iGatekeeperService.LJII();
                                                        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ = iGatekeeperService.LIZ(str);
                                                        if (map3 != null) {
                                                            obj = map3.get("feature_business");
                                                        } else {
                                                            obj = null;
                                                        }
                                                        Object obj14 = "";
                                                        obj14 = "";
                                                        if ((obj instanceof String) && obj != null) {
                                                            obj14 = obj;
                                                        }
                                                        if (map3 != null) {
                                                            obj2 = map3.get("current_status");
                                                        }
                                                        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
                                                            zBooleanValue = bool.booleanValue();
                                                        } else {
                                                            zBooleanValue = true;
                                                        }
                                                        if (eligibilityModelLIZ == null) {
                                                            C20684815ws.LJIILLIIL("pns_ppf_data_unknown", C2097608Jq.LJIIIIZZ(new Pair("business", obj14), new Pair("current_status", String.valueOf(zBooleanValue)), new Pair("feature_id", str), new Pair("app_status", String.valueOf(zLJII)), new Pair("decisionCode", "000001"), new Pair("ppf_status", "false")));
                                                            return;
                                                        }
                                                        boolean zIsEligible = eligibilityModelLIZ.isEligible();
                                                        String str11 = eligibilityModelLIZ.decisionCode;
                                                        if (zIsEligible && zLJII) {
                                                            str2 = "pns_ppf_check_success";
                                                        } else {
                                                            str2 = "pns_ppf_check_failure";
                                                        }
                                                        C20684815ws.LJIILLIIL(str2, C2097608Jq.LJIIIIZZ(new Pair("business", obj14), new Pair("current_status", String.valueOf(zBooleanValue)), new Pair("feature_id", str), new Pair("app_status", String.valueOf(zLJII)), new Pair("decisionCode", str11), new Pair("ppf_status", String.valueOf(zIsEligible))));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            Object obj15 = map.get("upc_validator_type");
                                            if (!(obj15 instanceof String) || obj15 == null) {
                                                obj15 = "";
                                            }
                                            if (Intrinsics.LJFF(obj15, EnumC1995207ri.PUMBAA.getTypeName())) {
                                                Bundle bundle = new Bundle();
                                                Object obj16 = map.get(Scene.SCENE_SERVICE);
                                                String str12 = "";
                                                if (obj16 instanceof String) {
                                                    String str13 = (String) obj16;
                                                    str12 = "";
                                                    if (str13 != null) {
                                                        str12 = str13;
                                                    }
                                                }
                                                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, str12, bundle);
                                                Object obj17 = map.get("extra");
                                                if (obj17 instanceof HashMap) {
                                                    map2 = (HashMap) obj17;
                                                } else {
                                                    map2 = null;
                                                }
                                                C786410Ut5.LJJIZ(bundle, "extra", map2);
                                                Object obj18 = map.get("log_extra");
                                                if (obj18 instanceof HashMap) {
                                                    map7 = (HashMap) obj18;
                                                }
                                                C786410Ut5.LJJIZ(bundle, "log_extra", map7);
                                                IGatekeeperService iGatekeeperService2 = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                                                if (iGatekeeperService2 != null) {
                                                    iGatekeeperService2.LJIIIIZZ("UPCFeatureDetectorSignal", bundle, null);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (!Intrinsics.LJFF(obj15, EnumC1995207ri.PPF.getTypeName())) {
                                                return;
                                            }
                                            Bundle bundle2 = new Bundle();
                                            Object obj19 = map.get(Scene.SCENE_SERVICE);
                                            String str14 = "";
                                            if (obj19 instanceof String) {
                                                String str15 = (String) obj19;
                                                str14 = "";
                                                if (str15 != null) {
                                                    str14 = str15;
                                                }
                                            }
                                            C786410Ut5.LJJJI("fid", str14, bundle2);
                                            IGatekeeperService iGatekeeperService3 = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                                            if (iGatekeeperService3 == null) {
                                                return;
                                            }
                                            iGatekeeperService3.LJIIIIZZ("FeatureAccessTaskSignal", bundle2, null);
                                        }
                                    }
                                }

                                @Override // X.AbstractC830880Wic
                                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                                    boolean z;
                                    String str;
                                    EnumC2213771Bkd enumC2213771Bkd2 = EnumC2213771Bkd.TTMStateCodeSuccess;
                                    if (enumC2213771Bkd == enumC2213771Bkd2) {
                                        C830030WhF.LIZIZ = interfaceC830890Wid;
                                    }
                                    C830030WhF c830030WhF = C830030WhF.LIZ;
                                    if (enumC2213771Bkd == enumC2213771Bkd2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    c830030WhF.getClass();
                                    Pair[] pairArr = new Pair[3];
                                    pairArr[0] = new Pair("step", "register_psp_scene");
                                    pairArr[1] = new Pair("psp_scene", "pns_upc_feature_detector");
                                    if (z) {
                                        str = "1";
                                    } else {
                                        str = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    pairArr[2] = new Pair("register_success", str);
                                    C20684815ws.LJIILLIIL("upc_metrics_info", C2097608Jq.LJIIIIZZ(pairArr));
                                }
                            });
                        }
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService
    public final C01WI LIZ() {
        return C01WI.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService
    public final C01WL LIZLLL() {
        return C01WL.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService
    public final C01WJ LJ() {
        return C01WJ.LIZ;
    }

    @Override // com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService
    public final void LIZIZ(Map map) {
        UPCSignalSampleConfig uPCSignalSampleConfig;
        List<SampleData> list;
        C1518760pco c1518760pco = C1518770pcp.LIZ;
        if (c1518760pco.LIZ.getValue() != null && (uPCSignalSampleConfig = (UPCSignalSampleConfig) c1518760pco.LIZ.getValue()) != null && Intrinsics.LJFF(uPCSignalSampleConfig.enable, Boolean.TRUE)) {
            UPCSignalSampleConfig uPCSignalSampleConfig2 = (UPCSignalSampleConfig) c1518760pco.LIZ.getValue();
            if (uPCSignalSampleConfig2 == null || (list = uPCSignalSampleConfig2.signalList) == null) {
                list = C13BV.INSTANCE;
            }
            if (!list.isEmpty()) {
                for (SampleData sampleData : list) {
                    if (Intrinsics.LJFF(sampleData.signalKey, "upc_geoblock_network_process")) {
                        Double d = sampleData.sampleRate;
                        if (d != null) {
                            double dDoubleValue = d.doubleValue();
                            if (dDoubleValue > 0.0d && dDoubleValue <= 1.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) < dDoubleValue) {
                                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("upc_geoblock_network_process", new JSONObject(map), (ExecutorService) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
