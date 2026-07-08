package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IEcUgPopupDependencyService extends IECommerceHostService {
    void checkPageSourceInfo(String str);

    Boolean isFromEcUg(Map<String, ? extends Object> map);

    Boolean isFromEcUgVSA(Map<String, ? extends Object> map);
}
