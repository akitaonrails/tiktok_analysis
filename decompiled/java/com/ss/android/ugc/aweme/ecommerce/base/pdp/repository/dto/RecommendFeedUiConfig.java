package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendFeedUiConfig {

    @C09CT("price_label_layout")
    public final Integer priceLabelLayout;

    @C09CT("title_max_lines")
    public final Integer titleMaxLine;

    public RecommendFeedUiConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendFeedUiConfig)) {
            return false;
        }
        RecommendFeedUiConfig recommendFeedUiConfig = (RecommendFeedUiConfig) obj;
        return Intrinsics.LJFF(this.titleMaxLine, recommendFeedUiConfig.titleMaxLine) && Intrinsics.LJFF(this.priceLabelLayout, recommendFeedUiConfig.priceLabelLayout);
    }

    public final int hashCode() {
        Integer num = this.titleMaxLine;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.priceLabelLayout;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendFeedUiConfig(titleMaxLine=");
        sbLIZ.append(this.titleMaxLine);
        sbLIZ.append(", priceLabelLayout=");
        sbLIZ.append(this.priceLabelLayout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendFeedUiConfig(Integer num, Integer num2) {
        this.titleMaxLine = num;
        this.priceLabelLayout = num2;
    }
}
