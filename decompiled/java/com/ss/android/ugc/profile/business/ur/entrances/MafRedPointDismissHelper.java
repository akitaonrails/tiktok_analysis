package com.ss.android.ugc.profile.business.ur.entrances;

import X.C04TD;
import X.C11PQ;
import X.C1220000hqw;
import X.C1249200ic2;
import X.C13LE;
import X.C1559960qhG;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class MafRedPointDismissHelper implements IMafRedPointDismissHelper {
    public static IMafRedPointDismissHelper LIZIZ() {
        Object objLIZ = C04TD.LIZ(IMafRedPointDismissHelper.class, false);
        if (objLIZ != null) {
            return (IMafRedPointDismissHelper) objLIZ;
        }
        if (C04TD.J6 == null) {
            synchronized (IMafRedPointDismissHelper.class) {
                if (C04TD.J6 == null) {
                    C04TD.J6 = new MafRedPointDismissHelper();
                }
            }
        }
        return C04TD.J6;
    }

    @Override // com.ss.android.ugc.aweme.profile.IMafRedPointDismissHelper
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(341);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileMafRedPointsVM.class);
        AFwS283S0000000_35 aFwS283S0000000_35 = AFwS283S0000000_35.get$arr$(113);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
        if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        ProfileMafRedPointsVM profileMafRedPointsVM = (ProfileMafRedPointsVM) new C736950SvV(c19719912DlLIZ, aFwS226S0000000_35, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS283S0000000_35, null, null, null).getValue();
        C1559960qhG c1559960qhG = profileMafRedPointsVM.LL;
        c1559960qhG.LIZ.erase("show_maf_point_not_click_times");
        c1559960qhG.LIZ.erase("maf_red_point_quit_times");
        c1559960qhG.LIZ.erase("random_maf_count");
        ((C11PQ) profileMafRedPointsVM.LLILLL.getValue()).onNext(new C1249200ic2(false, 0));
        profileMafRedPointsVM.setState(AFwS283S0000000_35.get$arr$(193));
    }
}
