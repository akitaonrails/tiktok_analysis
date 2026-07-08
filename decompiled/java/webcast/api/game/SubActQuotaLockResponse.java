package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubActQuotaLockResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("quota_left")
        public long quotaLeft;

        @C09CT("success")
        public boolean success;
    }
}
