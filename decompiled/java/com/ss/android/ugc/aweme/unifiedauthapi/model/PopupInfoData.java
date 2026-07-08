package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PopupInfoData implements Serializable {

    @C09CT("scene_list")
    public final List<UnifiedAuthPopupConfig> scenes;

    @C09CT("version")
    public final int version;

    public PopupInfoData() {
        this(-1, new ArrayList());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupInfoData(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", scenes=");
        sbLIZ.append(this.scenes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PopupInfoData(int i, List<UnifiedAuthPopupConfig> list) {
        this.version = i;
        this.scenes = list;
    }
}
