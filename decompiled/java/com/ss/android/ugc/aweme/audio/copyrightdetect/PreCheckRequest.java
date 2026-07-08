package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PreCheckRequest {

    @C09CT("creation_id")
    public final String creation_id;

    @C09CT("feature")
    public final String feature;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("scene_list")
    public final List<Integer> sceneList;

    public PreCheckRequest(String str, int i, List<Integer> list, String str2) {
        this.creation_id = str;
        this.scene = i;
        this.sceneList = list;
        this.feature = str2;
    }
}
