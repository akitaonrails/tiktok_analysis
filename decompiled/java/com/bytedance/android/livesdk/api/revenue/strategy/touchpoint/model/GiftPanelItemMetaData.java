package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1992207rE;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPText;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPanelItemMetaData implements InterfaceC1992207rE {

    @C09CT("bt_content")
    public final TPText btContent;

    @C09CT("gift_id")
    public final Long giftId;

    @C09CT("icon")
    public final ImageModel icon;

    @C09CT("schema")
    public final String schema;

    @C09CT("sub_title")
    public final TPText subTitle;

    @C09CT("title")
    public final TPText title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPanelItemMetaData)) {
            return false;
        }
        GiftPanelItemMetaData giftPanelItemMetaData = (GiftPanelItemMetaData) obj;
        return Intrinsics.LJFF(this.title, giftPanelItemMetaData.title) && Intrinsics.LJFF(this.subTitle, giftPanelItemMetaData.subTitle) && Intrinsics.LJFF(this.btContent, giftPanelItemMetaData.btContent) && Intrinsics.LJFF(this.icon, giftPanelItemMetaData.icon) && Intrinsics.LJFF(this.giftId, giftPanelItemMetaData.giftId) && Intrinsics.LJFF(this.schema, giftPanelItemMetaData.schema);
    }

    public final int hashCode() {
        TPText tPText = this.title;
        int iHashCode = (tPText == null ? 0 : tPText.hashCode()) * 31;
        TPText tPText2 = this.subTitle;
        int iHashCode2 = (iHashCode + (tPText2 == null ? 0 : tPText2.hashCode())) * 31;
        TPText tPText3 = this.btContent;
        int iHashCode3 = (iHashCode2 + (tPText3 == null ? 0 : tPText3.hashCode())) * 31;
        ImageModel imageModel = this.icon;
        int iHashCode4 = (iHashCode3 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        Long l = this.giftId;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.schema;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftPanelItemMetaData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", btContent=");
        sbLIZ.append(this.btContent);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", giftId=");
        sbLIZ.append(this.giftId);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GiftPanelItemMetaData(TPText tPText, TPText tPText2, TPText tPText3, ImageModel imageModel, Long l, String str) {
        this.title = tPText;
        this.subTitle = tPText2;
        this.btContent = tPText3;
        this.icon = imageModel;
        this.giftId = l;
        this.schema = str;
    }
}
