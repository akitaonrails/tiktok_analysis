package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UploadRequestInfoConfig {

    @C09CT("error_types")
    public final List<String> errorTypes;

    @C09CT("host")
    public final String host;

    @C09CT("path")
    public final String path;

    @C09CT("tool_names")
    public final List<String> toolNames;

    public UploadRequestInfoConfig() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadRequestInfoConfig)) {
            return false;
        }
        UploadRequestInfoConfig uploadRequestInfoConfig = (UploadRequestInfoConfig) obj;
        return Intrinsics.LJFF(this.path, uploadRequestInfoConfig.path) && Intrinsics.LJFF(this.host, uploadRequestInfoConfig.host) && Intrinsics.LJFF(this.errorTypes, uploadRequestInfoConfig.errorTypes) && Intrinsics.LJFF(this.toolNames, uploadRequestInfoConfig.toolNames);
    }

    public final int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.host;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.errorTypes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.toolNames;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadRequestInfoConfig(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", host=");
        sbLIZ.append(this.host);
        sbLIZ.append(", errorTypes=");
        sbLIZ.append(this.errorTypes);
        sbLIZ.append(", toolNames=");
        sbLIZ.append(this.toolNames);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UploadRequestInfoConfig(String str, String str2, List<String> list, List<String> list2) {
        this.path = str;
        this.host = str2;
        this.errorTypes = list;
        this.toolNames = list2;
    }
}
