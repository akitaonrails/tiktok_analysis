package com.ss.bytertc.base.media;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class Size {
    public int height;
    public int width;

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.width);
        sbLIZ.append("x");
        sbLIZ.append(this.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width != size.width || this.height != size.height) {
            return false;
        }
        return true;
    }

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
