package com.ss.android.ugc.aweme.longvideonotification;

import X.C09CT;
import X.C0CHQ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class LongVideoNotificationApi {
    public static final API LIZ = (API) C0CHQ.LIZ().getNetworkService().createDefaultRetrofit(API.class);

    public interface API {
        @InterfaceC1501170pAR("/tiktok/popup/report/v1/")
        Object reportPopupDisplay(@InterfaceC1501070pAH("permission_type") long j, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501170pAR("/tiktok/popup/display/v1/")
        Object shouldShowPopupDisplay(@InterfaceC1501070pAH("permission_type") long j, InterfaceC1364105Vn<? super PopupDisplayResponse> interfaceC1364105Vn);
    }

    public static final class PopupDisplayResponse extends BaseResponse {

        @C09CT("need_to_display")
        public final boolean needToDisplay;

        public PopupDisplayResponse() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopupDisplayResponse) && this.needToDisplay == ((PopupDisplayResponse) obj).needToDisplay;
        }

        public final int hashCode() {
            return C786410Ut5.Z2(this.needToDisplay);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PopupDisplayResponse(needToDisplay=");
            sbLIZ.append(this.needToDisplay);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PopupDisplayResponse(boolean z) {
            this.needToDisplay = z;
        }
    }
}
