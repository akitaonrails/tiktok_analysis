package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C1121500fI4;
import X.C2188811AlT;
import X.InterfaceC1992207rE;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TouchPointColor;

/* JADX INFO: loaded from: classes18.dex */
public final class FeedBubbleMetaData implements InterfaceC1992207rE {
    public static final C1121500fI4 LIZ = new Object() { // from class: X.0fI4
    };

    @C09CT("background_color")
    public final TouchPointColor background;

    @C09CT("left_icon")
    public final ImageModel icon;

    @C09CT("title")
    public final Text title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedBubbleMetaData)) {
            return false;
        }
        FeedBubbleMetaData feedBubbleMetaData = (FeedBubbleMetaData) obj;
        return Intrinsics.LJFF(this.title, feedBubbleMetaData.title) && Intrinsics.LJFF(this.icon, feedBubbleMetaData.icon) && Intrinsics.LJFF(this.background, feedBubbleMetaData.background);
    }

    public final int hashCode() {
        Text text = this.title;
        int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
        ImageModel imageModel = this.icon;
        int iHashCode2 = (iHashCode + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        TouchPointColor touchPointColor = this.background;
        return iHashCode2 + (touchPointColor != null ? touchPointColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedBubbleMetaData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", background=");
        sbLIZ.append(this.background);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedBubbleMetaData(Text text, ImageModel imageModel, TouchPointColor touchPointColor) {
        this.title = text;
        this.icon = imageModel;
        this.background = touchPointColor;
    }
}
