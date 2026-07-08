package com.ss.android.ugc.aweme.ecommerce.dependency.ad;

import X.AbstractC1056160dag;
import X.C04TD;
import X.C1017070cZd;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class AdDependencyService implements IAdDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public String getAdPackageBundleName() {
        ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).getAdPackageBundleName();
        return "ad_commerce";
    }

    public static IAdDependencyService createIAdDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IAdDependencyService.class, z);
        if (objLIZ != null) {
            return (IAdDependencyService) objLIZ;
        }
        if (C04TD.LLZLLLL == null) {
            synchronized (IAdDependencyService.class) {
                if (C04TD.LLZLLLL == null) {
                    C04TD.LLZLLLL = new AdDependencyService();
                }
            }
        }
        return C04TD.LLZLLLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public AwemeRawAd getPseudoAdData(Aweme aweme) {
        return C1017070cZd.LJJIJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public boolean isEcomVideo(Aweme aweme) {
        return C1017070cZd.LJLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public boolean isPseudoAd(Aweme aweme) {
        return C1017070cZd.LLILII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public void getShoppingCoupon(Aweme aweme, Function1<Object, Unit> function1) {
        IFeedAdShoppingService iFeedAdShoppingService = (IFeedAdShoppingService) PluggableExtentionKt.pluggableSpi$default(IFeedAdShoppingService.class, false, false, false, 14, null);
        if (iFeedAdShoppingService != null) {
            iFeedAdShoppingService.getShoppingCoupon(aweme, function1);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public String handleECAnchorSchemaIfNeeded(String str, Aweme aweme) {
        String strHandleECAnchorSchemaIfNeeded;
        IFeedAdShoppingService iFeedAdShoppingService = (IFeedAdShoppingService) PluggableExtentionKt.pluggableSpi$default(IFeedAdShoppingService.class, false, false, false, 14, null);
        if (iFeedAdShoppingService != null && (strHandleECAnchorSchemaIfNeeded = iFeedAdShoppingService.handleECAnchorSchemaIfNeeded(str, aweme)) != null) {
            return strHandleECAnchorSchemaIfNeeded;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public void reportProfilePlpClickEvent(Map<String, ? extends Object> map, AwemeRawAd awemeRawAd) {
        ((IShoppingAdsService) ServiceManager.get().getService(IShoppingAdsService.class)).reportProfilePlpClickEvent(map, awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public AbstractC1056160dag onAdEvent(final String str, final String str2, final CommonAdData commonAdData) {
        return new AbstractC1056160dag() { // from class: X.0d34
            @Override // X.AbstractC1056160dag
            public final void LIZIZ() {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, str2, commonAdData);
                for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
                    c1022820ciuLIZLLL.LIZJ(entry.getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                    c1022820ciuLIZLLL.LIZIZ(entry2.getValue(), (String) entry2.getKey());
                }
                c1022820ciuLIZLLL.LJII();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public boolean openAdWebUrl(Context context, String str, String str2) {
        return ((IMainService) ServiceManager.get().getService(IMainService.class)).openAdWebUrl(context, str, str2);
    }
}
