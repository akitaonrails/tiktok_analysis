package com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base;

import X.C1257530ipT;
import X.C1257790ipt;
import X.C1257950iq9;
import X.C1744700vVE;
import X.C19U0;
import android.view.View;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileTabBaseBusiness implements ITabBusinessListener {
    public final AwemePagerVM LL;
    public IAwemePagerVM LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public void Oq(C19U0 c19u0) {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public void Yn(C19U0 c19u0) {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void hl0() {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void ih(C19U0 c19u0) {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public int pt1() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public void sW(C19U0 c19u0, int i) {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public void st2(View view) {
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final Map<String, String> uP(int i, String str) {
        return null;
    }

    public final IAwemePagerVM LIZ() {
        IAwemePagerVM iAwemePagerVM = this.LLILLJJLI;
        return iAwemePagerVM == null ? this.LL : iAwemePagerVM;
    }

    public ProfileTabBaseBusiness(AwemePagerVM awemePagerVM) {
        this.LL = awemePagerVM;
    }

    public static void LIZJ(View view) {
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        if (view instanceof C1257790ipt) {
            TuxAlertBadgeLayout tuxAlertBadgeLayout2 = ((C1257790ipt) view).LLILZ;
            if (tuxAlertBadgeLayout2 != null && tuxAlertBadgeLayout2.LLJIJIL) {
                tuxAlertBadgeLayout2.LIZIZ();
                return;
            }
            return;
        }
        if (!(view instanceof C1257530ipT) || view == null || (tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view.findViewById(R.id.aw_)) == null) {
            return;
        }
        tuxAlertBadgeLayout.LIZIZ();
    }

    public static void LJFF(View view) {
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        if (view instanceof C1257790ipt) {
            TuxAlertBadgeLayout tuxAlertBadgeLayout2 = ((C1257790ipt) view).LLILZ;
            if (tuxAlertBadgeLayout2 != null && !tuxAlertBadgeLayout2.LLJIJIL) {
                tuxAlertBadgeLayout2.LIZJ();
                return;
            }
            return;
        }
        if (!(view instanceof C1257530ipT) || view == null || (tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view.findViewById(R.id.wwz)) == null) {
            return;
        }
        tuxAlertBadgeLayout.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void Hv0(AwemePagerVM awemePagerVM) {
        this.LLILLJJLI = awemePagerVM;
    }

    public final void LIZLLL(int i, View view) {
        Integer num;
        C1257530ipT c1257530ipT;
        AwemePagerVM awemePagerVM = this.LL;
        if (awemePagerVM != null && (num = awemePagerVM.LLILZLL) != null && num.intValue() == 1 && (view instanceof C1257530ipT) && (c1257530ipT = (C1257530ipT) view) != null) {
            c1257530ipT.setAdditionalSupportImageResource(i);
        }
    }

    public final void LJ(int i, int i2, View view) {
        Integer num;
        C1257530ipT c1257530ipT;
        AwemePagerVM awemePagerVM = this.LL;
        if (awemePagerVM != null && (num = awemePagerVM.LLILZLL) != null && num.intValue() == 1 && (view instanceof C1257530ipT) && (c1257530ipT = (C1257530ipT) view) != null) {
            TuxIconView tuxIconView = c1257530ipT.LLILZ;
            if (tuxIconView != null) {
                C1744700vVE.LJIIL(tuxIconView, i);
            }
            TuxIconView tuxIconView2 = c1257530ipT.LLILZ;
            if (tuxIconView2 != null) {
                C1744700vVE.LJIIIIZZ(i2, tuxIconView2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public void WQ(C1257950iq9 c1257950iq9, int i, View view) {
        LIZJ(view);
    }
}
