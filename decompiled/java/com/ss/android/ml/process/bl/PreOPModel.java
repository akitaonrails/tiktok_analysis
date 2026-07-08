package com.ss.android.ml.process.bl;

import X.C2188811AlT;
import X.InterfaceC1512760pT8;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class PreOPModel implements InterfaceC1512760pT8 {
    public List<String> args;
    public String feature;
    public List<String> labels;
    public List<String> lables;
    public int length;
    public String op;
    public List<Float> opts;
    public String type;
    public int vector_length;
    public int vector_num;

    @Override // X.InterfaceC1512760pT8
    public List<String> getLabels() {
        List<String> list = this.labels;
        return list != null ? list : this.lables;
    }

    @Override // X.InterfaceC1512760pT8
    public int getLength() {
        return (getVectorLength() <= 0 || getVectorNum() <= 0) ? this.length : getVectorLength() * getVectorNum();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreOPModel{feature='");
        sbLIZ.append(this.feature);
        sbLIZ.append('\'');
        sbLIZ.append(", op='");
        sbLIZ.append(this.op);
        sbLIZ.append('\'');
        sbLIZ.append(", args=");
        sbLIZ.append(this.args);
        sbLIZ.append(", opts=");
        sbLIZ.append(this.opts);
        sbLIZ.append(", labels=");
        sbLIZ.append(getLabels());
        sbLIZ.append(", length=");
        sbLIZ.append(this.length);
        sbLIZ.append(", type='");
        sbLIZ.append(this.type);
        sbLIZ.append('\'');
        sbLIZ.append(", vector_length=");
        sbLIZ.append(this.vector_length);
        sbLIZ.append(", vector_num=");
        sbLIZ.append(this.vector_num);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1512620pSu
    public List<String> getArgs() {
        return this.args;
    }

    @Override // X.InterfaceC1512760pT8
    public String getFeature() {
        return this.feature;
    }

    @Override // X.InterfaceC1512620pSu
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // X.InterfaceC1512620pSu
    public String getOperator() {
        return this.op;
    }

    @Override // X.InterfaceC1512760pT8
    public String getType() {
        return this.type;
    }

    @Override // X.InterfaceC1512760pT8
    public int getVectorLength() {
        return this.vector_length;
    }

    @Override // X.InterfaceC1512760pT8
    public int getVectorNum() {
        return this.vector_num;
    }
}
