package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.TextDO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class AccessoryDO implements Serializable {

    @C09CT("action")
    public final StellarActionDO action;

    @C09CT("arrow")
    public final Integer arrow;

    @C09CT("message")
    public final TextDO message;

    @C09CT("accessory_type")
    public final String type;

    public AccessoryDO() {
        this(null, null, null, null);
    }

    public AccessoryDO(String str, TextDO textDO, Integer num, StellarActionDO stellarActionDO) {
        this.type = str;
        this.message = textDO;
        this.arrow = num;
        this.action = stellarActionDO;
    }
}
