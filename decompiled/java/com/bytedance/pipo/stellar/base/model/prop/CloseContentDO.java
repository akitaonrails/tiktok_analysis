package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CloseContentDO implements Serializable {

    @C09CT("close_type")
    public final Integer closeType;

    @C09CT("target_id")
    public final String targetId;

    public CloseContentDO() {
        this(null, null);
    }

    public CloseContentDO(Integer num, String str) {
        this.closeType = num;
        this.targetId = str;
    }
}
