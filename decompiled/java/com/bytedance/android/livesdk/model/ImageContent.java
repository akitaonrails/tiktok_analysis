package com.bytedance.android.livesdk.model;

import X.C09CT;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class ImageContent {
    public transient Bitmap LIZ;

    @C09CT("fill_mode")
    public int fillMode;

    @C09CT("image")
    public ImageModel image;

    @C09CT("image_height")
    public SizeSpec imageHeight;

    @C09CT("image_width")
    public SizeSpec imageWidth;

    @C09CT("primary_color")
    public String primaryColor = "";
}
