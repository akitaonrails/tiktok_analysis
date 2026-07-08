package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import X.C1022820ciu;
import X.C1061730djf;
import X.C1440005kM;
import X.C1548820qPI;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2344009Gk;
import X.C397901gf;
import X.C989800bre;
import X.C996060c1k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPopUpWebPageVM extends AbsAdPopUpWebPageVM {
    public final String vQ2() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Aweme aweme2;
        Aweme aweme3;
        AwemeRawAd awemeRawAd2;
        this.LLILZ = false;
        C1440005kM.LIZ(new C989800bre(false));
        setState(AFwS252S0000000_16.get$arr$(674));
        setState(AFwS252S0000000_16.get$arr$(677));
        String str = C996060c1k.LIZ == 1 ? "slide" : "slide_down";
        VideoItemParams item = getItem();
        AwemeRawAd awemeRawAd3 = null;
        if (item != null && (aweme = item.getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1 && this.LLILLL == 2) {
            VideoItemParams item2 = getItem();
            String str2 = (item2 == null || (aweme3 = item2.getAweme()) == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null || awemeRawAd2.getWebviewPannelStyle() != 1) ? "landing_page" : "close";
            VideoItemParams item3 = getItem();
            if (item3 != null && (aweme2 = item3.getAweme()) != null) {
                awemeRawAd3 = aweme2.getAwemeRawAd();
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", str2, awemeRawAd3);
            String str3 = this.LL;
            if (str3 == null) {
                str3 = str;
            }
            c1022820ciuLIZLLL.LIZJ(str3, "refer");
            c1022820ciuLIZLLL.LJII();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("h5_stay_time", c2344009Gk.LIZ);
        wQ2();
        String str4 = this.LL;
        return str4 != null ? str4 : str;
    }

    public final void wQ2() {
        String webUrl;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
            webUrl = "";
        }
        linkedHashMap.put("url", webUrl);
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        new C1061730djf();
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, C1061730djf.LIZLLL(linkedHashMap), "ad_webview_close"));
    }
}
