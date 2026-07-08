package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeInfoExtraData implements Serializable {
    public static final int $stable = 0;

    @C09CT("current_price")
    public final String lastPrice;

    @C09CT("preload_animation_type")
    public final Integer preloadAnimationType;

    public ChangeInfoExtraData() {
        this(null, null);
    }

    public ChangeInfoExtraData(Integer num, String str) {
        this.preloadAnimationType = num;
        this.lastPrice = str;
    }
}
