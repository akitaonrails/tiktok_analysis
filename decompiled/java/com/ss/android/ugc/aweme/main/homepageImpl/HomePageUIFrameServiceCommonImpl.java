package com.ss.android.ugc.aweme.main.homepageImpl;

import X.AbstractC1583710rJZ;
import X.C0XQ7;
import X.C1440005kM;
import X.C1590400rUM;
import X.C1591410rVz;
import X.C1591880rWk;
import X.C19EG;
import X.C990890btP;
import X.InterfaceC1209250hZb;
import X.InterfaceC1594050raF;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public abstract class HomePageUIFrameServiceCommonImpl implements HomePageUIFrameService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ void afterTabChangedInMainPageFragment(String str);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildInboxIcon(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildProfileIcon(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View dmEntranceView(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View.OnClickListener getBottomClick(Context context, String str);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ Class<? extends Fragment> getFragmentClass(String str);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ Class<? extends Activity> getHomePageInflateActivityClass();

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View getInflatedLiveIcon(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View getInflatedSearchIcon(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View getInflatedSpecialIcon(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View getInflatedTakoIcon(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ AbstractC1583710rJZ getRootNode(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ ImageView ivScanView(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ InterfaceC1209250hZb obtainSwitchHelper(Context context, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ void openSessionListActivity(C19EG c19eg, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ void removeNoticeView();

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public void runInTabHostRunnable(AbsFragment absFragment) {
        MainActivity mainActivity;
        if (absFragment.isViewValid()) {
            C19EG activity = absFragment.getActivity();
            if ((activity instanceof MainActivity) && (mainActivity = (MainActivity) activity) != null) {
                mainActivity.refreshSlideSwitchCanScrollRight();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public void setTitleTabVisibility(boolean z) {
        C1440005kM.LIZ(new C990890btP(z));
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public String getTagForCurrentTabInMainPageFragment(TabChangeManager tabChangeManager, String str, String str2) {
        boolean z;
        if ((Intrinsics.LJFF("NOTIFICATION", str2) || Intrinsics.LJFF("USER", str2)) && !C0XQ7.LJFF().isLogin()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC1594050raF interfaceC1594050raFLJIILLIIL = C1591880rWk.LIZIZ.LJIILLIIL();
            if (str2 == null) {
                str2 = "";
            }
            String strLIZLLL = interfaceC1594050raFLJIILLIIL.LIZLLL(tabChangeManager, str2);
            if (strLIZLLL == null) {
                return "";
            }
            return strLIZLLL;
        }
        return str2;
    }
}
