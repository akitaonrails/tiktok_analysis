package com.bytedance.android.livestrategy;

import X.AbstractC830880Wic;
import X.C1090000eTG;
import X.C1093020eY8;
import X.C1093030eY9;
import X.C1093040eYA;
import X.C1093130eYJ;
import X.C1093160eYM;
import X.C1093270eYX;
import X.C1093360eYg;
import X.C1093390eYj;
import X.C1093400eYk;
import X.C1093420eYm;
import X.C1094620eai;
import X.C1161920gLG;
import X.C1533950q1J;
import X.C157V;
import X.C20441214yg;
import X.C2188811AlT;
import X.C227400uG;
import X.C477840IoY;
import X.EnumC1090770eUV;
import X.EnumC1093190eYP;
import X.EnumC1093370eYh;
import X.EnumC1094630eaj;
import X.InterfaceC1092770eXj;
import X.InterfaceC1093410eYl;
import X.InterfaceC1610880s1O;
import X.InterfaceC829930Wh5;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livestrategy.LiveStrategyCenterService;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepResult;
import com.bytedance.pitaya.api.bean.PTYCepCallbackMode;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.strategy.HostClientAiService$wrapperLivePitayaCore$1;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.strategycenter.TTMStrategyResult;
import com.tiktok.strategycenter.TTMStrategyRunCallBack;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS166S1100000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class LiveStrategyCenterService implements ILiveStrategyCenterService {
    public boolean LL;

    public static Map LIZ(FinalStrategyConfig finalStrategyConfig) {
        C1090000eTG c1090000eTGO3;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Map<String, Map<String, List<String>>> inputParamsKey = finalStrategyConfig.getInputParamsKey();
            if (inputParamsKey != null) {
                for (Map.Entry<String, Map<String, List<String>>> entry : inputParamsKey.entrySet()) {
                    String key = entry.getKey();
                    Map<String, List<String>> value = entry.getValue();
                    EnumC1094630eaj.Companion.getClass();
                    EnumC1094630eaj enumC1094630eajLIZ = C1094620eai.LIZ(key);
                    for (Map.Entry<String, List<String>> entry2 : value.entrySet()) {
                        String key2 = entry2.getKey();
                        for (String str : entry2.getValue()) {
                            ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
                            if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(enumC1094630eajLIZ, key2, str)) != null && (obj = c1090000eTGO3.LIZJ) != null) {
                                linkedHashMap.put(str, obj);
                            }
                        }
                    }
                }
            }
            Map<String, Object> strategyInputParams = finalStrategyConfig.getStrategyInputParams();
            if (strategyInputParams != null) {
                linkedHashMap.putAll(strategyInputParams);
            }
            Map<String, Object> customParams = finalStrategyConfig.getCustomParams();
            if (customParams != null) {
                for (Map.Entry<String, Object> entry3 : customParams.entrySet()) {
                    String key3 = entry3.getKey();
                    Object value2 = entry3.getValue();
                    if (value2 != null) {
                        linkedHashMap.put(key3, value2);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mergeStrategyParams: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("LiveStrategyCenterService", C2188811AlT.LIZIZ(sbLIZ));
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final void Hv1(String str) {
        C1093420eYm.LIZIZ.LIZLLL(str);
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final void T4(TriggerStrategyConfig triggerStrategyConfig) {
        IHostAction iHostAction;
        C157V hostClientAiService;
        TTMStrategyCenter tTMStrategyCenterLJIILLIIL;
        C157V hostClientAiService2;
        InterfaceC1610880s1O interfaceC1610880s1OLIZLLL;
        long type = triggerStrategyConfig.getType();
        if (type == EnumC1093190eYP.PITAYA_CEP.getType()) {
            IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction2 != null && (hostClientAiService2 = iHostAction2.getHostClientAiService()) != null && (interfaceC1610880s1OLIZLLL = hostClientAiService2.LIZLLL()) != null) {
                interfaceC1610880s1OLIZLLL.LIZIZ(triggerStrategyConfig.getStrategyName(), triggerStrategyConfig.getRuleName());
                return;
            }
            return;
        }
        if (type == EnumC1093190eYP.PSP_CEP.getType()) {
            TTMStrategyCenterManager.deregisterSceneWithScene(triggerStrategyConfig.getTtmScene());
            return;
        }
        if (type == EnumC1093190eYP.FEATURE_MODIFY.getType()) {
            ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).T4(triggerStrategyConfig);
        } else {
            if (type != EnumC1093190eYP.TTM_CEP.getType() || (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) == null || (hostClientAiService = iHostAction.getHostClientAiService()) == null || (tTMStrategyCenterLJIILLIIL = hostClientAiService.LJIILLIIL()) == null) {
                return;
            }
            tTMStrategyCenterLJIILLIIL.unRegisterBizCepCallback(triggerStrategyConfig.getStrategyName(), triggerStrategyConfig.getRuleName());
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final C1093040eYA wX(FinalStrategyConfig finalStrategyConfig) {
        long type = finalStrategyConfig.getType();
        if (type != EnumC1093370eYh.PITAYA.getType()) {
            if (type == EnumC1093370eYh.PSP.getType()) {
                if (finalStrategyConfig.getTtmScene() == null) {
                    return null;
                }
                return C1093130eYJ.LIZJ(finalStrategyConfig.getStrategyName(), finalStrategyConfig.getTtmScene(), TTMStrategyCenterManager.runScene(finalStrategyConfig.getTtmScene(), finalStrategyConfig.getRuleName(), new TTMParamData((Map<String, Object>) LIZ(finalStrategyConfig))));
            }
            if (type == EnumC1093370eYh.EPI.getType()) {
                return ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).Tt(finalStrategyConfig, LIZ(finalStrategyConfig));
            }
            if (type != EnumC1093370eYh.PITAYA_CEP.getType() && type != EnumC1093370eYh.TTM_CEP.getType()) {
                EnumC1093370eYh.TTM_CEL.getType();
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final void G2(final InterfaceC1092770eXj interfaceC1092770eXj, final TriggerStrategyConfig triggerStrategyConfig) {
        C157V hostClientAiService;
        TTMStrategyCenter tTMStrategyCenterLJIILLIIL;
        C157V hostClientAiService2;
        HostClientAiService$wrapperLivePitayaCore$1 hostClientAiService$wrapperLivePitayaCore$1LJIJJLI;
        C157V hostClientAiService3;
        long type = triggerStrategyConfig.getType();
        InterfaceC1610880s1O interfaceC1610880s1OLIZLLL = null;
        if (type == EnumC1093190eYP.PITAYA_CEP.getType()) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null && (hostClientAiService3 = iHostAction.getHostClientAiService()) != null) {
                interfaceC1610880s1OLIZLLL = hostClientAiService3.LIZLLL();
            }
            if (interfaceC1610880s1OLIZLLL != null) {
                if (triggerStrategyConfig.getNotifyInputParams() != null) {
                    IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    if (iHostAction2 != null && (hostClientAiService2 = iHostAction2.getHostClientAiService()) != null && (hostClientAiService$wrapperLivePitayaCore$1LJIJJLI = hostClientAiService2.LJIJJLI()) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Map<String, List<String>> notifyInputParams = triggerStrategyConfig.getNotifyInputParams();
                        if (notifyInputParams != null) {
                            for (Map.Entry<String, List<String>> entry : notifyInputParams.entrySet()) {
                                for (String str : entry.getValue()) {
                                    linkedHashMap.put(str, ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).O3(EnumC1094630eaj.PITAYA, entry.getKey(), str));
                                }
                                hostClientAiService$wrapperLivePitayaCore$1LJIJJLI.LJII(triggerStrategyConfig.getStrategyName(), linkedHashMap);
                            }
                        }
                    } else {
                        interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.PITAYA_NOT_INIT.getCode(), "pitaya env not ready"));
                        return;
                    }
                }
                interfaceC1610880s1OLIZLLL.LIZ(triggerStrategyConfig.getStrategyName(), triggerStrategyConfig.getRuleName(), new PTYCepCallback() { // from class: com.bytedance.android.livestrategy.LiveStrategyCenterService$registerStrategyWithTriggerConfig$2
                    @Override // com.bytedance.pitaya.api.PTYCepCallback
                    public void onFinish(boolean z, PTYError pTYError, PTYCepResult pTYCepResult) {
                        if (z) {
                            InterfaceC1092770eXj interfaceC1092770eXj2 = interfaceC1092770eXj;
                            String strategyName = triggerStrategyConfig.getStrategyName();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("ruleName", pTYCepResult.getRuleName());
                            linkedHashMap2.put("bizName", strategyName);
                            interfaceC1092770eXj2.LIZLLL(new C1093040eYA(strategyName, pTYCepResult, linkedHashMap2));
                            return;
                        }
                        interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.PITAYA_CEP_FAIL.getCode(), String.valueOf(pTYError)));
                    }
                }, PTYCepCallbackMode.SUCCESS_AND_ERROR);
                return;
            }
            interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.PITAYA_NOT_INIT.getCode(), "pitaya env not ready"));
            return;
        }
        if (type == EnumC1093190eYP.PSP_CEP.getType()) {
            if (this.LL) {
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(triggerStrategyConfig.getStrategyName(), null, null, new C1093160eYM(interfaceC1092770eXj, triggerStrategyConfig));
                return;
            } else {
                TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0eYi
                    @Override // X.InterfaceC829930Wh5
                    public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                        if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                            this.LIZ.LL = true;
                            TriggerStrategyConfig triggerStrategyConfig2 = triggerStrategyConfig;
                            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(triggerStrategyConfig2.getStrategyName(), null, null, new C1093160eYM(interfaceC1092770eXj, triggerStrategyConfig2));
                        }
                    }
                });
                return;
            }
        }
        if (type == EnumC1093190eYP.TTM_CEP.getType()) {
            IHostAction iHostAction3 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction3 != null && (hostClientAiService = iHostAction3.getHostClientAiService()) != null && (tTMStrategyCenterLJIILLIIL = hostClientAiService.LJIILLIIL()) != null) {
                tTMStrategyCenterLJIILLIIL.registerBizCepCallback(triggerStrategyConfig.getStrategyName(), triggerStrategyConfig.getRuleName(), new TTMStrategyRunCallBack() { // from class: X.0eYN
                    @Override // com.tiktok.strategycenter.TTMStrategyRunCallBack
                    public final void run(TTMStrategyResult tTMStrategyResult) {
                        interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZLLL(triggerStrategyConfig.getStrategyName(), tTMStrategyResult));
                    }
                });
                return;
            } else {
                interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.TTM_NOT_INIT.getCode(), "ttm env not ready"));
                return;
            }
        }
        if (type == EnumC1093190eYP.FEATURE_MODIFY.getType()) {
            ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).G2(interfaceC1092770eXj, triggerStrategyConfig);
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final void Mf0(final InterfaceC1092770eXj interfaceC1092770eXj, final FinalStrategyConfig finalStrategyConfig) {
        C157V hostClientAiService;
        InterfaceC1093410eYl interfaceC1093410eYlLJIIJ;
        C157V hostClientAiService2;
        TTMStrategyCenter tTMStrategyCenterLJIILLIIL;
        C157V hostClientAiService3;
        TTMStrategyCenter tTMStrategyCenterLJIILLIIL2;
        C157V hostClientAiService4;
        long type = finalStrategyConfig.getType();
        if (type == EnumC1093370eYh.PITAYA.getType()) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null && (hostClientAiService4 = iHostAction.getHostClientAiService()) != null) {
                hostClientAiService4.LIZJ(new C1093360eYg(this, interfaceC1092770eXj, finalStrategyConfig));
                return;
            }
            return;
        }
        if (type == EnumC1093370eYh.PSP.getType()) {
            if (finalStrategyConfig.getTtmScene() != null) {
                interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZJ(finalStrategyConfig.getStrategyName(), finalStrategyConfig.getTtmScene(), TTMStrategyCenterManager.runScene(finalStrategyConfig.getTtmScene(), finalStrategyConfig.getRuleName(), new TTMParamData((Map<String, Object>) LIZ(finalStrategyConfig)))));
                return;
            } else if (C1533950q1J.LJ(finalStrategyConfig.getStrategyName()) && C1533950q1J.LJ(finalStrategyConfig.getRuleName())) {
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(finalStrategyConfig.getStrategyName(), null, null, new AbstractC830880Wic(this) { // from class: X.0eYI
                    public final /* synthetic */ LiveStrategyCenterService LIZJ;

                    @Override // X.AbstractC830880Wic
                    public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                    }

                    @Override // X.AbstractC830880Wic
                    public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                        finalStrategyConfig.setTtmScene(interfaceC830890Wid);
                        interfaceC1092770eXj.LIZIZ(interfaceC830890Wid, enumC2213771Bkd);
                        if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                            this.LIZJ.Mf0(interfaceC1092770eXj, finalStrategyConfig);
                        } else {
                            InterfaceC1092770eXj interfaceC1092770eXj2 = interfaceC1092770eXj;
                            int code = EnumC1090770eUV.PSP_NOT_INIT.getCode();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("registerSceneResult failed code=");
                            sbLIZ.append(enumC2213771Bkd);
                            interfaceC1092770eXj2.LIZJ(new C477840IoY(code, C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    }

                    {
                        this.LIZJ = this;
                    }
                });
                return;
            } else {
                interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.PSP_NOT_INIT.getCode(), "PSP env not ready"));
                return;
            }
        }
        if (type == EnumC1093370eYh.EPI.getType()) {
            ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).n9(finalStrategyConfig, LIZ(finalStrategyConfig), interfaceC1092770eXj);
            return;
        }
        if (type == EnumC1093370eYh.PITAYA_CEP.getType()) {
            return;
        }
        if (type == EnumC1093370eYh.TTM_CEP.getType()) {
            IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction2 != null && (hostClientAiService3 = iHostAction2.getHostClientAiService()) != null && (tTMStrategyCenterLJIILLIIL2 = hostClientAiService3.LJIILLIIL()) != null) {
                interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZLLL(finalStrategyConfig.getStrategyName(), tTMStrategyCenterLJIILLIIL2.syncProcessBizCepRule(finalStrategyConfig.getStrategyName(), finalStrategyConfig.getRuleName(), new TTMParamData((Map<String, Object>) LIZ(finalStrategyConfig)), System.currentTimeMillis())));
                return;
            } else {
                interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.TTM_NOT_INIT.getCode(), "ttm env not ready"));
                return;
            }
        }
        if (type == EnumC1093370eYh.TTM_CEL.getType()) {
            IHostAction iHostAction3 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction3 != null && (hostClientAiService2 = iHostAction3.getHostClientAiService()) != null && (tTMStrategyCenterLJIILLIIL = hostClientAiService2.LJIILLIIL()) != null) {
                TTMInput tTMInput = new TTMInput();
                tTMInput.machineCode = finalStrategyConfig.getCelExp();
                tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
                tTMInput.paramData = new TTMParamData((Map<String, Object>) LIZ(finalStrategyConfig));
                TTMOutput tTMOutputRunTTMRuleWithBinData = tTMStrategyCenterLJIILLIIL.runTTMRuleWithBinData(tTMInput);
                if (tTMOutputRunTTMRuleWithBinData != null) {
                    String strategyName = finalStrategyConfig.getStrategyName();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("code", tTMOutputRunTTMRuleWithBinData.getType());
                    interfaceC1092770eXj.LIZLLL(new C1093040eYA(strategyName, tTMOutputRunTTMRuleWithBinData, linkedHashMap));
                    return;
                }
                interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.TTM_CEL_FAIL.getCode(), "ttm result is null"));
                return;
            }
            interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.TTM_NOT_INIT.getCode(), "ttm env not ready"));
            return;
        }
        if (type == EnumC1093370eYh.EPI_SERVER.getType() || type != EnumC1093370eYh.STAR_SHIP.getType()) {
            return;
        }
        IHostAction iHostAction4 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction4 != null && (hostClientAiService = iHostAction4.getHostClientAiService()) != null && (interfaceC1093410eYlLJIIJ = hostClientAiService.LJIIJ()) != null) {
            interfaceC1093410eYlLJIIJ.LIZ(new C1093400eYk(finalStrategyConfig.getStrategyName(), LIZ(finalStrategyConfig)), new AwS383S0200000_17(interfaceC1092770eXj, finalStrategyConfig, 44));
        } else {
            interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.STAR_SHIP_NOT_INIT.getCode(), "starShip env not ready"));
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final void uY0(String str, C1093030eY9 c1093030eY9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asyncRegisterSceneWithSceneKey start, sceneKey=");
        sbLIZ.append(str);
        C227400uG.LIZ("LiveTTMStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
        AwS166S1100000_17 awS166S1100000_17 = new AwS166S1100000_17(str, c1093030eY9, 3);
        if (C1093420eYm.LIZ) {
            awS166S1100000_17.invoke();
        } else {
            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new C1093390eYj(awS166S1100000_17));
        }
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final void nU0(final TriggerStrategyConfig triggerStrategyConfig, final FinalStrategyConfig finalStrategyConfig, final C1093020eY8 c1093020eY8) {
        G2(new InterfaceC1092770eXj() { // from class: X.0eYH
            @Override // X.InterfaceC1092770eXj
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092770eXj
            public final void LIZ() {
                c1093020eY8.LIZ();
            }

            @Override // X.InterfaceC1092770eXj
            public final void LIZJ(C477840IoY c477840IoY) {
                c1093020eY8.LIZJ(c477840IoY);
            }

            @Override // X.InterfaceC1092770eXj
            public final void LIZLLL(C1093040eYA c1093040eYA) {
                Object obj;
                Map map;
                finalStrategyConfig.setTtmScene(triggerStrategyConfig.getTtmScene());
                if (triggerStrategyConfig.getType() == EnumC1093190eYP.FEATURE_MODIFY.getType()) {
                    Map<String, Object> customParams = finalStrategyConfig.getCustomParams();
                    FinalStrategyConfig finalStrategyConfig2 = finalStrategyConfig;
                    Map<String, Object> map2 = c1093040eYA.LIZJ;
                    Object obj2 = null;
                    if (map2 != null) {
                        obj = map2.get("extra");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        obj2 = map.get("trigger_feature");
                    }
                    String strValueOf = String.valueOf(obj2);
                    if (customParams != null) {
                        customParams.put("trigger_feature", strValueOf);
                    } else {
                        finalStrategyConfig2.setCustomParams(C2097608Jq.LJIIJ(new Pair("trigger_feature", strValueOf)));
                    }
                }
                this.Mf0(c1093020eY8, finalStrategyConfig);
            }
        }, triggerStrategyConfig);
    }

    @Override // com.bytedance.android.livestrategy.ILiveStrategyCenterService
    public final void onAppLogEvent(final String str, final JSONObject jSONObject, final String str2) {
        ((ExecutorService) C1093270eYX.LIZ.getValue()).submit(new Runnable() { // from class: X.0eYZ
            public final void LIZ() {
                C0VMV c0vmv = C1093420eYm.LIZIZ;
                String str3 = str;
                JSONObject jSONObject2 = jSONObject;
                String str4 = str2;
                c0vmv.getClass();
                if (str3 == null || str3.length() == 0) {
                    return;
                }
                for (Map.Entry<AbstractC1093440eYo, List<InterfaceC1093320eYc>> entry : c0vmv.LIZIZ.entrySet()) {
                    AbstractC1093440eYo key = entry.getKey();
                    List<InterfaceC1093320eYc> value = entry.getValue();
                    ArrayList<C1093280eYY> arrayList = new ArrayList();
                    for (InterfaceC1093320eYc interfaceC1093320eYc : value) {
                        if (interfaceC1093320eYc instanceof C1093280eYY) {
                            arrayList.add(interfaceC1093320eYc);
                        }
                    }
                    for (C1093280eYY c1093280eYY : arrayList) {
                        if (!c1093280eYY.LIZIZ && c1093280eYY.LIZ.values.contains(str3)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("asyncEmitAppLogEvent tag=");
                            sbLIZ.append(str3);
                            sbLIZ.append(", category=");
                            sbLIZ.append(str4);
                            sbLIZ.append(", extJson=");
                            sbLIZ.append(jSONObject2 != null ? C786410Ut5.J3(jSONObject2) : null);
                            C227400uG.LIZ("LiveTTMEventStreamManager", C2188811AlT.LIZIZ(sbLIZ));
                            key.LIZIZ(new C473440IhS(str3, EnumC1093260eYW.APPLOG, jSONObject2 != null ? C116500cN.LIZIZ(jSONObject2) : new LinkedHashMap()));
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveTTMEventStreamManager@ad4d.asyncEmitAppLogEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveTTMEventStreamManager@ad4d.asyncEmitAppLogEvent$1");
            }
        });
    }
}
