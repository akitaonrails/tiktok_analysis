package com.ss.android.ugc.asve.context;

import X.C1442300ndU;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public final class PreviewSize {
    public static final C1442300ndU Companion = new Object() { // from class: X.0ndU
    };
    public final int height;
    public final int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewSize(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreviewSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
