package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyResponse {

    @C09CT("data")
    public LinkReplyResult data;

    @C09CT("extra")
    public ReplyExtra extra;

    public static final class ReplyExtra {

        @C09CT("log_pb")
        public LogPb logPb;

        public static final class LogPb {

            @C09CT("impr_id")
            public String imprId;

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.imprId != null) {
                    sb.append(", impr_id=");
                    sb.append(this.imprId);
                }
                sb.replace(0, 2, "LogPb{");
                sb.append('}');
                return sb.toString();
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.logPb != null) {
                sb.append(", log_pb=");
                sb.append(this.logPb);
            }
            sb.replace(0, 2, "ReplyExtra{");
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
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "ReplyResponse{");
        sb.append('}');
        return sb.toString();
    }
}
