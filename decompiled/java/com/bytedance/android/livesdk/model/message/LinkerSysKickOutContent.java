package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkerSysKickOutContent {

    @C09CT("linkmic_id_str")
    public String linkmicIdStr;

    @C09CT("user_id")
    public Long userId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.userId != null) {
            sb.append(", user_id=");
            sb.append(this.userId);
        }
        if (this.linkmicIdStr != null) {
            sb.append(", linkmic_id_str=");
            sb.append(this.linkmicIdStr);
        }
        sb.replace(0, 2, "LinkerSysKickOutContent{");
        sb.append('}');
        return sb.toString();
    }
}
