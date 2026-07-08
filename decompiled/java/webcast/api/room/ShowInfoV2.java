package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.GuestInfo;
import com.bytedance.android.livesdkapi.depend.model.live.SecondaryPageInfo;
import com.bytedance.android.livesdkapi.depend.model.live.TopFrameBannerInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShowInfoV2 {

    @C09CT("banner_info")
    public TopFrameBannerInfo bannerInfo;

    @C09CT("current_notify_num")
    public long currentNotifyNum;

    @C09CT("max_notify_num")
    public long maxNotifyNum;

    @C09CT("music_info_mode")
    public int musicInfoMode;

    @C09CT("secondary_page")
    public SecondaryPageInfo secondaryPage;

    @C09CT("show_end_time")
    public long showEndTime;

    @C09CT("show_start_time")
    public long showStartTime;

    @C09CT("show_status")
    public int showStatus;

    @C09CT("user_info_mode")
    public int userInfoMode;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("user_detail")
    public List<UserDetailV2> userDetail = new ArrayList();

    @C09CT("show_introduction")
    public String showIntroduction = "";

    @C09CT("show_title")
    public String showTitle = "";

    @C09CT("guest_info")
    public List<GuestInfo> guestInfo = new ArrayList();

    @C09CT("music_info")
    public List<ProgramMusicInfoStruct> musicInfo = new ArrayList();
}
