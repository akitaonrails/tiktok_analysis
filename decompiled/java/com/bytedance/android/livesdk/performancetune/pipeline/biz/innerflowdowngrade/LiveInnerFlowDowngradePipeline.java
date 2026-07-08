package com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C09CT;
import X.C09JN;
import X.C0IJT;
import X.C0IS4;
import X.C1017903yT;
import X.C1058250de3;
import X.C1090000eTG;
import X.C1094780eay;
import X.C1100750ekb;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C480190IsL;
import X.C491530JPj;
import X.C519040KXe;
import X.C519190KXt;
import X.C519200KXu;
import X.C519210KXv;
import X.C519220KXw;
import X.C805320ViU;
import X.EnumC1094630eaj;
import X.EnumC1101430elh;
import X.EnumC452301pR;
import X.EnumC480200IsM;
import X.InterfaceC482090IvP;
import X.InterfaceC519030KXd;
import X.InterfaceC519230KXx;
import Y.ACallableS414S0100000_7;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAudienceDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradePipeline;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradeSceneSetting;
import com.bytedance.android.livesdk.performancetune.strategy.model.CommonDecisionConfig;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveInnerFlowDowngradePipeline implements InterfaceC519030KXd {
    public static final LiveInnerFlowDowngradePipeline LIZ = new LiveInnerFlowDowngradePipeline();
    public static boolean LIZIZ;
    public static Map<String, Integer> LIZJ;
    public static int LIZLLL;
    public static final List<Float> LJ;
    public static final List<C1100750ekb> LJFF;
    public static final Map<String, Object> LJI;
    public static C11JF LJII;
    public static C11JF LJIIIIZZ;
    public static final ConcurrentHashMap<String, InterfaceC482090IvP> LJIIIZ;
    public static final ConcurrentHashMap<String, InterfaceC519230KXx> LJIIJ;
    public static final ConcurrentHashMap<String, String> LJIIJJI;
    public static String LJIIL;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static final C01GW LJIILL;
    public static final C01GW LJIILLIIL;
    public static final C01GW LJIIZILJ;
    public static final C01GW LJIJ;
    public static final C01GW LJIJI;
    public static boolean LJIJJ;
    public static int LJIJJLI;
    public static final ConcurrentHashMap<String, BizDowngradeStatisticsInfo> LJIL;
    public static boolean LJJ;
    public static int LJJI;
    public static volatile int LJJIFFI;
    public static volatile long LJJII;

    public static final class BizDowngradeStatisticsInfo {
        public long LIZ;

        @C09CT("downCount")
        public int downCount;

        @C09CT("downDuration")
        public long downDuration;

        @C09CT("upCount")
        public int upCount;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BizDowngradeStatisticsInfo(upCount=");
            sbLIZ.append(this.upCount);
            sbLIZ.append(", downCount=");
            sbLIZ.append(this.downCount);
            sbLIZ.append(", downDuration=");
            sbLIZ.append(this.downDuration);
            sbLIZ.append(", downgradeStartTime=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public BizDowngradeStatisticsInfo() {
            this(0, 0, 0L, 0L);
        }

        public BizDowngradeStatisticsInfo(int i, int i2, long j, long j2) {
            this.upCount = i;
            this.downCount = i2;
            this.downDuration = j;
            this.LIZ = j2;
        }
    }

    static {
        new AtomicInteger(0);
        LIZJ = new LinkedHashMap();
        LJ = new ArrayList();
        LJFF = new ArrayList();
        LJI = new LinkedHashMap();
        LJIIIZ = new ConcurrentHashMap<>();
        LJIIJ = new ConcurrentHashMap<>();
        LJIIJJI = new ConcurrentHashMap<>();
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LJIILL = C452501pT.LIZ(enumC452301pR, AFwS193S0000000_7.get$arr$(79));
        LJIILLIIL = C452501pT.LIZ(enumC452301pR, new C519210KXv());
        LJIIZILJ = C452501pT.LIZ(enumC452301pR, new C519200KXu());
        LJIJ = C452501pT.LIZ(enumC452301pR, new C519190KXt());
        LJIJI = C452501pT.LIZ(enumC452301pR, new C519220KXw());
        LJIL = new ConcurrentHashMap<>();
    }

    public static InnerFlowDowngradeSceneConfig LIZJ() {
        return (InnerFlowDowngradeSceneConfig) LJIILL.getValue();
    }

    public static int LIZLLL() {
        String str;
        C1090000eTG c1090000eTGO3 = ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).O3(EnumC1094630eaj.DEFAULT, "live_mode_setting", "ultra_lite_mode");
        if (c1090000eTGO3 == null) {
            return LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch();
        }
        try {
            Object obj = c1090000eTGO3.LIZJ;
            return (!(obj instanceof String) || (str = (String) obj) == null) ? LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch() : CastIntegerProtector.parseInt(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LiveUltraLiteModeSetting.INSTANCE.getValue().getDefaultAutoSwitch();
        }
    }

    public static CommonDecisionConfig LJ() {
        return (CommonDecisionConfig) LJIILLIIL.getValue();
    }

    public static boolean LJFF() {
        return ((Boolean) LJIJI.getValue()).booleanValue();
    }

    public static void LJIIIIZZ() {
        if (LJJ) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, BizDowngradeStatisticsInfo> entry : LJIL.entrySet()) {
                BizDowngradeStatisticsInfo value = entry.getValue();
                linkedHashMap.put(entry.getKey(), new ReportDowngradeInfo(value.upCount, value.downCount, value.downDuration));
            }
            AbstractC19484711Kz.LJIJI(new ACallableS414S0100000_7(linkedHashMap, 5)).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0JOF
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.reportSummary$2");
                    LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
                    C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.reportSummary$2");
                }
            }, new C09JN() { // from class: X.0JOE
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.reportSummary$3");
                    LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("report summary failed: ");
                    sbLIZ.append(obj);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.reportSummary$3");
                }
            });
            LJJ = false;
        }
    }

    public static void LJIIIZ() {
        Iterator<Map.Entry<String, BizDowngradeStatisticsInfo>> it2 = LJIL.entrySet().iterator();
        while (it2.hasNext()) {
            BizDowngradeStatisticsInfo value = it2.next().getValue();
            if (value.LIZ > 0) {
                value.downDuration += System.currentTimeMillis() - value.LIZ;
                value.LIZ = 0L;
                LJJ = true;
            }
        }
    }

    public static void LJIIJJI() {
        if (LJ().getStrategyType() == 0) {
            C11JF c11jf = LJIIIIZZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LJIIIIZZ = null;
            LJIIIIZZ = (C11JF) C11NZ.LJLJJLL(LiveInnerFlowDowngradeSceneSetting.INSTANCE.getValue().warmupPerfFetchIntervalSec, TimeUnit.SECONDS).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0KXr
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.warmUpPspStrategyIfNeeded$1");
                    LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
                    C01GW c01gw = C1094780eay.LIZ;
                    LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline2 = LiveInnerFlowDowngradePipeline.LIZ;
                    CommonDecisionConfig commonDecisionConfigLJ = LiveInnerFlowDowngradePipeline.LJ();
                    C1094760eaw c1094760eaw = (C1094760eaw) C1094780eay.LIZLLL.getValue();
                    c1094760eaw.getClass();
                    c1094760eaw.LIZ(commonDecisionConfigLJ.getTtmSceneKey());
                    C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.warmUpPspStrategyIfNeeded$1");
                }
            });
        }
    }

    @Override // X.InterfaceC519030KXd
    public final boolean enable() {
        return LIZJ().enable;
    }

    public static void LIZ(Map map) {
        int iIntValue;
        Integer num = (Integer) map.get(EnumC1101430elh.ALOG_DISABLE.getBizKey());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue != 0) {
            LiveInnerDowngradeAdaptExp.INSTANCE.setDisableAlog(true);
        } else {
            LiveInnerDowngradeAdaptExp.INSTANCE.setDisableAlog(false);
        }
        Integer num2 = (Integer) map.get(EnumC1101430elh.APM_DISABLE.getBizKey());
        if (num2 != null && num2.intValue() != 0) {
            LiveInnerDowngradeAdaptExp.INSTANCE.setDisableApmLog(true);
        } else {
            LiveInnerDowngradeAdaptExp.INSTANCE.setDisableApmLog(false);
        }
    }

    public static float LIZIZ(String str) {
        Float fValueOf;
        List<C1100750ekb> list = LJFF;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C491530JPj c491530JPj = ((C1100750ekb) it2.next()).LIZJ.LIZJ.get(str);
            if (c491530JPj != null && (fValueOf = Float.valueOf(c491530JPj.LIZ)) != null) {
                arrayList.add(fValueOf);
            }
        }
        return (float) C13LP.LJJIZ(arrayList);
    }

    public static Pair LJI(C519040KXe c519040KXe) {
        Long l;
        Map map;
        Map<String, ? extends Object> map2;
        Integer num;
        int i = c519040KXe.LIZ;
        if (i != 0) {
            if (i != 1 || (map2 = c519040KXe.LIZJ) == null) {
                return null;
            }
            Object obj = map2.get("result_downgrade_level");
            if (!(obj instanceof Integer) || (num = (Integer) obj) == null) {
                return null;
            }
            int iIntValue = num.intValue();
            Object obj2 = map2.get("result_downgrade_biz_status_map");
            if (!(obj2 instanceof Map) || obj2 == null) {
                return null;
            }
            return new Pair(Integer.valueOf(iIntValue), obj2);
        }
        Map<String, ? extends Object> map3 = c519040KXe.LIZJ;
        if (map3 == null) {
            return null;
        }
        Object obj3 = map3.get("result_downgrade_level");
        if ((obj3 instanceof Long) && (l = (Long) obj3) != null) {
            int iLongValue = (int) l.longValue();
            Object obj4 = map3.get("result_downgrade_biz_status_map");
            if ((obj4 instanceof Map) && (map = (Map) obj4) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), Integer.valueOf((int) ((Number) entry.getValue()).longValue()));
                }
                return new Pair(Integer.valueOf(iLongValue), linkedHashMap);
            }
        }
        return null;
    }

    public static void LJIIJ(int i) {
        Pair pairLJI;
        Object obj;
        Map linkedHashMap;
        Object obj2;
        final Map linkedHashMap2;
        long jCurrentTimeMillis;
        String str;
        Map map;
        if (LIZIZ) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("stashed_states", LJI);
            linkedHashMap3.put("downgrade_strategy_trigger_source", Integer.valueOf(i));
            linkedHashMap3.put("lite_mode_auto_switch", Integer.valueOf(LIZLLL()));
            if (LJJII > 0) {
                linkedHashMap3.put("inner_flow_session_duration", Long.valueOf(System.currentTimeMillis() - LJJII));
            }
            linkedHashMap3.put("byte_bench_score", Float.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue()));
            C01GW c01gw = C1094780eay.LIZ;
            C519040KXe c519040KXeLIZ = C1094780eay.LIZ(LJ(), linkedHashMap3);
            if (c519040KXeLIZ.LIZIZ == 0 && (pairLJI = LJI(c519040KXeLIZ)) != null) {
                int iIntValue = ((Number) pairLJI.getFirst()).intValue();
                Map map2 = (Map) pairLJI.getSecond();
                Map<String, ? extends Object> map3 = c519040KXeLIZ.LIZJ;
                if (map3 != null) {
                    obj = map3.get("result_stashed_states");
                } else {
                    obj = null;
                }
                if (!(obj instanceof Map) || (linkedHashMap = (Map) obj) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                Map<String, ? extends Object> map4 = c519040KXeLIZ.LIZJ;
                if (map4 != null) {
                    obj2 = map4.get("result_source_params");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof Map) || (linkedHashMap2 = (Map) obj2) == null) {
                    linkedHashMap2 = new LinkedHashMap();
                }
                Iterator it2 = map2.entrySet().iterator();
                while (true) {
                    final int iIntValue2 = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    final String str2 = (String) entry.getKey();
                    final int iIntValue3 = ((Number) entry.getValue()).intValue();
                    final InterfaceC482090IvP interfaceC482090IvP = LJIIIZ.get(str2);
                    if (interfaceC482090IvP != null) {
                        Integer num = (Integer) ((LinkedHashMap) LIZJ).get(str2);
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        }
                        if (iIntValue3 != iIntValue2 || LiveInnerFlowDowngradeSceneSetting.INSTANCE.isIgnoreLevelChanged(str2)) {
                            C805320ViU.LIZJ(new Runnable() { // from class: X.0IvR
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.triggerDowngradeDecisionNewlyOnce$1$1$1$1");
                                    try {
                                        if (LiveInnerFlowDowngradePipeline.LJIIIZ.containsKey(str2)) {
                                            interfaceC482090IvP.LIZ(new C0IS4(iIntValue3, iIntValue2, C2097608Jq.LJ(), linkedHashMap2, false, 32));
                                        }
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.triggerDowngradeDecisionNewlyOnce$1$1$1$1");
                                }
                            });
                            if (LJFF()) {
                                LJII(iIntValue2, iIntValue3, str2);
                            }
                        }
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    Object key = entry2.getKey();
                    int iIntValue4 = ((Number) entry2.getValue()).intValue();
                    Integer num2 = (Integer) ((LinkedHashMap) LIZJ).get(key);
                    if (num2 == null) {
                        num2 = 0;
                    }
                    if (!(num2 instanceof Integer) || iIntValue4 != num2.intValue()) {
                        String str3 = LJIIJJI.get(key);
                        if (str3 != null) {
                            Object linkedHashMap5 = linkedHashMap4.get(str3);
                            if (linkedHashMap5 == null) {
                                linkedHashMap5 = new LinkedHashMap();
                                linkedHashMap4.put(str3, linkedHashMap5);
                            }
                            ((Map) linkedHashMap5).put(key, Integer.valueOf(iIntValue4));
                        }
                    }
                }
                for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                    Object key2 = entry3.getKey();
                    Map<String, Integer> map5 = (Map) entry3.getValue();
                    InterfaceC519230KXx interfaceC519230KXx = LJIIJ.get(key2);
                    if (interfaceC519230KXx != null) {
                        interfaceC519230KXx.LIZIZ(map5);
                    }
                }
                LIZ(map2);
                if (LJFF()) {
                    Map<String, ? extends Object> map6 = c519040KXeLIZ.LIZJ;
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    if (map6 != null) {
                        Object obj3 = map6.get("result_downgrade_log_params");
                        if ((obj3 instanceof Map) && (map = (Map) obj3) != null) {
                            for (Map.Entry entry4 : map.entrySet()) {
                                linkedHashMap6.put(entry4.getKey(), entry4.getValue().toString());
                            }
                        }
                    }
                    int i2 = LIZLLL;
                    String ttmSceneKey = LJ().getTtmSceneKey();
                    if (iIntValue != i2) {
                        if (LJIILIIL != 0) {
                            jCurrentTimeMillis = System.currentTimeMillis() - LJIILIIL;
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        String str4 = LJIIL;
                        if (str4 == null) {
                            str4 = "";
                        }
                        ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().LLLLLJIL = iIntValue;
                        if (i2 == 0 && LJIIL == null) {
                            LJIIL = C1017903yT.LIZ();
                            LJIILIIL = System.currentTimeMillis();
                            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().LLLLLJLJLL = LJIIL;
                        } else if (iIntValue == 0) {
                            LJIIL = null;
                            LJIILIIL = 0L;
                            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().LLLLLJLJLL = null;
                        }
                        String str5 = LJIIL;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        boolean zZK2 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).ZK2();
                        linkedHashMap7.put(Scene.SCENE_SERVICE, "inner_room_downgrade_scene");
                        linkedHashMap7.put("downgrade_session_id", str4);
                        linkedHashMap7.put("pre_perf_level", String.valueOf(i2));
                        linkedHashMap7.put("post_perf_level", String.valueOf(iIntValue));
                        linkedHashMap7.put("biz_status_map", GsonProtectorUtils.toJson(C1058250de3.LIZIZ(), map2));
                        String str6 = "1";
                        linkedHashMap7.put("report_type", "1");
                        linkedHashMap7.put("source_strategy_key", ttmSceneKey);
                        if (LJIJJ) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        linkedHashMap7.put("default_status", str);
                        if (!zZK2) {
                            str6 = CardStruct.IStatusCode.DEFAULT;
                        }
                        linkedHashMap7.put("bright_changed_manual", str6);
                        linkedHashMap7.putAll(linkedHashMap6);
                        if (jCurrentTimeMillis > 0) {
                            linkedHashMap7.put("pre_level_dur", String.valueOf(jCurrentTimeMillis));
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_unify_downgrade_event");
                        c474500IjALIZ.LJJIIZI(linkedHashMap7);
                        c474500IjALIZ.LJIIIIZZ();
                        c474500IjALIZ.LIZ();
                    }
                }
                LIZJ = new LinkedHashMap(map2);
                LIZLLL = iIntValue;
                for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                    LJI.put((String) entry5.getKey(), entry5.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC519030KXd
    public final void S5(EnumC480200IsM enumC480200IsM) {
        boolean z;
        int i = C480190IsL.LIZ[enumC480200IsM.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6 && i != 7) {
                        return;
                    }
                    LJIJJLI++;
                    LJIIJ(2);
                    ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().LLLLLILLIL = LIZLLL();
                    return;
                }
                if (LIZLLL() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                LJIJJ = z;
                if (!LJFF()) {
                    return;
                }
                if (LJJ) {
                    LJIIIZ();
                    LJIIIIZZ();
                }
                Iterator<Map.Entry<String, BizDowngradeStatisticsInfo>> it2 = LJIL.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, BizDowngradeStatisticsInfo> next = it2.next();
                    Integer num = (Integer) ((LinkedHashMap) LIZJ).get(next.getKey());
                    if (num != null && num.intValue() == 0) {
                        it2.remove();
                    } else {
                        LJJ = true;
                        next.getValue().downCount = 1;
                        next.getValue().upCount = 0;
                        next.getValue().LIZ = System.currentTimeMillis();
                        next.getValue().downDuration = 0L;
                    }
                }
                return;
            }
            LJJIFFI--;
            if (LJJIFFI != 0) {
                return;
            }
            LIZIZ = false;
            LJJII = 0L;
            if (LiveInnerFlowDowngradeSceneSetting.INSTANCE.delayClearDowngradeStatusMs() == 0) {
                ((LinkedHashMap) LIZJ).clear();
            }
            LJIILJJIL = System.currentTimeMillis();
            C11JF c11jf = LJII;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LJII = null;
            C11JF c11jf2 = LJIIIIZZ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            LJIIIIZZ = null;
            ((ArrayList) LJ).clear();
            LIZLLL = 0;
            ((LinkedHashMap) LJI).clear();
            Iterator<Map.Entry<String, InterfaceC482090IvP>> it3 = LJIIIZ.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue().LIZ(new C0IS4(0, 0, C2097608Jq.LJ(), null, true, 16));
            }
            if (!LJFF()) {
                return;
            }
            if (LJJ) {
                LJIIIZ();
                LJIIIIZZ();
            }
            LJIL.clear();
            LJJ = false;
            return;
        }
        if (LJJIFFI == 0) {
            LJIJJLI = 0;
            LIZIZ = true;
            LJJII = System.currentTimeMillis();
            if (LIZJ().enableNewStrategy) {
                if (System.currentTimeMillis() - LJIILJJIL > LiveInnerFlowDowngradeSceneSetting.INSTANCE.delayClearDowngradeStatusMs()) {
                    ((LinkedHashMap) LIZJ).clear();
                }
                C11JF c11jf3 = LJII;
                if (c11jf3 != null) {
                    c11jf3.dispose();
                }
                ((LinkedHashMap) LJI).clear();
                LJIIJJI();
                LJII = null;
                LJII = (C11JF) C11NZ.LJJJJLI(LIZJ().perfFetchIntervalSec, TimeUnit.SECONDS).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0KXs
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.triggerDowngradeDecisionNewlyLoop$1");
                        if (LiveInnerFlowDowngradePipeline.LIZIZ) {
                            int i2 = LiveInnerFlowDowngradePipeline.LJJI + 1;
                            LiveInnerFlowDowngradePipeline.LJJI = i2;
                            if (i2 >= LiveInnerFlowDowngradeSceneSetting.INSTANCE.getValue().perfScoreCacheSize) {
                                LiveInnerFlowDowngradePipeline.LJJI = 0;
                                LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
                                LiveInnerFlowDowngradePipeline.LJIIJ(1);
                            }
                        }
                        C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.triggerDowngradeDecisionNewlyLoop$1");
                    }
                });
            } else {
                if (System.currentTimeMillis() - LJIILJJIL > LiveInnerFlowDowngradeSceneSetting.INSTANCE.delayClearDowngradeStatusMs()) {
                    ((LinkedHashMap) LIZJ).clear();
                }
                LIZLLL = 0;
                C11JF c11jf4 = LJII;
                if (c11jf4 != null) {
                    c11jf4.dispose();
                }
                ((LinkedHashMap) LJI).clear();
                LJIIJJI();
                LJII = null;
                LJII = (C11JF) C11NZ.LJJJJLI(LIZJ().perfFetchIntervalSec, TimeUnit.SECONDS).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0KXq
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        Pair pairLJI;
                        Object obj2;
                        Map linkedHashMap;
                        long jCurrentTimeMillis;
                        String str;
                        final int iIntValue;
                        C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.triggerStrategyLoop$1");
                        LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
                        C1100750ekb c1100750ekbNy0 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).ny0("live_watch");
                        if (c1100750ekbNy0 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("on perf fetch loop: add lastPerfScore ");
                            sbLIZ.append(c1100750ekbNy0.LIZJ.LIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            List<Float> list = LiveInnerFlowDowngradePipeline.LJ;
                            ArrayList arrayList = (ArrayList) list;
                            arrayList.add(Float.valueOf(c1100750ekbNy0.LIZJ.LIZIZ));
                            List<C1100750ekb> list2 = LiveInnerFlowDowngradePipeline.LJFF;
                            ((ArrayList) list2).add(c1100750ekbNy0);
                            int size = arrayList.size();
                            LiveInnerFlowDowngradeSceneSetting liveInnerFlowDowngradeSceneSetting = LiveInnerFlowDowngradeSceneSetting.INSTANCE;
                            if (size > liveInnerFlowDowngradeSceneSetting.getValue().perfScoreCacheSize) {
                                ListProtector.remove(list, 0);
                                ListProtector.remove(list2, 0);
                            }
                            int i2 = LiveInnerFlowDowngradePipeline.LJJI + 1;
                            LiveInnerFlowDowngradePipeline.LJJI = i2;
                            if (i2 >= liveInnerFlowDowngradeSceneSetting.getValue().perfScoreCacheSize) {
                                LiveInnerFlowDowngradePipeline.LJJI = 0;
                                if (LiveInnerFlowDowngradePipeline.LIZIZ) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("downgrade_biz_status_map", LiveInnerFlowDowngradePipeline.LIZJ);
                                    linkedHashMap2.put("params_downgrade_level", Integer.valueOf(LiveInnerFlowDowngradePipeline.LIZLLL));
                                    linkedHashMap2.put("latest_perf_scores", list);
                                    linkedHashMap2.put("stashed_states", LiveInnerFlowDowngradePipeline.LJI);
                                    C01GW c01gw = C1094780eay.LIZ;
                                    LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline2 = LiveInnerFlowDowngradePipeline.LIZ;
                                    C519040KXe c519040KXeLIZ = C1094780eay.LIZ(LiveInnerFlowDowngradePipeline.LJ(), linkedHashMap2);
                                    if (c519040KXeLIZ.LIZIZ == 0 && (pairLJI = LiveInnerFlowDowngradePipeline.LJI(c519040KXeLIZ)) != null) {
                                        int iIntValue2 = ((Number) pairLJI.getFirst()).intValue();
                                        Map map = (Map) pairLJI.getSecond();
                                        Map<String, ? extends Object> map2 = c519040KXeLIZ.LIZJ;
                                        if (map2 != null) {
                                            obj2 = map2.get("result_stashed_states");
                                        } else {
                                            obj2 = null;
                                        }
                                        if (!(obj2 instanceof Map) || (linkedHashMap = (Map) obj2) == null) {
                                            linkedHashMap = new LinkedHashMap();
                                        }
                                        for (Map.Entry entry : map.entrySet()) {
                                            final String str2 = (String) entry.getKey();
                                            final int iIntValue3 = ((Number) entry.getValue()).intValue();
                                            final InterfaceC482090IvP interfaceC482090IvP = LiveInnerFlowDowngradePipeline.LJIIIZ.get(str2);
                                            if (interfaceC482090IvP != null) {
                                                Integer num2 = (Integer) ((LinkedHashMap) LiveInnerFlowDowngradePipeline.LIZJ).get(str2);
                                                if (num2 != null) {
                                                    iIntValue = num2.intValue();
                                                } else {
                                                    iIntValue = 0;
                                                }
                                                if (iIntValue3 != iIntValue) {
                                                    C805320ViU.LIZJ(new Runnable() { // from class: X.0IvQ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean zLIZ;
                                                            C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.triggerStrategyLoop$1$1$1$1$1");
                                                            try {
                                                                if (LiveInnerFlowDowngradePipeline.LJIIIZ.containsKey(str2)) {
                                                                    interfaceC482090IvP.LIZ(new C0IS4(iIntValue3, iIntValue, C2097608Jq.LJ(), null, false, 48));
                                                                }
                                                            } finally {
                                                                if (!zLIZ) {
                                                                }
                                                            }
                                                            C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.triggerStrategyLoop$1$1$1$1$1");
                                                        }
                                                    });
                                                    LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline3 = LiveInnerFlowDowngradePipeline.LIZ;
                                                    if (LiveInnerFlowDowngradePipeline.LJFF()) {
                                                        LiveInnerFlowDowngradePipeline.LJII(iIntValue, iIntValue3, str2);
                                                    }
                                                }
                                            }
                                        }
                                        LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline4 = LiveInnerFlowDowngradePipeline.LIZ;
                                        LiveInnerFlowDowngradePipeline.LIZ(map);
                                        if (LiveInnerFlowDowngradePipeline.LJFF()) {
                                            int i3 = LiveInnerFlowDowngradePipeline.LIZLLL;
                                            String ttmSceneKey = LiveInnerFlowDowngradePipeline.LJ().getTtmSceneKey();
                                            if (iIntValue2 != i3) {
                                                if (LiveInnerFlowDowngradePipeline.LJIILIIL != 0) {
                                                    jCurrentTimeMillis = System.currentTimeMillis() - LiveInnerFlowDowngradePipeline.LJIILIIL;
                                                } else {
                                                    jCurrentTimeMillis = 0;
                                                }
                                                String str3 = LiveInnerFlowDowngradePipeline.LJIIL;
                                                if (str3 == null) {
                                                    str = "";
                                                } else {
                                                    str = str3;
                                                }
                                                if (i3 == 0 && str3 == null) {
                                                    LiveInnerFlowDowngradePipeline.LJIIL = C1017903yT.LIZ();
                                                    LiveInnerFlowDowngradePipeline.LJIILIIL = System.currentTimeMillis();
                                                } else if (iIntValue2 == 0) {
                                                    LiveInnerFlowDowngradePipeline.LJIIL = null;
                                                    LiveInnerFlowDowngradePipeline.LJIILIIL = 0L;
                                                }
                                                String str4 = LiveInnerFlowDowngradePipeline.LJIIL;
                                                if (str4 != null) {
                                                    str = str4;
                                                }
                                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                linkedHashMap3.put(Scene.SCENE_SERVICE, "inner_room_downgrade_scene");
                                                linkedHashMap3.put("downgrade_session_id", str);
                                                linkedHashMap3.put("pre_perf_level", String.valueOf(i3));
                                                linkedHashMap3.put("post_perf_level", String.valueOf(iIntValue2));
                                                linkedHashMap3.put("biz_status_map", GsonProtectorUtils.toJson(C1058250de3.LIZIZ(), map));
                                                linkedHashMap3.put("report_type", "1");
                                                linkedHashMap3.put("source_strategy_key", ttmSceneKey);
                                                linkedHashMap3.put("perf_score", String.valueOf(C13LP.LJJIZ(LiveInnerFlowDowngradePipeline.LJ)));
                                                linkedHashMap3.put("fps", String.valueOf(LiveInnerFlowDowngradePipeline.LIZIZ("fps")));
                                                linkedHashMap3.put("cpu_speed", String.valueOf(LiveInnerFlowDowngradePipeline.LIZIZ("cpu_speed")));
                                                linkedHashMap3.put("cpu_rate", String.valueOf(LiveInnerFlowDowngradePipeline.LIZIZ("cpu_rate")));
                                                linkedHashMap3.put("temp", String.valueOf(LiveInnerFlowDowngradePipeline.LIZIZ("battery_temp")));
                                                linkedHashMap3.put("drop3_rate", String.valueOf(LiveInnerFlowDowngradePipeline.LIZIZ("drop3")));
                                                if (jCurrentTimeMillis > 0) {
                                                    linkedHashMap3.put("pre_level_dur", String.valueOf(jCurrentTimeMillis));
                                                }
                                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_unify_downgrade_event");
                                                c474500IjALIZ.LJJIIZI(linkedHashMap3);
                                                c474500IjALIZ.LJIIIIZZ();
                                                c474500IjALIZ.LIZ();
                                            }
                                        }
                                        LiveInnerFlowDowngradePipeline.LIZJ = new LinkedHashMap(map);
                                        LiveInnerFlowDowngradePipeline.LIZLLL = iIntValue2;
                                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                            LiveInnerFlowDowngradePipeline.LJI.put((String) entry2.getKey(), entry2.getValue());
                                        }
                                    }
                                }
                            }
                        }
                        C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.triggerStrategyLoop$1");
                    }
                });
            }
            if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdaptLiveGiftDowngrade()) {
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.GIFT_TRACKING, new InterfaceC482090IvP() { // from class: X.0KXy
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC482090IvP
                    public final void LIZ(C0IS4 c0is4) {
                        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJ(((Number) c0is4.LIZ).intValue(), EnumC1101430elh.GIFT_TRACKING.getBizKey());
                    }
                });
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.GIFT_TRAY_ANIM, new InterfaceC482090IvP() { // from class: X.0KXz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC482090IvP
                    public final void LIZ(C0IS4 c0is4) {
                        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJ(((Number) c0is4.LIZ).intValue(), EnumC1101430elh.GIFT_TRAY_ANIM.getBizKey());
                    }
                });
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.GIFT_AI_ANALYSIS, new InterfaceC482090IvP() { // from class: X.0KY0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC482090IvP
                    public final void LIZ(C0IS4 c0is4) {
                        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJ(((Number) c0is4.LIZ).intValue(), EnumC1101430elh.GIFT_AI_ANALYSIS.getBizKey());
                    }
                });
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.GIFT_BUFFER_SIZE, new InterfaceC482090IvP() { // from class: X.0KY1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC482090IvP
                    public final void LIZ(C0IS4 c0is4) {
                        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJ(((Number) c0is4.LIZ).intValue(), EnumC1101430elh.GIFT_BUFFER_SIZE.getBizKey());
                    }
                });
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.GIFT_COMBO_SOUND, new InterfaceC482090IvP() { // from class: X.0KY2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC482090IvP
                    public final void LIZ(C0IS4 c0is4) {
                        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJ(((Number) c0is4.LIZ).intValue(), EnumC1101430elh.GIFT_COMBO_SOUND.getBizKey());
                    }
                });
                ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.LYNX_GIFT, new InterfaceC482090IvP() { // from class: X.0KY3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC482090IvP
                    public final void LIZ(C0IS4 c0is4) {
                        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJ(((Number) c0is4.LIZ).intValue(), EnumC1101430elh.LYNX_GIFT.getBizKey());
                    }
                });
            }
            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().LLLLLILLIL = LIZLLL();
            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().LLLLLJLJLL = null;
            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().LLLLLJIL = 0;
        }
        LJJIFFI++;
    }

    public static final class ReportDowngradeInfo {

        @C09CT("downCount")
        public int downCount;

        @C09CT("downDuration")
        public long downDuration;

        @C09CT("upCount")
        public int upCount;

        public ReportDowngradeInfo() {
            this(0, 0, 0L);
        }

        public ReportDowngradeInfo(int i, int i2, long j) {
            this.upCount = i;
            this.downCount = i2;
            this.downDuration = j;
        }
    }

    public static void LJII(int i, int i2, String str) {
        BizDowngradeStatisticsInfo bizDowngradeStatisticsInfoPutIfAbsent;
        if (i2 == i) {
            return;
        }
        ConcurrentHashMap<String, BizDowngradeStatisticsInfo> concurrentHashMap = LJIL;
        BizDowngradeStatisticsInfo bizDowngradeStatisticsInfo = concurrentHashMap.get(str);
        if (bizDowngradeStatisticsInfo == null && (bizDowngradeStatisticsInfoPutIfAbsent = concurrentHashMap.putIfAbsent(str, (bizDowngradeStatisticsInfo = new BizDowngradeStatisticsInfo(0, 0, 0L, 0L)))) != null) {
            bizDowngradeStatisticsInfo = bizDowngradeStatisticsInfoPutIfAbsent;
        }
        BizDowngradeStatisticsInfo bizDowngradeStatisticsInfo2 = bizDowngradeStatisticsInfo;
        if (i == 0) {
            bizDowngradeStatisticsInfo2.LIZ = System.currentTimeMillis();
            bizDowngradeStatisticsInfo2.downCount++;
        } else if (i2 == 0) {
            bizDowngradeStatisticsInfo2.downDuration += System.currentTimeMillis() - bizDowngradeStatisticsInfo2.LIZ;
            bizDowngradeStatisticsInfo2.LIZ = 0L;
            bizDowngradeStatisticsInfo2.upCount++;
        }
        LJJ = true;
        bizDowngradeStatisticsInfo2.toString();
    }
}
