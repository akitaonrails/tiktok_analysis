package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class LevelBadge {

    @C09CT("origin_img")
    public ImageModel originImg;

    @C09CT("preview_img")
    public ImageModel previewImg;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.originImg != null) {
            sb.append(", origin_img=");
            sb.append(this.originImg);
        }
        if (this.previewImg != null) {
            sb.append(", preview_img=");
            sb.append(this.previewImg);
        }
        sb.replace(0, 2, "LevelBadge{");
        sb.append('}');
        return sb.toString();
    }
}
