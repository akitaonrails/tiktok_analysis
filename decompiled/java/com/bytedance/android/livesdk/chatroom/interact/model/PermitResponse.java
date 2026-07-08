package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PermitResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("action_id")
        public Long actionId;

        @C09CT("channel_id")
        public Long channelId;

        @C09CT("linkmic_id_str")
        public String linkmicIdStr;

        @C09CT("rival_linkmic_id_str")
        public String rivalLinkmicIdStr;

        @C09CT("rtc_ext_info")
        public String rtcExtInfo;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.rtcExtInfo != null) {
                sb.append(", rtc_ext_info=");
                sb.append(this.rtcExtInfo);
            }
            if (this.channelId != null) {
                sb.append(", channel_id=");
                sb.append(this.channelId);
            }
            if (this.linkmicIdStr != null) {
                sb.append(", linkmic_id_str=");
                sb.append(this.linkmicIdStr);
            }
            if (this.actionId != null) {
                sb.append(", action_id=");
                sb.append(this.actionId);
            }
            if (this.rivalLinkmicIdStr != null) {
                sb.append(", rival_linkmic_id_str=");
                sb.append(this.rivalLinkmicIdStr);
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
        sb.replace(0, 2, "PermitResponse{");
        sb.append('}');
        return sb.toString();
    }
}
