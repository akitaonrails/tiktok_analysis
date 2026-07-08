package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad;

import X.AbstractC1056160dag;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public interface IAdDependencyService extends IECommerceHostService {
    String getAdPackageBundleName();

    AwemeRawAd getPseudoAdData(Aweme aweme);

    void getShoppingCoupon(Aweme aweme, Function1<Object, Unit> function1);

    String handleECAnchorSchemaIfNeeded(String str, Aweme aweme);

    boolean isEcomVideo(Aweme aweme);

    boolean isPseudoAd(Aweme aweme);

    AbstractC1056160dag onAdEvent(String str, String str2, CommonAdData commonAdData);

    boolean openAdWebUrl(Context context, String str, String str2);

    void reportProfilePlpClickEvent(Map<String, ? extends Object> map, AwemeRawAd awemeRawAd);
}
