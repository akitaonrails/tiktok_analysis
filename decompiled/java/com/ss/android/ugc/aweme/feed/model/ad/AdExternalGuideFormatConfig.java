package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdExternalGuideFormatConfig implements Serializable {

    @C09CT("trigger_conditions")
    public final List<AdExternalGuideTriggerCondition> triggerConditions;

    public AdExternalGuideFormatConfig() {
        this(null);
    }

    public final List<AdExternalGuideTriggerCondition> getTriggerConditions() {
        return this.triggerConditions;
    }

    public AdExternalGuideFormatConfig(List<AdExternalGuideTriggerCondition> list) {
        this.triggerConditions = list;
    }
}
