package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleResourceRefreshReq {

    @C09CT("ext")
    public final IMPublicResourceRequestExt ext;

    @C09CT("public_resource_id")
    public final Long resId;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public SingleResourceRefreshReq(int i, Long l, IMPublicResourceRequestExt iMPublicResourceRequestExt) {
        this.scene = i;
        this.resId = l;
        this.ext = iMPublicResourceRequestExt;
    }
}
