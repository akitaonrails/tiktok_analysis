package com.ss.android.ugc.aweme.feed.assem.duetbutton;

import X.C0203004r;
import X.C10IT;
import X.C2222691Bz1;
import X.C729980SkG;
import X.C735280Sso;
import X.C746350TPl;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.DuetHelperKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes22.dex */
public final class VideoDuetButtonViewModel extends FeedBaseViewModel<C0203004r> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0203004r(0);
    }

    public static boolean vQ2(Aweme aweme) {
        boolean z;
        boolean z2;
        if (aweme == null || !((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin() || aweme.getAwemeRawAd() != null) {
            return false;
        }
        boolean zLJIIIIZZ = C729980SkG.LJIIIIZZ(aweme);
        boolean zLIZ = C10IT.LIZ(aweme);
        if (C2222691Bz1.LJIIIIZZ() && !C746350TPl.LIZ.LIZ().LIZ().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZJ = ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(aweme.getMusic());
        C735280Sso.LIZ.getClass();
        boolean zLIZJ2 = C735280Sso.LIZJ(aweme);
        if (aweme.getAwemeType() == 13) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((zLIZJ2 && !zLJIIIIZZ) || z2 || !DuetHelperKt.canAddDuet(aweme, zLJIIIIZZ) || DuetHelperKt.setGrayForDuet(aweme, zLJIIIIZZ, zLIZ, z, zLIZJ)) {
            return false;
        }
        return true;
    }
}
