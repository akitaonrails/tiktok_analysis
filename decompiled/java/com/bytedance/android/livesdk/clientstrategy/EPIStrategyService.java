package com.bytedance.android.livesdk.clientstrategy;

import X.AbstractC467020ITc;
import X.AbstractC830880Wic;
import X.C0J0C;
import X.C0J0D;
import X.C0J0E;
import X.C0J6B;
import X.C0J6C;
import X.C1083450eIh;
import X.C1089120eRq;
import X.C1089310eS9;
import X.C1089610eSd;
import X.C1089730eSp;
import X.C1089780eSu;
import X.C1090000eTG;
import X.C1093040eYA;
import X.C1093130eYJ;
import X.C1161920gLG;
import X.C443120HZe;
import X.C477840IoY;
import X.EnumC1090770eUV;
import X.EnumC1094630eaj;
import X.EnumC467180ITs;
import X.InterfaceC1089430eSL;
import X.InterfaceC1092770eXj;
import X.InterfaceC1093100eYG;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.livesetting.performance.LiveIoOptExperience;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import com.bytedance.android.livesdk.signal.LiveEpiExpandLifecycleSetting;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public class EPIStrategyService implements IEPIStrategyService {
    public DataChannel LL;

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void Pa0() {
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).registerEPISignal("data_update", C0J6B.LIZLLL);
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("live_epi_scene_detection", null, null, new AbstractC830880Wic() { // from class: X.0J0G
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                    String str = interfaceC805220ViK.LIZLLL().LIZIZ;
                    if (Intrinsics.LJFF(interfaceC805220ViK.LIZJ(), Boolean.TRUE)) {
                        String strLJJLIL = a0.LJJLIL(str, "lest_", "");
                        if (strLJJLIL.length() > 0 && 1 != 0) {
                            C0J6B.LIZ(strLJJLIL, null);
                        }
                    }
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("register scene result, stateCode = ");
                    sbLIZ.append(enumC2213771Bkd);
                    C0J6C.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void BO(DataChannel dataChannel) {
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(dataChannel);
        if (interfaceC1089430eSLLIZIZ != null) {
            interfaceC1089430eSLLIZIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void Du0(DataChannel dataChannel) {
        if (!LiveIoOptExperience.INSTANCE.enableStrategyOpt()) {
            InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(dataChannel);
            if (interfaceC1089430eSLLIZIZ != null) {
                interfaceC1089430eSLLIZIZ.LIZLLL();
                return;
            }
            return;
        }
        InterfaceC1089430eSL interfaceC1089430eSLLIZ = LIZ(dataChannel);
        if (interfaceC1089430eSLLIZ == null) {
            return;
        }
        interfaceC1089430eSLLIZ.LIZLLL();
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final AbstractC467020ITc Ei2(DataChannel dataChannel) {
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(dataChannel);
        if (interfaceC1089430eSLLIZIZ != null) {
            return interfaceC1089430eSLLIZIZ.LIZJ();
        }
        return null;
    }

    public final InterfaceC1089430eSL LIZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return null;
        }
        InterfaceC1089430eSL interfaceC1089430eSL = (InterfaceC1089430eSL) dataChannel.gg0(C1083450eIh.class);
        if (interfaceC1089430eSL != null) {
            return interfaceC1089430eSL;
        }
        synchronized (this) {
            try {
                InterfaceC1089430eSL interfaceC1089430eSL2 = (InterfaceC1089430eSL) dataChannel.gg0(C1083450eIh.class);
                if (interfaceC1089430eSL2 == null) {
                    return null;
                }
                return interfaceC1089430eSL2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final InterfaceC1089430eSL LIZIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            InterfaceC1089430eSL interfaceC1089430eSL = (InterfaceC1089430eSL) dataChannel.gg0(C1083450eIh.class);
            if (interfaceC1089430eSL != null) {
                return interfaceC1089430eSL;
            }
            synchronized (this) {
                try {
                    InterfaceC1089430eSL interfaceC1089430eSL2 = (InterfaceC1089430eSL) dataChannel.gg0(C1083450eIh.class);
                    if (interfaceC1089430eSL2 != null) {
                        return interfaceC1089430eSL2;
                    }
                    C1089120eRq c1089120eRq = new C1089120eRq(dataChannel);
                    dataChannel.SX0(C1083450eIh.class, c1089120eRq);
                    return c1089120eRq;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void R60(DataChannel dataChannel) {
        if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
            this.LL = dataChannel;
        }
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(dataChannel);
        if (interfaceC1089430eSLLIZIZ != null) {
            interfaceC1089430eSLLIZIZ.prepare();
        }
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void T4(TriggerStrategyConfig triggerStrategyConfig) {
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            List<C443120HZe> list = (List) ((LinkedHashMap) C1089310eS9.LJ).get(triggerStrategyConfig.getStrategyName());
            if (list != null) {
                for (C443120HZe c443120HZe : list) {
                    InterfaceC1093100eYG interfaceC1093100eYG = (InterfaceC1093100eYG) ((Reference) c443120HZe.getThird()).get();
                    if (interfaceC1093100eYG != null) {
                        ((ILiveDecisionService) C1089310eS9.LIZJ.getValue()).sl((String) c443120HZe.getFirst(), (String) c443120HZe.getSecond(), interfaceC1093100eYG);
                    }
                }
            }
            C1089310eS9.LJ.remove(triggerStrategyConfig.getStrategyName());
            return;
        }
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(this.LL);
        if (interfaceC1089430eSLLIZIZ != null) {
            interfaceC1089430eSLLIZIZ.T4(triggerStrategyConfig);
        }
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void xl(DataChannel dataChannel) {
        this.LL = null;
        if (!LiveIoOptExperience.INSTANCE.enableStrategyOpt()) {
            InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(dataChannel);
            if (interfaceC1089430eSLLIZIZ != null) {
                interfaceC1089430eSLLIZIZ.release();
                return;
            }
            return;
        }
        InterfaceC1089430eSL interfaceC1089430eSLLIZ = LIZ(dataChannel);
        if (interfaceC1089430eSLLIZ == null) {
            return;
        }
        interfaceC1089430eSLLIZ.release();
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void G2(final InterfaceC1092770eXj interfaceC1092770eXj, final TriggerStrategyConfig triggerStrategyConfig) {
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            C0J0D c0j0d = C1089310eS9.LIZ;
            String strategyName = triggerStrategyConfig.getStrategyName();
            c0j0d.getClass();
            Strategy strategyLIZ = C0J0D.LIZ(strategyName);
            if (strategyLIZ == null) {
                ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
                EnumC467180ITs enumC467180ITs = EnumC467180ITs.SERVER_DECISION_GROUP;
                InterfaceC1093100eYG interfaceC1093100eYGLl = iLiveDecisionService.Ll(enumC467180ITs.getGroupName(), triggerStrategyConfig.getStrategyName(), new InterfaceC1093100eYG() { // from class: X.0eSN
                    @Override // X.InterfaceC1093100eYG
                    public final void LIZJ(Object obj, Object obj2, String str, String str2) {
                        if (Intrinsics.LJFF(obj, obj2)) {
                            return;
                        }
                        if (obj2 != null) {
                            interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(triggerStrategyConfig.getStrategyName(), new C1089610eSd(obj2.toString(), false), ""));
                        } else {
                            interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.EPI_FAIL.getCode(), "no server result"));
                        }
                    }
                });
                if (interfaceC1093100eYGLl != null) {
                    Map<String, List<C443120HZe<String, String, WeakReference<InterfaceC1093100eYG>>>> map = C1089310eS9.LJ;
                    List list = (List) ((LinkedHashMap) map).get(triggerStrategyConfig.getStrategyName());
                    if (list == null) {
                        String strategyName2 = triggerStrategyConfig.getStrategyName();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C443120HZe(enumC467180ITs.getGroupName(), triggerStrategyConfig.getStrategyName(), new WeakReference(interfaceC1093100eYGLl)));
                        map.put(strategyName2, arrayList);
                        return;
                    }
                    list.add(new C443120HZe(enumC467180ITs.getGroupName(), triggerStrategyConfig.getStrategyName(), new WeakReference(interfaceC1093100eYGLl)));
                    return;
                }
                return;
            }
            interfaceC1092770eXj.LIZ();
            for (C0J0E c0j0e : (ArrayList) strategyLIZ.LIZIZ()) {
                C0J6C.LIZ("registerFeature");
                InterfaceC1093100eYG interfaceC1093100eYGLl2 = ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).Ll(c0j0e.LIZJ, c0j0e.LIZ, new InterfaceC1093100eYG() { // from class: X.0eSf
                    @Override // X.InterfaceC1093100eYG
                    public final void LIZJ(Object obj, Object obj2, String str, String str2) {
                        if (Intrinsics.LJFF(obj, obj2)) {
                            return;
                        }
                        interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(triggerStrategyConfig.getStrategyName(), new C1089610eSd(str, false), str));
                    }
                });
                if (interfaceC1093100eYGLl2 != null) {
                    Map<String, List<C443120HZe<String, String, WeakReference<InterfaceC1093100eYG>>>> map2 = C1089310eS9.LJ;
                    List list2 = (List) ((LinkedHashMap) map2).get(triggerStrategyConfig.getStrategyName());
                    if (list2 == null) {
                        String strategyName3 = triggerStrategyConfig.getStrategyName();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new C443120HZe(c0j0e.LIZJ, c0j0e.LIZ, new WeakReference(interfaceC1093100eYGLl2)));
                        map2.put(strategyName3, arrayList2);
                    } else {
                        list2.add(new C443120HZe(c0j0e.LIZJ, c0j0e.LIZ, new WeakReference(interfaceC1093100eYGLl2)));
                    }
                }
            }
            return;
        }
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(this.LL);
        if (interfaceC1089430eSLLIZIZ == null) {
            return;
        }
        interfaceC1089430eSLLIZIZ.G2(interfaceC1092770eXj, triggerStrategyConfig);
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final Object T12(DataChannel dataChannel, String str) {
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(dataChannel);
        if (interfaceC1089430eSLLIZIZ != null) {
            return interfaceC1089430eSLLIZIZ.LIZIZ(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final C1093040eYA Tt(FinalStrategyConfig finalStrategyConfig, Map<String, ? extends Object> map) {
        String str;
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            C0J0D c0j0d = C1089310eS9.LIZ;
            String strategyName = finalStrategyConfig.getStrategyName();
            c0j0d.getClass();
            Strategy strategyLIZ = C0J0D.LIZ(strategyName);
            if (strategyLIZ == null) {
                return null;
            }
            C443120HZe<Strategy, C1089610eSd, C1089610eSd> c443120HZeLIZ = C1089310eS9.LIZIZ.LIZ(strategyLIZ, map, "");
            C1089610eSd third = c443120HZeLIZ.getThird();
            C1089780eSu c1089780eSu = C1089310eS9.LIZLLL;
            String str2 = strategyLIZ.name;
            String str3 = third.LIZ;
            Map<String, String> map2 = third.LIZIZ;
            if (third.LIZJ) {
                str = strategyLIZ.decisionKey;
            } else {
                str = str2;
            }
            ((ArrayList) c1089780eSu.LIZ.LIZJ).add(new C1089730eSp(str2, str3, str, map2));
            return C1093130eYJ.LIZ(finalStrategyConfig.getStrategyName(), c443120HZeLIZ.getThird(), "");
        }
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(this.LL);
        if (interfaceC1089430eSLLIZIZ == null) {
            return null;
        }
        return interfaceC1089430eSLLIZIZ.Tt(finalStrategyConfig, map);
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void fillUploadFeatures(Map<String, String> map, String str) {
        C0J0C.LIZ(str, map);
    }

    @Override // com.bytedance.android.live.dynamicstrategy.IEPIStrategyService
    public final void n9(FinalStrategyConfig finalStrategyConfig, Map<String, ? extends Object> map, InterfaceC1092770eXj interfaceC1092770eXj) {
        String string;
        String str;
        Object obj;
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            C0J0D c0j0d = C1089310eS9.LIZ;
            Map<String, Object> customParams = finalStrategyConfig.getCustomParams();
            if (customParams == null || (obj = customParams.get("trigger_feature")) == null || (string = obj.toString()) == null) {
                string = "";
            }
            C0J0D c0j0d2 = C1089310eS9.LIZ;
            String strategyName = finalStrategyConfig.getStrategyName();
            c0j0d2.getClass();
            Strategy strategyLIZ = C0J0D.LIZ(strategyName);
            if (strategyLIZ != null) {
                C443120HZe<Strategy, C1089610eSd, C1089610eSd> c443120HZeLIZ = C1089310eS9.LIZIZ.LIZ(strategyLIZ, map, string);
                C1089610eSd third = c443120HZeLIZ.getThird();
                C1089780eSu c1089780eSu = C1089310eS9.LIZLLL;
                String str2 = strategyLIZ.name;
                String str3 = third.LIZ;
                Map<String, String> map2 = third.LIZIZ;
                if (third.LIZJ) {
                    str = strategyLIZ.decisionKey;
                } else {
                    str = str2;
                }
                ((ArrayList) c1089780eSu.LIZ.LIZJ).add(new C1089730eSp(str2, str3, str, map2));
                interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(finalStrategyConfig.getStrategyName(), c443120HZeLIZ.getThird(), string));
                return;
            }
            C1090000eTG c1090000eTGO3 = ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).O3(EnumC1094630eaj.DEFAULT, EnumC467180ITs.SERVER_DECISION_GROUP.getGroupName(), finalStrategyConfig.getStrategyName());
            if (c1090000eTGO3 == null) {
                interfaceC1092770eXj.LIZJ(new C477840IoY(EnumC1090770eUV.EPI_FAIL.getCode(), "no server result"));
                return;
            } else {
                interfaceC1092770eXj.LIZLLL(C1093130eYJ.LIZ(finalStrategyConfig.getStrategyName(), new C1089610eSd(String.valueOf(c1090000eTGO3.LIZJ), false), ""));
                return;
            }
        }
        InterfaceC1089430eSL interfaceC1089430eSLLIZIZ = LIZIZ(this.LL);
        if (interfaceC1089430eSLLIZIZ == null) {
            return;
        }
        interfaceC1089430eSLLIZIZ.n9(finalStrategyConfig, map, interfaceC1092770eXj);
    }
}
