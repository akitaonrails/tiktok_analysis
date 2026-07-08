package com.ss.android.ugc.aweme.commercialize.landpage;

import X.C1068380duO;
import X.C1068390duP;
import X.C305310Bxx;
import X.InterfaceC1164530gPT;
import com.ss.android.ugc.aweme.autofill.IAdAutofillRegisterEventService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillRegisterEventService implements IAdAutofillRegisterEventService {
    @Override // com.ss.android.ugc.aweme.autofill.IAdAutofillRegisterEventService
    public final void LIZ() {
        if (C1068390duP.LIZIZ) {
            return;
        }
        C1068390duP.LIZIZ = true;
        if (C1068380duO.LIZ && C305310Bxx.LIZ()) {
            new InterfaceC1164530gPT() { // from class: X.0duQ
                {
                    ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_address_change", this);
                    EventBus.LIZLLL().LJIJJ(this);
                }

                @C14EU(threadMode = ThreadMode.MAIN)
                public final void onUserInfoChangeEvent(C854270XfF c854270XfF) {
                    C1067990dtl.LJFF("7");
                }

                @Override // X.InterfaceC1164530gPT
                public final void onEvent(String str, String str2) {
                    C1067990dtl.LJFF("6");
                }
            };
        }
    }
}
