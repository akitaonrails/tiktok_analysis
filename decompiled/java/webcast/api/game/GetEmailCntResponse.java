package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GetEmailCntResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("event_result")
        public String eventResult = "";

        @C09CT("is_find")
        public boolean isFind;
    }
}
