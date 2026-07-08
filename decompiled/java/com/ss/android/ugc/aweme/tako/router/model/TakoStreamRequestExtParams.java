package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoStreamRequestExtParams implements Serializable {
    public static final int $stable = 8;

    @C09CT("custom_params")
    public Map<String, String> customParams;

    @C09CT("feed_bar")
    public String feedBar;

    @C09CT("sar_info")
    public String sarInfo;

    @C09CT("view_duration")
    public Long viewDuration;

    public TakoStreamRequestExtParams() {
        this(null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoStreamRequestExtParams(feedBar=");
        sbLIZ.append(this.feedBar);
        sbLIZ.append(", viewDuration=");
        sbLIZ.append(this.viewDuration);
        sbLIZ.append(", sarInfo=");
        sbLIZ.append(this.sarInfo);
        sbLIZ.append(", customParams=");
        sbLIZ.append(this.customParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setCustomParams(Map<String, String> map) {
        this.customParams = map;
    }

    public final void setFeedBar(String str) {
        this.feedBar = str;
    }

    public final void setSarInfo(String str) {
        this.sarInfo = str;
    }

    public final void setViewDuration(Long l) {
        this.viewDuration = l;
    }

    public TakoStreamRequestExtParams(String str, Long l, String str2, Map<String, String> map) {
        this.feedBar = str;
        this.viewDuration = l;
        this.sarInfo = str2;
        this.customParams = map;
    }
}
