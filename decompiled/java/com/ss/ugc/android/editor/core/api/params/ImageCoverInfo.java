package com.ss.ugc.android.editor.core.api.params;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCoverInfo {
    public final PointF cropLeftBottom;
    public final PointF cropLeftTop;
    public final PointF cropRightBottom;
    public final PointF cropRightTop;
    public final String path;

    public ImageCoverInfo(String str, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.path = str;
        this.cropLeftTop = pointF;
        this.cropRightTop = pointF2;
        this.cropLeftBottom = pointF3;
        this.cropRightBottom = pointF4;
    }
}
