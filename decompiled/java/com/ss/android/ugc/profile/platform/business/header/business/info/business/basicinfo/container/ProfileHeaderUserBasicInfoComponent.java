package com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.container;

import X.C13LE;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.assemble.ProfileHeaderAvatarComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container.ProfileHeaderAccountInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container.ProfileUserInfoManageComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderUserBasicInfoComponent extends ProfileHeaderUserBasicInfoContainer {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("header_avatar", C13LE.LIZ(ProfileHeaderAvatarComponent.class), null, -1, false);
        Ho("user_info", C13LE.LIZ(ProfileHeaderAccountInfoComponent.class), null, -1, false);
        Ho("user_info_manage", C13LE.LIZ(ProfileUserInfoManageComponent.class), null, -1, false);
    }
}
