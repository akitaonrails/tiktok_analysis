package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class HighLightSmartPrefetchConfig extends SmartSceneConfig {

    @C09CT("enable_smart_prefetch")
    public final int enableSmartPrefetch;

    @C09CT("label_list")
    public List<String> labelList;

    @C09CT("prefetch_count")
    public final int prefetchCount;

    @C09CT("prefetch_delay_time")
    public final long prefetchDelayTime;

    @C09CT("score_threshold")
    public final float scoreThreshold;

    public HighLightSmartPrefetchConfig() {
        this(0, 1.0f, 0L, null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighLightSmartPrefetchConfig)) {
            return false;
        }
        HighLightSmartPrefetchConfig highLightSmartPrefetchConfig = (HighLightSmartPrefetchConfig) obj;
        return this.enableSmartPrefetch == highLightSmartPrefetchConfig.enableSmartPrefetch && Float.compare(this.scoreThreshold, highLightSmartPrefetchConfig.scoreThreshold) == 0 && this.prefetchDelayTime == highLightSmartPrefetchConfig.prefetchDelayTime && Intrinsics.LJFF(this.labelList, highLightSmartPrefetchConfig.labelList) && this.prefetchCount == highLightSmartPrefetchConfig.prefetchCount;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighLightSmartPrefetchConfig(enableSmartPrefetch=");
        sbLIZ.append(this.enableSmartPrefetch);
        sbLIZ.append(", scoreThreshold=");
        sbLIZ.append(this.scoreThreshold);
        sbLIZ.append(", prefetchDelayTime=");
        sbLIZ.append(this.prefetchDelayTime);
        sbLIZ.append(", labelList=");
        sbLIZ.append(this.labelList);
        sbLIZ.append(", prefetchCount=");
        sbLIZ.append(this.prefetchCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((this.enableSmartPrefetch * 31) + Float.floatToIntBits(this.scoreThreshold)) * 31) + C786410Ut5.Y2(this.prefetchDelayTime)) * 31;
        List<String> list = this.labelList;
        return ((iFloatToIntBits + (list == null ? 0 : list.hashCode())) * 31) + this.prefetchCount;
    }

    public HighLightSmartPrefetchConfig(int i, float f, long j, List<String> list, int i2) {
        this.enableSmartPrefetch = i;
        this.scoreThreshold = f;
        this.prefetchDelayTime = j;
        this.labelList = list;
        this.prefetchCount = i2;
    }
}
