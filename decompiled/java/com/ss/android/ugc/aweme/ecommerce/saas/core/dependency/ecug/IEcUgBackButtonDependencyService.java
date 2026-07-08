package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes2.dex */
public interface IEcUgBackButtonDependencyService extends IECommerceHostService {
    boolean getInFYP();

    boolean getInMallTab();

    void prepareBackButton(String str, ImageUrlModel imageUrlModel, String str2);

    void releaseBackButton();
}
