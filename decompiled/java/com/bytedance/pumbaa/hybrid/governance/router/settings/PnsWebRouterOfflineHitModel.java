package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsWebRouterOfflineHitModel extends BaseGovernanceModel {

    @C09CT("commonDataflowId")
    public final int commonDataflowId;

    @C09CT("commonEnable")
    public final boolean commonEnable;

    @C09CT("url_whitelist")
    public final List<String> whiteList;

    public PnsWebRouterOfflineHitModel() {
        this(false, 402685958, C1697810uHb.LJIIJJI("snssdk1233.onelink.me", "snssdk1180.onelink.me", "snssdk473824.onelink.me"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsWebRouterOfflineHitModel)) {
            return false;
        }
        PnsWebRouterOfflineHitModel pnsWebRouterOfflineHitModel = (PnsWebRouterOfflineHitModel) obj;
        return this.commonEnable == pnsWebRouterOfflineHitModel.commonEnable && this.commonDataflowId == pnsWebRouterOfflineHitModel.commonDataflowId && Intrinsics.LJFF(this.whiteList, pnsWebRouterOfflineHitModel.whiteList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.commonEnable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.commonDataflowId) * 31) + this.whiteList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsWebRouterOfflineHitModel(commonEnable=");
        sbLIZ.append(this.commonEnable);
        sbLIZ.append(", commonDataflowId=");
        sbLIZ.append(this.commonDataflowId);
        sbLIZ.append(", whiteList=");
        sbLIZ.append(this.whiteList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsWebRouterOfflineHitModel(boolean z, int i, List<String> list) {
        super(null, false, false, false, false);
        this.commonEnable = z;
        this.commonDataflowId = i;
        this.whiteList = list;
    }
}
