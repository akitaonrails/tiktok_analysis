package com.ss.android.ugc.ur.longpress;

import X.C09CT;
import X.EnumC1259080iry;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class AwemeRouteDetailPageParams implements Serializable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("check_is_from_live")
    public final boolean checkIsFromLive;

    @C09CT("current_user_live_room_id")
    public final Long currentUserLiveRoomId;

    @C09CT("follow_rec_previous_page")
    public final String followRecPreviousPage;

    @C09CT("is_my_profile")
    public final boolean isMyProfile;

    @C09CT("is_new_suggest")
    public final boolean isNewSuggest;

    @C09CT("live_enter_module")
    public final String liveEnterModule;

    @C09CT("live_feed_enter_from")
    public final String liveFeedEnterFrom;

    @C09CT("live_requested_Id")
    public final String liveRequestId;

    @C09CT("live_room_Id")
    public final String liveRoomId;

    @C09CT("relation_enter_from")
    public final String relationEnterFrom;

    @C09CT("show_follow_button_on_bottom")
    public final boolean showFollowBtnOnBottom;

    @C09CT("source_btm_token")
    public final String sourceBtmToken;

    @C09CT("tab_from")
    public final EnumC1259080iry tabFrom;

    @C09CT("tab_sort_type")
    public final int tabSortType;

    @C09CT("user_id")
    public final String toUserId;

    @C09CT("share_top_user_avatar_info")
    public List<? extends UrlModel> topShareUserAvatarInfo;

    @C09CT("user_rec_type")
    public final String userRecType;

    @C09CT("user_relation_type")
    public final String userRelationType;

    @C09CT("user_name")
    public final String username;

    public AwemeRouteDetailPageParams() {
        this(null, null, EnumC1259080iry.UNKNOWN, null, null, false, false, false, "", "", null, null, null, false, null, null, null, null, null, 0);
    }

    public final boolean isMyProfile() {
        return this.isMyProfile;
    }

    public final boolean isNewSuggest() {
        return this.isNewSuggest;
    }

    public final void setTopShareUserAvatarInfo(List<? extends UrlModel> list) {
        this.topShareUserAvatarInfo = list;
    }

    public AwemeRouteDetailPageParams(String str, List<? extends UrlModel> list, EnumC1259080iry enumC1259080iry, String str2, Aweme aweme, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, boolean z4, String str8, String str9, Long l, String str10, String str11, int i) {
        this.toUserId = str;
        this.topShareUserAvatarInfo = list;
        this.tabFrom = enumC1259080iry;
        this.username = str2;
        this.aweme = aweme;
        this.isMyProfile = z;
        this.showFollowBtnOnBottom = z2;
        this.isNewSuggest = z3;
        this.userRecType = str3;
        this.userRelationType = str4;
        this.relationEnterFrom = str5;
        this.followRecPreviousPage = str6;
        this.sourceBtmToken = str7;
        this.checkIsFromLive = z4;
        this.liveRoomId = str8;
        this.liveRequestId = str9;
        this.currentUserLiveRoomId = l;
        this.liveFeedEnterFrom = str10;
        this.liveEnterModule = str11;
        this.tabSortType = i;
    }
}
