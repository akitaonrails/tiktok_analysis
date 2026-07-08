package com.ss.android.ugc.aweme.detail.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class DetailPageRecreateExperimentSettingModel {

    @C09CT("enable_mem_judge")
    public final boolean enableMemJudge;

    @C09CT("expire_time")
    public final long expireTime;

    @C09CT("max_size")
    public final int maxSize;

    @C09CT("white_list")
    public final String whiteList;

    public DetailPageRecreateExperimentSettingModel() {
        this(2, 300000L, false, "others_homepage,personal_homepage,collection_video");
    }

    public DetailPageRecreateExperimentSettingModel(int i, long j, boolean z, String str) {
        this.maxSize = i;
        this.expireTime = j;
        this.enableMemJudge = z;
        this.whiteList = str;
    }
}
