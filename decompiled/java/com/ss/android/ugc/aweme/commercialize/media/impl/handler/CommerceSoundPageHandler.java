package com.ss.android.ugc.aweme.commercialize.media.impl.handler;

import X.C15M9;
import X.C15MA;
import X.C15MG;
import X.C19719612Di;
import X.InterfaceC20494615Hk;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceSoundPageHandler implements InterfaceC20494615Hk {
    @Override // X.InterfaceC20494615Hk
    public final void o01() {
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ()) {
            C15MA.LL.setInCommercialSoundPage(true);
        }
        C15MA.LL.getClass();
        ((ArrayList) C15MA.LLJILJIL).add(new C15MG());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C15MA.LL.getClass();
            C19719612Di.LJJIJIIJI(C15MA.LLJILJIL);
            C15MA.LJ(null);
            C15MA.LJFF(null);
            C15M9 c15m9 = C15MA.LLJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
            c15m9.LIZ(null);
        }
    }

    @Override // X.InterfaceC20494615Hk
    public final void n92(int i, Integer num, String str) {
        C15MA c15ma = C15MA.LL;
        C15MA.LJFF(Integer.valueOf(i));
        Integer numValueOf = null;
        if (str == null || !c15ma.getInCommercialSoundPage() || (num != null && num.intValue() == 0)) {
            str = null;
        }
        C15MA.LJ(str);
        if (num != null) {
            int iIntValue = num.intValue();
            if (c15ma.getInCommercialSoundPage() && iIntValue > 0) {
                numValueOf = Integer.valueOf(num.intValue() + 4);
            }
        }
        C15M9 c15m9 = C15MA.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C15MA.LLILLJJLI;
        c15m9.LIZ(numValueOf);
    }
}
