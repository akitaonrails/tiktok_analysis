package com.bytedance.bpea.basics;

import X.C838130WuJ;
import X.InterfaceC20146213sC;

/* JADX INFO: loaded from: classes31.dex */
public final class CertProviderManager implements InterfaceC20146213sC {
    public static final CertProviderManager INSTANCE = new CertProviderManager();
    public static InterfaceC20146213sC certProvider;
    public static InterfaceC20146213sC defaultCertProvider;

    public final void setCertProvider(InterfaceC20146213sC interfaceC20146213sC) throws C838130WuJ {
        if (certProvider == null) {
            certProvider = interfaceC20146213sC;
            return;
        }
        throw new C838130WuJ(-1, "certProvider is already exist");
    }

    public final void setDefaultCertProvider(InterfaceC20146213sC interfaceC20146213sC) {
        defaultCertProvider = interfaceC20146213sC;
    }

    @Override // X.InterfaceC20146213sC
    public Cert findCert(String str, int i) {
        Cert certFindCert;
        InterfaceC20146213sC interfaceC20146213sC = certProvider;
        if (interfaceC20146213sC == null || (certFindCert = interfaceC20146213sC.findCert(str, i)) == null) {
            InterfaceC20146213sC interfaceC20146213sC2 = defaultCertProvider;
            if (interfaceC20146213sC2 != null) {
                return interfaceC20146213sC2.findCert(str, i);
            }
            return null;
        }
        return certFindCert;
    }

    @Override // X.InterfaceC20146213sC
    public Cert findCert(String str, int i, String str2) {
        Cert certFindCert;
        InterfaceC20146213sC interfaceC20146213sC = certProvider;
        if (interfaceC20146213sC == null || (certFindCert = interfaceC20146213sC.findCert(str, i, str2)) == null) {
            InterfaceC20146213sC interfaceC20146213sC2 = defaultCertProvider;
            if (interfaceC20146213sC2 != null) {
                return interfaceC20146213sC2.findCert(str, i, str2);
            }
            return null;
        }
        return certFindCert;
    }
}
