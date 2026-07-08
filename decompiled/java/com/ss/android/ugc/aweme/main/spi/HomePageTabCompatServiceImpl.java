package com.ss.android.ugc.aweme.main.spi;

import X.C04TD;
import X.C08TU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1585280rM6;
import X.EnumC1585290rM7;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import com.ss.android.ugc.aweme.spi.HomePageTabCompatService;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes25.dex */
public final class HomePageTabCompatServiceImpl implements HomePageTabCompatService {
    public static HomePageTabCompatService LJI() {
        Object objLIZ = C04TD.LIZ(HomePageTabCompatService.class, false);
        if (objLIZ != null) {
            return (HomePageTabCompatService) objLIZ;
        }
        if (C04TD.e2 == null) {
            synchronized (HomePageTabCompatService.class) {
                if (C04TD.e2 == null) {
                    C04TD.e2 = new HomePageTabCompatServiceImpl();
                }
            }
        }
        return C04TD.e2;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final boolean LIZLLL() {
        HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
        return !C1585280rM6.LJ;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final String LJ() {
        HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
        EnumC1585290rM7 enumC1585290rM7 = C1585280rM6.LJFF;
        if (enumC1585290rM7 != null) {
            return enumC1585290rM7.getReasonStr();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final Map<String, Map<String, Boolean>> LJFF() {
        HomePageTabCompatService homePageTabCompatService = C1585280rM6.LIZ;
        return C1585280rM6.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final ExecutorService LIZ() {
        return C08TU.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final void LIZIZ() {
        C08TU.LIZ().execute(new Runnable() { // from class: X.00kn
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("MainPreloadExecutorKt@ebb1.initTabTask$1");
                C1C7U.LIZIZ("MainPreloadExecutorKt@ebb1.initTabTask$1");
            }
        });
        C08TU.LIZ().execute(new Runnable() { // from class: X.00ko
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("MainPreloadExecutorKt@ebb1.initTabTask$2");
                C1C7U.LIZIZ("MainPreloadExecutorKt@ebb1.initTabTask$2");
            }
        });
        C08TU.LIZ().execute(new Runnable() { // from class: X.00kp
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("MainPreloadExecutorKt@ebb1.initTabTask$3");
                C1C7U.LIZIZ("MainPreloadExecutorKt@ebb1.initTabTask$3");
            }
        });
        C08TU.LIZ().execute(new Runnable() { // from class: X.00kq
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("MainPreloadExecutorKt@ebb1.initTabTask$4");
                C1C7U.LIZIZ("MainPreloadExecutorKt@ebb1.initTabTask$4");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final ITabStrip LIZJ(Fragment fragment) {
        IMFAbility iMFAbility;
        if (fragment == null || (iMFAbility = (IMFAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IMFAbility.class, null)) == null) {
            return null;
        }
        return iMFAbility.t60();
    }
}
