package com.ss.android.ugc.profile.business.profile.menu.data;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileMenuData extends BaseResponse {

    @C09CT("bottom")
    public ProfileComponents bottomComponents;

    @C09CT("content_section")
    public ProfileComponents contentSectionComponents;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("nav_bar")
    public ProfileComponents navBarComponents;
}
