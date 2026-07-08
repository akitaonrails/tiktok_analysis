package com.ss.android.ugc.aweme.notification.aggregate.data;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public final class TemplateAggregateUiInfo {

    @C09CT("left_info")
    public final TemplateAggregateLeftUiInfo leftUiInfo;

    @C09CT("middle_info")
    public final TemplateAggregateMiddleUiInfo middleUiInfo;

    @C09CT("right_info")
    public final TemplateAggregateRightUiInfo rightUiInfo;

    public final int hashCode() {
        TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo = this.leftUiInfo;
        int iHashCode = (templateAggregateLeftUiInfo == null ? 0 : templateAggregateLeftUiInfo.hashCode()) * 31;
        TemplateAggregateMiddleUiInfo templateAggregateMiddleUiInfo = this.middleUiInfo;
        int iHashCode2 = (iHashCode + (templateAggregateMiddleUiInfo == null ? 0 : templateAggregateMiddleUiInfo.hashCode())) * 31;
        TemplateAggregateRightUiInfo templateAggregateRightUiInfo = this.rightUiInfo;
        return iHashCode2 + (templateAggregateRightUiInfo != null ? templateAggregateRightUiInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateAggregateUiInfo(leftUiInfo=");
        sbLIZ.append(this.leftUiInfo);
        sbLIZ.append(", middleUiInfo=");
        sbLIZ.append(this.middleUiInfo);
        sbLIZ.append(", rightUiInfo=");
        sbLIZ.append(this.rightUiInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TemplateAggregateUiInfo(TemplateAggregateLeftUiInfo templateAggregateLeftUiInfo, TemplateAggregateMiddleUiInfo templateAggregateMiddleUiInfo, TemplateAggregateRightUiInfo templateAggregateRightUiInfo) {
        this.leftUiInfo = templateAggregateLeftUiInfo;
        this.middleUiInfo = templateAggregateMiddleUiInfo;
        this.rightUiInfo = templateAggregateRightUiInfo;
    }
}
