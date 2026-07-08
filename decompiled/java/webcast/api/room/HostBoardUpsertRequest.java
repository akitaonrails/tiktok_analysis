package webcast.api.room;

import X.C09CT;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: loaded from: classes18.dex */
public final class HostBoardUpsertRequest {

    @C09CT("action_type")
    public int actionType;

    @C09CT("board")
    public MultiHostBoard board;

    @C09CT("room_id")
    public long roomId;
}
