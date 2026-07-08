package com.ss.ugc.android.editor.core.api.params;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class Resolution {
    public int height;
    public String name = "";
    public float ratio;
    public int resolution;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        sbLIZ.append(this.name);
        sbLIZ.append(" resolution:");
        sbLIZ.append(this.resolution);
        sbLIZ.append(" ratio:");
        sbLIZ.append(this.ratio);
        sbLIZ.append(" width:");
        sbLIZ.append(this.width);
        sbLIZ.append(" height:");
        sbLIZ.append(this.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getResolution() {
        return this.resolution;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setResolution(int i) {
        this.resolution = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public Resolution(int i, float f) {
        this.resolution = i;
        this.ratio = f;
        this.width = (i / 16) * 16;
        this.height = (((int) (i / f)) / 16) * 16;
    }
}
