package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public class PreverificationHelper {
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            return true;
        }
        return false;
    }
}
