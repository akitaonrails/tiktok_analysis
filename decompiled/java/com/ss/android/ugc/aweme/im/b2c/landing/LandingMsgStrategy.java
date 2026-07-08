package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LandingMsgStrategy {

    @C09CT("visible")
    public final int visibleType;

    @C09CT("visible_user_ids")
    public final List<Long> visibleUIDS;

    public LandingMsgStrategy() {
        this(0, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandingMsgStrategy(visibleType=");
        sbLIZ.append(this.visibleType);
        sbLIZ.append(", visibleUIDS=");
        sbLIZ.append(this.visibleUIDS);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LandingMsgStrategy(int i, List<Long> list) {
        this.visibleType = i;
        this.visibleUIDS = list;
    }
}
