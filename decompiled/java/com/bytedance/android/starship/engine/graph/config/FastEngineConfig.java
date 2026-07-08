package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FastEngineConfig {

    @C09CT("b_data")
    public final String data;

    @C09CT("extra_inputs")
    public final String extraInputs;

    @C09CT("models")
    public final List<String> models;

    public FastEngineConfig() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastEngineConfig)) {
            return false;
        }
        FastEngineConfig fastEngineConfig = (FastEngineConfig) obj;
        return Intrinsics.LJFF(this.data, fastEngineConfig.data) && Intrinsics.LJFF(this.extraInputs, fastEngineConfig.extraInputs) && Intrinsics.LJFF(this.models, fastEngineConfig.models);
    }

    public final int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.extraInputs;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.models;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FastEngineConfig(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", extraInputs=");
        sbLIZ.append(this.extraInputs);
        sbLIZ.append(", models=");
        sbLIZ.append(this.models);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FastEngineConfig(String str, String str2, List<String> list) {
        this.data = str;
        this.extraInputs = str2;
        this.models = list;
    }
}
