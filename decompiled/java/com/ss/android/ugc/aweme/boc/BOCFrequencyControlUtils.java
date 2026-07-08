package com.ss.android.ugc.aweme.boc;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04Q6;
import X.C0XQ7;
import X.C1322705Fp;
import X.C13LQ;
import X.C1D2M;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import kotlin.jvm.internal.AwS23S1100100_35;

/* JADX INFO: loaded from: classes3.dex */
public final class BOCFrequencyControlUtils implements IBOCFrequencyControlUtils {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1322705Fp());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C04Q6());

    @Override // com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils
    public final void LIZLLL() {
        if (((Boolean) this.LIZIZ.getValue()).booleanValue() && ((IAccountUserService) this.LIZ.getValue()).isLogin()) {
            Keva.getRepo("boc_jump_time").storeLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils
    public final long LJ() {
        return Keva.getRepo("boc_jump_time").getLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), 0L);
    }

    @Override // com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils
    public final boolean LJFF(AwemeRawAd awemeRawAd, String str) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check should open boc, bocFrequencySettings=");
        sbLIZ.append(((Boolean) this.LIZIZ.getValue()).booleanValue());
        sbLIZ.append(", userService.isLogin=");
        sbLIZ.append(((IAccountUserService) this.LIZ.getValue()).isLogin());
        sbLIZ.append(", open_system_browser=");
        if (awemeRawAd != null) {
            boolValueOf = Boolean.valueOf(awemeRawAd.isOpenSystemBrowser());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", lpRefer=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!((Boolean) this.LIZIZ.getValue()).booleanValue() || !((IAccountUserService) this.LIZ.getValue()).isLogin() || awemeRawAd == null || C13LQ.LJLIIL(new String[]{"draw_ad_slide", "draw_ad_name", "draw_ad_photo"}).contains(str) || awemeRawAd.getBoc3pCookieAction() != 1) {
            return false;
        }
        long jLJ = LJ();
        if ((awemeRawAd.getBocIntervalSeconds() * 1000) + jLJ <= System.currentTimeMillis()) {
            new AdWebEventLogger().logAd(C1D2M.LIZ, awemeRawAd, new AwS23S1100100_35(jLJ, awemeRawAd, str, 0));
            return true;
        }
        return false;
    }
}
