package com.lynx.fresco;

import X.C1315790kLR;
import X.C1322200kVm;
import X.C1325700kbQ;
import X.InterfaceC1320200kSY;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: loaded from: classes10.dex */
public class FrescoImagePrefetchHelper {
    public static InterfaceC1320200kSY<Void> prefetchImageToBitmapCache(String str, Bitmap.Config config, Object obj) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Uri uri = UriProtector.parse(str);
        if (uri.getScheme() == null) {
            return null;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        C1315790kLR.LIZIZ(c1325700kbQLIZLLL, config, false);
        return C1322200kVm.LIZ().LJIIZILJ(c1325700kbQLIZLLL.LIZ(), obj);
    }
}
