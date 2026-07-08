package com.ss.android.ugc.aweme.homepage.api.ui;

import X.AbstractC1583710rJZ;
import X.C1590400rUM;
import X.C1591410rVz;
import X.C19EG;
import X.InterfaceC1209250hZb;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;

/* JADX INFO: loaded from: classes25.dex */
public interface HomePageUIFrameService {
    void afterTabChangedInMainPageFragment(String str);

    View buildInboxIcon(C19EG c19eg);

    View buildProfileIcon(C19EG c19eg);

    View dmEntranceView(C19EG c19eg);

    View.OnClickListener getBottomClick(Context context, String str);

    Class<? extends Fragment> getFragmentClass(String str);

    Class<? extends Activity> getHomePageInflateActivityClass();

    View getInflatedLiveIcon(C19EG c19eg);

    View getInflatedSearchIcon(C19EG c19eg);

    View getInflatedSpecialIcon(C19EG c19eg);

    View getInflatedTakoIcon(C19EG c19eg);

    AbstractC1583710rJZ getRootNode(C19EG c19eg);

    String getTagForCurrentTabInMainPageFragment(TabChangeManager tabChangeManager, String str, String str2);

    ImageView ivScanView(C19EG c19eg);

    InterfaceC1209250hZb obtainSwitchHelper(Context context, C1591410rVz c1591410rVz, C1590400rUM c1590400rUM);

    void openSessionListActivity(C19EG c19eg, Bundle bundle);

    void removeNoticeView();

    void runInTabHostRunnable(AbsFragment absFragment);

    void setTitleTabVisibility(boolean z);
}
