package com.ss.android.ugc.aweme.im.sharepanel.impl.service;

import X.C04TD;
import X.C0CCZ;
import com.ss.android.ugc.aweme.im.sharepanel.api.service.IImMediaShareService;
import com.ss.android.ugc.aweme.im.sharepanel.impl.screenshotshare.InternalShareScreenshotTask;

/* JADX INFO: loaded from: classes3.dex */
public final class ImMediaShareService implements IImMediaShareService {
    public static IImMediaShareService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IImMediaShareService.class, false);
        if (objLIZ != null) {
            return (IImMediaShareService) objLIZ;
        }
        if (C04TD.i1 == null) {
            synchronized (IImMediaShareService.class) {
                if (C04TD.i1 == null) {
                    C04TD.i1 = new ImMediaShareService();
                }
            }
        }
        return C04TD.i1;
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.service.IImMediaShareService
    public final C0CCZ LIZ() {
        return new InternalShareScreenshotTask();
    }
}
