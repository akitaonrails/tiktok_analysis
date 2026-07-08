package com.ss.android.ugc.aweme.behavior.popup;

import X.C09CT;
import X.EnumC1616740sAq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MarketplacePopupParams {

    @C09CT("mode")
    public final String popupMode;

    @C09CT("schema")
    public final String popupSchema;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplacePopupParams)) {
            return false;
        }
        MarketplacePopupParams marketplacePopupParams = (MarketplacePopupParams) obj;
        return Intrinsics.LJFF(this.popupMode, marketplacePopupParams.popupMode) && Intrinsics.LJFF(this.popupSchema, marketplacePopupParams.popupSchema);
    }

    public MarketplacePopupParams() {
        this(EnumC1616740sAq.HALF_SCREEN_SHEET.getMode(), "");
    }

    public MarketplacePopupParams(String str, String str2) {
        this.popupMode = str;
        this.popupSchema = str2;
    }
}
