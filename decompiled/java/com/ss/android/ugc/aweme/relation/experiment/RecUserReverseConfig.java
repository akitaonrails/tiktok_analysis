package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class RecUserReverseConfig {

    @C09CT("pop_up_fyp_0_20_muf")
    public final Boolean disableFYPRecUserPopup;

    @C09CT("inbox_activities")
    public final Boolean disableInboxActivities;

    @C09CT("inbox_first_page")
    public final Boolean disableInboxFirstPage;

    @C09CT("pop_up_notification_page_and_profile")
    public final Boolean disableInboxProfileRecUserPopup;

    @C09CT("others_homepage_suggested_list")
    public final Boolean disableOthersHomePageSuggestedList;

    @C09CT("personal_homepage_following")
    public final Boolean disablePersonalHomePageFollowing;

    @C09CT("personal_homepage_friends")
    public final Boolean disablePersonalHomePageFriends;

    @C09CT("personal_homepage_suggested_list")
    public final Boolean disablePersonalHomePageSuggestedList;

    public RecUserReverseConfig() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    public RecUserReverseConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8) {
        this.disableInboxFirstPage = bool;
        this.disableInboxActivities = bool2;
        this.disableOthersHomePageSuggestedList = bool3;
        this.disablePersonalHomePageSuggestedList = bool4;
        this.disablePersonalHomePageFollowing = bool5;
        this.disablePersonalHomePageFriends = bool6;
        this.disableFYPRecUserPopup = bool7;
        this.disableInboxProfileRecUserPopup = bool8;
    }
}
