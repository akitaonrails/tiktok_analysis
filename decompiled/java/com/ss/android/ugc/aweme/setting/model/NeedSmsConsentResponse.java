package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NeedSmsConsentResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("data")
    public final Map<String, SmsSettingItem> data;

    public final NeedSmsConsentResponse copy(Map<String, SmsSettingItem> map) {
        return new NeedSmsConsentResponse(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NeedSmsConsentResponse) && Intrinsics.LJFF(this.data, ((NeedSmsConsentResponse) obj).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NeedSmsConsentResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NeedSmsConsentResponse() {
        this(C2097608Jq.LJ());
    }

    public final Map<String, SmsSettingItem> getData() {
        return this.data;
    }

    public NeedSmsConsentResponse(Map<String, SmsSettingItem> map) {
        this.data = map;
    }
}
