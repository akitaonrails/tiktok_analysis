package com.ss.android.ugc.aweme.ad.service;

import X.InterfaceC1054190dXV;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.ad.gp.service.ICommerceGooglePlayService;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageAppInterceptorConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageInterceptServiceImpl implements ILandingPageInterceptService {
    @Override // com.ss.android.ugc.aweme.ad.service.ILandingPageInterceptService
    public final boolean LIZ(Context context, AwemeRawAd awemeRawAd, Uri uri, boolean z, InterfaceC1054190dXV interfaceC1054190dXV) {
        AdStyleActionModel adStyleActionModel;
        LandingPageAppInterceptorConfig landingPageAppInterceptorConfig;
        ICommerceGooglePlayService iCommerceGooglePlayService;
        Uri uriLIZJ;
        if (context == null || awemeRawAd == null || uri == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (landingPageAppInterceptorConfig = adStyleActionModel.landingPageAppInterceptorConfig) == null || !landingPageAppInterceptorConfig.shouldShowGooglePlayMiniCard(z) || (iCommerceGooglePlayService = (ICommerceGooglePlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceGooglePlayService.class, false, false, false, 14, null)) == null || (uriLIZJ = iCommerceGooglePlayService.LIZJ(uri)) == null) {
            return false;
        }
        return iCommerceGooglePlayService.LIZ(context, uriLIZJ.toString(), interfaceC1054190dXV);
    }
}
