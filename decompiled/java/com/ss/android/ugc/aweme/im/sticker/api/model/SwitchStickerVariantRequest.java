package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.SwitchStickerVariantItem;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchStickerVariantRequest {

    @C09CT("items")
    public final List<SwitchStickerVariantItem> items;

    public SwitchStickerVariantRequest() {
        this(null);
    }

    public SwitchStickerVariantRequest(List<SwitchStickerVariantItem> list) {
        this.items = list;
    }
}
