package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class RecommendationResponse {

    @C09CT("results")
    public final List<TopicGroup> results;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public RecommendationResponse() {
        this(null, null);
    }

    public RecommendationResponse(List<TopicGroup> list, Integer num) {
        this.results = list;
        this.scene = num;
    }
}
