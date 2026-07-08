package com.ss.android.ugc.profile.business.profile;

import X.C0H9H;
import X.C1257950iq9;
import X.C268330AfP;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfilePrivateAwemeBusiness extends ProfileTabBaseBusiness {
    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final String getName() {
        return "profile_tab_private";
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final boolean iI0() {
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final int pt1() {
        return C268330AfP.LJII() ? R.raw.icon_exp_profile_exp_icon_lock_fill : R.raw.icon_lock;
    }

    public ProfilePrivateAwemeBusiness(AwemePagerVM awemePagerVM) {
        super(awemePagerVM);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void WQ(C1257950iq9 c1257950iq9, int i, View view) {
        String string;
        Resources resources;
        ProfileTabBaseBusiness.LIZJ(view);
        LJ(C0H9H.LIZIZ(13), C0H9H.LIZIZ(13), view);
        LIZLLL(R.raw.icon_lock_large_fill, view);
        if (view != null) {
            Context context = view.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(2131823315);
            } else {
                string = null;
            }
            view.setContentDescription(string);
        }
    }
}
