package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashClickConfig {

    @C09CT("additional_params")
    public final Map<String, String> additionalParams;

    @C09CT("schema")
    public final String schema;

    public SlashClickConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashClickConfig)) {
            return false;
        }
        SlashClickConfig slashClickConfig = (SlashClickConfig) obj;
        return Intrinsics.LJFF(this.schema, slashClickConfig.schema) && Intrinsics.LJFF(this.additionalParams, slashClickConfig.additionalParams);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.additionalParams;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashClickConfig(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", additionalParams=");
        sbLIZ.append(this.additionalParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashClickConfig(String str, Map<String, String> map) {
        this.schema = str;
        this.additionalParams = map;
    }
}
