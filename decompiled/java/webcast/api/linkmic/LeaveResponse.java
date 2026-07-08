package webcast.api.linkmic;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("feedback_show_reason")
        public long feedbackShowReason;

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
        sb.replace(0, 2, "LeaveResponse{");
        sb.append('}');
        return sb.toString();
    }
}
