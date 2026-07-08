package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class CustomBizInfo implements Serializable {

    @C09CT("aweme_trace")
    public String awemeTrace;

    @C09CT("high_quality_boost_info")
    public HighQualityBoostInfo highQualityBoostInfo;

    @C09CT("high_quality_boost_info_v2")
    public HighQualityBoostInfoV2 highQualityBoostInfoV2;

    @C09CT("delivery_content")
    public List<Scenario> scenarioList;

    public CustomBizInfo() {
        this(null, null, null, null);
    }

    public final void setScenarioList(List<Scenario> list) {
        this.scenarioList = list;
    }

    public CustomBizInfo(String str, List<Scenario> list, HighQualityBoostInfo highQualityBoostInfo, HighQualityBoostInfoV2 highQualityBoostInfoV2) {
        this.awemeTrace = str;
        this.scenarioList = list;
        this.highQualityBoostInfo = highQualityBoostInfo;
        this.highQualityBoostInfoV2 = highQualityBoostInfoV2;
    }
}
