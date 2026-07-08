package com.ss.android.ugc.aweme.friends.account;

import X.AbstractC1387200mCc;
import X.AbstractC2252651DEx;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C0XQ7;
import X.C0XVH;
import X.C0XVI;
import X.C0XVK;
import X.C1076010e6h;
import X.C1388190mED;
import X.C1906580ziK;
import X.C1DFH;
import X.C2107308Nj;
import X.C23260099m;
import X.InterfaceC1364105Vn;
import X.InterfaceC849930XVv;
import android.app.Activity;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class SocialRecommendFriendsFlowHook implements AfterLoginHook {
    public final C0XVH LIZIZ = C0XVH.SOCIAL_RECOMMEND_FRIENDS_FLOW_HOOK;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final AbstractC2252651DEx LJJJLL() {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        return !C0XQ7.LJFF().getCurUser().isUserCancelled();
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Activity activityLIZ;
        Activity activityLIZIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = c0xvi.LIZ.getBoolean("is_from_new_user_journey", false);
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        if (iNewUserJourneyService == null ? z2 : !(!z2 && iNewUserJourneyService.LIZLLL())) {
            return Unit.LIZ;
        }
        if (c0xvi.LIZLLL == C0XVK.SWITCH_ACCOUNT && !c0xvi.LIZ.getBoolean("need_skip_restart")) {
            z = true;
            c0xvi.LIZ.putBoolean("needCheckSocialRecDialog", true);
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        ISocialFriendsService iSocialFriendsServiceLJIIZILJ = C1076010e6h.LIZJ.LJIIZILJ();
        if (activityLIZ != null && iSocialFriendsServiceLJIIZILJ != null) {
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
            iSocialFriendsServiceLJIIZILJ.LIZJ(activityLIZ, z, new InterfaceC849930XVv() { // from class: X.0XVr
                @Override // X.InterfaceC849930XVv
                public final void LIZ() {
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", "SocialRecommendFriendsFlowHook");
                    c0xgr.LIZLLL("enter_method", "login");
                    c0xgr.LIZ(1, "is_hook");
                    c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
                    C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
                    InterfaceC1364105Vn<Unit> interfaceC1364105Vn2 = c23260099m;
                    Unit unit = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit);
                    interfaceC1364105Vn2.resumeWith(unit);
                }
            });
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
