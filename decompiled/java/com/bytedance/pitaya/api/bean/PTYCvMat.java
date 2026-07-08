package com.bytedance.pitaya.api.bean;

import android.graphics.Bitmap;
import com.bytedance.pitaya.media.GraphicByte;

/* JADX INFO: loaded from: classes27.dex */
public final class PTYCvMat extends PTYClass {
    public Bitmap bitmap;
    public GraphicByte graphicByte;

    public PTYCvMat() {
        this(null, null);
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final GraphicByte getGraphicByte() {
        return this.graphicByte;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setGraphicByte(GraphicByte graphicByte) {
        this.graphicByte = graphicByte;
    }

    public PTYCvMat(Bitmap bitmap, GraphicByte graphicByte) {
        super(2);
        this.bitmap = bitmap;
        this.graphicByte = graphicByte;
    }
}
