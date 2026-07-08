package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class OriginBadgeInfo {

    @C09CT("description")
    public String description;

    @C09CT("origin_img")
    public ImageModel originImg;

    @C09CT("sub_level")
    public Integer subLevel;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.subLevel != null) {
            sb.append(", sub_level=");
            sb.append(this.subLevel);
        }
        if (this.originImg != null) {
            sb.append(", origin_img=");
            sb.append(this.originImg);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        sb.replace(0, 2, "OriginBadgeInfo{");
        sb.append('}');
        return sb.toString();
    }
}
