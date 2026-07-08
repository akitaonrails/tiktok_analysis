package com.ss.android.ugc.aweme.autopick.model;

import X.C00AL;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AssetAnalysisResult {
    public final float aestheticScore;
    public final String assetId;
    public final boolean isPorn;
    public final float qualityScore;
    public final long scanTimestamp;
    public final float sharpnessScore;
    public final List<C00AL> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetAnalysisResult)) {
            return false;
        }
        AssetAnalysisResult assetAnalysisResult = (AssetAnalysisResult) obj;
        return Intrinsics.LJFF(this.assetId, assetAnalysisResult.assetId) && this.scanTimestamp == assetAnalysisResult.scanTimestamp && Intrinsics.LJFF(this.tags, assetAnalysisResult.tags) && Float.compare(this.qualityScore, assetAnalysisResult.qualityScore) == 0 && Float.compare(this.aestheticScore, assetAnalysisResult.aestheticScore) == 0 && Float.compare(this.sharpnessScore, assetAnalysisResult.sharpnessScore) == 0 && this.isPorn == assetAnalysisResult.isPorn;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetAnalysisResult(assetId=");
        sbLIZ.append(this.assetId);
        sbLIZ.append(", scanTimestamp=");
        sbLIZ.append(this.scanTimestamp);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append(", qualityScore=");
        sbLIZ.append(this.qualityScore);
        sbLIZ.append(", aestheticScore=");
        sbLIZ.append(this.aestheticScore);
        sbLIZ.append(", sharpnessScore=");
        sbLIZ.append(this.sharpnessScore);
        sbLIZ.append(", isPorn=");
        sbLIZ.append(this.isPorn);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((((((((this.assetId.hashCode() * 31) + C786410Ut5.Y2(this.scanTimestamp)) * 31) + this.tags.hashCode()) * 31) + Float.floatToIntBits(this.qualityScore)) * 31) + Float.floatToIntBits(this.aestheticScore)) * 31) + Float.floatToIntBits(this.sharpnessScore)) * 31) + C786410Ut5.Z2(this.isPorn);
    }

    public final boolean isPorn() {
        return this.isPorn;
    }

    public AssetAnalysisResult(String str, long j, List<C00AL> list, float f, float f2, float f3, boolean z) {
        this.assetId = str;
        this.scanTimestamp = j;
        this.tags = list;
        this.qualityScore = f;
        this.aestheticScore = f2;
        this.sharpnessScore = f3;
        this.isPorn = z;
    }
}
