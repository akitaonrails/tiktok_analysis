package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PopupCardBffData {

    @C09CT("card_config")
    public final BFFCardConfig cardConfig;

    @C09CT("card_ui_config")
    public final BFFUIConfig cardUiConfig;

    public PopupCardBffData() {
        this(null, null);
    }

    public PopupCardBffData(BFFUIConfig bFFUIConfig, BFFCardConfig bFFCardConfig) {
        this.cardUiConfig = bFFUIConfig;
        this.cardConfig = bFFCardConfig;
    }
}
