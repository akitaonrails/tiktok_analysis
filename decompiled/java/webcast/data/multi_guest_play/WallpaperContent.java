package webcast.data.multi_guest_play;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperContent {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("play_user_id")
    public long playUserId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("send_timestamp")
    public long sendTimestamp;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("wallpaper_id")
    public long wallpaperId;

    @C09CT("wallpaper_url")
    public String wallpaperUrl = "";

    @C09CT("finished_user_list")
    public List<WallpaperContext> finishedUserList = new ArrayList();

    @C09CT("play_user_list")
    public List<WallpaperContext> playUserList = new ArrayList();
}
