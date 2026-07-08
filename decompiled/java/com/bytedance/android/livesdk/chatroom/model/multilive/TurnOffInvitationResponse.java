package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class TurnOffInvitationResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {
        public final String toString() {
            StringBuilder sb = new StringBuilder();
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
        sb.replace(0, 2, "TurnOffInvitationResponse{");
        sb.append('}');
        return sb.toString();
    }
}
