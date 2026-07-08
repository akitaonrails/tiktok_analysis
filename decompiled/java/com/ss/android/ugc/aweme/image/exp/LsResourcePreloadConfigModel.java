package com.ss.android.ugc.aweme.image.exp;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class LsResourcePreloadConfigModel {

    @C09CT("api")
    public final String api;

    @C09CT("concurrent_num")
    public final int concurrentNum;

    @C09CT("images")
    public final List<LsResourcePreloadItemModel> images;

    @C09CT("instance_id")
    public final String instanceId;

    @C09CT("strategy")
    public final Integer strategy;

    public LsResourcePreloadConfigModel() {
        this(null, null, null, null, 1);
    }

    public LsResourcePreloadConfigModel(String str, String str2, Integer num, List<LsResourcePreloadItemModel> list, int i) {
        this.api = str;
        this.instanceId = str2;
        this.strategy = num;
        this.images = list;
        this.concurrentNum = i;
    }
}
