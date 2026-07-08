package com.ugc.android.clientai.lang.message;

import X.C09CT;
import X.C1524190plZ;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes24.dex */
public final class ImageContent {
    public static final C1524190plZ Companion = new Object() { // from class: X.0plZ
    };

    @C09CT("bitmap")
    public final Bitmap bitmap;

    @C09CT("channels")
    public final Integer channels;

    @C09CT("height")
    public final Integer height;

    @C09CT("imagePointer")
    public Long imagePointer;

    @C09CT("width")
    public final Integer width;

    public ImageContent() {
        this(null, null, null, null, null);
    }

    public final boolean hasImageData() {
        return (this.bitmap == null && this.imagePointer == null) ? false : true;
    }

    public final boolean isPreprocessed() {
        return this.imagePointer != null;
    }

    public final void setImagePointer(Long l) {
        this.imagePointer = l;
    }

    public ImageContent(Bitmap bitmap, Integer num, Integer num2, Integer num3, Long l) {
        this.bitmap = bitmap;
        this.width = num;
        this.height = num2;
        this.channels = num3;
        this.imagePointer = l;
    }
}
