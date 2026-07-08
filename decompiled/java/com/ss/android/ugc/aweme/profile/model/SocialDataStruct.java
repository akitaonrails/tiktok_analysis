package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialDataStruct implements Serializable {

    @C09CT("enable_permission_pop_up")
    public final boolean enablePermissionPopup;

    @C09CT("is_new_follower")
    public boolean isNewFollower;

    @C09CT("is_new_friend")
    public final boolean isNewFriend;

    @C09CT("social_platform_settings")
    public List<SocialPlatformSetting> socialPlatformSettings;

    public final boolean getEnablePermissionPopup() {
        return this.enablePermissionPopup;
    }

    public final List<SocialPlatformSetting> getSocialPlatformSettings() {
        return this.socialPlatformSettings;
    }

    public final boolean isNewFollower() {
        return this.isNewFollower;
    }

    public final boolean isNewFriend() {
        return this.isNewFriend;
    }

    public final void setNewFollower(boolean z) {
        this.isNewFollower = z;
    }

    public final void setSocialPlatformSettings(List<SocialPlatformSetting> list) {
        this.socialPlatformSettings = list;
    }

    public SocialDataStruct(List<SocialPlatformSetting> list, boolean z, boolean z2, boolean z3) {
        this.socialPlatformSettings = list;
        this.enablePermissionPopup = z;
        this.isNewFollower = z2;
        this.isNewFriend = z3;
    }
}
