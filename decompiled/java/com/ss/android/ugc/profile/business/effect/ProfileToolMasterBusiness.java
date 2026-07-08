package com.ss.android.ugc.profile.business.effect;

import X.C1257950iq9;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileToolMasterBusiness extends ProfileTabBaseBusiness {
    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final String getName() {
        return "profile_tab_effect";
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final boolean iI0() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final int pt1() {
        return R.raw.icon_effect;
    }

    public ProfileToolMasterBusiness(AwemePagerVM awemePagerVM) {
        super(awemePagerVM);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void st2(View view) {
        IAwemePagerVM iAwemePagerVMLIZ = LIZ();
        if (iAwemePagerVMLIZ != null && iAwemePagerVMLIZ.isMyProfile()) {
            Keva.getRepo("PROFILE_TAB_REPO").storeBoolean("PROFILE_EFFECT_TAB_RED_DOT_SHOWN", true);
            ProfileTabBaseBusiness.LIZJ(view);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void WQ(C1257950iq9 c1257950iq9, int i, View view) {
        ProfileTabBaseBusiness.LIZJ(view);
        if (c1257950iq9 != null && c1257950iq9.LIZIZ()) {
            Keva repo = Keva.getRepo("PROFILE_TAB_REPO");
            IAwemePagerVM iAwemePagerVMLIZ = LIZ();
            if (iAwemePagerVMLIZ != null && iAwemePagerVMLIZ.isMyProfile()) {
                if (!repo.getBoolean("PROFILE_EFFECT_TAB_RED_DOT_SHOWN", false)) {
                    ProfileTabBaseBusiness.LJFF(view);
                } else {
                    ProfileTabBaseBusiness.LIZJ(view);
                }
            }
        }
    }
}
