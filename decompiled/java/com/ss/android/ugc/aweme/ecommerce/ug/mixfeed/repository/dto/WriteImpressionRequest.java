package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class WriteImpressionRequest {

    @C09CT("feed_list")
    public final List<Feed> feedList;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_info")
    public final SessionInfo sessionInfo;

    @C09CT("sub_scene")
    public final String subScene;

    public WriteImpressionRequest() {
        this(null, null, null, null);
    }

    public WriteImpressionRequest(String str, String str2, List<Feed> list, SessionInfo sessionInfo) {
        this.scene = str;
        this.subScene = str2;
        this.feedList = list;
        this.sessionInfo = sessionInfo;
    }
}
