package com.bytedance.pumbaa.hybrid.governance.jsb;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PnsJsbIframeAllowlistModel extends BaseGovernanceModel {

    @C09CT("allowList")
    public final List<IframeItem> allowList;

    @C09CT("jsbList")
    public final List<String> jsbList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsJsbIframeAllowlistModel)) {
            return false;
        }
        PnsJsbIframeAllowlistModel pnsJsbIframeAllowlistModel = (PnsJsbIframeAllowlistModel) obj;
        return Intrinsics.LJFF(this.allowList, pnsJsbIframeAllowlistModel.allowList) && Intrinsics.LJFF(this.jsbList, pnsJsbIframeAllowlistModel.jsbList);
    }

    public final int hashCode() {
        return (this.allowList.hashCode() * 31) + this.jsbList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsJsbIframeAllowlistModel(allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(", jsbList=");
        sbLIZ.append(this.jsbList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsJsbIframeAllowlistModel() {
        this(new ArrayList(), new ArrayList());
    }

    public PnsJsbIframeAllowlistModel(List<IframeItem> list, List<String> list2) {
        super(null, false, false, false, false);
        this.allowList = list;
        this.jsbList = list2;
    }
}
