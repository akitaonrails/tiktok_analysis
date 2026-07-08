package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WriteImpressionRequest {

    @C09CT("impression_items")
    public final List<RecommendImpressionItem> impressionItems;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_info")
    public final RecommendSessionInfo sessionInfo;

    public WriteImpressionRequest() {
        this(null, null, null);
    }

    public WriteImpressionRequest(String str, List<RecommendImpressionItem> list, RecommendSessionInfo recommendSessionInfo) {
        this.scene = str;
        this.impressionItems = list;
        this.sessionInfo = recommendSessionInfo;
    }
}
