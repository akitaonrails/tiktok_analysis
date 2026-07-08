package com.ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: loaded from: classes7.dex */
public class VEMusicBitmapParam {
    public int lineCnt;
    public Bitmap lyricsBitmap;

    public void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    public VEMusicBitmapParam(Bitmap bitmap, int i) {
        this.lyricsBitmap = bitmap;
        this.lineCnt = i;
    }
}
