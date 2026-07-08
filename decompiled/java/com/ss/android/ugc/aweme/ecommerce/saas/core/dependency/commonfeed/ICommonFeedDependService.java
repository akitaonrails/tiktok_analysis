package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed;

import X.C2344009Gk;
import X.EnumC700430Rdh;
import X.InterfaceC1756430vo9;
import X.InterfaceC1756810vol;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public interface ICommonFeedDependService extends IECommerceHostService {
    void appendCheckParams(C2344009Gk c2344009Gk, Aweme aweme, String str, boolean z);

    void appendCntParams(C2344009Gk c2344009Gk, Aweme aweme);

    InterfaceC1756430vo9 createECVideoShrinkAbility(Activity activity);

    Fragment getCurrentFragmnet(Activity activity);

    String getCurrentVideoId(Activity activity);

    Pair<Integer, Integer> getCurrentVideoWidthAndHeight(Activity activity);

    InterfaceC1756810vol getFeedPlayerAbility(Activity activity);

    boolean isUnifyShrinkAbilityEnableFeedParams();

    void setComponentClickStatusExperimental(View view, EnumC700430Rdh enumC700430Rdh);

    void setDescDialogShowing(boolean z);

    void tryAnchorChangeBackgroundWithRadiusV2(View view, int i);

    void tryUnifyECommerceAnchorBackground(View view);
}
