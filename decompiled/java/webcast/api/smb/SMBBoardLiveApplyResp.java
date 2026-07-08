package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class SMBBoardLiveApplyResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("board_id")
        public long boardId;

        @C09CT("room_id")
        public long roomId;
    }
}
