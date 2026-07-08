package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class StrokeDO implements Serializable {

    @C09CT("color")
    public final ColorDO color;

    @C09CT("width")
    public final Integer width;

    public StrokeDO() {
        this(null, null);
    }

    public StrokeDO(ColorDO colorDO, Integer num) {
        this.color = colorDO;
        this.width = num;
    }
}
