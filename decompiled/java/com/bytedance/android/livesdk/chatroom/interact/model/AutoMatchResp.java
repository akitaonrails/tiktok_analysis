package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AutoMatchResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("avatars")
        public List<ImageModel> avatars;

        @C09CT("session_id")
        public String sessionId = "";

        @C09CT("settings")
        public String settings;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.settings != null) {
                sb.append(", settings=");
                sb.append(this.settings);
            }
            List<ImageModel> list = this.avatars;
            if (list != null && !list.isEmpty()) {
                sb.append(", avatars=");
                sb.append(this.avatars);
            }
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "AutoMatchResp{");
        sb.append('}');
        return sb.toString();
    }
}
