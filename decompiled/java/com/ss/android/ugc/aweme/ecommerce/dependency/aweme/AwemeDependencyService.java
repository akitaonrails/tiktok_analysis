package com.ss.android.ugc.aweme.ecommerce.dependency.aweme;

import X.C04TD;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.IAwemeDependencyService;

/* JADX INFO: loaded from: classes3.dex */
public final class AwemeDependencyService implements IAwemeDependencyService {
    public void initService() {
    }

    public static IAwemeDependencyService createIAwemeDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IAwemeDependencyService.class, z);
        if (objLIZ != null) {
            return (IAwemeDependencyService) objLIZ;
        }
        if (C04TD.LLZZZIL == null) {
            synchronized (IAwemeDependencyService.class) {
                if (C04TD.LLZZZIL == null) {
                    C04TD.LLZZZIL = new AwemeDependencyService();
                }
            }
        }
        return C04TD.LLZZZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r2
      0x0027: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String), (r2v3 java.lang.String) binds: [B:8:0x0015, B:10:0x001f, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.IAwemeDependencyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C916703i9 getCurrentAwemeAuthorAvatar(X.C19EG r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r0 = X.C680080Qly.LIZIZ(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLJILJILJ
            r2 = 0
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarThumb()
        L13:
            X.03i9 r1 = new X.03i9
            if (r0 == 0) goto L27
            java.lang.String r2 = r0.getUri()
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L27
            java.util.List r0 = X.C13LP.LLIIII(r0)
            if (r0 != 0) goto L29
        L27:
            X.13BV r0 = X.C13BV.INSTANCE
        L29:
            r1.<init>(r2, r0)
            return r1
        L2d:
            r0 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.dependency.aweme.AwemeDependencyService.getCurrentAwemeAuthorAvatar(X.19EG):X.03i9");
    }
}
