package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class PublicAreaCommon {

    @C09CT("user_consume_in_room")
    public Long userConsumeInRoom;

    @C09CT("user_label")
    public ImageModel userLabel;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.userLabel != null) {
            sb.append(", user_label=");
            sb.append(this.userLabel);
        }
        if (this.userConsumeInRoom != null) {
            sb.append(", user_consume_in_room=");
            sb.append(this.userConsumeInRoom);
        }
        sb.replace(0, 2, "PublicAreaCommon{");
        sb.append('}');
        return sb.toString();
    }
}
