package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeadAiSummary implements Serializable {

    @C09CT("click_enable")
    public final Boolean clickEnable;

    @C09CT("dimension_key")
    public final String dimensionKey;

    @C09CT("icon")
    public final DynamicIcon icon;

    @C09CT("recommendation_text")
    public final String recommendationText;

    public PoiHeadAiSummary() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiHeadAiSummary)) {
            return false;
        }
        PoiHeadAiSummary poiHeadAiSummary = (PoiHeadAiSummary) obj;
        return Intrinsics.LJFF(this.recommendationText, poiHeadAiSummary.recommendationText) && Intrinsics.LJFF(this.icon, poiHeadAiSummary.icon) && Intrinsics.LJFF(this.dimensionKey, poiHeadAiSummary.dimensionKey) && Intrinsics.LJFF(this.clickEnable, poiHeadAiSummary.clickEnable);
    }

    public int hashCode() {
        String str = this.recommendationText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DynamicIcon dynamicIcon = this.icon;
        int iHashCode2 = (iHashCode + (dynamicIcon == null ? 0 : dynamicIcon.hashCode())) * 31;
        String str2 = this.dimensionKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.clickEnable;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHeadAiSummary(recommendationText=");
        sbLIZ.append(this.recommendationText);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", dimensionKey=");
        sbLIZ.append(this.dimensionKey);
        sbLIZ.append(", clickEnable=");
        sbLIZ.append(this.clickEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiHeadAiSummary(String str, DynamicIcon dynamicIcon, String str2, Boolean bool) {
        this.recommendationText = str;
        this.icon = dynamicIcon;
        this.dimensionKey = str2;
        this.clickEnable = bool;
    }
}
