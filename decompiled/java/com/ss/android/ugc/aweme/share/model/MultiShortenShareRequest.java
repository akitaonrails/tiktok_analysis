package com.ss.android.ugc.aweme.share.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiShortenShareRequest {

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("share_urls")
    public final List<ShareURLInfo> shareUrlInfos;

    public MultiShortenShareRequest(int i, List<ShareURLInfo> list) {
        this.scene = i;
        this.shareUrlInfos = list;
    }
}
