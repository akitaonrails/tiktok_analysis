package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class InviteAndShareConfig {

    @C09CT("auto_popup_anchor_panel")
    public final int autoPopupAnchorPanel;

    @C09CT("auto_popup_delay")
    public final long autoPopupDelay;

    @C09CT("auto_popup_order_page_schema")
    public final String autoPopupOrderPageSchema;

    public InviteAndShareConfig() {
        this("", 0, 1000L);
    }

    public InviteAndShareConfig(String str, int i, long j) {
        this.autoPopupOrderPageSchema = str;
        this.autoPopupAnchorPanel = i;
        this.autoPopupDelay = j;
    }
}
