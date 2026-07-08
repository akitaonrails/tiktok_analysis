package webcast.data.multi_guest_play;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShowContent {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("show_config")
    public ShowConfig showConfig;

    @C09CT("show_create_time")
    public long showCreateTime;

    @C09CT("show_id")
    public long showId;

    @C09CT("show_status")
    public int showStatus;

    @C09CT("transition_info")
    public TransitionInfo transitionInfo;

    @C09CT("version")
    public long version;

    @C09CT("showing_and_ready_list")
    public List<ShowListUser> showingAndReadyList = new ArrayList();

    @C09CT("finished_list")
    public List<ShowListUser> finishedList = new ArrayList();
}
