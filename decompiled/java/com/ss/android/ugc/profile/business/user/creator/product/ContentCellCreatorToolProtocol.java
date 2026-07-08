package com.ss.android.ugc.profile.business.user.creator.product;

import X.C01GW;
import X.C0PEM;
import X.C1064720doU;
import X.C1250210idf;
import X.C1553780qXI;
import X.C20684815ws;
import X.C2097608Jq;
import X.C344601Vk;
import X.C452501pT;
import X.C948503nH;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.CreatorCenterGeckoURLSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ICreatorCenterPreloadService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellCreatorToolProtocol extends ContentCellProtocol {
    public AdvancedSemiPopCreatorToolData LLL;
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(538));
    public final C01GW LLLFF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(539));

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_creator_studio";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        Integer proAccountUpdateNotificationStatus;
        ISettingService iSettingService;
        IProfilePlatformVM iProfilePlatformVM;
        String str = "creator_center";
        boolean z = false;
        if (C1553780qXI.LIZ()) {
            C1064720doU.LIZ();
            ISettingService iSettingService2 = (ISettingService) ServiceManager.get().getService(ISettingService.class);
            if (iSettingService2 != null && iSettingService2.isStudioInappM10nCenterRevampEnabled() && (iProfilePlatformVM = this.LLIZLLLIL) != null) {
                C948503nH.LJI(iProfilePlatformVM, C0PEM.LIZJ, new C344601Vk(this, null));
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
        AdvancedSemiPopCreatorToolData advancedSemiPopCreatorToolData = this.LLL;
        if (advancedSemiPopCreatorToolData != null && (proAccountUpdateNotificationStatus = advancedSemiPopCreatorToolData.getProAccountUpdateNotificationStatus()) != null && ((proAccountUpdateNotificationStatus.intValue() == 1 || proAccountUpdateNotificationStatus.intValue() == 2) && (iSettingService = (ISettingService) ServiceManager.get().getService(ISettingService.class)) != null && iSettingService.isFirstShowBAOrCARedDot())) {
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
        this.LLL = advancedSemiPopCreatorToolData;
        this.LLJILJIL = advancedSemiPopCreatorToolData;
        this.LLJJJJ = advancedSemiPopCreatorToolData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final void LJLJJLL(Map map, boolean z) {
        if (z) {
            if (C1553780qXI.LIZ()) {
                String str = null;
                CreatorCenterGeckoURLSetting.CreatorCenterGeckoJsonModel creatorCenterGeckoJsonModel = (CreatorCenterGeckoURLSetting.CreatorCenterGeckoJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("creator_center_inapp_gecko_channel", CreatorCenterGeckoURLSetting.CreatorCenterGeckoJsonModel.class, null);
                if (creatorCenterGeckoJsonModel != null) {
                    str = creatorCenterGeckoJsonModel.ccGeckoChanel;
                }
                ICreatorCenterPreloadService iCreatorCenterPreloadService = (ICreatorCenterPreloadService) this.LLLF.getValue();
                if (iCreatorCenterPreloadService != null) {
                    iCreatorCenterPreloadService.LIZ(str);
                }
            }
            C20684815ws.LJFF().execute(new Runnable() { // from class: X.0icx
                public static void LIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "setting_panel");
                    c2344009Gk.LJIIIIZZ("button_name", C1553780qXI.LIZIZ() ? "creator_center" : "creator_tools");
                    c2344009Gk.LJIIIIZZ("is_red_dot", CardStruct.IStatusCode.DEFAULT);
                    c2344009Gk.LJIIIIZZ("page_layout", C1553780qXI.LIZ() ? "creator_center" : "creator_tools");
                    C20684815ws.LJIILLIIL("creator_center_entrance_show", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ContentCellCreatorToolProtocol@4bbd.onPageVisibleChange$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ContentCellCreatorToolProtocol@4bbd.onPageVisibleChange$1");
                }
            });
        }
    }
}
