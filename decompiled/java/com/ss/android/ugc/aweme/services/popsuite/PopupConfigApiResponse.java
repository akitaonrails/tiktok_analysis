package com.ss.android.ugc.aweme.services.popsuite;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PopupConfigApiResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public final PopupConfigData data;

    @C09CT("message")
    public final String message;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupConfigApiResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PopupConfigApiResponse(PopupConfigData popupConfigData, String str) {
        this.data = popupConfigData;
        this.message = str;
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static final class PopupConfigData implements Serializable {
        public static final int $stable = 8;

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("fyp")
        public final List<IPopSuiteManagerService.PopupConfigObject> fypPopupConfigs;

        @C09CT("inbox")
        public final List<IPopSuiteManagerService.PopupConfigObject> inboxPopupConfigs;

        @C09CT("profile")
        public final List<IPopSuiteManagerService.PopupConfigObject> profilePopupConfigs;

        public PopupConfigData() {
            this(null, null, null, null, null);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PopupConfigData(description=");
            sbLIZ.append(this.description);
            sbLIZ.append(", errorCode=");
            sbLIZ.append(this.errorCode);
            sbLIZ.append(", profilePopupConfigs=");
            sbLIZ.append(this.profilePopupConfigs);
            sbLIZ.append(", inboxPopupConfigs=");
            sbLIZ.append(this.inboxPopupConfigs);
            sbLIZ.append(", fypPopupConfigs=");
            sbLIZ.append(this.fypPopupConfigs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PopupConfigData(String str, Integer num, List<IPopSuiteManagerService.PopupConfigObject> list, List<IPopSuiteManagerService.PopupConfigObject> list2, List<IPopSuiteManagerService.PopupConfigObject> list3) {
            this.description = str;
            this.errorCode = num;
            this.profilePopupConfigs = list;
            this.inboxPopupConfigs = list2;
            this.fypPopupConfigs = list3;
        }
    }
}
