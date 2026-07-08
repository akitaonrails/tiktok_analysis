package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInteractionConfig {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("type")
    public final Integer type;

    public TakoInteractionConfig() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoInteractionConfig)) {
            return false;
        }
        TakoInteractionConfig takoInteractionConfig = (TakoInteractionConfig) obj;
        return Intrinsics.LJFF(this.type, takoInteractionConfig.type) && Intrinsics.LJFF(this.status, takoInteractionConfig.status);
    }

    public TakoInteractionConfig(Integer num, Integer num2) {
        this.type = num;
        this.status = num2;
    }
}
