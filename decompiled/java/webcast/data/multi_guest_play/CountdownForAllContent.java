package webcast.data.multi_guest_play;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownForAllContent {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("end_time")
    public long endTime;

    @C09CT("play_config")
    public CountdownForAllConfig playConfig;

    @C09CT("play_id")
    public long playId;

    @C09CT("play_status")
    public int playStatus;

    @C09CT("play_users")
    public List<CountdownForAllUser> playUsers = new ArrayList();

    @C09CT("room_id")
    public long roomId;

    @C09CT("start_time")
    public long startTime;

    @C09CT("version")
    public long version;
}
