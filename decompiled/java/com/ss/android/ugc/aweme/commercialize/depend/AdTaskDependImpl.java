package com.ss.android.ugc.aweme.commercialize.depend;

import X.AbstractC1025070cmX;
import X.C04TD;
import X.C1021860chM;
import X.C1025090cmZ;
import X.C1025720cna;
import X.C1026310coX;
import X.C1026350cob;
import X.C1028090crP;
import X.C1028100crQ;
import X.C19EG;
import X.InterfaceC1036270d4b;
import android.content.Context;
import com.ss.android.ugc.aweme.api.survey.BISurveyServiceImpl;
import com.ss.android.ugc.aweme.api.survey.IBISurveyService;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;

/* JADX INFO: loaded from: classes17.dex */
public final class AdTaskDependImpl implements IAdTaskDepend {
    public static IAdTaskDepend LIZLLL() {
        Object objLIZ = C04TD.LIZ(IAdTaskDepend.class, false);
        if (objLIZ != null) {
            return (IAdTaskDepend) objLIZ;
        }
        if (C04TD.LLLF == null) {
            synchronized (IAdTaskDepend.class) {
                if (C04TD.LLLF == null) {
                    C04TD.LLLF = new AdTaskDependImpl();
                }
            }
        }
        return C04TD.LLLF;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZIZ(Context context, String str) {
        return C1021860chM.LJJJJ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZJ(Context context, Aweme aweme, String str) {
        InterfaceC1036270d4b interfaceC1036270d4bS;
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ServiceManager.get().getService(IAdLandingPagePopUpService.class);
        if (iAdLandingPagePopUpService == null || !(context instanceof C19EG)) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        C1025720cna c1025720cna = new C1025720cna(0.7f, bool, bool, 1, null, -1, -1, null);
        c1025720cna.setDefaultHeightRatio(0.7f);
        c1025720cna.setVariant(1);
        c1025720cna.setHasOverlay(bool);
        c1025720cna.setCancelOnTouchOutside(bool);
        c1025720cna.setDismissedOnBackKeyPressed(false);
        c1025720cna.setHideable(false);
        C1028100crQ c1028100crQ = new C1028100crQ();
        Boolean bool2 = Boolean.TRUE;
        c1028100crQ.setUseSpecifiedUrl(bool2);
        c1028100crQ.setUseWebViewTitle(bool2);
        c1028100crQ.setDisableChangeStatusAndNavBar(true);
        c1028100crQ.setExpandTuxSheetInReuseWhenLoadFinish(true);
        C1026310coX c1026310coX = new C1026310coX(str, aweme.getAwemeRawAd(), C1028090crP.LIZ(aweme, null, 0, C1026350cob.LIZLLL(86), null, null, null, null), false, c1025720cna, c1028100crQ);
        IBISurveyService iBISurveyServiceLIZ = BISurveyServiceImpl.LIZ();
        if (iBISurveyServiceLIZ == null) {
            interfaceC1036270d4bS = null;
        } else {
            interfaceC1036270d4bS = iBISurveyServiceLIZ.s();
        }
        return iAdLandingPagePopUpService.LJIIJ(86, (C19EG) context, interfaceC1036270d4bS, c1026310coX, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZ(Context context, AwemeRawAd awemeRawAd, String str, String str2, int i) {
        C1025090cmZ c1025090cmZ = new C1025090cmZ();
        c1025090cmZ.LIZ = context;
        c1025090cmZ.LIZIZ = awemeRawAd;
        c1025090cmZ.LJFF = str;
        c1025090cmZ.LJI = "";
        c1025090cmZ.LIZ(str2);
        c1025090cmZ.LIZLLL = i;
        return AbstractC1025070cmX.LJIL(c1025090cmZ);
    }
}
