package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class ImageAction {

    @C09CT("bypass_img_2_video")
    public final boolean bypassImg2Video;

    public ImageAction() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageAction) && this.bypassImg2Video == ((ImageAction) obj).bypassImg2Video;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.bypassImg2Video);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageAction(bypassImg2Video=");
        sbLIZ.append(this.bypassImg2Video);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageAction(boolean z) {
        this.bypassImg2Video = z;
    }
}
