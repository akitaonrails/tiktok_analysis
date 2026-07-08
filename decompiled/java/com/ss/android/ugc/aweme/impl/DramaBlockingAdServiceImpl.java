package com.ss.android.ugc.aweme.impl;

import X.C1022620cia;
import X.C212349188d;
import X.C2184171Adz;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.api.IDramaBlockingAdProvider;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.DramaBlockingAdModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes32.dex */
public final class DramaBlockingAdServiceImpl implements IDramaBlockingAdProvider {
    @Override // com.ss.android.ugc.aweme.api.IDramaBlockingAdProvider
    public final boolean LIZ(Aweme aweme) {
        AdStyleActionModel adStyleActionModel;
        DramaBlockingAdModel dramaBlockingAdModel;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        boolean z = false;
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (dramaBlockingAdModel = adStyleActionModel.dramaBlockingAdConfig) != null && dramaBlockingAdModel.isBlockType()) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is blocking ad = ");
        sbLIZ.append(z);
        sbLIZ.append(", aid = ");
        sbLIZ.append(aweme.getAid());
        C1022620cia.LJ("DramaBlockingAdImpl", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // com.ss.android.ugc.aweme.api.IDramaBlockingAdProvider
    public final C212349188d LIZIZ(Aweme aweme) {
        AdStyleActionModel adStyleActionModel;
        DramaBlockingAdModel dramaBlockingAdModel;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (dramaBlockingAdModel = adStyleActionModel.dramaBlockingAdConfig) != null) {
            String str = dramaBlockingAdModel.swipeText;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = dramaBlockingAdModel.countDownText;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = dramaBlockingAdModel.finishedText;
            if (str4 != null) {
                str2 = str4;
            }
            int i = dramaBlockingAdModel.dramaBlockTime;
            C212349188d c212349188d = new C212349188d(str, str3, str2, i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("blockingAdConfig[toast = ");
            sbLIZ.append(str);
            sbLIZ.append(", countdownText = ");
            sbLIZ.append(str3);
            sbLIZ.append(", countdownFinishedText = ");
            sbLIZ.append(str2);
            sbLIZ.append(", countdownDuration = ");
            sbLIZ.append(i);
            sbLIZ.append(']');
            C1022620cia.LJ("DramaBlockingAdImpl", C2188811AlT.LIZIZ(sbLIZ));
            return c212349188d;
        }
        C1022620cia.LJ("DramaBlockingAdImpl", "getBlockAdConfig return null");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.IDramaBlockingAdProvider
    public final void LIZLLL(Aweme aweme) {
        C2184171Adz.LIZLLL("draw_ad", "countdown_dismiss", aweme.getAwemeRawAd()).LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCountDownViewDismiss, aid = ");
        sbLIZ.append(aweme.getAid());
        C1022620cia.LJ("DramaBlockingAdImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.api.IDramaBlockingAdProvider
    public final void LJ(Aweme aweme) {
        C2184171Adz.LIZLLL("draw_ad", "countdown_show", aweme.getAwemeRawAd()).LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCountDownViewShow, aid = ");
        sbLIZ.append(aweme.getAid());
        C1022620cia.LJ("DramaBlockingAdImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.api.IDramaBlockingAdProvider
    public final void LIZJ(int i, Aweme aweme) {
        C2184171Adz.LIZLLL("draw_ad", "block_toast_show", aweme.getAwemeRawAd()).LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onToastShow, remainingSeconds = ");
        sbLIZ.append(i);
        sbLIZ.append(", aid = ");
        sbLIZ.append(aweme.getAid());
        C1022620cia.LJ("DramaBlockingAdImpl", C2188811AlT.LIZIZ(sbLIZ));
    }
}
