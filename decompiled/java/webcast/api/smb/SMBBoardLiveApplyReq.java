package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBBoardLiveApplyReq {

    @C09CT("action")
    public int action;

    @C09CT("board_id")
    public long boardId;

    @C09CT("item_list")
    public List<SMBBoardLiveApplyItem> itemList = new ArrayList();

    @C09CT("room_id")
    public long roomId;
}
