package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class pushGuideInfo {

    @C09CT("close_count_limit")
    public Integer closeCountLimit = 3;

    @C09CT("showup_interval")
    public Integer showupInterval = 15;

    public Integer getCloseCountLimit() {
        return this.closeCountLimit;
    }

    public Integer getShowupInterval() {
        return this.showupInterval;
    }
}
