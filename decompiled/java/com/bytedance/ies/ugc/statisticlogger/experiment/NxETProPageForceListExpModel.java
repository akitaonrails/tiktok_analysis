package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class NxETProPageForceListExpModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("url_path_match_regex")
    public final String url_path_match_regex;

    public NxETProPageForceListExpModel() {
        this(false, "incentive_campaign|ug/incentive|pa_fe");
    }

    public NxETProPageForceListExpModel(boolean z, String str) {
        this.enable = z;
        this.url_path_match_regex = str;
    }
}
