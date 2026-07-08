package com.ss.android.ugc.tiktok.tpsc.privacy.unifiedconfig;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyUnifiedConfigResponse extends BaseResponse {

    @C09CT("configs")
    public final String configs;

    public final PrivacyUnifiedConfigResponse copy(String str) {
        return new PrivacyUnifiedConfigResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivacyUnifiedConfigResponse) && Intrinsics.LJFF(this.configs, ((PrivacyUnifiedConfigResponse) obj).configs);
    }

    public int hashCode() {
        String str = this.configs;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyUnifiedConfigResponse(configs=");
        sbLIZ.append(this.configs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyUnifiedConfigResponse() {
        this("");
    }

    public final String getConfigs() {
        return this.configs;
    }

    public PrivacyUnifiedConfigResponse(String str) {
        this.configs = str;
    }
}
