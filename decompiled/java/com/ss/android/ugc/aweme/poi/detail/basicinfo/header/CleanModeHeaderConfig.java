package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class CleanModeHeaderConfig implements Serializable {

    @C09CT("should_show_share")
    public final Integer shouldShowShare;

    public CleanModeHeaderConfig() {
        this(null);
    }

    public int hashCode() {
        Integer num = this.shouldShowShare;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CleanModeHeaderConfig(shouldShowShare=");
        sbLIZ.append(this.shouldShowShare);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CleanModeHeaderConfig(Integer num) {
        this.shouldShowShare = num;
    }
}
