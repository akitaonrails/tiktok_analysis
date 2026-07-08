package com.ss.android.ugc.aweme.compliance.consent.deviceconsent.config;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799980VZs;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractConsentConfigInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }
}
