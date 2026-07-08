package com.bytedance.pns.engine;

import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class InitStatistics implements Params {
    public int errorCode;
    public String errorMsg;
    public long parseActionCost;
    public long parseConditionCost;
    public long parseConstPoolCost;
    public long parseStrToJsonCost;
    public long parseStrategyCost;
    public long parseStrategyListCost;
    public long parseTriggerCost;
    public long totalCost;
    public int version;

    public final InitStatistics copy(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i2, String str) {
        return new InitStatistics(i, j, j2, j3, j4, j5, j6, j7, j8, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitStatistics)) {
            return false;
        }
        InitStatistics initStatistics = (InitStatistics) obj;
        return this.version == initStatistics.version && this.totalCost == initStatistics.totalCost && this.parseTriggerCost == initStatistics.parseTriggerCost && this.parseStrategyListCost == initStatistics.parseStrategyListCost && this.parseStrategyCost == initStatistics.parseStrategyCost && this.parseActionCost == initStatistics.parseActionCost && this.parseConstPoolCost == initStatistics.parseConstPoolCost && this.parseStrToJsonCost == initStatistics.parseStrToJsonCost && this.parseConditionCost == initStatistics.parseConditionCost && this.errorCode == initStatistics.errorCode && Intrinsics.LJFF(this.errorMsg, initStatistics.errorMsg);
    }

    @Override // com.bytedance.pns.engine.Params
    public JSONObject getExtras() {
        return null;
    }

    public int hashCode() {
        int iY2 = ((((((((((((((((((this.version * 31) + C786410Ut5.Y2(this.totalCost)) * 31) + C786410Ut5.Y2(this.parseTriggerCost)) * 31) + C786410Ut5.Y2(this.parseStrategyListCost)) * 31) + C786410Ut5.Y2(this.parseStrategyCost)) * 31) + C786410Ut5.Y2(this.parseActionCost)) * 31) + C786410Ut5.Y2(this.parseConstPoolCost)) * 31) + C786410Ut5.Y2(this.parseStrToJsonCost)) * 31) + C786410Ut5.Y2(this.parseConditionCost)) * 31) + this.errorCode) * 31;
        String str = this.errorMsg;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InitStatistics(version=" + this.version + ", totalCost=" + this.totalCost + ", parseTriggerCost=" + this.parseTriggerCost + ", parseStrategyListCost=" + this.parseStrategyListCost + ", parseStrategyCost=" + this.parseStrategyCost + ", parseActionCost=" + this.parseActionCost + ", parseConstPoolCost=" + this.parseConstPoolCost + ", parseStrToJsonCost=" + this.parseStrToJsonCost + ", parseConditionCost=" + this.parseConditionCost + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ')';
    }

    public InitStatistics() {
        this(0, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, null);
    }

    @Override // com.bytedance.pns.engine.Params
    public JSONObject getCategory() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("version", Integer.valueOf(this.version));
            jSONObject.putOpt("error_code", Integer.valueOf(this.errorCode));
            jSONObject.putOpt("error_msg", this.errorMsg);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // com.bytedance.pns.engine.Params
    public JSONObject getMetrics() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("cost", Long.valueOf(this.totalCost));
            jSONObject.putOpt("parse_trigger_cost", Long.valueOf(this.parseTriggerCost));
            jSONObject.putOpt("parse_strategy_list_cost", Long.valueOf(this.parseStrategyListCost));
            jSONObject.putOpt("parse_strategy_cost", Long.valueOf(this.parseStrategyCost));
            jSONObject.putOpt("parse_action_cost", Long.valueOf(this.parseActionCost));
            jSONObject.putOpt("parse_const_pool_cost", Long.valueOf(this.parseConstPoolCost));
            jSONObject.putOpt("parse_condition_cost", Long.valueOf(this.parseConditionCost));
            jSONObject.putOpt("parse_str_to_json_cost", Long.valueOf(this.parseStrToJsonCost));
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final long getParseActionCost() {
        return this.parseActionCost;
    }

    public final long getParseConditionCost() {
        return this.parseConditionCost;
    }

    public final long getParseConstPoolCost() {
        return this.parseConstPoolCost;
    }

    public final long getParseStrToJsonCost() {
        return this.parseStrToJsonCost;
    }

    public final long getParseStrategyCost() {
        return this.parseStrategyCost;
    }

    public final long getParseStrategyListCost() {
        return this.parseStrategyListCost;
    }

    public final long getParseTriggerCost() {
        return this.parseTriggerCost;
    }

    public final long getTotalCost() {
        return this.totalCost;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setParseActionCost(long j) {
        this.parseActionCost = j;
    }

    public final void setParseConditionCost(long j) {
        this.parseConditionCost = j;
    }

    public final void setParseConstPoolCost(long j) {
        this.parseConstPoolCost = j;
    }

    public final void setParseStrToJsonCost(long j) {
        this.parseStrToJsonCost = j;
    }

    public final void setParseStrategyCost(long j) {
        this.parseStrategyCost = j;
    }

    public final void setParseStrategyListCost(long j) {
        this.parseStrategyListCost = j;
    }

    public final void setParseTriggerCost(long j) {
        this.parseTriggerCost = j;
    }

    public final void setTotalCost(long j) {
        this.totalCost = j;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public InitStatistics(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i2, String str) {
        this.version = i;
        this.totalCost = j;
        this.parseTriggerCost = j2;
        this.parseStrategyListCost = j3;
        this.parseStrategyCost = j4;
        this.parseActionCost = j5;
        this.parseConstPoolCost = j6;
        this.parseStrToJsonCost = j7;
        this.parseConditionCost = j8;
        this.errorCode = i2;
        this.errorMsg = str;
    }
}
