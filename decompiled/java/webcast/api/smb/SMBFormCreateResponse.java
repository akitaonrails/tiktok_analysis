package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBFormCreateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("audit_status")
        public int auditStatus;

        @C09CT("create_time")
        public long createTime;

        @C09CT("form_id")
        public long formId;
    }
}
