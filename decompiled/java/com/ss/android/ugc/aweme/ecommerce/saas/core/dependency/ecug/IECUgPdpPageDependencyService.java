package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import X.InterfaceC2211711BhJ;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IECUgPdpPageDependencyService extends IECommerceHostService {
    String handlePdpShareInfo(String str, String str2, Map<String, Object> map);

    void onPdpFragmentOnCreate(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map, String str);

    void onPdpFragmentOnDestroy(Activity activity, InterfaceC2211711BhJ interfaceC2211711BhJ, boolean z, Map<String, ? extends Object> map);

    void onPdpFragmentRenderCompleted(Activity activity, boolean z, Map<String, ? extends Object> map);

    void onPopupFragmentExpandFull(Activity activity, String str, Map<String, ? extends Object> map, String str2);
}
