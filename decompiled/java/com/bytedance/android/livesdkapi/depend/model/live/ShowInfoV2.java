package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShowInfoV2 {

    @C09CT("banner_info")
    public TopFrameBannerInfo bannerInfo;

    @C09CT("current_notify_num")
    public long currentNotifyNum;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("max_notify_num")
    public long maxNotifyNum;

    @C09CT("secondary_page")
    public SecondaryPageInfo secondaryPage;

    @C09CT("show_end_time")
    public long showEndTime;

    @C09CT("show_start_time")
    public long showStartTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("anchors")
    public List<User> anchors = new ArrayList();

    @C09CT("show_introduction")
    public String showIntroduction = "";

    @C09CT("show_display_name")
    public String showDisplayName = "";

    @C09CT("guest_info_list")
    public List<GuestInfo> guestInfoList = new ArrayList();

    @C09CT("music_info_list")
    public List<MusicInfo> musicInfoList = new ArrayList();
}
