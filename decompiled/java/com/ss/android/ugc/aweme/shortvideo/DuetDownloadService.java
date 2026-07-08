package com.ss.android.ugc.aweme.shortvideo;

import X.C15OG;
import X.C2344009Gk;
import android.app.Activity;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionDuetRouterConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class DuetDownloadService implements IDuetDownloadService {
    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LIZ(Activity activity, DuetAndStitchRouterConfig duetAndStitchRouterConfig) {
        boolean z;
        C15OG c15og = new C15OG();
        String str = duetAndStitchRouterConfig.type;
        boolean z2 = true;
        if (str != null && str.equals("use_duet")) {
            z = true;
        } else {
            z = false;
        }
        c15og.LJJI = z;
        String str2 = duetAndStitchRouterConfig.enterMethod;
        if (str2 == null || !str2.equals("duet_and_stitch_jsb")) {
            z2 = false;
        }
        c15og.LJJIFFI = z2;
        c15og.LJJ = duetAndStitchRouterConfig.copy(duetAndStitchRouterConfig.type, duetAndStitchRouterConfig.awemeId, duetAndStitchRouterConfig.anchors, duetAndStitchRouterConfig.enterFrom, "", duetAndStitchRouterConfig.isEcommerce);
        c15og.LIZLLL(duetAndStitchRouterConfig.awemeId, activity, duetAndStitchRouterConfig.enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LIZIZ(String str, String str2) {
        new C15OG();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("entrance_type", "detail_page");
        c2344009Gk.LJFF("action_type", str2);
        c2344009Gk.LIZJ(1, "entrance_clickable");
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi(IExternalService.class);
        if (iExternalService != null) {
            iExternalService.getAVMobService().onEventV3("duet_shoot_entrance", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LJ(Activity activity, MissionDuetRouterConfig missionDuetRouterConfig) {
        C15OG c15og = new C15OG();
        c15og.LJIL = missionDuetRouterConfig;
        c15og.LIZJ(activity, missionDuetRouterConfig.duetAweme, "mission_duet");
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LIZJ(Aweme aweme, String str, String str2) {
        new C15OG();
        C15OG.LJIIJ(aweme, str, str2, null, true);
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LIZLLL(Aweme aweme, String str, String str2) {
        new C15OG();
        C15OG.LIZ(aweme, str, str2, null, true);
    }

    @Override // com.ss.android.ugc.aweme.IDuetDownloadService
    public final void LJFF(Activity activity, String str, Map map, String str2) {
        C15OG c15og = new C15OG();
        c15og.LIZJ = map;
        c15og.LIZLLL(str, activity, str2);
    }
}
