package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes27.dex */
public final class RecommendData {

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("vids")
    public final String vids;

    public RecommendData(String str, String str2, String str3) {
        this.scene = str;
        this.sessionId = str2;
        this.vids = str3;
    }
}
