package com.ss.android.ugc.aweme.compliance.consent.deviceconsent.config;

import X.C0VU1;
import X.C1514430pVp;
import X.EnumC799870VZh;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;

/* JADX INFO: loaded from: classes29.dex */
public final class PrioritizedConsentConfigInitTask extends AbstractConsentConfigInitTask implements InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PrioritizedConsentConfigInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ;
        if (C1514430pVp.LIZLLL().booleanValue() && (iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ()) != null) {
            iPNSConsentConfigServiceLJIIIZ.LJ(null, null);
        }
    }
}
