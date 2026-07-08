package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes4.dex */
public final class Icon {

    @C09CT("icon_asset_id")
    public final String iconAssetId;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("uri")
    public final String url;

    public Icon(String str, String str2, String str3) {
        this.url = str;
        this.scene = str2;
        this.iconAssetId = str3;
    }
}
