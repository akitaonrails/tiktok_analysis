package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class UpsertBoardResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("board_id")
        public long boardId;

        @C09CT("board_status")
        public int boardStatus;
    }
}
