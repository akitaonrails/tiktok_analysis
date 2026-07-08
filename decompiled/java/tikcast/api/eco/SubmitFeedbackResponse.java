package tikcast.api.eco;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubmitFeedbackResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseData {
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
