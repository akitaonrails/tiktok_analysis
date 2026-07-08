package com.ss.android.ugc.feed.platform.popup.component;

import X.C01GW;
import X.C0T1R;
import X.C1389300mG0;
import X.C452501pT;
import X.C741360T6g;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class FeedPopupPanelComponent extends BasePanelComponent implements IFeedPopupAbility, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(new C741360T6g(this));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 39224906) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.popup.component.IFeedPopupAbility
    public final void pauseVideo() {
        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LL.getValue();
        if (iPlayerComponentAbility != null) {
            iPlayerComponentAbility.LLLLLLLLLL();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.popup.component.IFeedPopupAbility
    public final void LJJLIIJ() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        Aweme awemeLJIIIIZZ;
        IPlayerComponentAbility iPlayerComponentAbility;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) == null || (iPlayerComponentAbility = (IPlayerComponentAbility) this.LL.getValue()) == null) {
            return;
        }
        iPlayerComponentAbility.jF0(awemeLJIIIIZZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || !C1389300mG0.LJI(fragment)) {
            return;
        }
        FeedPopupAbilityWrapper.LL.getClass();
        WeakReference<IFeedPopupAbility> weakReference = FeedPopupAbilityWrapper.LLILLJJLI;
        if (Intrinsics.LJFF(this, weakReference != null ? weakReference.get() : null)) {
            FeedPopupAbilityWrapper.LLILLJJLI = null;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || !C1389300mG0.LJI(fragment)) {
            return;
        }
        FeedPopupAbilityWrapper.LL.getClass();
        FeedPopupAbilityWrapper.LLILLJJLI = new WeakReference<>(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        IFeedPopupAbility iFeedPopupAbility;
        super.onPagePause(i);
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && C1389300mG0.LJI(fragment)) {
            return;
        }
        FeedPopupAbilityWrapper.LL.getClass();
        WeakReference<IFeedPopupAbility> weakReference = FeedPopupAbilityWrapper.LLILLJJLI;
        if (weakReference != null) {
            iFeedPopupAbility = weakReference.get();
        } else {
            iFeedPopupAbility = null;
        }
        if (!Intrinsics.LJFF(this, iFeedPopupAbility)) {
            return;
        }
        FeedPopupAbilityWrapper.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && C1389300mG0.LJI(fragment)) {
            return;
        }
        FeedPopupAbilityWrapper.LL.getClass();
        FeedPopupAbilityWrapper.LLILLJJLI = new WeakReference<>(this);
    }
}
