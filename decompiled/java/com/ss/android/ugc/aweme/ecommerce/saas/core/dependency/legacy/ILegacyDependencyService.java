package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy;

import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes29.dex */
public interface ILegacyDependencyService extends IECommerceHostService {
    String getUserResidence();

    Aweme parseAwemeJSONStr(String str);
}
