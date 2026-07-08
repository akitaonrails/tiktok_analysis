package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C316420Cam;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionRecommendQueryRequest implements Serializable {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("mention_type")
    public final long mentionType;

    @C09CT("pagination")
    public final String pagination;

    @C09CT(Scene.SCENE_SERVICE)
    public final long scene;

    public MentionRecommendQueryRequest() {
        this(0L, C316420Cam.LIZIZ(false), null, 0L);
    }

    public MentionRecommendQueryRequest(long j, String str, String str2, long j2) {
        this.mentionType = j;
        this.pagination = str;
        this.awemeId = str2;
        this.scene = j2;
    }
}
