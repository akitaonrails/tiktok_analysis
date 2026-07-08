package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class BetResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("bet_error")
        public int betError;

        @C09CT("success")
        public boolean success;
    }
}
