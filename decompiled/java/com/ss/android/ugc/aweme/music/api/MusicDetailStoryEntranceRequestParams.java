package com.ss.android.ugc.aweme.music.api;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailStoryEntranceRequestParams {

    @C09CT("count")
    public final Integer count;

    @C09CT("entity_id")
    public final RequestParamsEntityId entityId;

    @C09CT("entity_type")
    public final Integer entityType;

    @C09CT("from_group_id")
    public final String fromGroupId;

    @C09CT("page_token")
    public final String pageToken;

    @C09CT("recent_viewed_ids")
    public final List<String> recentViewedIds;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("source")
    public final Integer source;

    public MusicDetailStoryEntranceRequestParams(RequestParamsEntityId requestParamsEntityId, Integer num, String str, Integer num2, String str2, String str3, List<String> list, Integer num3) {
        this.entityId = requestParamsEntityId;
        this.entityType = num;
        this.pageToken = str;
        this.count = num2;
        this.scene = str2;
        this.fromGroupId = str3;
        this.recentViewedIds = list;
        this.source = num3;
    }
}
