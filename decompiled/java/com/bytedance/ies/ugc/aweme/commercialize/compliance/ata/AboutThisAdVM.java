package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.C0TPL;
import X.C19EG;
import X.C1BNE;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C312690CNn;
import X.InterfaceC594300NSq;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.InfoModel;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes13.dex */
public final class AboutThisAdVM extends ViewModel {
    public static final /* synthetic */ int LLILLL = 0;
    public final ICommercializeComplianceApi LL;
    public final C2252321DDq LLILLJJLI;

    public AboutThisAdVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LL = C0TPL.LIZ();
        this.LLILLJJLI = C1BNE.LIZ(null);
    }

    public static String vQ2(AwemeRawAd awemeRawAd) {
        String geoId;
        String countryCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        AboutAdInfo aboutThisAd = awemeRawAd.getAboutThisAd();
        String audienceTags = null;
        if (aboutThisAd != null) {
            geoId = aboutThisAd.getGeoId();
        } else {
            geoId = null;
        }
        sbLIZ.append(geoId);
        AboutAdInfo aboutThisAd2 = awemeRawAd.getAboutThisAd();
        if (aboutThisAd2 != null) {
            countryCode = aboutThisAd2.getCountryCode();
        } else {
            countryCode = null;
        }
        sbLIZ.append(countryCode);
        AboutAdInfo aboutThisAd3 = awemeRawAd.getAboutThisAd();
        if (aboutThisAd3 != null) {
            audienceTags = aboutThisAd3.getAudienceTags();
        }
        sbLIZ.append(audienceTags);
        sbLIZ.append(awemeRawAd.getAdvId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void wQ2(final C19EG c19eg, final AwemeRawAd awemeRawAd, final String str) {
        if (C312690CNn.LIZIZ(C312690CNn.LIZ)) {
            return;
        }
        this.LL.getATAInfo(awemeRawAd.getAboutThisAd().getGeoId(), awemeRawAd.getAboutThisAd().getCountryCode(), awemeRawAd.getAboutThisAd().getAudienceTags(), awemeRawAd.getAdvId()).enqueue(new InterfaceC594300NSq<InfoModel>() { // from class: X.0TOZ
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<InfoModel> c0x9s, Throwable th) {
                C0TOX.LIZ(c19eg, awemeRawAd, str, 1, null).show();
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<InfoModel> c0x9s, C0X52<InfoModel> c0x52) {
                if (c0x52 != null && c0x52.LIZJ()) {
                    C0TOX.LIZ(c19eg, awemeRawAd, str, 2, c0x52.LIZIZ).show();
                } else {
                    C0TOX.LIZ(c19eg, awemeRawAd, str, 1, null).show();
                }
            }
        });
    }
}
