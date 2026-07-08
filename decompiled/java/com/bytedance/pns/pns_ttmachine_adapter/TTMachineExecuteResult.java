package com.bytedance.pns.pns_ttmachine_adapter;

/* JADX INFO: loaded from: classes14.dex */
public class TTMachineExecuteResult {
    public TTMStateExecutionTimeStatistics executionTimeStatistics;
    public String[] policyConfig;
    public Object[] results;
    public String[] signature;
    public String[] strategyName;

    public TTMStateExecutionTimeStatistics getExecutionTimeStatistics() {
        return this.executionTimeStatistics;
    }

    public String[] getPolicyConfig() {
        return this.policyConfig;
    }

    public Object[] getResults() {
        return this.results;
    }

    public String[] getSignature() {
        return this.signature;
    }

    public String[] getStrategyName() {
        return this.strategyName;
    }

    public TTMachineExecuteResult(String[] strArr, String[] strArr2, Object[] objArr) {
        this.strategyName = strArr;
        this.policyConfig = strArr2;
        this.results = objArr;
    }

    public TTMachineExecuteResult(String[] strArr, String[] strArr2, Object[] objArr, TTMStateExecutionTimeStatistics tTMStateExecutionTimeStatistics) {
        this.strategyName = strArr;
        this.policyConfig = strArr2;
        this.results = objArr;
        this.executionTimeStatistics = tTMStateExecutionTimeStatistics;
    }

    public TTMachineExecuteResult(String[] strArr, String[] strArr2, Object[] objArr, TTMStateExecutionTimeStatistics tTMStateExecutionTimeStatistics, String[] strArr3) {
        this.strategyName = strArr;
        this.policyConfig = strArr2;
        this.results = objArr;
        this.executionTimeStatistics = tTMStateExecutionTimeStatistics;
        this.signature = strArr3;
    }
}
