package com.bytedance.pipo.stellar.base.model.prop;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselPageChangeContent implements Serializable {

    @C09CT("indicatorPosition")
    public final Integer position;

    public CarouselPageChangeContent() {
        this(null);
    }

    public CarouselPageChangeContent(Integer num) {
        this.position = num;
    }
}
