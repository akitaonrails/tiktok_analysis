package com.ss.android.ml.process.bl;

import X.C2188811AlT;
import X.InterfaceC1512630pSv;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class AfOPModel implements InterfaceC1512630pSv {
    public List<String> args;
    public List<String> labels;
    public String op;
    public List<Float> opts;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AfOPModel{labels=");
        sbLIZ.append(this.labels);
        sbLIZ.append(", op='");
        sbLIZ.append(this.op);
        sbLIZ.append('\'');
        sbLIZ.append(", args=");
        sbLIZ.append(this.args);
        sbLIZ.append(", opts=");
        sbLIZ.append(this.opts);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1512620pSu
    public List<String> getArgs() {
        return this.args;
    }

    @Override // X.InterfaceC1512630pSv
    public List<String> getLabels() {
        return this.labels;
    }

    @Override // X.InterfaceC1512620pSu
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // X.InterfaceC1512620pSu
    public String getOperator() {
        return this.op;
    }
}
