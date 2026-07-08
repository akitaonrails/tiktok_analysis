package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class SearchBar {

    @C09CT("bg_image")
    public ImageModel bgImage;

    @C09CT("content")
    public String content;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bgImage != null) {
            sb.append(", bg_image=");
            sb.append(this.bgImage);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        sb.replace(0, 2, "SearchBar{");
        sb.append('}');
        return sb.toString();
    }
}
