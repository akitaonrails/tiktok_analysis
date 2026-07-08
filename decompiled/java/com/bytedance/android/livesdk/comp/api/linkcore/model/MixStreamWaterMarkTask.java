package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class MixStreamWaterMarkTask {
    public final String linkMicId;
    public final MixStreamWaterMarkRect rect;
    public final long spotId;
    public final String url;
    public final int zOrder;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStreamWaterMarkTask)) {
            return false;
        }
        MixStreamWaterMarkTask mixStreamWaterMarkTask = (MixStreamWaterMarkTask) obj;
        return this.spotId == mixStreamWaterMarkTask.spotId && Intrinsics.LJFF(this.linkMicId, mixStreamWaterMarkTask.linkMicId) && Intrinsics.LJFF(this.url, mixStreamWaterMarkTask.url) && this.zOrder == mixStreamWaterMarkTask.zOrder && Intrinsics.LJFF(this.rect, mixStreamWaterMarkTask.rect);
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.spotId) * 31;
        String str = this.linkMicId;
        int iHashCode = (((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.url.hashCode()) * 31) + this.zOrder) * 31;
        MixStreamWaterMarkRect mixStreamWaterMarkRect = this.rect;
        return iHashCode + (mixStreamWaterMarkRect != null ? mixStreamWaterMarkRect.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStreamWaterMarkTask(spotId=");
        sbLIZ.append(this.spotId);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.linkMicId);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", zOrder=");
        sbLIZ.append(this.zOrder);
        sbLIZ.append(", rect=");
        sbLIZ.append(this.rect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MixStreamWaterMarkTask(long j, String str, String str2, int i, MixStreamWaterMarkRect mixStreamWaterMarkRect) {
        this.spotId = j;
        this.linkMicId = str;
        this.url = str2;
        this.zOrder = i;
        this.rect = mixStreamWaterMarkRect;
    }
}
