package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationSettings extends BaseResponse {

    @C09CT("notification_settings_info")
    public final NotificationSettingsInfo notificationSettingsInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationSettings) && Intrinsics.LJFF(this.notificationSettingsInfo, ((NotificationSettings) obj).notificationSettingsInfo);
    }

    public final int hashCode() {
        NotificationSettingsInfo notificationSettingsInfo = this.notificationSettingsInfo;
        if (notificationSettingsInfo == null) {
            return 0;
        }
        return notificationSettingsInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationSettings(notificationSettingsInfo=");
        sbLIZ.append(this.notificationSettingsInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NotificationSettings(NotificationSettingsInfo notificationSettingsInfo) {
        this.notificationSettingsInfo = notificationSettingsInfo;
    }
}
