package com.bytedance.bmf_mods_api;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes21.dex */
public interface VideoSuperResolutionAPI {
    int GetQueuingTaskNum();

    int Init(int i, int i2, int i3, int i4, String str, String str2, String str3, int i5, int i6, int i7);

    Bitmap ProcessMultiScaleBitmap(Bitmap bitmap, int i, int i2);
}
