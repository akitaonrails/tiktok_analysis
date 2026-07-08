package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AsyncReplayRemuxResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("fail_reason")
        public String failReason = "";

        @C09CT("is_success")
        public boolean isSuccess;
    }
}
