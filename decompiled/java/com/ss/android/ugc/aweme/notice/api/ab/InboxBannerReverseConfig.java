package com.ss.android.ugc.aweme.notice.api.ab;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InboxBannerReverseConfig {

    @C09CT("enable")
    public final int enable;

    @C09CT("ignore_white_list")
    public final List<String> ignoreWhiteList;

    public InboxBannerReverseConfig() {
        this(0, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxBannerReverseConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", ignoreWhiteList=");
        sbLIZ.append(this.ignoreWhiteList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InboxBannerReverseConfig(int i, List<String> list) {
        this.enable = i;
        this.ignoreWhiteList = list;
    }
}
