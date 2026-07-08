package com.ss.android.ugc.profile.business.profile;

import X.C0H9H;
import X.C1257550ipV;
import X.C1257750ipp;
import X.C1257950iq9;
import X.C1260190itl;
import X.C1260200itm;
import X.C19U0;
import X.C2532609wC;
import X.C268330AfP;
import X.C746350TPl;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAITheaterBusiness extends ProfileTabBaseBusiness {
    public View LLILLL;

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final String getName() {
        return "profile_tab_cast";
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final boolean iI0() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final int pt1() {
        return C268330AfP.LJII() ? R.raw.icon_exp_profile_exp_icon_cast_fill : R.raw.icon_cast;
    }

    public ProfileAITheaterBusiness(AwemePagerVM awemePagerVM) {
        super(awemePagerVM);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void Oq(C19U0 c19u0) {
        IAwemePagerVM iAwemePagerVM;
        User user;
        int i;
        C1257550ipV c1257550ipV;
        C1257550ipV c1257550ipV2;
        Integer numLIZ;
        if (C2532609wC.LIZLLL()) {
            IAwemePagerVM iAwemePagerVM2 = this.LLILLJJLI;
            boolean z = true;
            if (iAwemePagerVM2 == null || !iAwemePagerVM2.isMyProfile() ? (iAwemePagerVM = this.LLILLJJLI) == null || (user = iAwemePagerVM.getUser()) == null || !C1257750ipp.LIZ(user) : (numLIZ = C746350TPl.LIZ.LJIIJJI().LIZ()) != null && numLIZ.intValue() == 0) {
                z = false;
            }
            if (C268330AfP.LJII()) {
                i = R.raw.icon_exp_profile_exp_icon_cast_fill;
            } else {
                i = R.raw.icon_cast;
            }
            if (z) {
                View view = this.LLILLL;
                if ((view instanceof C1257550ipV) && (c1257550ipV2 = (C1257550ipV) view) != null) {
                    c1257550ipV2.setImageResource(i);
                    return;
                }
                return;
            }
            View view2 = this.LLILLL;
            if (!(view2 instanceof C1257550ipV) || (c1257550ipV = (C1257550ipV) view2) == null) {
                return;
            }
            c1257550ipV.setImageResource(i);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void Yn(C19U0 c19u0) {
        int i;
        C1257550ipV c1257550ipV;
        if (C2532609wC.LIZLLL()) {
            if (C268330AfP.LJII()) {
                i = R.raw.icon_exp_profile_exp_icon_cast_fill;
            } else {
                i = R.raw.icon_cast;
            }
            View view = this.LLILLL;
            if ((view instanceof C1257550ipV) && (c1257550ipV = (C1257550ipV) view) != null) {
                c1257550ipV.setImageResource(i);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void st2(View view) {
        C1260190itl.LIZ.getClass();
        C1260190itl.LIZIZ = new C1260200itm(System.currentTimeMillis(), 0L, 0L, 0L, true, null);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void WQ(C1257950iq9 c1257950iq9, int i, View view) {
        int i2;
        ProfileTabBaseBusiness.LIZJ(view);
        this.LLILLL = view;
        LJ(C0H9H.LIZIZ(13), C0H9H.LIZIZ(13), view);
        if (C268330AfP.LJII()) {
            i2 = R.raw.icon_exp_profile_exp_icon_cast_fill;
        } else {
            i2 = R.raw.icon_cast;
        }
        LIZLLL(i2, view);
        if (view != null) {
            view.setContentDescription("ai theater");
        }
    }
}
