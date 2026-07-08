package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FlashSaleEnhancementTextInfo {

    @C09CT("all_texts")
    public final Map<Long, String> allTexts;

    @C09CT("enhancement_texts")
    public final List<FlashSaleEnhancementText> enhancementTexts;

    @C09CT("show_countdown_threshold")
    public final long showCountdownThreshold;

    public FlashSaleEnhancementTextInfo() {
        this(null, null, 0L, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashSaleEnhancementTextInfo)) {
            return false;
        }
        FlashSaleEnhancementTextInfo flashSaleEnhancementTextInfo = (FlashSaleEnhancementTextInfo) obj;
        return Intrinsics.LJFF(this.allTexts, flashSaleEnhancementTextInfo.allTexts) && Intrinsics.LJFF(this.enhancementTexts, flashSaleEnhancementTextInfo.enhancementTexts) && this.showCountdownThreshold == flashSaleEnhancementTextInfo.showCountdownThreshold;
    }

    public final int hashCode() {
        return (((this.allTexts.hashCode() * 31) + this.enhancementTexts.hashCode()) * 31) + C786410Ut5.Y2(this.showCountdownThreshold);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleEnhancementTextInfo(allTexts=");
        sbLIZ.append(this.allTexts);
        sbLIZ.append(", enhancementTexts=");
        sbLIZ.append(this.enhancementTexts);
        sbLIZ.append(", showCountdownThreshold=");
        sbLIZ.append(this.showCountdownThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FlashSaleEnhancementTextInfo(Map<Long, String> map, List<FlashSaleEnhancementText> list, long j) {
        this.allTexts = map;
        this.enhancementTexts = list;
        this.showCountdownThreshold = j;
    }

    public FlashSaleEnhancementTextInfo(Map map, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJ() : map, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 0L : j);
    }
}
