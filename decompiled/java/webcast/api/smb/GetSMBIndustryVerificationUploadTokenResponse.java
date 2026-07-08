package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GetSMBIndustryVerificationUploadTokenResponse {

    @C09CT("data")
    public Data data;

    /* JADX INFO: loaded from: classes31.dex */
    public static final class Data {

        @C09CT("expired_time")
        public long expiredTime;

        @C09CT("access_key_id")
        public String accessKeyId = "";

        @C09CT("secret_access_key")
        public String secretAccessKey = "";

        @C09CT("session_token")
        public String sessionToken = "";

        @C09CT("service_id")
        public String serviceId = "";

        @C09CT("upload_host")
        public String uploadHost = "";
    }
}
