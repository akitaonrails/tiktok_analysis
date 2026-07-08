package com.ss.android.ugc.aweme.assem;

import X.C098200Yq;
import X.C0QSJ;
import X.C1076020e6i;
import X.C1440005kM;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561720qk6;
import X.C1589640rT8;
import X.C1599640rjG;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C297720Bli;
import X.C319860CgK;
import X.C343710Ddh;
import X.C446900Hfk;
import X.C486860J7k;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC992240bva;
import X.InterfaceC1587410rPX;
import X.InterfaceC1593630rZZ;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ChangeTabProtocol;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsChangeTabInterceptor implements ChangeTabProtocol {
    public static void LIZ(C19EG c19eg) {
        Bundle extras;
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        if (c446900Hfk.LIZ(c19eg).KQ2("HOME")) {
            Intent intent = c19eg.getIntent();
            if (intent != null) {
                try {
                    extras = intent.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (extras == null) {
                    extras = new Bundle();
                }
            } else {
                extras = new Bundle();
            }
            C786410Ut5.LJJJI("fromStart", "MainPage", extras);
            c446900Hfk.LIZ(c19eg).yQ2(extras, "HOME");
            ((MainAnimViewModel) ViewModelProviders.of(c19eg).get(MainAnimViewModel.class)).LLILZ.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(C19EG c19eg, Intent intent) {
        Bundle bundle;
        MainPageBusinessAbility mainPageBusinessAbility;
        Object c098200Yq;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        Object ability;
        Object ability2;
        FeedFragment feedFragment;
        FeedFragment feedFragmentUx = null;
        try {
            bundle = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.l3()) {
            Fragment fragmentKi = Hox.LLJILJIL.LIZ(c19eg).Ki("FRIENDS_FEED");
            if ((fragmentKi instanceof FeedFragment) && (feedFragment = (FeedFragment) fragmentKi) != null) {
                feedFragment.Oi(false);
            } else if (C319860CgK.LIZ()) {
                C1599640rjG.LIZIZ.Uu();
            }
        }
        if (c1589640rT8.F2()) {
            if (C297720Bli.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
                if (c0qsjLIZJ != null) {
                    ability2 = c0qsjLIZJ.getAbility(MainPageBusinessAbility.class);
                } else {
                    ability2 = null;
                }
                if (!(ability2 instanceof MainPageBusinessAbility)) {
                    ability2 = null;
                }
                mainPageBusinessAbility = (MainPageBusinessAbility) ability2;
            } else {
                mainPageBusinessAbility = (MainPageBusinessAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), MainPageBusinessAbility.class, null);
            }
            if (mainPageBusinessAbility != null) {
                mainPageBusinessAbility.Db(false);
            }
            try {
                Fragment fragmentBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
                if (fragmentBQ2 != 0) {
                    IMFPubAbility iMFPubAbilityLIZJ = C1561720qk6.LIZJ(fragmentBQ2);
                    if (iMFPubAbilityLIZJ != null) {
                        iMFPubAbilityLIZJ.gB1(31);
                    }
                    if (C297720Bli.LIZ()) {
                        C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(C1558360qeg.LJFF(fragmentBQ2, null), MainActivityScope.class);
                        if (c0qsjLIZJ2 != null) {
                            ability = c0qsjLIZJ2.getAbility(HomeViewPagerAbility.class);
                        } else {
                            ability = null;
                        }
                        if (!(ability instanceof HomeViewPagerAbility)) {
                            ability = null;
                        }
                        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) ability;
                        if (homeViewPagerAbility != null) {
                            homeViewPagerAbility.sZ(31, false);
                        }
                    } else {
                        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(fragmentBQ2);
                        if (homeViewPagerAbilityLIZIZ != null) {
                            homeViewPagerAbilityLIZIZ.sZ(31, false);
                        }
                    }
                    if ((fragmentBQ2 instanceof InterfaceC1593630rZZ) && (interfaceC1593630rZZ = (InterfaceC1593630rZZ) fragmentBQ2) != null) {
                        feedFragmentUx = interfaceC1593630rZZ.ux();
                    }
                    if (feedFragmentUx instanceof InterfaceC1587410rPX) {
                        C1440005kM.LIZ(new C1076020e6i());
                        LIZ(c19eg);
                    }
                }
                Fragment fragmentBQ22 = C343710Ddh.LIZ(c19eg).BQ2();
                if (fragmentBQ22 != null && fragmentBQ22.isAdded()) {
                    C486860J7k.LIZIZ(c19eg).KQ2(true);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            if (Intrinsics.LJFF(bundle.getString("refer"), "inner_push")) {
                C786410Ut5.LJJJI("enter_method", "inner_push_landing", bundle);
            } else {
                C786410Ut5.LJJJI("enter_method", "push_landing", bundle);
            }
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            c446900Hfk.LIZ(c19eg).TQ2(bundle, "HOME", false);
            c446900Hfk.LIZ(c19eg).TQ2(bundle, "FRIENDS_FEED", false);
            return;
        }
        if (Intrinsics.LJFF(bundle.getString("refer"), "inner_push")) {
            C786410Ut5.LJJJI("enter_method", "inner_push_landing", bundle);
        } else {
            C786410Ut5.LJJJI("enter_method", "push_landing", bundle);
        }
        C446900Hfk c446900Hfk2 = Hox.LLJILJIL;
        c446900Hfk2.LIZ(c19eg).TQ2(bundle, "FRIENDS_TAB", false);
        c446900Hfk2.LIZ(c19eg).TQ2(bundle, "FRIENDS_FEED", false);
    }

    @Override // com.ss.android.ugc.aweme.base.ChangeTabProtocol
    public final boolean IW(C19EG c19eg, Intent intent, String str, EnumC992240bva enumC992240bva) {
        String stringExtra;
        Bundle bundle;
        if (enumC992240bva == EnumC992240bva.COLD_BOOT) {
            Intent intent2 = c19eg.getIntent();
            if (Intrinsics.LJFF(str, "FRIENDS_FEED")) {
                LIZJ(c19eg, intent2);
                return true;
            }
            return false;
        }
        if (enumC992240bva != EnumC992240bva.ON_NEW_INTENT) {
            return false;
        }
        try {
            stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            bundle = intent.getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
        if (Intrinsics.LJFF(stringExtra, "FRIENDS_FEED")) {
            LIZJ(c19eg, intent);
            return true;
        }
        return false;
    }
}
