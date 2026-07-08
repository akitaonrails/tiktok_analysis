package com.bytedance.pns.engine;

import X.C08CX;
import X.C13BV;
import X.C13LP;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class ExecuteResult {
    public List<String> allowStrategies;
    public List<String> blockStrategies;
    public String errorMsg;
    public Set<String> forbiddenActions;
    public List<StrategyResult> results;
    public DecisionStatistics statistics;
    public String triggerId;

    public ExecuteResult() {
        this(null, null, null, null, null, null, null);
    }

    public final void setAllowStrategies(List<String> list) {
        this.allowStrategies = list;
    }

    public final void setBlockStrategies(List<String> list) {
        this.blockStrategies = list;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setForbiddenActions(Set<String> set) {
        this.forbiddenActions = set;
    }

    public final void setResults(List<StrategyResult> list) {
        this.results = list;
    }

    public final void setStatistics(DecisionStatistics decisionStatistics) {
        this.statistics = decisionStatistics;
    }

    public final void setTriggerId(String str) {
        this.triggerId = str;
    }

    public final void merge(ExecuteResult executeResult, boolean z) {
        List<StrategyResult> list;
        List<StrategyResult> listLJLIL;
        if (executeResult != null && (list = executeResult.results) != null && !list.isEmpty()) {
            if (z) {
                Collection collection = executeResult.results;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                Iterable iterable = this.results;
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                listLJLIL = C13LP.LJLIL(iterable, collection);
            } else {
                Collection collection2 = this.results;
                if (collection2 == null) {
                    collection2 = C13BV.INSTANCE;
                }
                Iterable iterable2 = executeResult.results;
                if (iterable2 == null) {
                    iterable2 = C13BV.INSTANCE;
                }
                listLJLIL = C13LP.LJLIL(iterable2, collection2);
            }
            this.results = listLJLIL;
            Collection collection3 = this.blockStrategies;
            if (collection3 == null) {
                collection3 = C13BV.INSTANCE;
            }
            Iterable iterable3 = executeResult.blockStrategies;
            if (iterable3 == null) {
                iterable3 = C13BV.INSTANCE;
            }
            this.blockStrategies = C13LP.LJLIL(iterable3, collection3);
            Collection collection4 = this.allowStrategies;
            if (collection4 == null) {
                collection4 = C13BV.INSTANCE;
            }
            Iterable iterable4 = executeResult.allowStrategies;
            if (iterable4 == null) {
                iterable4 = C13BV.INSTANCE;
            }
            this.allowStrategies = C13LP.LJLIL(iterable4, collection4);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Collection collection5 = this.forbiddenActions;
            if (collection5 == null) {
                collection5 = C08CX.INSTANCE;
            }
            linkedHashSet.addAll(collection5);
            Collection collection6 = executeResult.forbiddenActions;
            if (collection6 == null) {
                collection6 = C08CX.INSTANCE;
            }
            linkedHashSet.addAll(collection6);
            if (!(!linkedHashSet.isEmpty())) {
                linkedHashSet = null;
            }
            this.forbiddenActions = linkedHashSet;
        }
    }

    public ExecuteResult(String str, DecisionStatistics decisionStatistics, String str2, List<StrategyResult> list, List<String> list2, List<String> list3, Set<String> set) {
        this.errorMsg = str;
        this.statistics = decisionStatistics;
        this.triggerId = str2;
        this.results = list;
        this.blockStrategies = list2;
        this.allowStrategies = list3;
        this.forbiddenActions = set;
    }
}
