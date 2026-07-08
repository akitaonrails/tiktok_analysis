package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.config;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInflowSmartLoadMoreConfig extends SmartSceneConfig {

    @C09CT("enable_smart_load_more")
    public final int enableSmartLoadMore;

    @C09CT("label")
    public String label;

    @C09CT("predict_total_time")
    public final int predictTime;

    @C09CT("predict_video_count")
    public final int predictVideoCount;

    @C09CT("score_threshold")
    public final float scoreThreshold;

    @C09CT("smart_execute_count")
    public final int smartExecuteCount;

    public SearchInflowSmartLoadMoreConfig() {
        this(0, 2, null, 1.0f, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInflowSmartLoadMoreConfig)) {
            return false;
        }
        SearchInflowSmartLoadMoreConfig searchInflowSmartLoadMoreConfig = (SearchInflowSmartLoadMoreConfig) obj;
        return this.enableSmartLoadMore == searchInflowSmartLoadMoreConfig.enableSmartLoadMore && this.smartExecuteCount == searchInflowSmartLoadMoreConfig.smartExecuteCount && Intrinsics.LJFF(this.label, searchInflowSmartLoadMoreConfig.label) && Float.compare(this.scoreThreshold, searchInflowSmartLoadMoreConfig.scoreThreshold) == 0 && this.predictTime == searchInflowSmartLoadMoreConfig.predictTime && this.predictVideoCount == searchInflowSmartLoadMoreConfig.predictVideoCount;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchInflowSmartLoadMoreConfig(enableSmartLoadMore=");
        sbLIZ.append(this.enableSmartLoadMore);
        sbLIZ.append(", smartExecuteCount=");
        sbLIZ.append(this.smartExecuteCount);
        sbLIZ.append(", label=");
        sbLIZ.append(this.label);
        sbLIZ.append(", scoreThreshold=");
        sbLIZ.append(this.scoreThreshold);
        sbLIZ.append(", predictTime=");
        sbLIZ.append(this.predictTime);
        sbLIZ.append(", predictVideoCount=");
        sbLIZ.append(this.predictVideoCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int i = ((this.enableSmartLoadMore * 31) + this.smartExecuteCount) * 31;
        String str = this.label;
        return ((((((i + (str == null ? 0 : str.hashCode())) * 31) + Float.floatToIntBits(this.scoreThreshold)) * 31) + this.predictTime) * 31) + this.predictVideoCount;
    }

    public SearchInflowSmartLoadMoreConfig(int i, int i2, String str, float f, int i3, int i4) {
        this.enableSmartLoadMore = i;
        this.smartExecuteCount = i2;
        this.label = str;
        this.scoreThreshold = f;
        this.predictTime = i3;
        this.predictVideoCount = i4;
        setScene("search_inflow_smart_load_more");
    }
}
