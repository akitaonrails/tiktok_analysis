package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LinkerUpdateUserContent {

    @C09CT("from_user_id")
    public Long fromUserId;

    @C09CT("to_user_id")
    public Long toUserId;

    @C09CT("update_info")
    public Map<String, String> updateInfo;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fromUserId != null) {
            sb.append(", from_user_id=");
            sb.append(this.fromUserId);
        }
        if (this.toUserId != null) {
            sb.append(", to_user_id=");
            sb.append(this.toUserId);
        }
        Map<String, String> map = this.updateInfo;
        if (map != null && !map.isEmpty()) {
            sb.append(", update_info=");
            sb.append(this.updateInfo);
        }
        sb.replace(0, 2, "LinkerUpdateUserContent{");
        sb.append('}');
        return sb.toString();
    }
}
