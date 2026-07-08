package com.ss.android.ugc.aweme.privacy;

import X.C04TD;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.aweme.services.privacy.ICreativeCertService;

/* JADX INFO: loaded from: classes34.dex */
public final class CreativeCertService implements ICreativeCertService {
    public static ICreativeCertService LIZ() {
        Object objLIZ = C04TD.LIZ(ICreativeCertService.class, false);
        if (objLIZ != null) {
            return (ICreativeCertService) objLIZ;
        }
        if (C04TD.k3 == null) {
            synchronized (ICreativeCertService.class) {
                if (C04TD.k3 == null) {
                    C04TD.k3 = new CreativeCertService();
                }
            }
        }
        return C04TD.k3;
    }

    @Override // com.ss.android.ugc.aweme.services.privacy.ICreativeCertService
    public final Cert getExceptionCloseAudioCert() {
        return CertProviderManagerKt.findCert("bpea-exception_close_mic", 1476788485);
    }

    @Override // com.ss.android.ugc.aweme.services.privacy.ICreativeCertService
    public final Cert getExceptionCloseCameraCert() {
        return CertProviderManagerKt.findCert("bpea-exception_close_camera", 1476788485);
    }
}
