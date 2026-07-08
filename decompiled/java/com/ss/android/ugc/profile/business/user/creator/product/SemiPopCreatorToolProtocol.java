package com.ss.android.ugc.profile.business.user.creator.product;

import X.C01GW;
import X.C0PEM;
import X.C1064720doU;
import X.C1250210idf;
import X.C1553780qXI;
import X.C20684815ws;
import X.C2097608Jq;
import X.C344701Vl;
import X.C452501pT;
import X.C948503nH;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.SemiPopProtocol;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SemiPopCreatorToolProtocol extends SemiPopProtocol {
    public AdvancedSemiPopCreatorToolData LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(540));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(541));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "settings_semi_pop_up_creator_studio";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Integer proAccountUpdateNotificationStatus;
        IProfilePlatformVM iProfilePlatformVM;
        String str = "creator_center";
        boolean z = false;
        if (C1553780qXI.LIZ()) {
            C1064720doU.LIZ();
            if (((ISettingService) ServiceManager.get().getService(ISettingService.class)).isStudioInappM10nCenterRevampEnabled() && (iProfilePlatformVM = this.LLIZLLLIL) != null) {
                C948503nH.LJI(iProfilePlatformVM, C0PEM.LIZJ, new C344701Vl(this, null));
            }
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("enter_from", "personal_homepage");
            pairArr[1] = new Pair("enter_method", "click_panel_button");
            SettingsManager.LIZLLL().getClass();
            pairArr[2] = new Pair("cc_opt", String.valueOf(SettingsManager.LJ("cc_optimize_strategy", 0)));
            if (!C1553780qXI.LIZIZ()) {
                str = "creator_tools";
            }
            pairArr[3] = new Pair("button_name", str);
            C20684815ws.LJIILLIIL("enter_creator_center", C2097608Jq.LJIIJ(pairArr));
            SmartRouter.buildRoute(this.LLILZ, "//creatorcenter").open();
            return true;
        }
        String string = UUID.randomUUID().toString();
        Pair[] pairArr2 = new Pair[5];
        pairArr2[0] = new Pair("enter_from", "personal_homepage");
        pairArr2[1] = new Pair("enter_method", "click_panel_button");
        pairArr2[2] = new Pair("process_id", string);
        SettingsManager.LIZLLL().getClass();
        pairArr2[3] = new Pair("cc_opt", String.valueOf(SettingsManager.LJ("cc_optimize_strategy", 0)));
        if (!C1553780qXI.LIZIZ()) {
            str = "creator_tools";
        }
        pairArr2[4] = new Pair("button_name", str);
        C20684815ws.LJIILLIIL("enter_creator_account", C2097608Jq.LJIIJ(pairArr2));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://creatortools");
        smartRouteBuildRoute.withParam("bundle_process_id", string);
        smartRouteBuildRoute.withParam("HAS_PRELOAD", true);
        smartRouteBuildRoute.withParam("PRO_ENTER_FROM", "creator_tools");
        AdvancedSemiPopCreatorToolData advancedSemiPopCreatorToolData = this.LLJL;
        if (advancedSemiPopCreatorToolData != null && (proAccountUpdateNotificationStatus = advancedSemiPopCreatorToolData.getProAccountUpdateNotificationStatus()) != null && ((proAccountUpdateNotificationStatus.intValue() == 1 || proAccountUpdateNotificationStatus.intValue() == 2) && ((ISettingService) ServiceManager.get().getService(ISettingService.class)).isFirstShowBAOrCARedDot())) {
            z = true;
        }
        smartRouteBuildRoute.withParam("bundle_show_account_dialog_when_start", z);
        smartRouteBuildRoute.open();
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.AdvancedFeatureProtocol, com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        n nVar2;
        ProfileComponents profileComponents = this.LLJILJILJ;
        if (profileComponents != null) {
            nVar2 = profileComponents.bizData;
        } else {
            nVar2 = null;
        }
        AdvancedSemiPopCreatorToolData advancedSemiPopCreatorToolData = (AdvancedSemiPopCreatorToolData) C1250210idf.LIZ(String.valueOf(nVar2), AdvancedSemiPopCreatorToolData.class);
        this.LLJL = advancedSemiPopCreatorToolData;
        this.LLJILJIL = advancedSemiPopCreatorToolData;
        this.LLJJJJ = advancedSemiPopCreatorToolData;
    }
}
