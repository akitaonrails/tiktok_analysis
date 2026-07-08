package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed;

import X.C2344009Gk;
import X.EnumC700430Rdh;
import X.InterfaceC1756430vo9;
import X.InterfaceC1756810vol;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultCommonFeedDependService implements ICommonFeedDependService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void appendCheckParams(C2344009Gk c2344009Gk, Aweme aweme, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void appendCntParams(C2344009Gk c2344009Gk, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public InterfaceC1756430vo9 createECVideoShrinkAbility(Activity activity) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public Fragment getCurrentFragmnet(Activity activity) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public String getCurrentVideoId(Activity activity) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public InterfaceC1756810vol getFeedPlayerAbility(Activity activity) {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public boolean isUnifyShrinkAbilityEnableFeedParams() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void setComponentClickStatusExperimental(View view, EnumC700430Rdh enumC700430Rdh) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void setDescDialogShowing(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void tryAnchorChangeBackgroundWithRadiusV2(View view, int i) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public void tryUnifyECommerceAnchorBackground(View view) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService
    public Pair<Integer, Integer> getCurrentVideoWidthAndHeight(Activity activity) {
        return new Pair<>(-1, -1);
    }
}
