package com.ss.android.ugc.aweme.aigc.aicreation.models;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ImagePreprocessTaskOutput extends AbsTaskOutput {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @C09CT("degraded")
    public final boolean degraded;

    @C09CT("failed_count")
    public final int failedCount;

    @C09CT("path_mapping")
    public final Map<String, String> pathMapping;

    @C09CT("reused_count")
    public final int reusedCount;

    @C09CT("transformed_count")
    public final int transformedCount;

    @C09CT("transformed_paths")
    public final List<String> transformedPaths;

    @C09CT("violations_summary")
    public final Map<String, Integer> violationsSummary;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagePreprocessTaskOutput)) {
            return false;
        }
        ImagePreprocessTaskOutput imagePreprocessTaskOutput = (ImagePreprocessTaskOutput) obj;
        return Intrinsics.LJFF(this.LIZ, imagePreprocessTaskOutput.LIZ) && this.LIZIZ == imagePreprocessTaskOutput.LIZIZ && Intrinsics.LJFF(this.LIZJ, imagePreprocessTaskOutput.LIZJ) && Intrinsics.LJFF(this.LIZLLL, imagePreprocessTaskOutput.LIZLLL) && Intrinsics.LJFF(this.transformedPaths, imagePreprocessTaskOutput.transformedPaths) && Intrinsics.LJFF(this.pathMapping, imagePreprocessTaskOutput.pathMapping) && this.reusedCount == imagePreprocessTaskOutput.reusedCount && this.transformedCount == imagePreprocessTaskOutput.transformedCount && this.failedCount == imagePreprocessTaskOutput.failedCount && this.degraded == imagePreprocessTaskOutput.degraded && Intrinsics.LJFF(this.violationsSummary, imagePreprocessTaskOutput.violationsSummary);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.transformedPaths.hashCode()) * 31) + this.pathMapping.hashCode()) * 31) + this.reusedCount) * 31) + this.transformedCount) * 31) + this.failedCount) * 31) + C786410Ut5.Z2(this.degraded)) * 31) + this.violationsSummary.hashCode();
    }

    public final String toString() {
        return "ImagePreprocessTaskOutput(status=" + this.LIZ + ", errorCode=" + this.LIZIZ + ", errorMsg=" + this.LIZJ + ", errorSource=" + this.LIZLLL + ", transformedPaths=" + this.transformedPaths + ", pathMapping=" + this.pathMapping + ", reusedCount=" + this.reusedCount + ", transformedCount=" + this.transformedCount + ", failedCount=" + this.failedCount + ", degraded=" + this.degraded + ", violationsSummary=" + this.violationsSummary + ')';
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.LIZ;
    }

    public ImagePreprocessTaskOutput(String str, int i, String str2, String str3, List<String> list, Map<String, String> map, int i2, int i3, int i4, boolean z, Map<String, Integer> map2) {
        super(str, i, str2, str3, "");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.transformedPaths = list;
        this.pathMapping = map;
        this.reusedCount = i2;
        this.transformedCount = i3;
        this.failedCount = i4;
        this.degraded = z;
        this.violationsSummary = map2;
    }

    public ImagePreprocessTaskOutput(String str, int i, String str2, String str3, List list, Map map, int i2, int i3, int i4, boolean z, Map map2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? C13BV.INSTANCE : list, (i5 & 32) != 0 ? C2097608Jq.LJ() : map, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0 : i4, (i5 & 512) == 0 ? z : false, (i5 & 1024) != 0 ? C2097608Jq.LJ() : map2);
    }
}
