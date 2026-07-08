package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.pip;

import X.C1026310coX;
import X.C1035880d3y;
import X.C1035930d43;
import X.C1038600d8M;
import X.C1038610d8N;
import X.C1038620d8O;
import X.C1D21;
import X.C20739116Dl;
import X.C2097908Jt;
import X.InterfaceC1757230vpR;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Size;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.pip.IAdWebPipService;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.IabSmallWindowConfig;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebPipService implements IAdWebPipService {
    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.pip.IAdWebPipService
    public final C1035930d43 LIZIZ(C1035880d3y c1035880d3y, Integer num) {
        AdStyleActionModel adStyleActionModel;
        IabSmallWindowConfig iabSmallWindowConfig;
        Integer num2;
        String type;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (iabSmallWindowConfig = adStyleActionModel.iabSmallWindowConfig) != null && (num2 = iabSmallWindowConfig.smallWindowPosition) != null && num2.intValue() > 0) {
            C1026310coX adlpPopUpModel = c1035880d3y.getAdlpPopUpModel();
            String refer = c1035880d3y.getRefer();
            if (!Intrinsics.LJFF(refer, "homepage_ad_button") && !Intrinsics.LJFF(refer, "draw_ad_slide")) {
                boolean z = true;
                if (adlpPopUpModel == null) {
                    AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        type = awemeRawAd2.getType();
                    } else {
                        type = null;
                    }
                    if (!Intrinsics.LJFF(type, "web") || num == null || num.intValue() == -1) {
                        return null;
                    }
                    if (num.intValue() != 1000) {
                        z = false;
                    }
                    IFeedVideoShrinkService iFeedVideoShrinkService = (IFeedVideoShrinkService) ServiceManager.get().getService(IFeedVideoShrinkService.class);
                    if (z) {
                        if (!iFeedVideoShrinkService.LLLF(refer)) {
                            return null;
                        }
                    } else if (!iFeedVideoShrinkService.LLJZ(num.intValue())) {
                        return null;
                    }
                    return new C1035930d43(0);
                }
                return new C1035930d43(1);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.pip.IAdWebPipService
    public final C1D21 LIZ(Fragment fragment, FrameLayout frameLayout, AwemeRawAd awemeRawAd, C1035880d3y c1035880d3y) {
        int i;
        String refer;
        String awemeAuthorUid;
        AdStyleActionModel adStyleActionModel;
        IabSmallWindowConfig iabSmallWindowConfig;
        Integer num;
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = fragment.getContext();
        int iIntValue = 0;
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            i = displayMetrics.heightPixels;
        } else {
            i = 0;
        }
        Size size = new Size((int) (i * 0.15f), 0);
        IECommerceVideoService iECommerceVideoService = (IECommerceVideoService) PluggableExtentionKt.pluggableSpi$default(IECommerceVideoService.class, false, false, false, 14, null);
        if (iECommerceVideoService == null) {
            return null;
        }
        if (c1035880d3y == null || (refer = c1035880d3y.getRefer()) == null) {
            refer = "";
        }
        if (c1035880d3y == null || (awemeAuthorUid = c1035880d3y.getAwemeAuthorUid()) == null) {
            awemeAuthorUid = "";
        }
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (iabSmallWindowConfig = adStyleActionModel.iabSmallWindowConfig) != null && (num = iabSmallWindowConfig.smallWindowPosition) != null) {
            iIntValue = num.intValue();
        }
        InterfaceC1757230vpR interfaceC1757230vpRLJIIJJI = iECommerceVideoService.LJIIJJI(fragment, frameLayout, new C20739116Dl(refer, "landing_page", "page_feed", awemeAuthorUid, C2097908Jt.LIZJ(new Pair("small_window_position", Integer.valueOf(iIntValue))), true), false, new C1038610d8N(size, new C1038600d8M(true, 2000L), new C1038620d8O(-1, 2)));
        if (interfaceC1757230vpRLJIIJJI == null) {
            return null;
        }
        return new C1D21(interfaceC1757230vpRLJIIJJI, frameLayout, awemeRawAd);
    }
}
