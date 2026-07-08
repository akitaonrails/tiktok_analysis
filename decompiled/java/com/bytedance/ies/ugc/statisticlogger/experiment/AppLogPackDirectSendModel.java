package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLogPackDirectSendModel {

    @C09CT("direct_send_current_session_data")
    public final boolean directSendCurrentSessionData;

    @C09CT("direct_send_skip_first_request")
    public final boolean directSendSkipFirstRequest;

    public AppLogPackDirectSendModel() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLogPackDirectSendModel)) {
            return false;
        }
        AppLogPackDirectSendModel appLogPackDirectSendModel = (AppLogPackDirectSendModel) obj;
        return this.directSendCurrentSessionData == appLogPackDirectSendModel.directSendCurrentSessionData && this.directSendSkipFirstRequest == appLogPackDirectSendModel.directSendSkipFirstRequest;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.directSendCurrentSessionData) * 31) + C786410Ut5.Z2(this.directSendSkipFirstRequest);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppLogPackDirectSendModel(directSendCurrentSessionData=");
        sbLIZ.append(this.directSendCurrentSessionData);
        sbLIZ.append(", directSendSkipFirstRequest=");
        sbLIZ.append(this.directSendSkipFirstRequest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AppLogPackDirectSendModel(boolean z, boolean z2) {
        this.directSendCurrentSessionData = z;
        this.directSendSkipFirstRequest = z2;
    }
}
