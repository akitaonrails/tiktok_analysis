package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightSceneRequest implements Serializable {

    @C09CT("biz_groups")
    public final List<Integer> bizGroups;

    @C09CT("count")
    public final long count;

    @C09CT("insert_params")
    public final List<MixRankSkylightInsertParams> insertParams;

    @C09CT("page_control_token")
    public final String pageControlToken;

    @C09CT(Scene.SCENE_SERVICE)
    public final long scene;

    @C09CT("top_count_limit_by_biz")
    public final Map<String, Long> topCountLimitByBiz;

    public MixRankSkylightSceneRequest() {
        this(0L, 0L, null, null, null, null, 63, null);
    }

    public MixRankSkylightSceneRequest(long j, long j2, List<Integer> list, List<MixRankSkylightInsertParams> list2, String str, Map<String, Long> map) {
        this.scene = j;
        this.count = j2;
        this.bizGroups = list;
        this.insertParams = list2;
        this.pageControlToken = str;
        this.topCountLimitByBiz = map;
    }

    public MixRankSkylightSceneRequest(long j, long j2, List list, List list2, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? null : str, (i & 32) == 0 ? map : null);
    }
}
