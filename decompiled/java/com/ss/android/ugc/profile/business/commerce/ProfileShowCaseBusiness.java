package com.ss.android.ugc.profile.business.commerce;

import X.C1257480ipO;
import X.C1257790ipt;
import X.C19U0;
import X.C2188811AlT;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileShowCaseBusiness extends ProfileTabBaseBusiness {
    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final String getName() {
        return "profile_tab_ecommerce_showcase";
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final boolean iI0() {
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final int pt1() {
        return R.raw.icon_bag;
    }

    public ProfileShowCaseBusiness(AwemePagerVM awemePagerVM) {
        super(awemePagerVM);
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness, com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener
    public final void sW(C19U0 c19u0, int i) {
        View view;
        View view2;
        User user;
        String uid = null;
        if (c19u0 != null) {
            view = c19u0.LJFF;
        } else {
            view = null;
        }
        if (view instanceof C1257790ipt) {
            if (c19u0 != null) {
                view2 = c19u0.LJFF;
            } else {
                view2 = null;
            }
            ProfileTabBaseBusiness.LIZJ(view2);
            Keva keva = C1257480ipO.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("profile_tab_clicked_");
            IAwemePagerVM iAwemePagerVMLIZ = LIZ();
            if (iAwemePagerVMLIZ != null && (user = iAwemePagerVMLIZ.getUser()) != null) {
                uid = user.getUid();
            }
            sbLIZ.append(uid);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
    }
}
