package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class Scene implements Serializable {

    @C09CT(com.bytedance.scene.Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("words")
    public final List<Word> words;

    public Scene() {
        this(null, null);
    }

    public Scene(String str, List<Word> list) {
        this.scene = str;
        this.words = list;
    }
}
