package com.ss.android.ugc.aweme.ad.feed.adexperience.event;

import X.C04TD;
import X.C1022820ciu;
import X.C2184171Adz;
import com.ss.android.ugc.aweme.ad.feed.adexperience.IAdSurveyEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes8.dex */
public final class AdSurveyEventLogger implements IAdSurveyEventLogger {
    public String LIZ;

    public static IAdSurveyEventLogger LJ() {
        Object objLIZ = C04TD.LIZ(IAdSurveyEventLogger.class, false);
        if (objLIZ != null) {
            return (IAdSurveyEventLogger) objLIZ;
        }
        if (C04TD.LJLJLLL == null) {
            synchronized (IAdSurveyEventLogger.class) {
                if (C04TD.LJLJLLL == null) {
                    C04TD.LJLJLLL = new AdSurveyEventLogger();
                }
            }
        }
        return C04TD.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAdSurveyEventLogger
    public final void LIZLLL(Aweme aweme, String str) {
        String advId;
        Long adId;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || str == null) {
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "survey_notify", aweme.getAwemeRawAd());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String string = null;
        if (awemeRawAd != null) {
            advId = awemeRawAd.getAdvId();
        } else {
            advId = null;
        }
        c1022820ciuLIZLLL.LIZIZ(advId, "adv_id");
        c1022820ciuLIZLLL.LIZIZ(str, "survey_id");
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
            string = adId.toString();
        }
        c1022820ciuLIZLLL.LIZIZ(string, "adid");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAdSurveyEventLogger
    public final void LIZ(Aweme aweme, String str, String str2) {
        String advId;
        Long adId;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || str == null) {
            return;
        }
        this.LIZ = str2;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "secondary_survey_notify", aweme.getAwemeRawAd());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String string = null;
        if (awemeRawAd != null) {
            advId = awemeRawAd.getAdvId();
        } else {
            advId = null;
        }
        c1022820ciuLIZLLL.LIZIZ(advId, "adv_id");
        c1022820ciuLIZLLL.LIZIZ(str, "survey_id");
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
            string = adId.toString();
        }
        c1022820ciuLIZLLL.LIZIZ(string, "adid");
        c1022820ciuLIZLLL.LIZIZ(str2, "enter_method");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAdSurveyEventLogger
    public final void LIZIZ(Aweme aweme, String str, String str2, String str3, long j) {
        String advId;
        Long adId;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || str == null) {
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "exit_secondary_survey", aweme.getAwemeRawAd());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String string = null;
        if (awemeRawAd != null) {
            advId = awemeRawAd.getAdvId();
        } else {
            advId = null;
        }
        c1022820ciuLIZLLL.LIZIZ(advId, "adv_id");
        c1022820ciuLIZLLL.LIZIZ(str, "survey_id");
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
            string = adId.toString();
        }
        c1022820ciuLIZLLL.LIZIZ(string, "adid");
        c1022820ciuLIZLLL.LIZIZ(str2, "result");
        c1022820ciuLIZLLL.LIZIZ(str3, "exit_method");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "stay_time");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.IAdSurveyEventLogger
    public final void LIZJ(Aweme aweme, String str, String str2, String str3, long j) {
        String advId;
        String string;
        Long adId;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || str == null) {
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "exit_survey", aweme.getAwemeRawAd());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            advId = awemeRawAd.getAdvId();
        } else {
            advId = null;
        }
        c1022820ciuLIZLLL.LIZIZ(advId, "adv_id");
        c1022820ciuLIZLLL.LIZIZ(str, "survey_id");
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
            string = adId.toString();
        } else {
            string = null;
        }
        c1022820ciuLIZLLL.LIZIZ(string, "adid");
        if (str2 == null) {
            str2 = this.LIZ;
        }
        c1022820ciuLIZLLL.LIZIZ(str2, "result");
        c1022820ciuLIZLLL.LIZIZ(str3, "exit_method");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "stay_time");
        c1022820ciuLIZLLL.LJII();
        this.LIZ = null;
    }
}
