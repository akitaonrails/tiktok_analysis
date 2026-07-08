package com.ss.android.ugc.aweme.ad.service;

import X.C1035880d3y;
import X.C1038270d7p;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideConfig;
import com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdExternalGuideService {
    boolean LIZ(C1035880d3y c1035880d3y, AdExternalGuideConfig.Format format);

    AdExternalGuideHandlerManager LIZIZ(Context context, AwemeRawAd awemeRawAd);

    C1038270d7p getStatus();
}
