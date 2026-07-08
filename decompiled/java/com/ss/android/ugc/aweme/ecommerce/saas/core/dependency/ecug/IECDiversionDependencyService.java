package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IECDiversionDependencyService extends IECommerceHostService {
    void onPopupFragmentOnCreate(Activity activity, String str, Map<String, ? extends Object> map, String str2, String str3);

    void onPopupFragmentOnDestroy(Activity activity, Map<String, ? extends Object> map);

    void onPopupFragmentRenderCompleted(Activity activity, Map<String, ? extends Object> map);
}
