package com.ss.android.ugc.aweme.feed.account;

import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.AbstractC848400XPy;
import X.C0PEM;
import X.C0XGR;
import X.C0XQ7;
import X.C0XVB;
import X.C0XVG;
import X.C0XVH;
import X.C0XVI;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C849840XVm;
import X.C849850XVn;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class NewUserDialogCleanHook implements AfterLoginHook, AfterSwitchAccountHook {
    public final C0XVH LIZIZ = C0XVH.NEW_USER_DIALOG_CLEAN_HOOK;
    public final C0XVG LIZJ = C0XVG.NEW_USER_DIALOG_CLEAN_HOOK;
    public final AbstractC2238408pq LIZLLL;

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LIZIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final boolean LJI(C0XVI c0xvi) {
        return true;
    }

    public NewUserDialogCleanHook() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZLLL = C2107308Nj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final C0XVH LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterSwitchAccountHook
    public final C0XVG LJFF() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final AbstractC2252651DEx LJJJLL() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final boolean LJ(C0XVI c0xvi) {
        return !C0XQ7.LJFF().getCurUser().isUserCancelled();
    }

    @Override // com.ss.android.ugc.aweme.account.hook.AfterLoginHook
    public final Object LIZ(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IRecommendUsersService iRecommendUsersService = (IRecommendUsersService) PluggableExtentionKt.pluggableSpi$default(IRecommendUsersService.class, false, false, false, 14, null);
        String str2 = "login";
        if (iRecommendUsersService != null) {
            if (!c0xvi.LIZJ) {
                str = "login";
            } else {
                str = "switch";
            }
            iRecommendUsersService.LJIIJ(str);
        }
        if (C0XVB.LIZ(c0xvi) && !c0xvi.LIZJ) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser() != null && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSecUid() != null) {
                String secUid = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSecUid();
                FeedCommonService feedCommonService = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null);
                if (feedCommonService != null) {
                    feedCommonService.LJJIFFI(secUid);
                }
            }
        } else {
            FeedCommonService feedCommonService2 = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null);
            if (feedCommonService2 != null) {
                feedCommonService2.LJIJJ();
            }
        }
        C849840XVm.LIZ.getClass();
        if (C849840XVm.LIZIZ != null) {
            C849850XVn.LIZIZ.LIZJ().LJJIFFI();
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "NewUserDialogCleanHook");
        if (c0xvi.LIZJ) {
            str2 = "switch_account";
        }
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZ(1, "is_hook");
        c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("account_after_auth_action", c0xgr.LIZ);
        return Unit.LIZ;
    }
}
