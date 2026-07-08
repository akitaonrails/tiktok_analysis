package com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiScrollingBubble extends BaseComponentData implements Serializable {

    @C09CT("ai_summary_dimension_key")
    public final String aiSummaryDimensionKey;

    @C09CT("avatar_list")
    public final List<UrlModel> avatarList;

    @C09CT("bubble_type")
    public final Integer bubbleType;

    @C09CT("display_text")
    public final String displayText;

    public PoiScrollingBubble() {
        this(null, null, null, null);
    }

    public final PoiScrollingBubble copy(Integer num, String str, List<? extends UrlModel> list, String str2) {
        return new PoiScrollingBubble(num, str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiScrollingBubble)) {
            return false;
        }
        PoiScrollingBubble poiScrollingBubble = (PoiScrollingBubble) obj;
        return Intrinsics.LJFF(this.bubbleType, poiScrollingBubble.bubbleType) && Intrinsics.LJFF(this.displayText, poiScrollingBubble.displayText) && Intrinsics.LJFF(this.avatarList, poiScrollingBubble.avatarList) && Intrinsics.LJFF(this.aiSummaryDimensionKey, poiScrollingBubble.aiSummaryDimensionKey);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        Integer num = this.bubbleType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.displayText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UrlModel> list = this.avatarList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.aiSummaryDimensionKey;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiScrollingBubble(bubbleType=");
        sbLIZ.append(this.bubbleType);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", avatarList=");
        sbLIZ.append(this.avatarList);
        sbLIZ.append(", aiSummaryDimensionKey=");
        sbLIZ.append(this.aiSummaryDimensionKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAiSummaryDimensionKey() {
        return this.aiSummaryDimensionKey;
    }

    public final List<UrlModel> getAvatarList() {
        return this.avatarList;
    }

    public final Integer getBubbleType() {
        return this.bubbleType;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoiScrollingBubble(Integer num, String str, List<? extends UrlModel> list, String str2) {
        this.bubbleType = num;
        this.displayText = str;
        this.avatarList = list;
        this.aiSummaryDimensionKey = str2;
    }
}
