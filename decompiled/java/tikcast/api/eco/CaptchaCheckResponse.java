package tikcast.api.eco;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class CaptchaCheckResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseData {

        @C09CT("captcha_decision")
        public String captchaDecision = "";

        @C09CT("captcha_record_id")
        public long captchaRecordId;

        @C09CT("check_approved")
        public boolean checkApproved;
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
