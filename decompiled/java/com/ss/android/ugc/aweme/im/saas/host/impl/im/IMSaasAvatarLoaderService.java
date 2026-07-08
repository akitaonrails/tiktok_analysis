package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C1331670kl3;
import X.C1890720zIk;
import X.C1890810zIt;
import X.InterfaceC658750Psf;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostAvatarLoaderApi;

/* JADX INFO: loaded from: classes29.dex */
public final class IMSaasAvatarLoaderService implements IMHostAvatarLoaderApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostAvatarLoaderApi
    public final C1331670kl3 LIZ(C1331670kl3 c1331670kl3, InterfaceC658750Psf interfaceC658750Psf) {
        if (C1890720zIk.LIZ().enable) {
            if (interfaceC658750Psf == null) {
                interfaceC658750Psf = c1331670kl3.LJJJIL;
            }
            c1331670kl3.LJJJIL = new C1890810zIt(interfaceC658750Psf);
        }
        return c1331670kl3;
    }
}
