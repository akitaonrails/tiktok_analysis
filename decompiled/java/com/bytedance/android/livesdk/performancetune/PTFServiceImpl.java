package com.bytedance.android.livesdk.performancetune;

import X.C01GW;
import X.C0IS4;
import X.C1094780eay;
import X.C15438062q;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C319230CfJ;
import X.C519010KXb;
import X.C519040KXe;
import X.C519090KXj;
import X.C805320ViU;
import X.EnumC1101430elh;
import X.EnumC480200IsM;
import X.InterfaceC482090IvP;
import X.InterfaceC519030KXd;
import X.InterfaceC519230KXx;
import X.RunnableC519000KXa;
import X.RunnableC519060KXg;
import Y.ARunnableS12S1100000_7;
import Y.ARunnableS13S0100100_7;
import Y.ARunnableS40S0300000_7;
import android.os.Handler;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradePipeline;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.LiveTaskScheduleTuneScene;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.PTFWatchLiveScheduleSetting;
import com.bytedance.android.performanhtune.IPTFService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class PTFServiceImpl implements IPTFService {
    @Override // com.bytedance.android.performanhtune.IPTFService
    public final Map SA() {
        if (!Intrinsics.LJFF("inner_room_downgrade_scene", "inner_room_downgrade_scene")) {
            return null;
        }
        LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : LiveInnerFlowDowngradePipeline.LJIIJJI.entrySet()) {
            String key = entry.getKey();
            if (Intrinsics.LJFF(entry.getValue(), "Spark_Env_Downgrade_Bizs") && LiveInnerFlowDowngradePipeline.LIZJ.containsKey(key)) {
                Integer num = (Integer) ((LinkedHashMap) LiveInnerFlowDowngradePipeline.LIZJ).get(key);
                linkedHashMap.put(key, Integer.valueOf(num != null ? num.intValue() : 0));
            }
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.performanhtune.IPTFService
    public final void S5(EnumC480200IsM enumC480200IsM) {
        C01GW c01gw = C519010KXb.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSceneTriggerArrived: ");
        sbLIZ.append(enumC480200IsM);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator it2 = ((List) C519010KXb.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC519030KXd) it2.next()).S5(enumC480200IsM);
        }
    }

    @Override // com.bytedance.android.performanhtune.IPTFService
    public final long So0(RunnableC519000KXa runnableC519000KXa) {
        List<Integer> list;
        int iLongValue;
        LiveTaskScheduleTuneScene.TaskScheduleResult taskScheduleResult;
        List list2;
        Long l;
        int iIntValue;
        List list3;
        Integer num;
        LiveTaskScheduleTuneScene liveTaskScheduleTuneScene = LiveTaskScheduleTuneScene.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueuePTFTask: ");
        sbLIZ.append(runnableC519000KXa);
        C2188811AlT.LIZIZ(sbLIZ);
        if (liveTaskScheduleTuneScene.enable()) {
            String str = runnableC519000KXa.LL;
            String str2 = runnableC519000KXa.LLILLJJLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("task_main_key", str);
            linkedHashMap.put("task_sub_key", str2);
            linkedHashMap.put("task_base_priority", Integer.valueOf(runnableC519000KXa.LLILZ.ordinal()));
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("task_info", linkedHashMap));
            C01GW c01gw = C1094780eay.LIZ;
            C519040KXe c519040KXeLIZ = C1094780eay.LIZ(PTFWatchLiveScheduleSetting.INSTANCE.getValue().getTaskScheduleDecisionConfig(), mapLIZJ);
            int i = 10;
            if (c519040KXeLIZ.LIZIZ == 0) {
                Map<String, ? extends Object> map = c519040KXeLIZ.LIZJ;
                LiveTaskScheduleTuneScene.TaskScheduleResult taskScheduleResult2 = null;
                list = null;
                List list4 = null;
                taskScheduleResult2 = null;
                arrayList = null;
                ArrayList arrayList = null;
                if (map != null) {
                    int i2 = c519040KXeLIZ.LIZ;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            Object obj = map.get("schedule_priority");
                            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 10;
                            }
                            Object obj2 = map.get("ignore_block_scenes");
                            if ((obj2 instanceof List) && (list3 = (List) obj2) != null) {
                                list4 = list3;
                            }
                            taskScheduleResult = new LiveTaskScheduleTuneScene.TaskScheduleResult(iIntValue, list4);
                        }
                    } else {
                        Object obj3 = map.get("schedule_priority");
                        if ((obj3 instanceof Long) && (l = (Long) obj3) != null) {
                            iLongValue = (int) l.longValue();
                        } else {
                            iLongValue = 10;
                        }
                        Object obj4 = map.get("ignore_block_scenes");
                        if ((obj4 instanceof List) && (list2 = (List) obj4) != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(Integer.valueOf((int) ((Number) it2.next()).longValue()));
                            }
                        }
                        taskScheduleResult = new LiveTaskScheduleTuneScene.TaskScheduleResult(iLongValue, arrayList);
                    }
                    taskScheduleResult2 = taskScheduleResult;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("runPTFTaskScheduleStrategy: ");
                sbLIZ2.append(taskScheduleResult2);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (taskScheduleResult2 != null) {
                    i = taskScheduleResult2.schedulePriority;
                }
                runnableC519000KXa.LLIZ = i;
                Set<Integer> set = runnableC519000KXa.LLILZIL;
                if (taskScheduleResult2 == null || (list = taskScheduleResult2.ignoreBlockScenes) == null) {
                    list = C519090KXj.LJIIJJI;
                }
                set.addAll(list);
            } else {
                runnableC519000KXa.LLIZ = 10;
                runnableC519000KXa.LLILZIL.addAll(C519090KXj.LJIIJJI);
            }
            C519090KXj c519090KXj = LiveTaskScheduleTuneScene.LIZLLL;
            c519090KXj.getClass();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("submitTask [task-");
            sbLIZ3.append(runnableC519000KXa);
            sbLIZ3.append(']');
            C2188811AlT.LIZIZ(sbLIZ3);
            if (c519090KXj.LJIIIIZZ + 1 == Long.MAX_VALUE) {
                c519090KXj.LJIIIIZZ = 0L;
            }
            c519090KXj.LJIIIIZZ++;
            RunnableC519060KXg runnableC519060KXg = new RunnableC519060KXg(runnableC519000KXa, c519090KXj.LJIIIIZZ, c519090KXj);
            runnableC519060KXg.LLILZ = System.currentTimeMillis();
            c519090KXj.LIZIZ.submit(new ARunnableS40S0300000_7(runnableC519000KXa, c519090KXj, runnableC519060KXg, 12));
            return c519090KXj.LJIIIIZZ;
        }
        runnableC519000KXa.run();
        return -1L;
    }

    @Override // com.bytedance.android.performanhtune.IPTFService
    public final void a70(long j) {
        C519090KXj c519090KXj = LiveTaskScheduleTuneScene.LIZLLL;
        Runnable runnable = c519090KXj.LJFF.get(Long.valueOf(j));
        if (runnable != null) {
            ((Handler) c519090KXj.LJI.getValue()).removeCallbacks(runnable);
            c519090KXj.LJFF.remove(Long.valueOf(j));
        }
        c519090KXj.LIZIZ.submit(new ARunnableS13S0100100_7(c519090KXj, j, 14));
    }

    @Override // com.bytedance.android.performanhtune.IPTFService
    public final void ph1(EnumC1101430elh enumC1101430elh) {
        if (Intrinsics.LJFF(enumC1101430elh.getTuneScene(), "inner_room_downgrade_scene")) {
            LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
            LiveInnerFlowDowngradePipeline.LJIIIZ.remove(enumC1101430elh.getBizKey());
        }
    }

    @Override // com.bytedance.android.performanhtune.IPTFService
    public final void FA2(EnumC1101430elh enumC1101430elh, InterfaceC482090IvP interfaceC482090IvP) {
        int iIntValue;
        if (Intrinsics.LJFF(enumC1101430elh.getTuneScene(), "inner_room_downgrade_scene")) {
            LiveInnerFlowDowngradePipeline liveInnerFlowDowngradePipeline = LiveInnerFlowDowngradePipeline.LIZ;
            String bizKey = enumC1101430elh.getBizKey();
            LiveInnerFlowDowngradePipeline.LJIIIZ.put(bizKey, interfaceC482090IvP);
            if (C805320ViU.LIZ()) {
                Integer num = (Integer) ((LinkedHashMap) LiveInnerFlowDowngradePipeline.LIZJ).get(bizKey);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                interfaceC482090IvP.LIZ(new C0IS4(iIntValue, -1, C2097608Jq.LJ(), null, false, 48));
                return;
            }
            C805320ViU.LIZJ(new ARunnableS12S1100000_7(interfaceC482090IvP, bizKey, 14));
        }
    }

    @Override // com.bytedance.android.performanhtune.IPTFService
    public final void xe0(String str, C319230CfJ c319230CfJ) {
        if (Intrinsics.LJFF("inner_room_downgrade_scene", "inner_room_downgrade_scene")) {
            ConcurrentHashMap<String, InterfaceC519230KXx> concurrentHashMap = LiveInnerFlowDowngradePipeline.LJIIJ;
            if (!concurrentHashMap.containsKey("Spark_Env_Downgrade_Bizs")) {
                concurrentHashMap.put("Spark_Env_Downgrade_Bizs", c319230CfJ);
            }
            LiveInnerFlowDowngradePipeline.LJIIJJI.put(str, "Spark_Env_Downgrade_Bizs");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a3 A[PHI: r5
      0x01a3: PHI (r5v2 X.0IKU<T>) = (r5v1 X.0IKU<T>), (r5v4 X.0IKU<T>) binds: [B:65:0x01a2, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.performanhtune.IPTFService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> X.C0IKU<T> P71(java.lang.String r13, X.EnumC1101430elh r14, java.util.Map<java.lang.String, ? extends java.lang.Object> r15, java.lang.Class<T> r16) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performancetune.PTFServiceImpl.P71(java.lang.String, X.0elh, java.util.Map, java.lang.Class):X.0IKU");
    }
}
