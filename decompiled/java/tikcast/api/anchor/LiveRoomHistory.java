package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveRoomHistory {

    @C09CT("like_cnt")
    public long likeCnt;

    @C09CT("live_history_creator_network")
    public LiveHistoryCreatorNetwork liveHistoryCreatorNetwork;

    @C09CT("type")
    public int type;

    @C09CT("start_time")
    public String startTime = "";

    @C09CT("end_time")
    public String endTime = "";

    @C09CT("title")
    public String title = "";

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("live_highlight_history_post_list")
    public List<LiveHighlightHistory> liveHighlightHistoryPostList = new ArrayList();

    @C09CT("live_highlight_history_list")
    public List<LiveHighlightHistory> liveHighlightHistoryList = new ArrayList();
}
