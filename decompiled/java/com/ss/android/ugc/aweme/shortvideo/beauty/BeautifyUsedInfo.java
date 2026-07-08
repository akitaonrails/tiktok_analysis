package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes27.dex */
public final class BeautifyUsedInfo {

    @C09CT("beautify_used_info")
    public final List<BeautifyUesTabInfo> info;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautifyUsedInfo(info=");
        sbLIZ.append(this.info);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BeautifyUsedInfo() {
        this(new CopyOnWriteArrayList());
    }

    public BeautifyUsedInfo(List<BeautifyUesTabInfo> list) {
        this.info = list;
    }
}
