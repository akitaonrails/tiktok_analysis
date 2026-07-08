package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RecMoreByTriadCooldownConfigModel {

    @C09CT("daily_threshold")
    public final int dailyCooldownThreshold;

    @C09CT("feature_thresholds")
    public final int[] featureCooldownNoActionThresholds;

    @C09CT("feature_stages")
    public final int[] featureCooldownStageDays;

    public RecMoreByTriadCooldownConfigModel() {
        this(3, new int[]{5, 5, 5, 5}, new int[]{3, 7, 14, 28});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecMoreByTriadCooldownConfigModel)) {
            return false;
        }
        RecMoreByTriadCooldownConfigModel recMoreByTriadCooldownConfigModel = (RecMoreByTriadCooldownConfigModel) obj;
        return this.dailyCooldownThreshold == recMoreByTriadCooldownConfigModel.dailyCooldownThreshold && Intrinsics.LJFF(this.featureCooldownNoActionThresholds, recMoreByTriadCooldownConfigModel.featureCooldownNoActionThresholds) && Intrinsics.LJFF(this.featureCooldownStageDays, recMoreByTriadCooldownConfigModel.featureCooldownStageDays);
    }

    public final int hashCode() {
        return (((this.dailyCooldownThreshold * 31) + Arrays.hashCode(this.featureCooldownNoActionThresholds)) * 31) + Arrays.hashCode(this.featureCooldownStageDays);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecMoreByTriadCooldownConfigModel(dailyCooldownThreshold=");
        sbLIZ.append(this.dailyCooldownThreshold);
        sbLIZ.append(", featureCooldownNoActionThresholds=");
        sbLIZ.append(Arrays.toString(this.featureCooldownNoActionThresholds));
        sbLIZ.append(", featureCooldownStageDays=");
        sbLIZ.append(Arrays.toString(this.featureCooldownStageDays));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecMoreByTriadCooldownConfigModel(int i, int[] iArr, int[] iArr2) {
        this.dailyCooldownThreshold = i;
        this.featureCooldownNoActionThresholds = iArr;
        this.featureCooldownStageDays = iArr2;
    }
}
