package webcast.api.linkmic;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class KickOutResponse {

    @C09CT("data")
    public ResponseData data;

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
        sb.replace(0, 2, "KickOutResponse{");
        sb.append('}');
        return sb.toString();
    }
}
