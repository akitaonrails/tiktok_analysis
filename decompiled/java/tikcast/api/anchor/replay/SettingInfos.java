package tikcast.api.anchor.replay;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.FuncData;
import com.bytedance.android.livesdk.chatroom.model.GlipBannerInfo;
import com.bytedance.android.livesdk.chatroom.model.PlaylistReminderInfo;
import java.util.ArrayList;
import java.util.List;
import webcast.data.ExcellentHighLightUser;
import webcast.data.RoomShortVideoStatsWithDate;

/* JADX INFO: loaded from: classes.dex */
public final class SettingInfos {

    @C09CT("amplify_status")
    public int amplifyStatus;

    @C09CT("autopost_living_switch")
    public int autopostLivingSwitch;

    @C09CT("can_strong_reach_autopost_living")
    public boolean canStrongReachAutopostLiving;

    @C09CT("excellent_highlight_user")
    public ExcellentHighLightUser excellentHighlightUser;

    @C09CT("fragment_list_returned")
    public boolean fragmentListReturned;

    @C09CT("fragment_revert_switch")
    public int fragmentRevertSwitch;

    @C09CT("func_data")
    public FuncData funcData;

    @C09CT("glip_banner_info")
    public GlipBannerInfo glipBannerInfo;

    @C09CT("has_posted_last_7d")
    public boolean hasPostedLast7d;

    @C09CT("reminder_info")
    public PlaylistReminderInfo reminderInfo;

    @C09CT("room_short_video_stats_with_date")
    public List<RoomShortVideoStatsWithDate> roomShortVideoStatsWithDate = new ArrayList();

    @C09CT("share_with_fans_club_strong_reach")
    public boolean shareWithFansClubStrongReach;

    @C09CT("share_with_fans_club_switch")
    public int shareWithFansClubSwitch;

    @C09CT("share_with_viewers_switch")
    public int shareWithViewersSwitch;

    @C09CT("show_inbox_sub_pop_up")
    public boolean showInboxSubPopUp;

    @C09CT("support_share_with_fans_club")
    public boolean supportShareWithFansClub;
}
