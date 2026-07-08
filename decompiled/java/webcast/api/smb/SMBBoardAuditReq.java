package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.model.Board;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class SMBBoardAuditReq {

    @C09CT("board")
    public Board board;

    @C09CT("live_room_info")
    public LiveRoomInfo liveRoomInfo;

    @C09CT("render_info")
    public List<BoardRenderInfo> renderInfo = new ArrayList();
}
