package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class TooltipEntityConfig {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public TooltipEntityConfig() {
        this("");
    }

    public TooltipEntityConfig(String str) {
        this.id = str;
    }
}
