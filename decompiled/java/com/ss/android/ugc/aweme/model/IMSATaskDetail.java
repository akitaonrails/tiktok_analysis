package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMSATaskDetail implements Serializable {
    public final boolean isAISelfSideTask;
    public final boolean missingSelfie;
    public final float percentage;
    public final String taskId;
    public final long timeRemainingMs;
    public final int totalStickerCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMSATaskDetail)) {
            return false;
        }
        IMSATaskDetail iMSATaskDetail = (IMSATaskDetail) obj;
        return Intrinsics.LJFF(this.taskId, iMSATaskDetail.taskId) && Float.compare(this.percentage, iMSATaskDetail.percentage) == 0 && this.timeRemainingMs == iMSATaskDetail.timeRemainingMs && this.missingSelfie == iMSATaskDetail.missingSelfie && this.isAISelfSideTask == iMSATaskDetail.isAISelfSideTask && this.totalStickerCount == iMSATaskDetail.totalStickerCount;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSATaskDetail(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", percentage=");
        sbLIZ.append(this.percentage);
        sbLIZ.append(", timeRemainingMs=");
        sbLIZ.append(this.timeRemainingMs);
        sbLIZ.append(", missingSelfie=");
        sbLIZ.append(this.missingSelfie);
        sbLIZ.append(", isAISelfSideTask=");
        sbLIZ.append(this.isAISelfSideTask);
        sbLIZ.append(", totalStickerCount=");
        sbLIZ.append(this.totalStickerCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((((((this.taskId.hashCode() * 31) + Float.floatToIntBits(this.percentage)) * 31) + C786410Ut5.Y2(this.timeRemainingMs)) * 31) + C786410Ut5.Z2(this.missingSelfie)) * 31) + C786410Ut5.Z2(this.isAISelfSideTask)) * 31) + this.totalStickerCount;
    }

    public final boolean isAISelfSideTask() {
        return this.isAISelfSideTask;
    }

    public IMSATaskDetail(String str, float f, long j, boolean z, boolean z2, int i) {
        this.taskId = str;
        this.percentage = f;
        this.timeRemainingMs = j;
        this.missingSelfie = z;
        this.isAISelfSideTask = z2;
        this.totalStickerCount = i;
    }
}
