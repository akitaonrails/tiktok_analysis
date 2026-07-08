package com.ss.android.ugc.aweme.assem;

import X.C1895210zPz;
import X.C1895600zQc;
import X.C18ZN;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SpecActAssem extends BaseMainPageFragmentAssem {
    public final C1895210zPz LLILLJJLI = new C18ZN() { // from class: X.0zPz
        @Override // X.C18ZN
        public final void onAppBackground() {
            C1619820sFo.LIZ.getClass();
            C1619820sFo.LIZIZ = false;
            C1898110zUf.LL.getClass();
            C01U6.LIZIZ(new C740090T1j());
            C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(776));
        }

        @Override // X.C18ZN
        public final void onAppForeground() {
            C1619820sFo.LIZ.getClass();
            C1619820sFo.LIZIZ = true;
            C1894360zOc.LIZ.getClass();
            if (C1894360zOc.LIZIZ) {
                C1894360zOc.LIZIZ = false;
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    iTouchPointModuleService.LJJ(10);
                }
            }
            C1898110zUf.LL.getClass();
            C01U6.LIZIZ(AFwS199S0000000_12.get$arr$(239));
            C1898560zVO.LL.getClass();
            C1898560zVO.LJIIJJI();
        }
    };

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJII();
        if (!C1895600zQc.LIZJ) {
            C1895600zQc.LIZJ = true;
            C1895600zQc.LIZ();
        }
        ActivityStack.addAppBackGroundListener(this.LLILLJJLI);
    }
}
