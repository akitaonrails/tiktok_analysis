package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1992207rE;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPanelMetaData implements InterfaceC1992207rE {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("banner")
    public final GiftPanelBannerMetaData banner;

    @C09CT("item")
    public final GiftPanelItemMetaData item;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPanelMetaData)) {
            return false;
        }
        GiftPanelMetaData giftPanelMetaData = (GiftPanelMetaData) obj;
        return Intrinsics.LJFF(this.item, giftPanelMetaData.item) && Intrinsics.LJFF(this.banner, giftPanelMetaData.banner);
    }

    public final int hashCode() {
        GiftPanelItemMetaData giftPanelItemMetaData = this.item;
        int iHashCode = (giftPanelItemMetaData == null ? 0 : giftPanelItemMetaData.hashCode()) * 31;
        GiftPanelBannerMetaData giftPanelBannerMetaData = this.banner;
        return iHashCode + (giftPanelBannerMetaData != null ? giftPanelBannerMetaData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftPanelMetaData(item=");
        sbLIZ.append(this.item);
        sbLIZ.append(", banner=");
        sbLIZ.append(this.banner);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GiftPanelMetaData(GiftPanelItemMetaData giftPanelItemMetaData, GiftPanelBannerMetaData giftPanelBannerMetaData) {
        this.item = giftPanelItemMetaData;
        this.banner = giftPanelBannerMetaData;
    }
}
