package webcast.api.game_station;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GameRegisterResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_success")
        public boolean isSuccess;

        @C09CT("referrer")
        public String referrer = "";
    }
}
