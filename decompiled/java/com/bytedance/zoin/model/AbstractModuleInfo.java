package com.bytedance.zoin.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public class AbstractModuleInfo {
    public String algorithm;
    public String moduleName;
    public int moduleType;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbstractModuleInfo{moduleName='");
        sbLIZ.append(this.moduleName);
        sbLIZ.append('\'');
        sbLIZ.append(", moduleType=");
        sbLIZ.append(this.moduleType);
        sbLIZ.append(", algorithm='");
        sbLIZ.append(this.algorithm);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
