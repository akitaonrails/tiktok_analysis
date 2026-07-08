package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VoDPlayerKernelDynamicOption {

    @C09CT("shared")
    public final List<DynamicOptionModel> sharedDynamicOptionModelList;

    @C09CT("vod")
    public final List<DynamicOptionModel> vodDynamicOptionModelList;

    public VoDPlayerKernelDynamicOption() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoDPlayerKernelDynamicOption)) {
            return false;
        }
        VoDPlayerKernelDynamicOption voDPlayerKernelDynamicOption = (VoDPlayerKernelDynamicOption) obj;
        return Intrinsics.LJFF(this.vodDynamicOptionModelList, voDPlayerKernelDynamicOption.vodDynamicOptionModelList) && Intrinsics.LJFF(this.sharedDynamicOptionModelList, voDPlayerKernelDynamicOption.sharedDynamicOptionModelList);
    }

    public final int hashCode() {
        List<DynamicOptionModel> list = this.vodDynamicOptionModelList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DynamicOptionModel> list2 = this.sharedDynamicOptionModelList;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoDPlayerKernelDynamicOption(vodDynamicOptionModelList=");
        sbLIZ.append(this.vodDynamicOptionModelList);
        sbLIZ.append(", sharedDynamicOptionModelList=");
        sbLIZ.append(this.sharedDynamicOptionModelList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VoDPlayerKernelDynamicOption(List<DynamicOptionModel> list, List<DynamicOptionModel> list2) {
        this.vodDynamicOptionModelList = list;
        this.sharedDynamicOptionModelList = list2;
    }
}
