package com.ss.android.ugc.aweme.feed.ui;

import X.C098200Yq;
import X.C0SZ8;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1591220rVg;
import X.C189200o6;
import X.C293860BfU;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseFeedListFragment extends FeedFragment {
    public HomeFeedComponent LLILZLL;

    public final HomeFeedComponent VR() {
        if (this.LLILZLL == null) {
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IFeedFragmentAbility.class, null);
            if (!(interfaceC494301wDLIZ instanceof IHomeFeedFragmentAbility)) {
                interfaceC494301wDLIZ = null;
            }
            IHomeFeedFragmentAbility iHomeFeedFragmentAbility = (IHomeFeedFragmentAbility) interfaceC494301wDLIZ;
            this.LLILZLL = iHomeFeedFragmentAbility instanceof HomeFeedComponent ? (HomeFeedComponent) iHomeFeedFragmentAbility : null;
        }
        return this.LLILZLL;
    }

    public final IRefreshAbility E80() {
        HomeFeedComponent homeFeedComponentVR = VR();
        if (homeFeedComponentVR != null) {
            return homeFeedComponentVR.LLJJI;
        }
        return null;
    }

    public final ILoadMoreAbility Ew0() {
        HomeFeedComponent homeFeedComponentVR = VR();
        if (homeFeedComponentVR != null) {
            return homeFeedComponentVR.LLJJ;
        }
        return null;
    }

    public final C0SZ8 k4() {
        HomeFeedComponent homeFeedComponentVR = VR();
        if (homeFeedComponentVR != null) {
            return homeFeedComponentVR.k4();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.L();
        }
        if (C1591220rVg.LIZIZ()) {
            this.LLILZLL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.dd();
        }
    }

    public final IPageStateAbility sl0() {
        HomeFeedComponent homeFeedComponentVR = VR();
        if (homeFeedComponentVR != null) {
            return homeFeedComponentVR.LLJILLL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public boolean Oi(boolean z) {
        IRefreshAbility iRefreshAbilityE80 = E80();
        if (iRefreshAbilityE80 != null) {
            return iRefreshAbilityE80.Oi(z);
        }
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        C1578630rBN.LJII(this);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.Bg(activity, this);
        }
        super.onAttach(activity);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        RootPanelComponent rootPanelComponentLIZ;
        super.onConfigurationChanged(configuration);
        if (((Number) C293860BfU.LIZ.getValue()).intValue() == 1 && (rootPanelComponentLIZ = C1578630rBN.LIZ(this)) != null) {
            rootPanelComponentLIZ.M1(configuration);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.P9(bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public boolean onDispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this);
        SystemComponentAbility systemComponentAbility = null;
        if (interfaceC665370Q7zLJ != null) {
            systemComponentAbility = (SystemComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, SystemComponentAbility.class, null);
        }
        if (systemComponentAbility != null && systemComponentAbility.onDispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RootPanelComponent rootPanelComponentLIZ = C1578630rBN.LIZ(this);
        if (rootPanelComponentLIZ != null) {
            rootPanelComponentLIZ.LLZLLLL(view, bundle);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
