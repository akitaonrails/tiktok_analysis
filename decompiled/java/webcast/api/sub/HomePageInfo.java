package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class HomePageInfo {

    @C09CT("anchor_info")
    public User anchorInfo;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("is_quit")
    public boolean isQuit;

    @C09CT("last_active_time_sec")
    public long lastActiveTimeSec;

    @C09CT("live_pv")
    public long livePv;

    @C09CT("member_count")
    public long memberCount;

    @C09CT("offset")
    public long offset;

    @C09CT("room_info")
    public Room roomInfo;

    @C09CT("space_activity_indicator")
    public SpaceActivityIndicator spaceActivityIndicator;

    @C09CT("tip")
    public SpaceTip tip;

    @C09CT("total_count")
    public long totalCount;

    @C09CT("user_info")
    public User userInfo;

    @C09CT("member_list")
    public List<User> memberList = new ArrayList();

    @C09CT("post_list")
    public List<SpacePost> postList = new ArrayList();

    @C09CT("jump_url")
    public String jumpUrl = "";

    @C09CT("mock_post_list")
    public List<SpacePost> mockPostList = new ArrayList();
}
