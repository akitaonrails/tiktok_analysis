package com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchFeedVideoGuideAfterWatchWord {

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("word")
    public final String word;

    public EcSearchFeedVideoGuideAfterWatchWord() {
        this(null, null);
    }

    public EcSearchFeedVideoGuideAfterWatchWord(String str, String str2) {
        this.scene = str;
        this.word = str2;
    }
}
