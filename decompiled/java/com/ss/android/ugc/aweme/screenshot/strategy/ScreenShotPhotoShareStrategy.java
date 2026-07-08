package com.ss.android.ugc.aweme.screenshot.strategy;

import X.C1373440lqQ;
import X.C1374640lsM;
import X.InterfaceC1369790lkX;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotPhotoShareStrategy;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ScreenShotPhotoShareStrategy<T extends SharePackage> extends ScreenshotPhotoShareStrategy<T> {
    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final String LJII(SharePackage sharePackage) {
        String string = sharePackage.extras.getString("screenshot_image_path");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LIZ(InterfaceC1369790lkX interfaceC1369790lkX, SharePackage sharePackage) {
        String string = sharePackage.extras.getString("panel_source");
        if (string == null) {
            string = "";
        }
        if (TextUtils.equals("screenshot_popup", string) && !TextUtils.isEmpty(sharePackage.extras.getString("screenshot_image_path")) && !C1374640lsM.LJFF.contains(interfaceC1369790lkX.key())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LIZJ(InterfaceC1369790lkX interfaceC1369790lkX, String str, int i) {
        C1373440lqQ.LIZ.getClass();
        return C1373440lqQ.LIZIZ(interfaceC1369790lkX, str, i);
    }

    @Override // com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy
    public final boolean LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX, String str, int i) {
        C1373440lqQ.LIZ.getClass();
        if (!C1373440lqQ.LIZIZ(interfaceC1369790lkX, str, i) && !TextUtils.equals(interfaceC1369790lkX.key(), "email")) {
            return false;
        }
        return true;
    }
}
