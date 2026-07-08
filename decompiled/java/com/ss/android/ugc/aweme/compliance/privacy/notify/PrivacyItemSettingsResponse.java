package com.ss.android.ugc.aweme.compliance.privacy.notify;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyItemSettingsResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("requested_scenes_values")
    public final Map<String, String> scenesValues;

    public final PrivacyItemSettingsResponse copy(Map<String, String> map) {
        return new PrivacyItemSettingsResponse(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivacyItemSettingsResponse) && Intrinsics.LJFF(this.scenesValues, ((PrivacyItemSettingsResponse) obj).scenesValues);
    }

    public int hashCode() {
        return this.scenesValues.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyItemSettingsResponse(scenesValues=");
        sbLIZ.append(this.scenesValues);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyItemSettingsResponse() {
        this(C2097608Jq.LJ());
    }

    public final Map<String, String> getScenesValues() {
        return this.scenesValues;
    }

    public PrivacyItemSettingsResponse(Map<String, String> map) {
        this.scenesValues = map;
    }
}
