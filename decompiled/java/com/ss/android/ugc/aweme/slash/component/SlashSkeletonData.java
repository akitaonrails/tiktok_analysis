package com.ss.android.ugc.aweme.slash.component;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SlashSkeletonData extends BaseComponentData {

    @C09CT("need_wait_signal")
    public Boolean needWaitSignal;

    @C09CT("real_instance_id")
    public String realInstanceId;

    @C09CT("skeletonUIType")
    public Integer skeletonUIType;

    public SlashSkeletonData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashSkeletonData)) {
            return false;
        }
        SlashSkeletonData slashSkeletonData = (SlashSkeletonData) obj;
        return Intrinsics.LJFF(this.realInstanceId, slashSkeletonData.realInstanceId) && Intrinsics.LJFF(this.skeletonUIType, slashSkeletonData.skeletonUIType) && Intrinsics.LJFF(this.needWaitSignal, slashSkeletonData.needWaitSignal);
    }

    public final int hashCode() {
        String str = this.realInstanceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.skeletonUIType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.needWaitSignal;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashSkeletonData(realInstanceId=");
        sbLIZ.append(this.realInstanceId);
        sbLIZ.append(", skeletonUIType=");
        sbLIZ.append(this.skeletonUIType);
        sbLIZ.append(", needWaitSignal=");
        sbLIZ.append(this.needWaitSignal);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashSkeletonData(String str, Integer num, Boolean bool) {
        this.realInstanceId = str;
        this.skeletonUIType = num;
        this.needWaitSignal = bool;
    }
}
