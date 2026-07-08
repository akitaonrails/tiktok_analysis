package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad;

import X.AbstractC1056160dag;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public final class DefaultAdDependencyService implements IAdDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public String getAdPackageBundleName() {
        return "ad_commerce";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public void getShoppingCoupon(Aweme aweme, Function1<Object, Unit> function1) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public String handleECAnchorSchemaIfNeeded(String str, Aweme aweme) {
        return str;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public boolean isPseudoAd(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public boolean openAdWebUrl(Context context, String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public void reportProfilePlpClickEvent(Map<String, ? extends Object> map, AwemeRawAd awemeRawAd) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public AwemeRawAd getPseudoAdData(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            return commerceVideoAuthInfo.getPseudoAdData();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public boolean isEcomVideo(Aweme aweme) {
        throw new RuntimeException("method must be impl");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService
    public AbstractC1056160dag onAdEvent(String str, String str2, CommonAdData commonAdData) {
        return new AbstractC1056160dag() { // from class: X.0daf
            @Override // X.AbstractC1056160dag
            public final void LIZIZ() {
            }
        };
    }
}
