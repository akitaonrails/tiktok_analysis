package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SurprisePreloadConfig implements Serializable {

    @C09CT("activity_ids")
    public List<Long> activityIds;

    @C09CT("enable_cache")
    public Boolean enableCache;

    @C09CT("surprise_item_type")
    public Integer surpriseItemType;

    public SurprisePreloadConfig() {
    }

    public SurprisePreloadConfig(Integer num, List<Long> list, Boolean bool) {
        this.surpriseItemType = num;
        this.activityIds = list;
        this.enableCache = bool;
    }
}
