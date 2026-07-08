package com.ss.android.ugc.aweme.education;

import X.C01GW;
import X.C0AA5;
import X.C0TGX;
import X.C20515215Pi;
import X.C2238051Cih;
import X.C2238081Cik;
import X.C452501pT;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IEducationOutreachBannerService;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class EducationOutreachProfileBannerHelper implements IEducationOutreachBannerService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(51));

    @Override // com.ss.android.ugc.aweme.IEducationOutreachBannerService
    public final boolean LIZ() {
        C2238081Cik c2238081Cik = (C2238081Cik) this.LIZ.getValue();
        if (c2238081Cik.LIZ.getLong("last_show_time", 0L) + 2419200000L < System.currentTimeMillis()) {
            c2238081Cik.LIZ.storeInt("show_count", 0);
            c2238081Cik.LIZ.storeBoolean("is_click_quit", false);
        }
        return ((Number) C0AA5.LIZ.getValue()).intValue() == 1 && c2238081Cik.LIZ.getInt("show_count", 0) < 3 && !c2238081Cik.LIZ.getBoolean("is_click_quit", false) && c2238081Cik.LIZ.getLong("last_show_time", 0L) + 86400000 < System.currentTimeMillis() && c2238081Cik.LIZ.getLong("last_click_close_time", 0L) + 4838400000L < System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.IEducationOutreachBannerService
    public final void LIZIZ(C0TGX c0tgx, C20515215Pi c20515215Pi) {
        PopupManager.LJIJI(new C2238051Cih(c0tgx, c20515215Pi, (C2238081Cik) this.LIZ.getValue()), true);
    }
}
