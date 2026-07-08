package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PnsSparkPureShutdownModel extends BaseGovernanceModel {

    @C09CT("allowlist")
    public final List<Integer> allowlist;

    @C09CT("popup_enable")
    public final boolean popupEnable;

    @C09CT("runtime_blocklist")
    public final List<String> runtimeBlocklist;

    public PnsSparkPureShutdownModel() {
        this(false, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsSparkPureShutdownModel)) {
            return false;
        }
        PnsSparkPureShutdownModel pnsSparkPureShutdownModel = (PnsSparkPureShutdownModel) obj;
        return this.popupEnable == pnsSparkPureShutdownModel.popupEnable && Intrinsics.LJFF(this.allowlist, pnsSparkPureShutdownModel.allowlist) && Intrinsics.LJFF(this.runtimeBlocklist, pnsSparkPureShutdownModel.runtimeBlocklist);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.popupEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.allowlist.hashCode()) * 31) + this.runtimeBlocklist.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsSparkPureShutdownModel(popupEnable=");
        sbLIZ.append(this.popupEnable);
        sbLIZ.append(", allowlist=");
        sbLIZ.append(this.allowlist);
        sbLIZ.append(", runtimeBlocklist=");
        sbLIZ.append(this.runtimeBlocklist);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsSparkPureShutdownModel(boolean z, List<Integer> list, List<String> list2) {
        super(null, false, false, false, false);
        this.popupEnable = z;
        this.allowlist = list;
        this.runtimeBlocklist = list2;
    }

    public PnsSparkPureShutdownModel(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C1697810uHb.LJIIJJI(402657281, 402657282, 67108864, 402681856, 402681857, 402685961, 402685959, 402685955) : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
