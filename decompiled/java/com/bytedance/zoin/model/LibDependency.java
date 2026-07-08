package com.bytedance.zoin.model;

import X.C2188811AlT;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class LibDependency {
    public LinkedList<String> depsList = new LinkedList<>();
    public String libName;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LibDependency{libName='");
        sbLIZ.append(this.libName);
        sbLIZ.append('\'');
        sbLIZ.append(", depsList=");
        sbLIZ.append(this.depsList);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
