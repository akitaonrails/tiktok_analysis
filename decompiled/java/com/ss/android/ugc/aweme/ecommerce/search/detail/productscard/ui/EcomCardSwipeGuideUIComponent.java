package com.ss.android.ugc.aweme.ecommerce.search.detail.productscard.ui;

import X.C2189821An6;
import com.ss.android.ugc.aweme.ecommerce.search.detail.shoptab.ui.EcomSearchSwipeGuideUiComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class EcomCardSwipeGuideUIComponent extends EcomSearchSwipeGuideUiComponent {
    public final int LLJJIJI = 2131834562;

    @Override // com.ss.android.ugc.aweme.ecommerce.search.detail.shoptab.ui.EcomSearchSwipeGuideUiComponent
    public final String Go() {
        String searchChannel;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        return (c2189821An6 == null || (searchChannel = c2189821An6.getSearchChannel()) == null) ? "" : searchChannel;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.detail.shoptab.ui.EcomSearchSwipeGuideUiComponent
    public final int Ho() {
        return this.LLJJIJI;
    }
}
