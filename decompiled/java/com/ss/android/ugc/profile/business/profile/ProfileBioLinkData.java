package com.ss.android.ugc.profile.business.profile;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBioLinkData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("profile_links")
    public List<ProfileLinkData> profileLinks;

    public final List<ProfileLinkData> getProfileLinks() {
        return this.profileLinks;
    }

    public final void setProfileLinks(List<ProfileLinkData> list) {
        this.profileLinks = list;
    }
}
