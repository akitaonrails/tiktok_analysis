package com.ss.android.ugc.profile.platform.business.navbar.assemble.sub;

import X.C01GW;
import X.C1249430icP;
import X.C13LE;
import X.C452501pT;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavBarEndComponent extends ProfileNavBarBaseComponent {
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(566));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("nav_bar_base_item", C13LE.LIZ(NavbarBaseUIComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Lo() {
        if (this.LLJILLL) {
            ((ArrayList) this.LLJI).add("nav_bar_end_settings");
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent, com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final C1249430icP Sr2() {
        return (C1249430icP) this.LLJL.getValue();
    }
}
