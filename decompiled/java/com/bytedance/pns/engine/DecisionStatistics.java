package com.bytedance.pns.engine;

import X.C0C40;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class DecisionStatistics implements Params {
    public long coreCostTime;
    public boolean isSync;
    public long jniCostTime;
    public long strategyExecuteCostTime;
    public String strategyListId;
    public long strategySelectCostTime;
    public List<StrategyResult> strategyStats;
    public long totalCostTime;
    public String triggerBiz;
    public String triggerId;
    public int version;

    public DecisionStatistics() {
        this(null, null, null, true, 0, 0L, 0L, 0L, 0L, 0L, null);
    }

    public final DecisionStatistics copy(String str, String str2, String str3, boolean z, int i, long j, long j2, long j3, long j4, long j5, List<StrategyResult> list) {
        return new DecisionStatistics(str, str2, str3, z, i, j, j2, j3, j4, j5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionStatistics)) {
            return false;
        }
        DecisionStatistics decisionStatistics = (DecisionStatistics) obj;
        return Intrinsics.LJFF(this.strategyListId, decisionStatistics.strategyListId) && Intrinsics.LJFF(this.triggerId, decisionStatistics.triggerId) && Intrinsics.LJFF(this.triggerBiz, decisionStatistics.triggerBiz) && this.isSync == decisionStatistics.isSync && this.version == decisionStatistics.version && this.strategySelectCostTime == decisionStatistics.strategySelectCostTime && this.strategyExecuteCostTime == decisionStatistics.strategyExecuteCostTime && this.jniCostTime == decisionStatistics.jniCostTime && this.coreCostTime == decisionStatistics.coreCostTime && this.totalCostTime == decisionStatistics.totalCostTime && Intrinsics.LJFF(this.strategyStats, decisionStatistics.strategyStats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v27 */
    public int hashCode() {
        String str = this.strategyListId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.triggerId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.triggerBiz;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.isSync;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iY2 = (((((((((((((iHashCode3 + r0) * 31) + this.version) * 31) + C786410Ut5.Y2(this.strategySelectCostTime)) * 31) + C786410Ut5.Y2(this.strategyExecuteCostTime)) * 31) + C786410Ut5.Y2(this.jniCostTime)) * 31) + C786410Ut5.Y2(this.coreCostTime)) * 31) + C786410Ut5.Y2(this.totalCostTime)) * 31;
        List<StrategyResult> list = this.strategyStats;
        return iY2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DecisionStatistics(strategyListId=" + this.strategyListId + ", triggerId=" + this.triggerId + ", triggerBiz=" + this.triggerBiz + ", isSync=" + this.isSync + ", version=" + this.version + ", strategySelectCostTime=" + this.strategySelectCostTime + ", strategyExecuteCostTime=" + this.strategyExecuteCostTime + ", jniCostTime=" + this.jniCostTime + ", coreCostTime=" + this.coreCostTime + ", totalCostTime=" + this.totalCostTime + ", strategyStats=" + this.strategyStats + ')';
    }

    @Override // com.bytedance.pns.engine.Params
    public JSONObject getCategory() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("hit_strategy_list_id", this.strategyListId);
            jSONObject.putOpt("trigger_id", this.triggerId);
            jSONObject.putOpt("trigger_biz", this.triggerBiz);
            jSONObject.putOpt("is_sync", Boolean.valueOf(this.isSync));
            jSONObject.putOpt("version", Integer.valueOf(this.version));
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // com.bytedance.pns.engine.Params
    public JSONObject getExtras() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.strategyStats != null) {
                jSONObject.putOpt("strategy_stats", new JSONArray(C0C40.LIZIZ(this.strategyStats)));
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    @Override // com.bytedance.pns.engine.Params
    public JSONObject getMetrics() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("strategy_select_cost", Long.valueOf(this.strategySelectCostTime));
            jSONObject.putOpt("strategy_exec_cost", Long.valueOf(this.strategyExecuteCostTime));
            jSONObject.putOpt("adapter_cost", Long.valueOf(this.jniCostTime));
            jSONObject.putOpt("core_cost", Long.valueOf(this.coreCostTime));
            jSONObject.putOpt("cost", Long.valueOf(this.totalCostTime));
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final long getCoreCostTime() {
        return this.coreCostTime;
    }

    public final long getJniCostTime() {
        return this.jniCostTime;
    }

    public final long getStrategyExecuteCostTime() {
        return this.strategyExecuteCostTime;
    }

    public final String getStrategyListId() {
        return this.strategyListId;
    }

    public final long getStrategySelectCostTime() {
        return this.strategySelectCostTime;
    }

    public final List<StrategyResult> getStrategyStats() {
        return this.strategyStats;
    }

    public final long getTotalCostTime() {
        return this.totalCostTime;
    }

    public final String getTriggerBiz() {
        return this.triggerBiz;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public final void setCoreCostTime(long j) {
        this.coreCostTime = j;
    }

    public final void setJniCostTime(long j) {
        this.jniCostTime = j;
    }

    public final void setStrategyExecuteCostTime(long j) {
        this.strategyExecuteCostTime = j;
    }

    public final void setStrategyListId(String str) {
        this.strategyListId = str;
    }

    public final void setStrategySelectCostTime(long j) {
        this.strategySelectCostTime = j;
    }

    public final void setStrategyStats(List<StrategyResult> list) {
        this.strategyStats = list;
    }

    public final void setSync(boolean z) {
        this.isSync = z;
    }

    public final void setTotalCostTime(long j) {
        this.totalCostTime = j;
    }

    public final void setTriggerBiz(String str) {
        this.triggerBiz = str;
    }

    public final void setTriggerId(String str) {
        this.triggerId = str;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public DecisionStatistics(String str, String str2, String str3, boolean z, int i, long j, long j2, long j3, long j4, long j5, List<StrategyResult> list) {
        this.strategyListId = str;
        this.triggerId = str2;
        this.triggerBiz = str3;
        this.isSync = z;
        this.version = i;
        this.strategySelectCostTime = j;
        this.strategyExecuteCostTime = j2;
        this.jniCostTime = j3;
        this.coreCostTime = j4;
        this.totalCostTime = j5;
        this.strategyStats = list;
    }
}
