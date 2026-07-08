package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1992207rE;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPText;
import webcast.data.TouchPointBackground;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPanelBannerMetaData implements InterfaceC1992207rE {

    @C09CT("content")
    public final TPText content;

    @C09CT("countdown_ts")
    public final TPText countdownTs;

    @C09CT("icon")
    public final ImageModel icon;

    @C09CT("panel_background")
    public final TouchPointBackground panelBackground;

    @C09CT("schema")
    public final String schema;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPanelBannerMetaData)) {
            return false;
        }
        GiftPanelBannerMetaData giftPanelBannerMetaData = (GiftPanelBannerMetaData) obj;
        return Intrinsics.LJFF(this.icon, giftPanelBannerMetaData.icon) && Intrinsics.LJFF(this.content, giftPanelBannerMetaData.content) && Intrinsics.LJFF(this.schema, giftPanelBannerMetaData.schema) && Intrinsics.LJFF(this.panelBackground, giftPanelBannerMetaData.panelBackground) && Intrinsics.LJFF(this.countdownTs, giftPanelBannerMetaData.countdownTs);
    }

    public final int hashCode() {
        ImageModel imageModel = this.icon;
        int iHashCode = (imageModel == null ? 0 : imageModel.hashCode()) * 31;
        TPText tPText = this.content;
        int iHashCode2 = (iHashCode + (tPText == null ? 0 : tPText.hashCode())) * 31;
        String str = this.schema;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TouchPointBackground touchPointBackground = this.panelBackground;
        int iHashCode4 = (iHashCode3 + (touchPointBackground == null ? 0 : touchPointBackground.hashCode())) * 31;
        TPText tPText2 = this.countdownTs;
        return iHashCode4 + (tPText2 != null ? tPText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftPanelBannerMetaData(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", panelBackground=");
        sbLIZ.append(this.panelBackground);
        sbLIZ.append(", countdownTs=");
        sbLIZ.append(this.countdownTs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GiftPanelBannerMetaData(ImageModel imageModel, TPText tPText, String str, TouchPointBackground touchPointBackground, TPText tPText2) {
        this.icon = imageModel;
        this.content = tPText;
        this.schema = str;
        this.panelBackground = touchPointBackground;
        this.countdownTs = tPText2;
    }
}
