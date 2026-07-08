package com.ss.android.ugc.aweme.ad.feed.adexperience;

import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.AutoData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes17.dex */
public interface IAutoAdIntroUtils {
    TuxSheet LIZ(AdDisclaimer adDisclaimer, String str, int i, AwemeRawAd awemeRawAd);

    TuxSheet LIZIZ(AutoData autoData, String str, int i, AwemeRawAd awemeRawAd, int i2, int i3);

    void LIZJ(Context context, String str, String str2, String str3, AwemeRawAd awemeRawAd, boolean z);
}
