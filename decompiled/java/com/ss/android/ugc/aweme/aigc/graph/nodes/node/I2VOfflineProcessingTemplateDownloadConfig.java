package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I2VOfflineProcessingTemplateDownloadConfig implements Serializable {

    @C09CT("reserved")
    public final String reserved;

    public I2VOfflineProcessingTemplateDownloadConfig() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I2VOfflineProcessingTemplateDownloadConfig) && Intrinsics.LJFF(this.reserved, ((I2VOfflineProcessingTemplateDownloadConfig) obj).reserved);
    }

    public int hashCode() {
        String str = this.reserved;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VOfflineProcessingTemplateDownloadConfig(reserved=");
        sbLIZ.append(this.reserved);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public I2VOfflineProcessingTemplateDownloadConfig(String str) {
        this.reserved = str;
    }
}
