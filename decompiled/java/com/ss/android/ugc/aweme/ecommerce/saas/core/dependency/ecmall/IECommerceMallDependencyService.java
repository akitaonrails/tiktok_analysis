package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall;

import X.C1770080wAA;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes27.dex */
public interface IECommerceMallDependencyService extends IECommerceHostService {
    boolean hitTopTabExpExperiment();

    void onAnchorPanelClose(C1770080wAA c1770080wAA);

    void onAnchorPanelOpen(C1770080wAA c1770080wAA);

    void onEcOrderSubmit();

    Boolean shouldShowMall2TabOrTopTab();

    boolean shouldShowMallTab();

    boolean shouldShowMallTopTab();
}
