package com.ss.android.ugc.profile.business.profile;

import X.C1248940ibc;
import X.C1251350ifV;
import X.C1253930ijf;
import X.C1558420qem;
import X.C1558520qew;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import X.EnumC1248220iaS;
import android.os.Build;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarOtherBackProtocol extends NavbarPlatformProtocol<BizBaseData> {
    public final EnumC1248220iaS LLJLL = EnumC1248220iaS.OTHER;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_start_back";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        C1248940ibc c1248940ibc;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2 = this.LLJJJJLIIL;
        if (tuxIconView2 != null) {
            C426750GoL.LJIIL(tuxIconView2, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 16);
        }
        if (Build.VERSION.SDK_INT < 26 || (c1248940ibc = this.LLJJJJ) == null || c1248940ibc.LL == null || (tuxIconView = this.LLJJJJLIIL) == null) {
            return;
        }
        tuxIconView.setDefaultFocusHighlightEnabled(false);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return !this.LLJI;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final Integer LJJLJLI() {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248220iaS LJIIZILJ() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        String uid;
        C1251350ifV c1251350ifVYQ2;
        User userVQ2;
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(getContext())) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//duo");
            smartRouteBuildRoute.withParam("duo_type", "duo_back");
            smartRouteBuildRoute.open();
            return false;
        }
        String str = null;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), UserProfileAbility.class, null);
        if (userProfileAbility != null) {
            userProfileAbility.LJIJ();
        }
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null && (userVQ2 = iProfilePlatformVM.vQ2()) != null) {
            uid = userVQ2.getUid();
        } else {
            uid = null;
        }
        String str2 = this.LLJJIJIL;
        IProfilePlatformVM iProfilePlatformVM2 = this.LLIZLLLIL;
        if (iProfilePlatformVM2 != null && (c1251350ifVYQ2 = iProfilePlatformVM2.yQ2()) != null) {
            str = c1251350ifVYQ2.LLJZ;
        }
        c1253930ijf.getClass();
        C1253930ijf.LJJIFFI(uid, str2, str, "click_back_button");
        return false;
    }
}
