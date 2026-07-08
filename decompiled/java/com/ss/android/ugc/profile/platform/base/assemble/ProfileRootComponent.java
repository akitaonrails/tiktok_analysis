package com.ss.android.ugc.profile.platform.base.assemble;

import X.C1251390ifZ;
import X.C13LE;
import X.C1558520qew;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C1CRB;
import X.C287540BOu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.business.ad.MyProfileADAssem;
import com.ss.android.ugc.profile.business.ad.ad.UserProfileADAssemV2;
import com.ss.android.ugc.profile.business.ad.ad.UserProfileCommerceAssem;
import com.ss.android.ugc.profile.business.profile.loading.UserPageLoadingAssem;
import com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent;
import com.ss.android.ugc.profile.platform.business.header.assemble.ProfileHeaderComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavbarComponent;
import com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssem;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileRootComponent extends ProfileRootBaseComponent {
    public FrameLayout LLJJJIL;
    public TuxNavBar LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public RelativeLayout LLJJJJLIIL;
    public C1CRB LLJJL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        C1251390ifZ c1251390ifZ = C1251390ifZ.LIZ;
        boolean z = this.LLJILLL;
        c1251390ifZ.getClass();
        if (C1251390ifZ.LIZIZ(z)) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileBackgroundComponent.class);
            View viewFindViewById = this.LLJJJIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.bo3) : null;
                this.LLJJJIL = (FrameLayout) viewFindViewById;
            }
            Ho("profile_background", c19719912DlLIZ, viewFindViewById, -1, false);
        }
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.q1()) {
            if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
                Ho("nav_bar", C13LE.LIZ(ProfileNavbarComponent.class), dp(), -1, false);
                Ho("header", C13LE.LIZ(ProfileHeaderComponent.class), ip(), -1, false);
                Ho("profile_tab", C13LE.LIZ(MineAwemePagerAssem.class), hp(), -1, false);
                Ho("profile_ad", C13LE.LIZ(MyProfileADAssem.class), hp(), -1, false);
                return;
            }
            Ho("nav_bar", C13LE.LIZ(ProfileNavbarComponent.class), dp(), -1, false);
            Ho("header", C13LE.LIZ(ProfileHeaderComponent.class), ip(), -1, false);
            Ho("profile_tab", C13LE.LIZ(MineAwemePagerAssem.class), hp(), -1, false);
            Ho("profile_ad", C13LE.LIZ(MyProfileADAssem.class), hp(), -1, false);
            return;
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            Ho("nav_bar", C13LE.LIZ(ProfileNavbarComponent.class), dp(), -1, false);
            Ho("header", C13LE.LIZ(ProfileHeaderComponent.class), ip(), -1, false);
            Ho("profile_tab", C13LE.LIZ(UserAwemePagerAssemV2.class), ep(), -1, true);
            Ho("profile_ad", C13LE.LIZ(UserProfileADAssemV2.class), ep(), -1, true);
            Ho("profile_commerce", C13LE.LIZ(UserProfileCommerceAssem.class), ep(), -1, true);
            if (C287540BOu.LIZ()) {
                Ho("profile_user_loading", C13LE.LIZ(UserPageLoadingAssem.class), ep(), -1, true);
                return;
            }
            return;
        }
        Ho("nav_bar", C13LE.LIZ(ProfileNavbarComponent.class), dp(), -1, false);
        Ho("header", C13LE.LIZ(ProfileHeaderComponent.class), ip(), -1, false);
        Ho("profile_tab", C13LE.LIZ(UserAwemePagerAssemV2.class), ep(), -1, true);
        Ho("profile_ad", C13LE.LIZ(UserProfileADAssemV2.class), ep(), -1, true);
        Ho("profile_commerce", C13LE.LIZ(UserProfileCommerceAssem.class), ep(), -1, true);
        if (C287540BOu.LIZ()) {
            Ho("profile_user_loading", C13LE.LIZ(UserPageLoadingAssem.class), ep(), -1, true);
        }
    }

    public final TuxNavBar dp() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.p15) : null;
            this.LLJJJJ = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final C1CRB ep() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.s5m) : null;
            this.LLJJL = (C1CRB) viewFindViewById;
        }
        return (C1CRB) viewFindViewById;
    }

    public final RelativeLayout hp() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.s5m) : null;
            this.LLJJJJLIIL = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final LinearLayout ip() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.s5p) : null;
            this.LLJJJJJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }
}
