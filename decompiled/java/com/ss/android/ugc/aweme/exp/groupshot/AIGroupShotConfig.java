package com.ss.android.ugc.aweme.exp.groupshot;

import X.C09CT;
import X.C19990113Jj;
import X.C19990313Jl;
import X.EnumC19990213Jk;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotConfig implements Serializable {

    @C09CT("create_group_banner_max_show_count")
    public final int createGroupBannerMaxShowCount;

    @C09CT("im_group_shot_feature_flag")
    public final boolean enableGroupShot;

    @C09CT("face_detect_parameters")
    public final AIGroupShotFaceDetectParameters faceDetectParameters;

    @C09CT("groupchat_bottom_banner_display_interval")
    public final int groupChatBottomBannerDisplayInterval;

    @C09CT("groupchat_first_unclicked_interval")
    public final int groupChatFirstUnclickedInterval;

    @C09CT("groupchat_permanent_unclick_disable_count")
    public final int groupChatPermanentUnclickDisableCount;

    @C09CT("groupchat_second_unclicked_interval")
    public final int groupChatSecondUnclickedInterval;

    @C09CT("groupchat_third_unclicked_interval")
    public final int groupChatThirdUnclickedInterval;

    @C09CT("invite_friends_group_limit")
    public final int inviteFriendsGroupLimit;

    @C09CT("show_bottom_banner_after_inactive_days")
    public final int showBottomBannerAfterInactiveDays;

    @C09CT("singlechat_bottom_banner_display_interval")
    public final int singleChatBottomBannerDisplayInterval;

    @C09CT("singlechat_first_unclicked_interval")
    public final int singleChatFirstUnclickedInterval;

    @C09CT("singlechat_permanent_unclick_disable_count")
    public final int singleChatPermanentUnclickDisableCount;

    @C09CT("singlechat_second_unclicked_interval")
    public final int singleChatSecondUnclickedInterval;

    @C09CT("singlechat_third_unclicked_interval")
    public final int singleChatThirdUnclickedInterval;

    @C09CT("client_status_mapping_active_time")
    public final long statusMappingActiveTime;

    @C09CT("user_count_active_group_check")
    public final int userCountActiveGroupCheck;

    public AIGroupShotConfig() {
        this(true, new AIGroupShotFaceDetectParameters(null, null, null), C19990113Jj.LJIIIZ(C19990313Jl.LJII(30, EnumC19990213Jk.DAYS)), 3, 5, 3, 20, 14, 14, 21, 30, 5, 14, 14, 21, 30, 5);
    }

    public AIGroupShotConfig(boolean z, AIGroupShotFaceDetectParameters aIGroupShotFaceDetectParameters, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.enableGroupShot = z;
        this.faceDetectParameters = aIGroupShotFaceDetectParameters;
        this.statusMappingActiveTime = j;
        this.inviteFriendsGroupLimit = i;
        this.showBottomBannerAfterInactiveDays = i2;
        this.createGroupBannerMaxShowCount = i3;
        this.userCountActiveGroupCheck = i4;
        this.groupChatBottomBannerDisplayInterval = i5;
        this.groupChatFirstUnclickedInterval = i6;
        this.groupChatSecondUnclickedInterval = i7;
        this.groupChatThirdUnclickedInterval = i8;
        this.groupChatPermanentUnclickDisableCount = i9;
        this.singleChatBottomBannerDisplayInterval = i10;
        this.singleChatFirstUnclickedInterval = i11;
        this.singleChatSecondUnclickedInterval = i12;
        this.singleChatThirdUnclickedInterval = i13;
        this.singleChatPermanentUnclickDisableCount = i14;
    }
}
