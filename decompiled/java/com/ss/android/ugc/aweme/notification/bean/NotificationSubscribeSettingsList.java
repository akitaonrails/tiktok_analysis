package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationSubscribeSettingsList extends BaseResponse {

    @C09CT("unsubscribe_settings")
    public final List<UnSubscribeSettingsData> unSubscribeSettingList;

    public NotificationSubscribeSettingsList() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationSubscribeSettingsList) && Intrinsics.LJFF(this.unSubscribeSettingList, ((NotificationSubscribeSettingsList) obj).unSubscribeSettingList);
    }

    public final int hashCode() {
        List<UnSubscribeSettingsData> list = this.unSubscribeSettingList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationSubscribeSettingsList(unSubscribeSettingList=");
        sbLIZ.append(this.unSubscribeSettingList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NotificationSubscribeSettingsList(List<UnSubscribeSettingsData> list) {
        this.unSubscribeSettingList = list;
    }
}
