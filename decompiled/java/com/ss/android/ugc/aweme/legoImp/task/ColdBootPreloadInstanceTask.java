package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass0716;
import X.C0CCZ;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0TKA;
import X.C0VU1;
import X.C0VZ0;
import X.C10R5;
import X.C10RS;
import X.C1492110ovp;
import X.C1E21;
import X.C2184641Aek;
import X.C285090BFj;
import X.C304790Bx7;
import X.C312240CLu;
import X.C343140Dcm;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.AObjectS298S0200000_29;
import Y.AObjectS74S0000000_24;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes25.dex */
public class ColdBootPreloadInstanceTask implements C0CCZ, InterfaceC799590VYf {
    public static final ColdBootPreloadInstanceTask LLILLL = new ColdBootPreloadInstanceTask();
    public FeedRecommendFragment LL;
    public Fragment LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ColdBootPreloadInstanceTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        C304790Bx7.LIZ.getClass();
        int iLIZ = C304790Bx7.LIZ();
        int i = C304790Bx7.LIZJ;
        EnumC799870VZh enumC799870VZh = (EnumC799870VZh) C1492110ovp.LIZJ("PreloadInstanceTask_idleOpt", new AObjectS74S0000000_24(1), new AObjectS74S0000000_24(2), (iLIZ & i) == i);
        Objects.requireNonNull(enumC799870VZh);
        return enumC799870VZh;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !C1E21.LIZIZ();
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((Boolean) AnonymousClass0716.LJIIJ.getValue()).booleanValue();
        if (((Boolean) C285090BFj.LIZLLL.getValue()).booleanValue()) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService();
        }
        if (((Boolean) C285090BFj.LJFF.getValue()).booleanValue()) {
            this.LL = new FeedRecommendFragment();
        }
        if (((Boolean) C285090BFj.LJI.getValue()).booleanValue()) {
            this.LLILLJJLI = FollowFeedServiceImpl.LJIL().LJIIJJI();
        }
        if (((Boolean) AnonymousClass0716.LJI.getValue()).booleanValue() && C0TKA.LJ) {
            try {
                C10R5 c10r5 = C10R5.LJIIIIZZ;
                C10RS.LIZ().LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ConcurrentHashMap<Integer, String> concurrentHashMap = C343140Dcm.LIZ;
        C823050WQl.LIZJ().submit(new Runnable() { // from class: X.0BvI
            public static void LIZ() {
                C343140Dcm.LJI(C1697810uHb.LJIIJJI(2131823214, 2131822936, 2131823230));
                Iterator it2 = Collections.singletonList(Integer.valueOf(R.dimen.oy)).iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    C343160Dco c343160DcoLJ = C343140Dcm.LJ(iIntValue);
                    if (c343160DcoLJ != null) {
                        C343140Dcm.LIZIZ.put(Integer.valueOf(iIntValue), c343160DcoLJ);
                    }
                }
                if (C295410Bhz.LIZ()) {
                    C343140Dcm.LJI(C1697810uHb.LJIIJJI(2131823178, 2131823179, 2131823177));
                    C343140Dcm.LJFF(R.dimen.p3);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ResourceCacheManager@3c0e.preloadResources$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ResourceCacheManager@3c0e.preloadResources$1");
            }
        });
        C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_UI_FRAME, "", new AObjectS298S0200000_29(this, context, 0), ((Boolean) C2184641Aek.LJI.getValue()).booleanValue()));
    }
}
