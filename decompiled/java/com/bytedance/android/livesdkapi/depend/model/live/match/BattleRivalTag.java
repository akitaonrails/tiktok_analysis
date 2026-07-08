package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class BattleRivalTag {

    @C09CT("bg_image")
    public ImageModel bgImage;

    @C09CT("content")
    public String content;

    @C09CT("icon_image")
    public ImageModel iconImage;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bgImage != null) {
            sb.append(", bg_image=");
            sb.append(this.bgImage);
        }
        if (this.iconImage != null) {
            sb.append(", icon_image=");
            sb.append(this.iconImage);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        sb.replace(0, 2, "BattleRivalTag{");
        sb.append('}');
        return sb.toString();
    }
}
