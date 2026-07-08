package com.ss.android.ugc.aweme.ecommercelive.common.container.lynxcard;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class LynxCardEventParams {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("animation_end_time")
    public final String animationEndTime;

    public LynxCardEventParams() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxCardEventParams(actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(", animationEndTime=");
        sbLIZ.append(this.animationEndTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LynxCardEventParams(Integer num, String str) {
        this.actionType = num;
        this.animationEndTime = str;
    }
}
