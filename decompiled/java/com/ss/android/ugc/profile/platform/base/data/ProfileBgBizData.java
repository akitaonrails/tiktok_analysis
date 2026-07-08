package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBgBizData extends BizBaseData {

    @C09CT("auto_play")
    public Boolean autoPlay;

    @C09CT("need_guide")
    public boolean needGuide;

    @C09CT("profile_bg_info")
    public ProfileBgInfo profileBgInfo;

    public final Boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final boolean getNeedGuide() {
        return this.needGuide;
    }

    public final ProfileBgInfo getProfileBgInfo() {
        return this.profileBgInfo;
    }

    public final void setAutoPlay(Boolean bool) {
        this.autoPlay = bool;
    }

    public final void setNeedGuide(boolean z) {
        this.needGuide = z;
    }

    public final void setProfileBgInfo(ProfileBgInfo profileBgInfo) {
        this.profileBgInfo = profileBgInfo;
    }
}
