package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.ButtonDO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class DialogActionDO implements Serializable {

    @C09CT("buttons")
    public final List<ButtonDO> buttons;

    @C09CT("orientation")
    public final String orientation;

    @C09CT("type")
    public final String type;

    public DialogActionDO() {
        this(null, null, null);
    }

    public DialogActionDO(String str, String str2, List<ButtonDO> list) {
        this.type = str;
        this.orientation = str2;
        this.buttons = list;
    }
}
