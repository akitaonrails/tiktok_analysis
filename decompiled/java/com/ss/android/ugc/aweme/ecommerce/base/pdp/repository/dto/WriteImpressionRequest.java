package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class WriteImpressionRequest {

    @C09CT("feed_list")
    public final List<Feed> feeds;

    @C09CT("impression_items")
    public final List<Object> impressionItems;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_info")
    public final SessionInfo sessionInfo;

    public WriteImpressionRequest() {
        this(null, null, null, null);
    }

    public WriteImpressionRequest(String str, List<Feed> list, List<Object> list2, SessionInfo sessionInfo) {
        this.scene = str;
        this.feeds = list;
        this.impressionItems = list2;
        this.sessionInfo = sessionInfo;
    }
}
