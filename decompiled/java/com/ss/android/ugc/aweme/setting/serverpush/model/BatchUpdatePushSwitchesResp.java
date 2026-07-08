package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BatchUpdatePushSwitchesResp extends BaseResponse {

    @C09CT("push_settings")
    public final Map<String, Integer> updatedSwitches;

    public BatchUpdatePushSwitchesResp() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchUpdatePushSwitchesResp) && Intrinsics.LJFF(this.updatedSwitches, ((BatchUpdatePushSwitchesResp) obj).updatedSwitches);
    }

    public final int hashCode() {
        Map<String, Integer> map = this.updatedSwitches;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchUpdatePushSwitchesResp(updatedSwitches=");
        sbLIZ.append(this.updatedSwitches);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchUpdatePushSwitchesResp(Map<String, Integer> map) {
        this.updatedSwitches = map;
    }
}
