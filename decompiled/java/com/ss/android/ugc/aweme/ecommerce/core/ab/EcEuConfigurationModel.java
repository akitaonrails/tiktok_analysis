package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcEuConfigurationModel {

    @C09CT("disable_inductive_popup")
    public final boolean closePopupInducedConfig;

    @C09CT("region_select_page_style")
    public final int regionSelectPageStyle;

    public EcEuConfigurationModel() {
        this(false, 0);
    }

    public EcEuConfigurationModel(boolean z, int i) {
        this.closePopupInducedConfig = z;
        this.regionSelectPageStyle = i;
    }
}
