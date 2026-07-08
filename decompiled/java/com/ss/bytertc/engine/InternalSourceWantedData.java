package com.ss.bytertc.engine;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class InternalSourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalSourceWantedData{width='");
        sbLIZ.append(this.width);
        sbLIZ.append('\'');
        sbLIZ.append(", height='");
        sbLIZ.append(this.height);
        sbLIZ.append('\'');
        sbLIZ.append(", frameRate='");
        sbLIZ.append(this.frameRate);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InternalSourceWantedData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }

    public static InternalSourceWantedData create(int i, int i2, int i3) {
        return new InternalSourceWantedData(i, i2, i3);
    }
}
