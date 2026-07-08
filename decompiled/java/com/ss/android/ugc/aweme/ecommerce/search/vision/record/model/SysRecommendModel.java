package com.ss.android.ugc.aweme.ecommerce.search.vision.record.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class SysRecommendModel {

    @C09CT("code")
    public final String code;

    @C09CT("feed_list")
    public final List<SysRecommendFeedItem> feedList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final int nextCursor;

    @C09CT("request_id")
    public final String requestId;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("sub_scene")
    public final String subScene;

    public SysRecommendModel(List<SysRecommendFeedItem> list, boolean z, int i, String str, String str2, String str3, String str4, String str5) {
        this.feedList = list;
        this.hasMore = z;
        this.nextCursor = i;
        this.requestId = str;
        this.sessionId = str2;
        this.scene = str3;
        this.subScene = str4;
        this.code = str5;
    }
}
