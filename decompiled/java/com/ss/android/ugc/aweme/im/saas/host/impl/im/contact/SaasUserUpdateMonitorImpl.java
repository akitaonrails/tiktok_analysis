package com.ss.android.ugc.aweme.im.saas.host.impl.im.contact;

import X.C1434905jX;
import X.C14EU;
import X.C622680Oba;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor;
import kotlin.Unit;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SaasUserUpdateMonitorImpl implements ISaasUserUpdateMonitor {
    public InterfaceC1631620sYq<? super String, ? super String, ? super BaseContact, Unit> LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor
    public final void LIZ() {
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor
    public final void LIZIZ() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.contact.ISaasUserUpdateMonitor
    public final void LIZJ(InterfaceC1631620sYq<? super String, ? super String, ? super BaseContact, Unit> interfaceC1631620sYq) {
        this.LIZIZ = interfaceC1631620sYq;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onUserUpdateEvent(C1434905jX c1434905jX) {
        InterfaceC1631620sYq<? super String, ? super String, ? super BaseContact, Unit> interfaceC1631620sYq = this.LIZIZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(c1434905jX.LIZ, c1434905jX.LIZIZ, c1434905jX.LIZJ);
        }
    }
}
