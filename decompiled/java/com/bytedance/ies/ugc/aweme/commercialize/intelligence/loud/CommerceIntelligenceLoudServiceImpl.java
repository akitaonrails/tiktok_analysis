package com.bytedance.ies.ugc.aweme.commercialize.intelligence.loud;

import X.C1022620cia;
import X.C1484090oit;
import X.C274740Apk;
import X.C582130MsN;
import X.InterfaceC1484110oiv;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceIntelligenceLoudServiceImpl implements ICommerceIntelligenceLoudService {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.loud.ICommerceIntelligenceLoudService
    public final void LIZ() {
        if (((Number) C274740Apk.LIZ.getValue()).intValue() == 0 || this.LIZ) {
            return;
        }
        C582130MsN.LIZ().LJ().getClass();
        C1484090oit value = C1484090oit.LIZJ.getValue();
        InterfaceC1484110oiv<String> interfaceC1484110oiv = new InterfaceC1484110oiv<String>() { // from class: X.0cU9
            @Override // X.InterfaceC1484100oiu
            public final void getStrategyName() {
            }

            @Override // X.InterfaceC1484110oiv
            public final int LIZ() {
                return ((Number) C274740Apk.LIZ.getValue()).intValue();
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            @Override // X.InterfaceC1484100oiu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean LIZIZ(java.lang.Object r3) {
                /*
                    r2 = this;
                    java.lang.String r3 = (java.lang.String) r3
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.xr(r3)
                    if (r0 == 0) goto L20
                    boolean r1 = r0.isAd()
                    r0 = 1
                    if (r1 != r0) goto L20
                L1b:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L20:
                    r0 = 0
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1013670cU9.LIZIZ(java.lang.Object):java.lang.Boolean");
            }
        };
        value.getClass();
        C1484090oit.LIZIZ.add(interfaceC1484110oiv);
        this.LIZ = true;
        C1022620cia.LIZ("CommerceVideoLoud", "[initCommerceVideoStrategy], offset = AdVideoLoudOffsetSetting.get()");
    }
}
