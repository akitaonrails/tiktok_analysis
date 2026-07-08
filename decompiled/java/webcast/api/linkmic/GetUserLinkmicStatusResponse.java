package webcast.api.linkmic;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GetUserLinkmicStatusResponse {

    @C09CT("data")
    public ResponseData data;

    public static class ResponseData {

        @C09CT("block_reason")
        public int blockReason;

        @C09CT("play_type")
        public int linkmicPlayType;
    }
}
