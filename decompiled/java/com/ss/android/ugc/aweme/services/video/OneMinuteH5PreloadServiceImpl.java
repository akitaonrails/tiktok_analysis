package com.ss.android.ugc.aweme.services.video;

import X.C04TD;
import X.C2532209w8;
import X.C2532309w9;
import X.C523710KgL;

/* JADX INFO: loaded from: classes9.dex */
public final class OneMinuteH5PreloadServiceImpl implements IOneMinuteH5PreloadServiceImpl {
    public static final int $stable = 8;
    public C523710KgL allowOneMinuteVideoNoticeKeva = new C523710KgL();

    @Override // com.ss.android.ugc.aweme.services.video.IOneMinuteH5PreloadServiceImpl
    public boolean shouldPreloadWebView() {
        return C2532309w9.LIZ && !this.allowOneMinuteVideoNoticeKeva.LIZ.getBoolean("learn_more_entered", false) && this.allowOneMinuteVideoNoticeKeva.LIZ.getInt("prompt_display_count", 0) < C2532209w8.LIZ;
    }

    public static IOneMinuteH5PreloadServiceImpl createIOneMinuteH5PreloadServiceImplbyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IOneMinuteH5PreloadServiceImpl.class, z);
        if (objLIZ != null) {
            return (IOneMinuteH5PreloadServiceImpl) objLIZ;
        }
        if (C04TD.N4 == null) {
            synchronized (IOneMinuteH5PreloadServiceImpl.class) {
                if (C04TD.N4 == null) {
                    C04TD.N4 = new OneMinuteH5PreloadServiceImpl();
                }
            }
        }
        return C04TD.N4;
    }
}
