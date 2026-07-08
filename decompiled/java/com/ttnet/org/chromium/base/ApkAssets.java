package com.ttnet.org.chromium.base;

import X.C787230UuP;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class ApkAssets {
    public static long[] open(String str, String str2) {
        String[] strArr;
        AssetFileDescriptor assetFileDescriptorOpenNonAssetFd = null;
        try {
            try {
                Context context = C787230UuP.LIZ;
                if (!TextUtils.isEmpty(str2) && Build.VERSION.SDK_INT >= 26 && (strArr = context.getApplicationInfo().splitNames) != null) {
                    Arrays.asList(strArr).contains(str2);
                }
                assetFileDescriptorOpenNonAssetFd = context.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptorOpenNonAssetFd.getParcelFileDescriptor().detachFd(), assetFileDescriptorOpenNonAssetFd.getStartOffset(), assetFileDescriptorOpenNonAssetFd.getLength()};
                try {
                    assetFileDescriptorOpenNonAssetFd.close();
                    return jArr;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return jArr;
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (!e2.getMessage().equals("")) {
                    e2.getMessage().equals(str);
                }
                long[] jArr2 = {-1, -1, -1};
                if (assetFileDescriptorOpenNonAssetFd != null) {
                    try {
                        assetFileDescriptorOpenNonAssetFd.close();
                        return jArr2;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return jArr2;
                    }
                }
                return jArr2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (assetFileDescriptorOpenNonAssetFd != null) {
                try {
                    assetFileDescriptorOpenNonAssetFd.close();
                    throw th;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw th;
                }
            }
            throw th;
        }
    }
}
