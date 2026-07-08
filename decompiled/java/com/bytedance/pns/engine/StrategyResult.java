package com.bytedance.pns.engine;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class StrategyResult {

    @C09CT("hit_actions")
    public List<Action> actions;

    @C09CT("cost")
    public long cost;

    @C09CT("error_msg")
    public String errorMsg;

    @C09CT("execute_node_count")
    public Long executeNodeCount;

    @C09CT("graph_path")
    public String graphPath;

    @C09CT("is_hit_sample")
    public boolean hitSample;

    @C09CT("is_sync")
    public boolean isSync;

    @C09CT("sample_rate")
    public Double sampleRate;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String strategyId;

    @C09CT("name")
    public String strategyName;

    @C09CT("version")
    public String version;

    public StrategyResult() {
        this(null, 0L, null, null, null, null, null, true, 0L, null, false);
    }

    public final Set<String> getActionNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<Action> list = this.actions;
        if (list != null) {
            Iterator<Action> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().name;
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return linkedHashSet;
    }

    @C09CT("is_hit_action")
    public final boolean isHitAction() {
        List<Action> list = this.actions;
        return !(list == null || list.isEmpty());
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public final void setActions(List<Action> list) {
        this.actions = list;
    }

    public final void setCost(long j) {
        this.cost = j;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setExecuteNodeCount(Long l) {
        this.executeNodeCount = l;
    }

    public final void setGraphPath(String str) {
        this.graphPath = str;
    }

    public final void setHitSample(boolean z) {
        this.hitSample = z;
    }

    public final void setSampleRate(Double d) {
        this.sampleRate = d;
    }

    public final void setStrategyId(String str) {
        this.strategyId = str;
    }

    public final void setStrategyName(String str) {
        this.strategyName = str;
    }

    public final void setSync(boolean z) {
        this.isSync = z;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public StrategyResult(String str, Long l, Double d, String str2, String str3, List<Action> list, String str4, boolean z, long j, String str5, boolean z2) {
        this.graphPath = str;
        this.executeNodeCount = l;
        this.sampleRate = d;
        this.strategyId = str2;
        this.strategyName = str3;
        this.actions = list;
        this.errorMsg = str4;
        this.isSync = z;
        this.cost = j;
        this.version = str5;
        this.hitSample = z2;
    }
}
