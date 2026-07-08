package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C5182020e;

/* JADX INFO: loaded from: classes.dex */
public final class BubbleClickAction {
    public final C01GW LIZ;

    @C09CT("jump_type")
    public final Integer jumpType;

    @C09CT("live_bag_info")
    public final String liveBagInfo;

    @C09CT("schema")
    public final String schema;

    public BubbleClickAction() {
        this(1, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleClickAction(jumpType=");
        sbLIZ.append(this.jumpType);
        sbLIZ.append(", liveBagInfo=");
        sbLIZ.append(this.liveBagInfo);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BubbleClickAction(Integer num, String str, String str2) {
        this.jumpType = num;
        this.liveBagInfo = str;
        this.schema = str2;
        this.LIZ = C452501pT.LIZIZ(new C5182020e(this, 107));
    }
}
