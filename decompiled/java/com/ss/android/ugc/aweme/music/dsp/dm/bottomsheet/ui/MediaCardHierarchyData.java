package com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MediaCardHierarchyData implements InterfaceC111300bX {
    public final DmMessageConfig dmMessageConfig;

    public final MediaCardHierarchyData copy(DmMessageConfig dmMessageConfig) {
        return new MediaCardHierarchyData(dmMessageConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediaCardHierarchyData) && Intrinsics.LJFF(this.dmMessageConfig, ((MediaCardHierarchyData) obj).dmMessageConfig);
    }

    public int hashCode() {
        DmMessageConfig dmMessageConfig = this.dmMessageConfig;
        if (dmMessageConfig == null) {
            return 0;
        }
        return dmMessageConfig.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaCardHierarchyData(dmMessageConfig=");
        sbLIZ.append(this.dmMessageConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final DmMessageConfig getDmMessageConfig() {
        return this.dmMessageConfig;
    }

    public MediaCardHierarchyData(DmMessageConfig dmMessageConfig) {
        this.dmMessageConfig = dmMessageConfig;
    }
}
