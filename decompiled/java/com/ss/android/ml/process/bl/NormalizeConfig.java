package com.ss.android.ml.process.bl;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public class NormalizeConfig {
    public boolean enable;
    public float[] opts;
    public int opts_dim;
    public String type = "min_max";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MLConfigModel{enable='");
        sbLIZ.append(this.enable);
        sbLIZ.append('\'');
        sbLIZ.append(", type='");
        sbLIZ.append(this.type);
        sbLIZ.append('\'');
        sbLIZ.append(", opts_length=");
        sbLIZ.append(this.opts_dim);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
