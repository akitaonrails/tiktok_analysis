package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class LinkmicUserToastContent {

    @C09CT("display_text")
    public Text displayText;

    @C09CT("leaved_user_id")
    public long leavedUserId;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("user_id")
    public Long userId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.userId != null) {
            sb.append(", user_id=");
            sb.append(this.userId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.displayText != null) {
            sb.append(", display_text=");
            sb.append(this.displayText);
        }
        sb.replace(0, 2, "LinkmicUserToastContent{");
        sb.append('}');
        return sb.toString();
    }
}
