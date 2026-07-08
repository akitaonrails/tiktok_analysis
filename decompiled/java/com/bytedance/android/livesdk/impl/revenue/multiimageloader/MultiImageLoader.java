package com.bytedance.android.livesdk.impl.revenue.multiimageloader;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.android.livesdk.api.revenue.multiimageloader.IMultiImageLoader;

/* JADX INFO: loaded from: classes36.dex */
public class MultiImageLoader implements IMultiImageLoader {
    @Override // com.bytedance.android.livesdk.api.revenue.multiimageloader.IMultiImageLoader
    public final void Q90(Bitmap bitmap, ImageView imageView) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
