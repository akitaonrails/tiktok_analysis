package com.ss.android.ugc.profile.platform.business.header.business.info.assemble;

import X.C13LE;
import X.C268330AfP;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.container.ProfileHeaderUserBasicInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container.ProfileHeaderRelationInfoComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container.ProfileHeaderAccountInfoComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderInfoComponent extends ProfileHeaderInfoBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        if (C268330AfP.LJIIJ()) {
            Ho("user_basic_info", C13LE.LIZ(ProfileHeaderUserBasicInfoComponent.class), null, -1, false);
        } else {
            Ho("user_info", C13LE.LIZ(ProfileHeaderAccountInfoComponent.class), null, 0, false);
        }
        Ho("user_relation_info", C13LE.LIZ(ProfileHeaderRelationInfoComponent.class), null, 1, false);
    }
}
