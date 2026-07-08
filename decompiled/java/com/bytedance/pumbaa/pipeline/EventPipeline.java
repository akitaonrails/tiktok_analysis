package com.bytedance.pumbaa.pipeline;

import X.C08CX;
import X.C098200Yq;
import X.C0WQ3;
import X.C0WQ4;
import X.C0WRI;
import X.C0WRK;
import X.C0WRL;
import X.C0WRN;
import X.C0WRP;
import X.C0WRT;
import X.C0WRU;
import X.C0WRW;
import X.C0WRX;
import X.C0WS7;
import X.C0WSC;
import X.C0WSD;
import X.C0WSF;
import X.C13BV;
import X.C13LP;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C823240WRe;
import X.C823280WRi;
import X.InterfaceC823210WRb;
import Y.ARunnableS18S1200000_13;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.pns.engine.Action;
import com.bytedance.pns.engine.AsyncCallback;
import com.bytedance.pns.engine.ExecuteResult;
import com.bytedance.pns.engine.RuleEngineService;
import com.bytedance.pns.engine.StrategyResult;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.pumbaa.pipeline.settings.AggregatedReportConfig;
import com.bytedance.pumbaa.pipeline.settings.EventPipelineConfig;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes14.dex */
public final class EventPipeline {
    public static CopyOnWriteArraySet<InterfaceC823210WRb> handleResultCallbacks;
    public static final EventPipeline INSTANCE = new EventPipeline();
    public static final ReentrantReadWriteLock rwLockActionMap = new ReentrantReadWriteLock();
    public static final Map<String, C0WRP> actionMap = C2097608Jq.LJIIJ(new Pair("report", C0WRI.LIZIZ), new Pair("stash", C0WRK.LIZIZ), new Pair("aggregated_report", new C0WRL() { // from class: X.0WRH
        public static final Map<String, C0WQE<String, Map<String, C0WR6>>> LIZJ = new LinkedHashMap();
        public static final Map<String, C0W8P> LIZLLL = new LinkedHashMap();

        @Override // X.C0WRP
        public final String name() {
            return "aggregated_report";
        }

        public static C0WQE LIZJ(String str) {
            Map<String, C0WQE<String, Map<String, C0WR6>>> map = LIZJ;
            synchronized (map) {
                try {
                    if (map.containsKey(str)) {
                        return (C0WQE) ((LinkedHashMap) map).get(str);
                    }
                    AggregatedReportConfig aggregatedReportConfig = C823240WRe.LIZ().aggregatedReportConfigs.get(str);
                    if (aggregatedReportConfig == null) {
                        aggregatedReportConfig = EventPipelineConfig.LIZ;
                    }
                    C0WQE<String, Map<String, C0WR6>> c0wqe = new C0WQE<>(aggregatedReportConfig.maxStorageLimit);
                    c0wqe.setOnRemoveListener(new C0WQB() { // from class: X.0WQC
                        @Override // X.C0WQB
                        public final void LIZ(Map.Entry entry) {
                            entry.getKey();
                            Map map2 = (Map) entry.getValue();
                            map2.put("is_exceed_capacity", new C0WQ8(EnumC823400WRu.Bool, Boolean.TRUE));
                            synchronized (map2) {
                                try {
                                    C0WQ6.LIZIZ(map2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    });
                    map.put(str, c0wqe);
                    return c0wqe;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // X.C0WRL
        public final boolean LIZIZ(C0WRN c0wrn) {
            Object objLIZ;
            long jLongValue;
            C0WRM c0wrm;
            PrivacyEvent privacyEvent = c0wrn.LJ;
            C0WR6 c0wr6Query = privacyEvent.query((String) c0wrn.LIZ.LIZJ.get("aggregated_key"));
            if (c0wr6Query != null) {
                objLIZ = c0wr6Query.LIZ();
            } else {
                objLIZ = null;
            }
            String str = (String) objLIZ;
            if (str != null && !Intrinsics.LJFF(str, "pns-null")) {
                C0WQE c0wqeLIZJ = LIZJ(privacyEvent.triggerBiz());
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(C823240WRe.LIZ().commonFields);
                Object obj = c0wrn.LIZ.LIZJ.get("aggregated_fields");
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        linkedHashSet.add(jSONArray.optString(i));
                    }
                }
                Object obj2 = c0wrn.LIZ.LIZJ.get("additional_report_fields");
                if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        linkedHashSet.add(jSONArray2.optString(i2));
                    }
                }
                Object obj3 = c0wrn.LIZ.LIZJ.get("prefer_existing_fields");
                HashSet hashSet = new HashSet();
                if (obj3 instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) obj3;
                    int length3 = jSONArray3.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        hashSet.add(jSONArray3.optString(i3));
                    }
                }
                Map linkedHashMap = (Map) c0wqeLIZJ.pop(str);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                synchronized (linkedHashMap) {
                    try {
                        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
                        linkedHashMap.put("trigger_id", new C0WQ8(enumC823400WRu, privacyEvent.triggerId()));
                        linkedHashMap.put("trigger_biz", new C0WQ8(enumC823400WRu, privacyEvent.triggerBiz()));
                        linkedHashMap.put("graph_path", new C0WQ8(enumC823400WRu, c0wrn.LIZLLL));
                        linkedHashMap.put("report_sample", new C0WQ8(EnumC823400WRu.Double, Double.valueOf(c0wrn.LIZJ)));
                        linkedHashMap.put("report_category", new C0WQ8(enumC823400WRu, c0wrn.LIZ.LIZJ.get("report_category")));
                        linkedHashMap.put("strategy_id", new C0WQ8(enumC823400WRu, c0wrn.LIZIZ));
                        linkedHashMap.put("strategy_version", new C0WQ8(enumC823400WRu, String.valueOf(String.valueOf(RuleEngineService.getStrategyVersion()))));
                        linkedHashMap.put("const_pool_version", new C0WQ8(enumC823400WRu, String.valueOf(String.valueOf(RuleEngineService.getConstPoolVersion()))));
                        for (String str2 : linkedHashSet) {
                            C0WQ7 c0wq7 = C0WQ7.LIZ;
                            String strTriggerBiz = privacyEvent.triggerBiz();
                            c0wq7.getClass();
                            C0WQG c0wqgLIZ = C0WQ7.LIZ(strTriggerBiz, str2);
                            if (c0wqgLIZ != null) {
                                c0wrm = c0wqgLIZ.LIZ;
                            } else {
                                c0wrm = null;
                            }
                            if (c0wrm == C0WRM.Engine) {
                                linkedHashMap.put(str2, new C0WQ8(c0wqgLIZ.LIZIZ, c0wrn.LIZ.LIZJ.get(str2)));
                            } else {
                                C0WR6 c0wr6Query2 = privacyEvent.contextInfo().query(str2);
                                if (c0wr6Query2 != null && (!hashSet.contains(str2) || !linkedHashMap.containsKey(str2))) {
                                    linkedHashMap.put(str2, new C0WQ8(c0wr6Query2.LIZ, c0wr6Query2.LIZ()));
                                }
                            }
                        }
                        if (linkedHashMap.containsKey("aggregated_trigger_ids")) {
                            C0WR6 c0wr6 = (C0WR6) linkedHashMap.get("aggregated_trigger_ids");
                            if (c0wr6 != null) {
                                C19719512Dh.LIZIZ(((C0WQ8) c0wr6).LIZ()).add(privacyEvent.triggerId());
                            }
                        } else {
                            linkedHashMap.put("aggregated_trigger_ids", new C0WQ8(EnumC823400WRu.StringArray, C1697810uHb.LJIILJJIL(privacyEvent.triggerId())));
                        }
                        if (c0wrn.LIZ.LIZJ.get("override_timeout") instanceof Number) {
                            jLongValue = ((Number) c0wrn.LIZ.LIZJ.get("override_timeout")).longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Map<String, C0W8P> map = LIZLLL;
                        C0W8P c0w8p = (C0W8P) ((LinkedHashMap) map).get(str);
                        if (c0w8p != null) {
                            c0w8p.LIZ = null;
                            c0w8p.LIZIZ = -1L;
                        }
                        map.remove(str);
                        if (jLongValue > 0) {
                            c0wqeLIZJ.put(str, linkedHashMap);
                            ARunnableS18S1200000_13 aRunnableS18S1200000_13 = new ARunnableS18S1200000_13(linkedHashMap, c0wqeLIZJ, str, 8);
                            Handler handler = PumbaaWorkerThread.getHandler();
                            C0W8P c0w8p2 = new C0W8P(aRunnableS18S1200000_13, jLongValue);
                            Message messageObtainMessage = handler.obtainMessage(354084380);
                            messageObtainMessage.obj = c0w8p2;
                            C786410Ut5.LJLJL(handler, messageObtainMessage, SystemClock.uptimeMillis() + jLongValue);
                            map.put(str, c0w8p2);
                        } else {
                            C0WQ6.LIZIZ(linkedHashMap);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return true;
            }
            this.LIZ = "value of aggregated_key is null";
            return false;
        }
    }), new Pair("merge_report", new C0WRL() { // from class: X.0WRG
        public static final Map<String, C0WQE<String, Map<String, C0WR6>>> LIZJ = new LinkedHashMap();
        public static final Map<String, C0W8P> LIZLLL = new LinkedHashMap();

        @Override // X.C0WRP
        public final String name() {
            return "merge_report";
        }

        @Override // X.C0WRL
        public final boolean LIZIZ(C0WRN c0wrn) {
            Object objLIZ;
            long jLongValue;
            C0WRM c0wrm;
            PrivacyEvent privacyEvent = c0wrn.LJ;
            C0WR6 c0wr6Query = privacyEvent.query((String) c0wrn.LIZ.LIZJ.get("merge_key"));
            if (c0wr6Query != null) {
                objLIZ = c0wr6Query.LIZ();
            } else {
                objLIZ = null;
            }
            String str = (String) objLIZ;
            if (str != null && !Intrinsics.LJFF(str, "pns-null")) {
                AggregatedReportConfig aggregatedReportConfig = C823240WRe.LIZ().mergeReportConfigs.get(privacyEvent.triggerBiz());
                if (aggregatedReportConfig == null) {
                    aggregatedReportConfig = EventPipelineConfig.LIZIZ;
                }
                int i = aggregatedReportConfig.maxStorageLimit;
                C0WQE c0wqeLIZJ = LIZJ(i, privacyEvent.triggerBiz());
                if (!Intrinsics.LJFF(c0wrn.LIZ.LIZJ.get("is_start"), Boolean.TRUE) && !c0wqeLIZJ.containsKey(str)) {
                    this.LIZ = "is not start node, and merge_key not in cache";
                    return false;
                }
                LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                linkedHashSet.addAll(C823240WRe.LIZ().commonFields);
                Object obj = c0wrn.LIZ.LIZJ.get("merge_fields");
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        linkedHashSet.add(jSONArray.optString(i2));
                    }
                }
                Object obj2 = c0wrn.LIZ.LIZJ.get("additional_report_fields");
                if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        linkedHashSet.add(jSONArray2.optString(i3));
                    }
                }
                Object obj3 = c0wrn.LIZ.LIZJ.get("prefer_existing_fields");
                HashSet hashSet = new HashSet();
                if (obj3 instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) obj3;
                    int length3 = jSONArray3.length();
                    for (int i4 = 0; i4 < length3; i4++) {
                        hashSet.add(jSONArray3.optString(i4));
                    }
                }
                Map linkedHashMap = (Map) c0wqeLIZJ.pop(str);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                synchronized (linkedHashMap) {
                    try {
                        EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
                        linkedHashMap.put("trigger_id", new C0WQ8(enumC823400WRu, privacyEvent.triggerId()));
                        linkedHashMap.put("trigger_biz", new C0WQ8(enumC823400WRu, privacyEvent.triggerBiz()));
                        linkedHashMap.put("graph_path", new C0WQ8(enumC823400WRu, c0wrn.LIZLLL));
                        linkedHashMap.put("report_sample", new C0WQ8(EnumC823400WRu.Double, Double.valueOf(c0wrn.LIZJ)));
                        linkedHashMap.put("report_category", new C0WQ8(enumC823400WRu, c0wrn.LIZ.LIZJ.get("report_category")));
                        linkedHashMap.put("strategy_id", new C0WQ8(enumC823400WRu, c0wrn.LIZIZ));
                        linkedHashMap.put("strategy_version", new C0WQ8(enumC823400WRu, String.valueOf(String.valueOf(RuleEngineService.getStrategyVersion()))));
                        linkedHashMap.put("const_pool_version", new C0WQ8(enumC823400WRu, String.valueOf(String.valueOf(RuleEngineService.getConstPoolVersion()))));
                        linkedHashMap.put("merge_queue_max_size", new C0WQ8(EnumC823400WRu.Long, Integer.valueOf(i)));
                        for (String str2 : linkedHashSet) {
                            C0WQ7 c0wq7 = C0WQ7.LIZ;
                            String strTriggerBiz = privacyEvent.triggerBiz();
                            c0wq7.getClass();
                            C0WQG c0wqgLIZ = C0WQ7.LIZ(strTriggerBiz, str2);
                            if (c0wqgLIZ != null) {
                                c0wrm = c0wqgLIZ.LIZ;
                            } else {
                                c0wrm = null;
                            }
                            if (c0wrm == C0WRM.Engine) {
                                linkedHashMap.put(str2, new C0WQ8(c0wqgLIZ.LIZIZ, c0wrn.LIZ.LIZJ.get(str2)));
                            } else {
                                C0WR6 c0wr6Query2 = privacyEvent.contextInfo().query(str2);
                                if (c0wr6Query2 != null && (!hashSet.contains(str2) || !linkedHashMap.containsKey(str2))) {
                                    linkedHashMap.put(str2, new C0WQ8(c0wr6Query2.LIZ, c0wr6Query2.LIZ()));
                                }
                            }
                        }
                        if (linkedHashMap.containsKey("merge_trigger_ids")) {
                            C0WR6 c0wr6 = (C0WR6) linkedHashMap.get("merge_trigger_ids");
                            if (c0wr6 != null) {
                                C19719512Dh.LIZIZ(((C0WQ8) c0wr6).LIZ()).add(privacyEvent.triggerId());
                            }
                        } else {
                            linkedHashMap.put("merge_trigger_ids", new C0WQ8(EnumC823400WRu.StringArray, C1697810uHb.LJIILJJIL(privacyEvent.triggerId())));
                        }
                        if (linkedHashMap.containsKey("graph_paths")) {
                            C0WR6 c0wr62 = (C0WR6) linkedHashMap.get("graph_paths");
                            if (c0wr62 != null) {
                                C19719512Dh.LIZIZ(((C0WQ8) c0wr62).LIZ()).add(c0wrn.LIZLLL);
                            }
                        } else {
                            linkedHashMap.put("graph_paths", new C0WQ8(EnumC823400WRu.StringArray, C1697810uHb.LJIILJJIL(c0wrn.LIZLLL)));
                        }
                        if (c0wrn.LIZ.LIZJ.get("override_timeout") instanceof Number) {
                            jLongValue = ((Number) c0wrn.LIZ.LIZJ.get("override_timeout")).longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Map<String, C0W8P> map = LIZLLL;
                        C0W8P c0w8p = (C0W8P) ((LinkedHashMap) map).get(str);
                        if (c0w8p != null) {
                            c0w8p.LIZ = null;
                            c0w8p.LIZIZ = -1L;
                        }
                        map.remove(str);
                        if (jLongValue > 0) {
                            c0wqeLIZJ.put(str, linkedHashMap);
                            ARunnableS18S1200000_13 aRunnableS18S1200000_13 = new ARunnableS18S1200000_13(linkedHashMap, c0wqeLIZJ, str, 9);
                            Handler handler = PumbaaWorkerThread.getHandler();
                            C0W8P c0w8p2 = new C0W8P(aRunnableS18S1200000_13, jLongValue);
                            Message messageObtainMessage = handler.obtainMessage(354084380);
                            messageObtainMessage.obj = c0w8p2;
                            C786410Ut5.LJLJL(handler, messageObtainMessage, SystemClock.uptimeMillis() + jLongValue);
                            map.put(str, c0w8p2);
                        } else {
                            linkedHashMap.put("merge_report_reason", new C0WQ8(EnumC823400WRu.String, "success"));
                            C0WQ6.LIZIZ(linkedHashMap);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return true;
            }
            this.LIZ = "value of merge_key is null";
            return false;
        }

        public static C0WQE LIZJ(int i, String str) {
            Map<String, C0WQE<String, Map<String, C0WR6>>> map = LIZJ;
            synchronized (map) {
                try {
                    if (map.containsKey(str)) {
                        return (C0WQE) ((LinkedHashMap) map).get(str);
                    }
                    C0WQE<String, Map<String, C0WR6>> c0wqe = new C0WQE<>(i);
                    c0wqe.setOnRemoveListener(new C0WQB() { // from class: X.0WQA
                        @Override // X.C0WQB
                        public final void LIZ(Map.Entry entry) {
                            entry.getKey();
                            Map map2 = (Map) entry.getValue();
                            synchronized (map2) {
                                try {
                                    map2.put("merge_report_reason", new C0WQ8(EnumC823400WRu.String, "exceed_queue_size"));
                                    C0WQ6.LIZIZ(map2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    });
                    map.put(str, c0wqe);
                    return c0wqe;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }));

    static {
        PumbaaWorkerThread pumbaaWorkerThread;
        synchronized (PumbaaWorkerThread.class) {
            try {
                PumbaaWorkerThread.LIZIZ();
                pumbaaWorkerThread = PumbaaWorkerThread.LL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0WQ3 c0wq3 = C0WQ4.LIZ;
        pumbaaWorkerThread.setUncaughtExceptionHandler(C0WQ4.LIZ);
        handleResultCallbacks = new CopyOnWriteArraySet<>();
    }

    public static final boolean isActivated() {
        try {
            return RuleEngineService.isActivated();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZJ("isActivated error", "ensure_not_reach_here", th);
            return false;
        }
    }

    public static final boolean isEnabled() {
        return C823240WRe.LIZ().enablePipeline;
    }

    public final void addOnHandleResultCallback(InterfaceC823210WRb interfaceC823210WRb) {
        handleResultCallbacks.add(interfaceC823210WRb);
    }

    public final void clearDecisionAction(String str) {
        int readHoldCount;
        if (!C823240WRe.LIZ().enablePipeline) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = rwLockActionMap;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            actionMap.remove(str);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void registerDecisionAction(C0WRP c0wrp) {
        int readHoldCount;
        if (!C823240WRe.LIZ().enablePipeline) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = rwLockActionMap;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            actionMap.put(c0wrp.name(), c0wrp);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void removeOnHandleResultCallback(InterfaceC823210WRb interfaceC823210WRb) {
        handleResultCallbacks.remove(interfaceC823210WRb);
    }

    public static final List<C0WRN> handleEvent(final PrivacyEvent privacyEvent, final InterfaceC823210WRb interfaceC823210WRb) {
        C0WS7 c0ws7LJFF;
        C0WS7 c0ws7LJFF2;
        ExecuteResult executeResultValidate;
        boolean z;
        Set<String> set;
        Object c098200Yq;
        List<StrategyResult> list;
        C0WSC performanceNode = privacyEvent.getPerformanceNode();
        C0WS7 c0ws7LJFF3 = null;
        if (performanceNode != null) {
            c0ws7LJFF = performanceNode.LJFF("event_pipeline_pre_handle");
        } else {
            c0ws7LJFF = null;
        }
        if (C0WSD.LIZIZ(performanceNode, c0ws7LJFF)) {
            if (c0ws7LJFF != null) {
                c0ws7LJFF.stop();
            }
            return C13BV.INSTANCE;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - privacyEvent.getEventCreateTime$pipeline_release();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long j2 = jElapsedRealtimeNanos / j;
        if (!C823240WRe.LIZ().enablePipeline) {
            if (c0ws7LJFF != null) {
                c0ws7LJFF.LJ = "disable";
            }
            if (c0ws7LJFF != null) {
                c0ws7LJFF.stop();
            }
            return C13BV.INSTANCE;
        }
        C0WRU.LIZ(privacyEvent, "pipeline", "passed_decision=true");
        C823240WRe.LIZ();
        C0WRT c0wrt = new C0WRT("EventPipeline.handleEvent");
        if (c0wrt.LIZLLL) {
            c0wrt.LIZ(privacyEvent.getEventInitCost$pipeline_release(), "event_init");
            c0wrt.LIZ(j2 - privacyEvent.getEventInitCost$pipeline_release(), "event_add_callsite_to_event");
            String strTriggerId = privacyEvent.triggerId();
            if (c0wrt.LIZLLL) {
                c0wrt.LIZIZ.put("trigger_id", strTriggerId);
            }
            String strTriggerBiz = privacyEvent.triggerBiz();
            if (c0wrt.LIZLLL) {
                c0wrt.LIZIZ.put("trigger_biz", strTriggerBiz);
            }
        }
        if (c0ws7LJFF != null) {
            c0ws7LJFF.stop();
        }
        if (performanceNode != null) {
            c0ws7LJFF2 = performanceNode.LJFF("rule_engine_validate");
        } else {
            c0ws7LJFF2 = null;
        }
        if (C0WSD.LIZIZ(performanceNode, c0ws7LJFF2)) {
            if (c0ws7LJFF2 != null) {
                c0ws7LJFF2.stop();
            }
            return C13BV.INSTANCE;
        }
        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        try {
            executeResultValidate = RuleEngineService.validate(privacyEvent, new AsyncCallback() { // from class: X.0WRS
                @Override // com.bytedance.pns.engine.AsyncCallback
                public final void onCall(ExecuteResult executeResult) throws JSONException {
                    Object c098200Yq2;
                    List<StrategyResult> list2;
                    C0WRU.LIZ(privacyEvent, "engine_validate", EventPipeline.INSTANCE.formatExecuteResultDetail("async", executeResult));
                    InterfaceC823210WRb interfaceC823210WRb2 = interfaceC823210WRb;
                    if (interfaceC823210WRb2 != null) {
                        try {
                            interfaceC823210WRb2.LIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                    }
                    Iterator<InterfaceC823210WRb> it2 = EventPipeline.handleResultCallbacks.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                    if (thM5exceptionOrNullimpl != null) {
                        C823280WRi.LIZJ("onHandleResult error", "ensure_not_reach_here", thM5exceptionOrNullimpl);
                    }
                    if (executeResult != null && (list2 = executeResult.results) != null) {
                        PrivacyEvent privacyEvent2 = privacyEvent;
                        for (StrategyResult strategyResult : list2) {
                            EventPipeline eventPipeline = EventPipeline.INSTANCE;
                            C0WRW c0wrw = C0WRW.STRATEGY_TYPE_ASYNC;
                            Set<String> forbiddenActions = privacyEvent2.getForbiddenActions();
                            if (forbiddenActions == null) {
                                forbiddenActions = C08CX.INSTANCE;
                            }
                            eventPipeline.handleResult(c0wrw, privacyEvent2, strategyResult, forbiddenActions);
                        }
                    }
                    privacyEvent.recordOrReportStrategyResults(executeResult);
                }
            });
            z = false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C823280WRi.LIZJ("validate error", "ensure_not_reach_here", e);
            executeResultValidate = null;
            z = true;
        }
        C0WRU.LIZ(privacyEvent, "engine_validate", INSTANCE.formatExecuteResultDetail("sync", executeResultValidate));
        if (c0ws7LJFF2 != null) {
            c0ws7LJFF2.stop();
        }
        if (executeResultValidate != null) {
            set = executeResultValidate.forbiddenActions;
        } else {
            set = null;
        }
        privacyEvent.setForbiddenActions(set);
        if (C0WSD.LIZ(performanceNode, "record_or_report_strategy_results")) {
            return C13BV.INSTANCE;
        }
        if (performanceNode == null) {
            privacyEvent.recordOrReportStrategyResults(executeResultValidate);
        } else {
            C0WS7 c0ws7LJFF4 = performanceNode.LJFF("record_or_report_strategy_results");
            privacyEvent.recordOrReportStrategyResults(executeResultValidate);
            C0WSF c0wsfLJII = performanceNode.LJII();
            C0WSF c0wsf = C0WSF.EXCEEDED;
            if (c0wsfLJII == c0wsf) {
                c0ws7LJFF4.LJFF = c0wsf;
            }
            c0ws7LJFF4.stop();
        }
        if (performanceNode != null) {
            c0ws7LJFF3 = performanceNode.LJFF("handle_engine_results");
        }
        if (C0WSD.LIZIZ(performanceNode, c0ws7LJFF3)) {
            if (c0ws7LJFF3 != null) {
                c0ws7LJFF3.stop();
            }
            return C13BV.INSTANCE;
        }
        if (c0wrt.LIZLLL) {
            long jElapsedRealtimeNanos3 = (SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2) / j;
            C823240WRe.LIZ();
            c0wrt.LIZ(jElapsedRealtimeNanos3, "engine_validate");
        }
        long jElapsedRealtimeNanos4 = SystemClock.elapsedRealtimeNanos();
        if (interfaceC823210WRb != null) {
            try {
                interfaceC823210WRb.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        Iterator<InterfaceC823210WRb> it2 = handleResultCallbacks.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        if (z) {
            if (interfaceC823210WRb != null) {
                interfaceC823210WRb.LIZ();
            }
            Iterator<InterfaceC823210WRb> it3 = handleResultCallbacks.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ();
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZJ("onHandleResult error", "ensure_not_reach_here", thM5exceptionOrNullimpl);
        }
        ArrayList arrayList = new ArrayList();
        if (executeResultValidate != null && (list = executeResultValidate.results) != null) {
            for (StrategyResult strategyResult : list) {
                EventPipeline eventPipeline = INSTANCE;
                C0WRW c0wrw = C0WRW.STRATEGY_TYPE_SYNC;
                Set<String> set2 = executeResultValidate.forbiddenActions;
                if (set2 == null) {
                    set2 = C08CX.INSTANCE;
                }
                List<C0WRN> listHandleResult = eventPipeline.handleResult(c0wrw, privacyEvent, strategyResult, set2);
                if (!listHandleResult.isEmpty()) {
                    arrayList.addAll(listHandleResult);
                }
            }
        }
        c0wrt.LIZ((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos4) / j, "pipeline_handle_results");
        c0wrt.LIZIZ();
        if (c0ws7LJFF3 != null) {
            c0ws7LJFF3.stop();
        }
        return arrayList;
    }

    public final String formatExecuteResultDetail(String str, ExecuteResult executeResult) {
        int size;
        String strLJJLIIIJ;
        if (executeResult == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(":null");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        List<StrategyResult> list = executeResult.results;
        int size2 = 0;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        List<StrategyResult> list2 = executeResult.results;
        if (list2 == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS247S0000000_13.get$arr$(4), 30)) == null) {
            strLJJLIIIJ = "";
        }
        Set<String> set = executeResult.forbiddenActions;
        if (set != null) {
            size2 = set.size();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(":results=");
        sbLIZ2.append(size);
        sbLIZ2.append(",strategyIds=[");
        sbLIZ2.append(strLJJLIIIJ);
        sbLIZ2.append("],forbiddenActions=");
        sbLIZ2.append(size2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final List<C0WRN> handleResult(C0WRW c0wrw, PrivacyEvent privacyEvent, StrategyResult strategyResult, Set<String> set) {
        boolean z;
        Object c098200Yq;
        boolean z2;
        double dDoubleValue;
        C823240WRe.LIZ();
        String str = strategyResult.strategyId;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        try {
            List<Action> list = strategyResult.actions;
            if (list != null) {
                for (Action action : list) {
                    String str2 = action.name;
                    if (str2 != null && str2.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        if (set.contains(action.name)) {
                            C823240WRe.LIZ();
                        } else {
                            String str3 = action.actionId;
                            String str4 = action.name;
                            Map<String, Object> params = action.getParams();
                            if (params == null) {
                                params = C2097608Jq.LJ();
                            }
                            C0WRX c0wrx = new C0WRX(str3, str4, params);
                            String str5 = strategyResult.strategyId;
                            Double d = strategyResult.sampleRate;
                            if (d != null) {
                                dDoubleValue = d.doubleValue();
                            } else {
                                dDoubleValue = -1.0d;
                            }
                            C0WRN c0wrn = new C0WRN(c0wrx, str5, dDoubleValue, strategyResult.graphPath, privacyEvent);
                            ReentrantReadWriteLock.ReadLock lock = rwLockActionMap.readLock();
                            lock.lock();
                            try {
                                Map<String, C0WRP> map = actionMap;
                                if (map.containsKey(action.name)) {
                                    C0WRP c0wrp = map.get(action.name);
                                    if (c0wrp != null) {
                                        c0wrp.LIZ(c0wrn);
                                    }
                                } else {
                                    arrayList.add(c0wrn);
                                }
                                lock.unlock();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                lock.unlock();
                                throw th;
                            }
                        }
                    }
                }
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZJ("handleResult error", "ensure_not_reach_here", thM5exceptionOrNullimpl);
        }
        return arrayList;
    }
}
