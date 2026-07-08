package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileUser extends BaseResponse {

    @C09CT("common")
    public ProfileCommonInfo common;

    @C09CT("header")
    public ProfileComponents headerComponents;

    @C09CT("legacy")
    public Legacy legacy;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("nav_bar")
    public ProfileComponents navBarComponents;

    @C09CT("profile_background")
    public ProfileComponents profileBackground;

    @C09CT("profile_tab")
    public ProfileComponents tabsComponents;
}
