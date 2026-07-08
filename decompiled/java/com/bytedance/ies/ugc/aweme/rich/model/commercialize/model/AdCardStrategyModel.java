package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCardStrategyModel implements Serializable {

    @C09CT("trigger_condition")
    public int triggerCondition;

    public AdCardStrategyModel() {
        this(0);
    }

    public final int getTriggerCondition() {
        return this.triggerCondition;
    }

    public AdCardStrategyModel(int i) {
        this.triggerCondition = i;
    }

    public final void setTriggerCondition(int i) {
        this.triggerCondition = i;
    }
}
