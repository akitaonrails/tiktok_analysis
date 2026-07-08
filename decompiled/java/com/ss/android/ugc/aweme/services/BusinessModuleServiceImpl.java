package com.ss.android.ugc.aweme.services;

import X.C0X35;
import X.C0X37;
import X.C1594160raQ;
import X.C1601090rlb;
import X.C1601190rll;
import X.C285090BFj;
import X.C704270Rjt;
import X.EnumC2239808q4;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes25.dex */
public final class BusinessModuleServiceImpl implements BusinessModuleService {
    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void resetWatchState() {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null);
        if (mainLooperOptServiceLJFF != null) {
            for (EnumC2239808q4 enumC2239808q4 : EnumC2239808q4.values()) {
                ((HashMap) mainLooperOptServiceLJFF.LL).put(enumC2239808q4, Boolean.FALSE);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public boolean getDelayGetAidReturnCacheOpt() {
        return ((Boolean) C285090BFj.LJJJJI.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public boolean getDelayGetAidTaskOpt() {
        return ((Boolean) C285090BFj.LJJJJ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void getMainLooperOptServiceAndUpdateWatchMainFrame() {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(EnumC2239808q4.WATCH_MAIN_FRAME);
        if (mainLooperOptServiceLJFF != null) {
            mainLooperOptServiceLJFF.LJIJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void getMainLooperOptServiceAndUpdateWatchOriginalFocusMsg() {
        MainLooperOptService.LJFF(EnumC2239808q4.WATCH_SECOND_WINDOW_FOCUS_CHANGE);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void getMainLooperOptServiceAndUpdateWatchUIFrame() {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(EnumC2239808q4.WATCH_UI_FRAME);
        if (mainLooperOptServiceLJFF != null) {
            mainLooperOptServiceLJFF.LJIJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void notifyLiveFullColdBootEnd() {
        C0X35.LJIJ(C0X37.Live);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void notifyMallFullColdBootEnd() {
        C0X35.LJIJ(C0X37.Mall);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void notifyPDPFullColdBootEnd() {
        C0X35.LJIJ(C0X37.Pdp);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public boolean isColdBootTabDelayEnabled() {
        return C1601090rlb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public boolean isOriginalWindowFocusExecuted() {
        return MainLooperOptService.LJ().LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void notifyTabDelayRunsIfNeeded() {
        if (C1601090rlb.LIZ()) {
            C704270Rjt.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public IInitialChooseLanguageManager getInitialChooseLanguageManager() {
        return C1594160raQ.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void addRunAfterTrtPlayMsg(Runnable runnable) {
        C704270Rjt.LIZ(runnable);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void notifyFeedCacheCallback(Lock lock) {
        C1601190rll.LIZ(lock);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void setMainLooperOptServiceEnable(boolean z) {
        MainLooperOptService.LLJJJJLIIL = z;
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void updateRootViewAndState(View view) {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null);
        if (mainLooperOptServiceLJFF != null) {
            mainLooperOptServiceLJFF.LJIJJ(view);
            mainLooperOptServiceLJFF.LJIJJLI(EnumC2239808q4.WATCH_FIRST_WINDOW_FOCUS_CHANGE);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public boolean doAtTheEndOfMeasure(Choreographer choreographer, Runnable runnable) {
        return MainLooperOptService.LIZ(choreographer, runnable);
    }

    @Override // com.ss.android.ugc.aweme.services.BusinessModuleService
    public void getMainLooperOptServiceAndUpdateWatchSpecificMsg(Handler handler, int i) {
        MainLooperOptService mainLooperOptServiceLJFF = MainLooperOptService.LJFF(null);
        if (mainLooperOptServiceLJFF != null) {
            mainLooperOptServiceLJFF.LJIJJLI(EnumC2239808q4.WATCH_SPECIFIC_MSG);
            mainLooperOptServiceLJFF.LLJJJIL = handler;
            mainLooperOptServiceLJFF.LLJJJJ = i;
        }
    }
}
