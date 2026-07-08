package webcast.api.linkmic;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ApplyExtra {

        @C09CT("log_pb")
        public LogPb logPb;

        public static final class LogPb {

            @C09CT("client_log_id")
            public String clientLogId = "";
        }
    }

    public static final class ResponseData {

        @C09CT("action_id")
        public Long actionId;

        @C09CT("channel_id")
        public Long channelId;

        @C09CT("extra")
        public ApplyExtra extra;

        @C09CT("linkmic_id_str")
        public String linkMicIdStr;

        @C09CT("perception_message")
        public PerceptionMessage perceptionMessage;

        @C09CT("perception_status")
        public int perceptionStatus;

        @C09CT("rivals_linkmic_id_str")
        public String rivalsLinkMicIdStr;

        @C09CT("rtc_ext_info")
        public String rtcExtInfo;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.actionId != null) {
                sb.append(", action_id=");
                sb.append(this.actionId);
            }
            if (this.channelId != null) {
                sb.append(", channel_id=");
                sb.append(this.channelId);
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
        sb.replace(0, 2, "ApplyResponse{");
        sb.append('}');
        return sb.toString();
    }
}
