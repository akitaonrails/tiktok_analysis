package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class WebcastRoomRepostCreateResponse {

    @C09CT("extra")
    public RepostCreateExtra extra;

    public static final class RepostCreateExtra {

        @C09CT("create_code")
        public long createCode;

        @C09CT("now")
        public long now;

        @C09CT("reason")
        public String reason = "";
    }
}
