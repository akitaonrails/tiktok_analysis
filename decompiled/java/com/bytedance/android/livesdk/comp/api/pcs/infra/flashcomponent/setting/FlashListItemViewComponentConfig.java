package com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class FlashListItemViewComponentConfig {
    public String LIZ;

    @C09CT("f_order")
    public final int fallbackOrder;

    @C09CT("op")
    public final int op;

    @C09CT("slot_id")
    public final String slotComponentId;

    @C09CT("url")
    public final String url;

    public FlashListItemViewComponentConfig() {
        this(0, "", "", -1);
    }

    public FlashListItemViewComponentConfig(int i, String str, String str2, int i2) {
        this.op = i;
        this.url = str;
        this.slotComponentId = str2;
        this.fallbackOrder = i2;
        this.LIZ = "";
    }
}
