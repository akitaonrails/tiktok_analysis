package com.ss.android.ugc.playerkit.videoview.texturepool;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class FixTexturePoolParam implements Serializable {

    @C09CT("height")
    public int height;

    @C09CT("max_size")
    public int maxSize;

    @C09CT("width")
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixTexturePoolParam{width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", maxSize=");
        sbLIZ.append(this.maxSize);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMaxSize(int i) {
        this.maxSize = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
