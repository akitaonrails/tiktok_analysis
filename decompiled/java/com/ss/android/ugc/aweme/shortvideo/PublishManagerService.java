package com.ss.android.ugc.aweme.shortvideo;

import X.C04TD;
import X.C1443030nef;
import com.ss.android.ugc.aweme.publish.IPublishManagerService;

/* JADX INFO: loaded from: classes9.dex */
public final class PublishManagerService implements IPublishManagerService {
    public static IPublishManagerService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPublishManagerService.class, false);
        if (objLIZ != null) {
            return (IPublishManagerService) objLIZ;
        }
        if (C04TD.e5 == null) {
            synchronized (IPublishManagerService.class) {
                if (C04TD.e5 == null) {
                    C04TD.e5 = new PublishManagerService();
                }
            }
        }
        return C04TD.e5;
    }

    @Override // com.ss.android.ugc.aweme.publish.IPublishManagerService
    public final void LIZ() {
        C1443030nef.LJII().LJIIIZ();
    }
}
