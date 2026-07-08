package com.ss.android.vesdk.bean;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class VEInfoStickerParams {
    public float alpha;
    public int layer;
    public float positionX;
    public float positionY;
    public float rotate;
    public float scaleX;
    public float scaleY;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEInfoStickerParams{positionX=");
        sbLIZ.append(this.positionX);
        sbLIZ.append(", positionY=");
        sbLIZ.append(this.positionY);
        sbLIZ.append(", scaleX=");
        sbLIZ.append(this.scaleX);
        sbLIZ.append(", scaleY=");
        sbLIZ.append(this.scaleY);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.rotate);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", layer=");
        sbLIZ.append(this.layer);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public float getAlpha() {
        return this.alpha;
    }

    public int getLayer() {
        return this.layer;
    }

    public float getPositionX() {
        return this.positionX;
    }

    public float getPositionY() {
        return this.positionY;
    }

    public float getRotate() {
        return this.rotate;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setLayer(int i) {
        this.layer = i;
    }

    public void setPositionX(float f) {
        this.positionX = f;
    }

    public void setPositionY(float f) {
        this.positionY = f;
    }

    public void setRotate(float f) {
        this.rotate = f;
    }

    public void setScaleX(float f) {
        this.scaleX = f;
    }

    public void setScaleY(float f) {
        this.scaleY = f;
    }

    public VEInfoStickerParams(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.positionX = f;
        this.positionY = f2;
        this.scaleX = f3;
        this.scaleY = f4;
        this.rotate = f5;
        this.alpha = f6;
        this.layer = i;
    }
}
