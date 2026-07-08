package com.ss.android.ugc.aweme.creatorcenter;

import X.C040I;
import X.C09CT;
import X.C11NZ;
import X.C1891130zJP;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface InspirationSettingApi {
    public static final C1891130zJP LIZ = C1891130zJP.LIZ;

    @InterfaceC1501200pAU("/tiktok/v1/inspiration/settings")
    C11NZ<InspirationSetting> LIZ();

    @InterfaceC1501240pAY("/tiktok/v1/inspiration/settings/edit")
    C11NZ<BaseResponse> LIZIZ(@C040I InspirationSetting inspirationSetting);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class InspirationSetting extends BaseResponse {

        @C09CT("is_enabled")
        public final boolean isEnabled;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InspirationSetting) && this.isEnabled == ((InspirationSetting) obj).isEnabled;
        }

        public final int hashCode() {
            return C786410Ut5.Z2(this.isEnabled);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InspirationSetting(isEnabled=");
            sbLIZ.append(this.isEnabled);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public InspirationSetting(boolean z) {
            this.isEnabled = z;
        }
    }
}
