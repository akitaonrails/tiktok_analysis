package com.ss.android.ugc.aweme.main.spi;

import X.C0BVA;
import X.C1565380qq0;
import X.C786410Ut5;
import X.EnumC1585940rNA;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import com.ss.android.ugc.aweme.spi.IHomePageService;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public class HomePageServiceImpl implements IHomePageService {
    @Override // com.ss.android.ugc.aweme.spi.IHomePageService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomePageService
    public final void LIZ() {
        NonPersonalizedAssem.LLJLL.getClass();
        NonPersonalizedAssem.LLJLLL = true;
        BPEAHandler bPEAHandler = NonPersonalizedAssem.LLJZ;
        bPEAHandler.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(10000L, bPEAHandler, new Runnable() { // from class: X.0qpy
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NonPersonalizedAssem$Companion@f19d.hideConsent$1");
                try {
                    NonPersonalizedAssem.LLJLLL = false;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NonPersonalizedAssem$Companion@f19d.hideConsent$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomePageService
    public final TabAbilityAssem LIZLLL() {
        IMainContainerAssemProvider iMainContainerAssemProvider = (IMainContainerAssemProvider) PluggableExtentionKt.pluggableSpi$default(IMainContainerAssemProvider.class, false, false, false, 14, null);
        if (iMainContainerAssemProvider != null) {
            return iMainContainerAssemProvider.LIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomePageService
    public final boolean LJ() {
        return C0BVA.LIZ() >= 1;
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomePageService
    public final boolean LIZIZ(String str) {
        C1565380qq0.LIZ.getClass();
        EnumC1585940rNA enumC1585940rNA = (EnumC1585940rNA) ((Map) C1565380qq0.LIZJ.getValue()).get(str);
        if (enumC1585940rNA != null && enumC1585940rNA.operatorInvoke()) {
            return true;
        }
        return false;
    }
}
