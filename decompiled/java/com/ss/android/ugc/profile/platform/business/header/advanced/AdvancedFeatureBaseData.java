package com.ss.android.ugc.profile.platform.business.header.advanced;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public class AdvancedFeatureBaseData extends BizBaseData {

    @C09CT("feature_id")
    public Integer featureId;

    @C09CT("data_record_type")
    public Integer recordType;

    @C09CT("tool_tips_text")
    public String tooltipsText;

    public final Integer getFeatureId() {
        return this.featureId;
    }

    public final Integer getRecordType() {
        return this.recordType;
    }

    public final String getTooltipsText() {
        return this.tooltipsText;
    }

    public final void setFeatureId(Integer num) {
        this.featureId = num;
    }

    public final void setRecordType(Integer num) {
        this.recordType = num;
    }

    public final void setTooltipsText(String str) {
        this.tooltipsText = str;
    }
}
