package com.ss.android.ugc.aweme.follow.service;

import X.AbstractC738140SxQ;
import X.C04TD;
import X.C059B;
import X.C098200Yq;
import X.C0C64;
import X.C0CCZ;
import X.C0WHU;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C1588470rRF;
import X.C1588520rRK;
import X.C1588560rRO;
import X.C1588840rRq;
import X.C1589640rT8;
import X.C1604710rrR;
import X.C1720106oR;
import X.C189200o6;
import X.C19EG;
import X.C2187451AjH;
import X.C23250099c;
import X.C2450009is;
import X.C2450109it;
import X.C315301Kd;
import X.C607520NsE;
import X.C607610NsN;
import X.C607810Nsh;
import X.C607830Nsj;
import X.C614770O9j;
import X.C736500Sum;
import X.C737030Svd;
import X.C804950Vht;
import X.EnumC607570NsJ;
import X.InterfaceC1569400qwU;
import X.InterfaceC1587510rPh;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cache.FollowingFeedAssem;
import com.ss.android.ugc.aweme.detail.ui.FollowInnerFeedPageStateImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestComponent;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.vm.FollowFeedVM;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.task.FollowPreloadTask;
import com.ss.android.ugc.aweme.service.IFollowFeedService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowFeedServiceImpl implements IFollowFeedService {
    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJII() {
        return C13LE.LIZ(FollowingFeedAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIL() {
        return C13LE.LIZ(FollowingSuggestComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final int LJIJ() {
        return R.id.i_t;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C13IQ<? extends UIContentAssem> LJIJI() {
        return C13LE.LIZ(FollowInnerFeedPageStateImpl.class);
    }

    public static IFollowFeedService LJIL() {
        Object objLIZ = C04TD.LIZ(IFollowFeedService.class, false);
        if (objLIZ != null) {
            return (IFollowFeedService) objLIZ;
        }
        if (C04TD.C0 == null) {
            synchronized (IFollowFeedService.class) {
                if (C04TD.C0 == null) {
                    C04TD.C0 = new FollowFeedServiceImpl();
                }
            }
        }
        return C04TD.C0;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void E1() {
        C1588470rRF.LIZ.getClass();
        C1588470rRF.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZLLL() {
        C1440005kM.LIZ(new C736500Sum());
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIJ() {
        C1588560rRO.LIZLLL = "unfollow";
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final Fragment LJIIJJI() {
        return new FeedFollowFragment();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final long LJIJJ() {
        C804950Vht.LIZ.getClass();
        try {
            return C804950Vht.LIZ().getLong("key_following_skylight_user_cell_click_time", 0L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return -1L;
            }
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingKevaStorage", "getSkylightUserCellClickTime error", thM5exceptionOrNullimpl);
            return -1L;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void S1() {
        if (C1588470rRF.LJFF) {
            return;
        }
        C1588470rRF.LJFF = true;
        InterfaceC1587510rPh interfaceC1587510rPh = C1588470rRF.LIZJ;
        if (interfaceC1587510rPh != null) {
            interfaceC1587510rPh.LIZ();
        }
        C1604710rrR c1604710rrR = C1588470rRF.LIZIZ;
        c1604710rrR.LIZLLL().erase("key_timestamp_records");
        c1604710rrR.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean T1() {
        C1588470rRF.LIZ.getClass();
        return C1588470rRF.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJIIIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "following_feed_refresh_bling_fix", true) > 0;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C0WHU LIZIZ() {
        return C1588470rRF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZJ(Context context) {
        C614770O9j.LIZIZ.LJ().LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJ(String str) {
        C607520NsE c607520NsE = C607520NsE.LIZ;
        EnumC607570NsJ[] enumC607570NsJArr = {EnumC607570NsJ.GLOBAL};
        c607520NsE.getClass();
        C607520NsE.LIZJ(str, enumC607570NsJArr);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final InterfaceC1569400qwU LJFF(C19EG c19eg) {
        return (InterfaceC1569400qwU) new ViewModelProvider(c19eg).get(FollowFeedVM.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final C0CCZ LJIIIIZZ(Context context) {
        return new FollowPreloadTask();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJIILIIL(C737030Svd c737030Svd) {
        if (c737030Svd.LIZ != 15 || C1589640rT8.LIZIZ.u2()) {
            return false;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "landing_page_optimization_experiment", false);
        if (iLJIJ != 0 && iLJIJ != 1) {
            if (!C1588520rRK.LIZIZ()) {
                return false;
            }
            int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "landing_page_optimization_experiment_v2", false);
            if (iLJIJ2 != 2 && iLJIJ2 != 4) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILJJIL(long j) {
        Object c098200Yq;
        C804950Vht.LIZ.getClass();
        try {
            C804950Vht.LIZ().storeLong("key_following_skylight_user_cell_click_time", j);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FollowingKevaStorage", "saveSkylightUserCellClickTime error", thM5exceptionOrNullimpl);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final List<Aweme> LJIIZILJ(List<? extends FollowFeed> list) {
        return C1588840rRq.LJIILJJIL(list);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final int LJIJJLI(Fragment fragment) {
        if (fragment instanceof FeedFollowFragment) {
            FeedFollowFragment feedFollowFragment = (FeedFollowFragment) fragment;
            if (feedFollowFragment.LLJILJILJ) {
                return 1;
            }
            if (C614770O9j.LIZIZ.LJ().LJJIL(2, feedFollowFragment)) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void refreshComment(Fragment fragment) {
        if (fragment instanceof FeedFollowFragment) {
            FollowFeedFragmentPanelMT followFeedFragmentPanelMT = ((FeedFollowFragment) fragment).LLJJJ;
            followFeedFragmentPanelMT.LLLLJI(followFeedFragmentPanelMT.LLLLLJLJLL(), null, "tab_follow", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZ(Context context, List<FollowingInterestUser> list) {
        C614770O9j.LIZIZ.LJ().LIZ(context, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJI(String str, C059B c059b) {
        C607830Nsj.LIZ.getClass();
        C23250099c.LIZLLL((InterfaceC497601wk) C607830Nsj.LIZIZ.getValue(), null, null, new C607810Nsh(str, c059b, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILL(String str, boolean z) {
        C2450109it.LIZ.setValue(new C2450009is(z, str));
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILLIIL(int i, int i2) {
        C607610NsN.LIZ.getClass();
        C23250099c.LIZLLL(C607610NsN.LIZ(), null, null, new C315301Kd(i, i2, null), 3);
    }
}
