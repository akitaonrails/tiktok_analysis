package com.ss.android.ugc.aweme.commercialize.api.auto;

import X.C04TD;
import X.C1003330cDT;
import X.C1022820ciu;
import X.C1388190mED;
import X.C19EG;
import X.C2184171Adz;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.feed.adexperience.AutoAdIntroUtils;
import com.ss.android.ugc.aweme.api.auto.IAutoService;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class IAutoServiceImpl implements IAutoService {
    public static IAutoService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAutoService.class, false);
        if (objLIZ != null) {
            return (IAutoService) objLIZ;
        }
        if (C04TD.LLJJLIIIJLLLLLLLZ == null) {
            synchronized (IAutoService.class) {
                if (C04TD.LLJJLIIIJLLLLLLLZ == null) {
                    C04TD.LLJJLIIIJLLLLLLLZ = new IAutoServiceImpl();
                }
            }
        }
        return C04TD.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.api.auto.IAutoService
    public final void LIZ(Context context, Aweme aweme, C1003330cDT c1003330cDT) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        int size;
        AdDisclaimer disclaimer;
        List<String> list;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || aweme == null) {
            return;
        }
        TuxSheet tuxSheetLIZIZ = AutoAdIntroUtils.LIZLLL().LIZIZ(c1003330cDT.LIZJ, c1003330cDT.LIZ, c1003330cDT.LIZIZ, aweme.getAwemeRawAd(), 2, c1003330cDT.LIZLLL);
        if (tuxSheetLIZIZ != null) {
            tuxSheetLIZIZ.show(supportFragmentManager, "");
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("auto_disclaimer_halfscreen", "refer");
        c1022820ciuLIZLLL.LIZIZ(c1003330cDT.LIZ, "product_id");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (disclaimer = awemeRawAd.getDisclaimer()) != null && (list = disclaimer.pidList) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(size), "product_counts");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(c1003330cDT.LIZIZ), "DisclaimerType");
        c1022820ciuLIZLLL.LJII();
    }
}
