package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class GameSubActGetRandUnfinishedAnchorResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor_sec_user_id")
        public String anchorSecUserId = "";

        @C09CT("anchor_user_id")
        public String anchorUserId = "";
    }
}
