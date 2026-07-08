package com.ss.android.ugc.aweme.event;

import X.C0CR3;
import X.C10SW;
import X.C1150504el;
import X.C1514430pVp;
import X.C1911410zq7;
import X.C1913090zsp;
import X.C19240310Oz;
import X.C19254610Um;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C807840VmY;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJMobHelper;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class NUJMobHelperImpl implements INUJMobHelper {
    @Override // com.ss.android.ugc.aweme.journey.INUJMobHelper
    public final void LIZJ(C2344009Gk c2344009Gk) {
        int iIntValue;
        Integer numValueOf;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII;
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        int i = 0;
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
        int i2 = !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0;
        IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
        if (iUgCommonService != null && iUgCommonService.LIZIZ()) {
            i = 1;
        }
        c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
        c2344009Gk.LIZJ(iIntValue, "is_hybrid_ab_recv");
        c2344009Gk.LIZJ(zBooleanValue ? 1 : 0, "is_cold_start_first_launch");
        c2344009Gk.LIZJ(i2, "is_did_ready");
        C0CR3.LIZ.getClass();
        c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c2344009Gk.LIZJ(C19254610Um.LIZIZ.LJJIJIIJI(), "is_in_nuj_process");
        C1913090zsp.LIZ.getClass();
        c2344009Gk.LJ(Boolean.valueOf(C1913090zsp.LJ), "feed_status_on_video_show");
        c2344009Gk.LJ(Boolean.valueOf(C1913090zsp.LJI), "is_google_attribution_ready");
        C10SW.LIZ.getClass();
        c2344009Gk.LJFF("is_af_recv", C10SW.LJI.getDesc());
        c2344009Gk.LJFF("is_gg_ads_recv", C10SW.LJFF.getDesc());
        c2344009Gk.LJFF("is_short_link_recv", C10SW.LJII.getDesc());
        c2344009Gk.LJFF("is_long_link_recv", C10SW.LJIIIIZZ.getDesc());
        c2344009Gk.LJFF("has_referrer_link", C10SW.LIZJ());
        c2344009Gk.LJFF("current_nuj_node", C19240310Oz.LIZLLL);
        c2344009Gk.LIZJ(i, "setting_status");
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        if (iNewUserJourneyService != null) {
            numValueOf = Integer.valueOf(iNewUserJourneyService.LJIILLIIL());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "nuj_times");
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJMobHelper
    public final void LIZ(String str, HashMap<String, String> map) {
        if (map.isEmpty()) {
            LIZIZ(new C2344009Gk(), str);
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c2344009Gk.LJFF(entry.getKey(), entry.getValue());
        }
        LIZIZ(c2344009Gk, str);
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJMobHelper
    public final void LIZIZ(C2344009Gk c2344009Gk, String str) {
        LIZJ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventName: ");
        sbLIZ.append(str);
        sbLIZ.append("  params: ");
        sbLIZ.append(map);
        C1911410zq7.LIZ("INUJMobHelper", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL(str, map);
    }
}
