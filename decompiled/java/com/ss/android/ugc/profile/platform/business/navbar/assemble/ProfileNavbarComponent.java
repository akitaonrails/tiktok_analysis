package com.ss.android.ugc.profile.platform.business.navbar.assemble;

import X.C13LE;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarCenterComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarEndComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarStartComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarComponent extends ProfileNavBarRootComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("nav_bar_start", C13LE.LIZ(ProfileNavBarStartComponent.class), null, 0, false);
        Ho("nav_bar_center", C13LE.LIZ(ProfileNavBarCenterComponent.class), null, 1, false);
        Ho("nav_bar_end", C13LE.LIZ(ProfileNavBarEndComponent.class), null, 2, false);
    }
}
