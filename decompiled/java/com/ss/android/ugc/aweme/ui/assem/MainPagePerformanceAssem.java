package com.ss.android.ugc.aweme.ui.assem;

import X.C13LE;
import X.C1878330yyl;
import X.C2217381BqS;
import X.C2514309tF;
import X.C786410Ut5;
import X.C854540Xfg;
import X.InterfaceC2217461Bqa;
import X.RunnableC1610300s0S;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.ss.android.ugc.aweme.ui.assem.MainPagePerformanceAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPagePerformanceAssem extends BaseMainPageFragmentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public volatile boolean LLILLJJLI;
    public boolean LLILZ;
    public volatile C1878330yyl LLILZLL;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC1610300s0S LLILZIL = new Runnable() { // from class: X.0s0S
        public final void LIZ() {
            if (this.LL.LLILZ && C1906580ziK.LJI()) {
                HomeTabAbility homeTabAbilityLIZIZ = C0DMM.LIZIZ(C1558520qew.LJIIL(this.LL));
                String strCt0 = homeTabAbilityLIZIZ != null ? homeTabAbilityLIZIZ.Ct0() : null;
                if (Intrinsics.LJFF(strCt0, "For You") || Intrinsics.LJFF(strCt0, "Following")) {
                    MainPagePerformanceAssem mainPagePerformanceAssem = this.LL;
                    C1878330yyl c1878330yyl = mainPagePerformanceAssem.LLILZLL;
                    if (c1878330yyl == null) {
                        synchronized (mainPagePerformanceAssem) {
                            c1878330yyl = mainPagePerformanceAssem.LLILZLL;
                            if (c1878330yyl == null) {
                                c1878330yyl = new C1878330yyl();
                                mainPagePerformanceAssem.LLILZLL = c1878330yyl;
                            }
                        }
                    }
                    Object obj = c1878330yyl.LL;
                    MainPageBusinessAbility mainPageBusinessAbility = (MainPageBusinessAbility) (Intrinsics.LJFF(obj, C1610310s0T.LIZ) ? null : obj);
                    if (mainPageBusinessAbility != null) {
                        mainPageBusinessAbility.LJJLIIIJLLLLLLLZ();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("MainPagePerformanceAssem@92d2.releaseTask$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("MainPagePerformanceAssem@92d2.releaseTask$1");
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainPagePerformanceAssem.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lknit/Option;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        this.LLILZ = false;
        super.onResume();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() throws Exception {
        super.onStop();
        int i = C2514309tF.LIZ;
        if (i > 0) {
            this.LLILZ = true;
            this.LLILLL.removeCallbacks(this.LLILZIL);
            C786410Ut5.LJLIIL(i, this.LLILLL, this.LLILZIL);
            if (this.LLILLJJLI) {
                return;
            }
            this.LLILLJJLI = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            Context context = getContext();
            if (context != null) {
                C786410Ut5.LJIJJ(context, new C854540Xfg(this, 2), intentFilter);
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC1570850qyp
    public final void O9(ViewGroup viewGroup) {
        BusinessModuleService businessModuleService = (BusinessModuleService) PluggableExtentionKt.pluggableSpi$default(BusinessModuleService.class, false, false, false, 14, null);
        if (businessModuleService != null) {
            businessModuleService.updateRootViewAndState(viewGroup);
        }
    }
}
