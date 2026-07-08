package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatComponentConfig {

    @C09CT("biz_data")
    public final String bizData;

    @C09CT("component_id")
    public final String componentId;

    @C09CT("enable")
    public boolean enable;

    public ChatComponentConfig() {
        this(false, "", null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatComponentConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", componentId=");
        sbLIZ.append(this.componentId);
        sbLIZ.append(", bizData=");
        sbLIZ.append(this.bizData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChatComponentConfig(boolean z, String str, String str2) {
        this.enable = z;
        this.componentId = str;
        this.bizData = str2;
    }
}
