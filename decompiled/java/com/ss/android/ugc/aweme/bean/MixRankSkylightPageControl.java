package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightPageControl implements Serializable {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("is_demotioned")
    public final boolean isDemotion;

    @C09CT("page_control_token")
    public final String pageControlToken;

    @C09CT("scene_entity_ids")
    public final List<String> sceneEntityIds;

    @C09CT("total_count")
    public final long totalCount;

    @C09CT("total_count_by_biz")
    public final Map<String, Long> totalCountByBiz;

    public MixRankSkylightPageControl() {
        this(null, false, 0L, false, null, null, 63, null);
    }

    public final MixRankSkylightPageControl copy(List<String> list, boolean z, long j, boolean z2, String str, Map<String, Long> map) {
        return new MixRankSkylightPageControl(list, z, j, z2, str, map);
    }

    public final boolean isDemotion() {
        return this.isDemotion;
    }

    public MixRankSkylightPageControl(List<String> list, boolean z, long j, boolean z2, String str, Map<String, Long> map) {
        this.sceneEntityIds = list;
        this.hasMore = z;
        this.totalCount = j;
        this.isDemotion = z2;
        this.pageControlToken = str;
        this.totalCountByBiz = map;
    }

    public MixRankSkylightPageControl(List list, boolean z, long j, boolean z2, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? null : str, (i & 32) != 0 ? C2097608Jq.LJ() : map);
    }
}
