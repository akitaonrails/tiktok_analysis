package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class WebcastRoomRepostNoteCreateResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("create_code")
        public long createCode;

        @C09CT("now")
        public long now;

        @C09CT("reason")
        public String reason = "";
    }
}
