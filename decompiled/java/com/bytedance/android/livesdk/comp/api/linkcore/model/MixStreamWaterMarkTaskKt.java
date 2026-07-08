package com.bytedance.android.livesdk.comp.api.linkcore.model;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes34.dex */
public final class MixStreamWaterMarkTaskKt {
    public static final RectF toRectF(MixStreamWaterMarkRect mixStreamWaterMarkRect) {
        double d = mixStreamWaterMarkRect.left;
        double d2 = mixStreamWaterMarkRect.top;
        return new RectF((float) d, (float) d2, (float) (d + mixStreamWaterMarkRect.width), (float) (d2 + mixStreamWaterMarkRect.height));
    }
}
