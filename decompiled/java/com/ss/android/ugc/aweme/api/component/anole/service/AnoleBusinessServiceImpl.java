package com.ss.android.ugc.aweme.api.component.anole.service;

import X.C04TD;
import X.C1022820ciu;
import X.C1047660dMy;
import X.C19EG;
import X.C2184171Adz;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.ss.android.ugc.aweme.IAnoleBusinessService;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes11.dex */
public final class AnoleBusinessServiceImpl implements IAnoleBusinessService {
    public static IAnoleBusinessService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IAnoleBusinessService.class, false);
        if (objLIZ != null) {
            return (IAnoleBusinessService) objLIZ;
        }
        if (C04TD.LLFII == null) {
            synchronized (IAnoleBusinessService.class) {
                if (C04TD.LLFII == null) {
                    C04TD.LLFII = new AnoleBusinessServiceImpl();
                }
            }
        }
        return C04TD.LLFII;
    }

    @Override // com.ss.android.ugc.aweme.IAnoleBusinessService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.IAnoleBusinessService
    public final void LIZIZ(Context context, Aweme aweme) {
        C1047660dMy.LIZIZ.a3(context, aweme, "long_press", null, true, null);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleBusinessService
    public final void LIZJ(AwemeRawAd awemeRawAd, C19EG c19eg) {
        Integer contentType;
        Integer contentType2;
        if (c19eg == null) {
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("about_tiktok_ads", "refer");
        c1022820ciuLIZLLL.LIZIZ("long_press", "enter_from");
        c1022820ciuLIZLLL.LJII();
        if (awemeRawAd != null) {
            AboutAdInfo aboutThisAd = awemeRawAd.getAboutThisAd();
            if (aboutThisAd != null && (contentType2 = aboutThisAd.getContentType()) != null && contentType2.intValue() == 1) {
                ((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIIJ(c19eg, awemeRawAd, "long_press");
                return;
            }
            AboutAdInfo aboutThisAd2 = awemeRawAd.getAboutThisAd();
            if (aboutThisAd2 == null || (contentType = aboutThisAd2.getContentType()) == null || contentType.intValue() != 2) {
                return;
            }
            ((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJJIFFI(c19eg, awemeRawAd, "long_press");
        }
    }
}
