package com.ss.android.ugc.aweme.aigc.graph.nodes.node;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class I2VOfflineProcessingPostProcessingConfig implements Serializable {

    @C09CT("ignore_post_processing_failure")
    public final boolean ignorePostProcessingFailure;

    @C09CT("output_dir")
    public final String outputDir;

    public I2VOfflineProcessingPostProcessingConfig() {
        this(null, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2VOfflineProcessingPostProcessingConfig)) {
            return false;
        }
        I2VOfflineProcessingPostProcessingConfig i2VOfflineProcessingPostProcessingConfig = (I2VOfflineProcessingPostProcessingConfig) obj;
        return Intrinsics.LJFF(this.outputDir, i2VOfflineProcessingPostProcessingConfig.outputDir) && this.ignorePostProcessingFailure == i2VOfflineProcessingPostProcessingConfig.ignorePostProcessingFailure;
    }

    public int hashCode() {
        String str = this.outputDir;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.ignorePostProcessingFailure);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VOfflineProcessingPostProcessingConfig(outputDir=");
        sbLIZ.append(this.outputDir);
        sbLIZ.append(", ignorePostProcessingFailure=");
        sbLIZ.append(this.ignorePostProcessingFailure);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public I2VOfflineProcessingPostProcessingConfig(String str, boolean z) {
        this.outputDir = str;
        this.ignorePostProcessingFailure = z;
    }
}
