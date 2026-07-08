package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class InteractionConfiguration implements Serializable {
    public static final int $stable = 0;

    @C09CT("use_fe_land_page_callback")
    public final Boolean useFeLandPageCallback;

    public InteractionConfiguration() {
        this(null);
    }

    public InteractionConfiguration(Boolean bool) {
        this.useFeLandPageCallback = bool;
    }
}
