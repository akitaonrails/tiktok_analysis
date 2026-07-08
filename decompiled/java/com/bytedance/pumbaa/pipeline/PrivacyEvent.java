package com.bytedance.pumbaa.pipeline;

import X.AbstractC19994813Le;
import X.C0WQ8;
import X.C0WR6;
import X.C0WRB;
import X.C0WRC;
import X.C0WRO;
import X.C0WRZ;
import X.C0WSC;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.C308480C7i;
import X.C308590C7t;
import X.C823240WRe;
import X.C823280WRi;
import X.EnumC823400WRu;
import X.InterfaceC825580Wa4;
import android.os.SystemClock;
import com.bytedance.pns.engine.DecisionStatistics;
import com.bytedance.pns.engine.ExecuteResult;
import com.bytedance.pns.engine.StrategyResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class PrivacyEvent implements InterfaceC825580Wa4 {
    public static final C0WRC Companion = new C0WRC();
    public C0WRB contextInfo;
    public volatile CopyOnWriteArrayList<C0WRZ> decisionTraceLog;
    public long eventInitCost;
    public Set<String> forbiddenActions;
    public boolean needReport;
    public C0WSC performanceNode;
    public volatile List<StrategyResult> storedStrategyResults;
    public final String triggerBiz;
    public final String triggerId;
    public final long eventCreateTime = SystemClock.elapsedRealtimeNanos();
    public final String id = UUID.randomUUID().toString();
    public final AtomicBoolean initialized = new AtomicBoolean(false);

    public static final PrivacyEvent create(String str, String str2) {
        Companion.getClass();
        return C0WRC.LIZ(str, str2);
    }

    @Override // X.InterfaceC825580Wa4
    public C0WRO contextInfo() {
        C0WRB c0wrb = this.contextInfo;
        if (c0wrb == null) {
            return null;
        }
        return c0wrb;
    }

    public final boolean generateSampleRateResult() {
        int i = C308590C7t.LIZ;
        Integer num = (Integer) C308480C7i.LIZLLL(Integer.TYPE, "pns_pumbaa_decision_custom_sample_rate", 0);
        double dIntValue = ((double) (num != null ? num.intValue() : 0)) / 100.0d;
        return dIntValue >= 1.0d || (dIntValue > 0.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= dIntValue);
    }

    public final List<C0WRZ> getDecisionTraceSnapshot() {
        List<C0WRZ> listLLIIII;
        CopyOnWriteArrayList<C0WRZ> copyOnWriteArrayList = this.decisionTraceLog;
        return (copyOnWriteArrayList == null || (listLLIIII = C13LP.LLIIII(copyOnWriteArrayList)) == null) ? C13BV.INSTANCE : listLLIIII;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.triggerId);
        sbLIZ.append(',');
        sbLIZ.append(this.triggerBiz);
        sbLIZ.append(')');
        C0WRB c0wrb = this.contextInfo;
        if (c0wrb == null) {
            c0wrb = null;
        }
        sbLIZ.append(c0wrb);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getEventCreateTime$pipeline_release() {
        return this.eventCreateTime;
    }

    public final long getEventInitCost$pipeline_release() {
        return this.eventInitCost;
    }

    public final Set<String> getForbiddenActions() {
        return this.forbiddenActions;
    }

    public final String getId() {
        return this.id;
    }

    public final C0WSC getPerformanceNode() {
        return this.performanceNode;
    }

    @Override // X.InterfaceC825580Wa4
    public String triggerBiz() {
        return this.triggerBiz;
    }

    @Override // X.InterfaceC825580Wa4
    public String triggerId() {
        return this.triggerId;
    }

    public final C0WR6 query(String str) {
        if (str == null) {
            return null;
        }
        if (Intrinsics.LJFF(str, "trigger_id")) {
            return new C0WQ8(EnumC823400WRu.String, this.triggerId);
        }
        return contextInfo().query(str);
    }

    public final void recordOrReportStrategyResults(ExecuteResult executeResult) throws JSONException {
        Object objLIZ;
        Object objLIZ2;
        Object objLIZ3;
        List<StrategyResult> list;
        Object objValueOf;
        boolean z;
        Object objValueOf2;
        boolean z2;
        DecisionStatistics decisionStatistics;
        List<StrategyResult> list2;
        if (this.storedStrategyResults == null) {
            if (this.initialized.compareAndSet(false, true)) {
                this.needReport = generateSampleRateResult();
                if (executeResult == null || (list2 = executeResult.results) == null) {
                    list2 = C13BV.INSTANCE;
                }
                this.storedStrategyResults = list2;
                return;
            }
            while (this.storedStrategyResults == null) {
                Thread.yield();
            }
        }
        if (!this.needReport) {
            this.storedStrategyResults = null;
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("report_category", "strategy_coverage");
        jSONObject.put("trigger_id", this.triggerId);
        C0WR6 c0wr6Query = query("pumbaa_app_version");
        if (c0wr6Query == null || (objLIZ = c0wr6Query.LIZ()) == null) {
            objLIZ = "pns-null";
        }
        jSONObject.put("pumbaa_app_version", objLIZ);
        C0WR6 c0wr6Query2 = query("pumbaa_version_code");
        if (c0wr6Query2 == null || (objLIZ2 = c0wr6Query2.LIZ()) == null) {
            objLIZ2 = "pns-null";
        }
        jSONObject.put("pumbaa_version_code", objLIZ2);
        C0WR6 c0wr6Query3 = query("store_region");
        if (c0wr6Query3 == null || (objLIZ3 = c0wr6Query3.LIZ()) == null) {
            objLIZ3 = "pns-null";
        }
        jSONObject.put("store_region", objLIZ3);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (StrategyResult strategyResult : this.storedStrategyResults) {
            JSONObject jSONObject3 = new JSONObject();
            String str = strategyResult.strategyId;
            if (str == null) {
                str = "pns-null";
            }
            jSONObject3.put("strategy_id", str);
            if (executeResult == null || (decisionStatistics = executeResult.statistics) == null) {
                objValueOf2 = "pns-null";
            } else {
                objValueOf2 = Integer.valueOf(decisionStatistics.getVersion());
            }
            jSONObject3.put("strategy_version", objValueOf2.toString());
            if (strategyResult.actions != null && (!r0.isEmpty())) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject3.put("has_action", z2);
            jSONArray.put(jSONObject3);
        }
        this.storedStrategyResults = null;
        if (executeResult != null && (list = executeResult.results) != null) {
            for (StrategyResult strategyResult2 : list) {
                JSONObject jSONObject4 = new JSONObject();
                String str2 = strategyResult2.strategyId;
                if (str2 == null) {
                    str2 = "pns-null";
                }
                jSONObject4.put("strategy_id", str2);
                DecisionStatistics decisionStatistics2 = executeResult.statistics;
                if (decisionStatistics2 == null) {
                    objValueOf = "pns-null";
                } else {
                    objValueOf = Integer.valueOf(decisionStatistics2.getVersion());
                }
                jSONObject4.put("strategy_version", objValueOf.toString());
                if (strategyResult2.actions != null && (!r0.isEmpty())) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject4.put("has_action", z);
                jSONArray.put(jSONObject4);
            }
        }
        jSONObject2.put("strategy_info", jSONArray);
        C823280WRi.LJI("pumbaa_standard_event", jSONObject, null, jSONObject2);
    }

    public final void setEventInitCost$pipeline_release(long j) {
        this.eventInitCost = j;
    }

    public final void setForbiddenActions(Set<String> set) {
        this.forbiddenActions = set;
    }

    public final void setPerformanceNode(C0WSC c0wsc) {
        this.performanceNode = c0wsc;
    }

    public PrivacyEvent(String str, String str2) {
        this.triggerId = str;
        this.triggerBiz = str2;
    }

    public final void addCallSiteInfo(String str, C0WR6 c0wr6) {
        C0WRB c0wrb = this.contextInfo;
        if (c0wrb == null) {
            c0wrb = null;
        }
        c0wrb.LIZ(c0wrb.LIZIZ, str, c0wr6, C823240WRe.LIZ().fieldValidate);
    }

    public final void appendDecisionTrace$pipeline_release(String str, String str2) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.decisionTraceLog;
        if (copyOnWriteArrayList == null) {
            synchronized (this) {
                try {
                    copyOnWriteArrayList = this.decisionTraceLog;
                    if (copyOnWriteArrayList == null) {
                        copyOnWriteArrayList = new CopyOnWriteArrayList();
                        this.decisionTraceLog = copyOnWriteArrayList;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        copyOnWriteArrayList.add(new Object() { // from class: X.0WRZ
            {
                System.nanoTime();
            }
        });
    }

    public static final PrivacyEvent createWithMap(String str, String str2, Map<String, C0WR6> map) {
        Companion.getClass();
        PrivacyEvent privacyEvent = new PrivacyEvent(str, str2);
        privacyEvent.contextInfo = new C0WRB(str2, map);
        return privacyEvent;
    }
}
