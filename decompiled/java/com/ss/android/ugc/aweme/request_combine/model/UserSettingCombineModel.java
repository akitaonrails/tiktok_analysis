package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UserSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public PushSettings userSetting;

    public final UserSettingCombineModel copy(PushSettings pushSettings) {
        return new UserSettingCombineModel(pushSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserSettingCombineModel) && Intrinsics.LJFF(this.userSetting, ((UserSettingCombineModel) obj).userSetting);
    }

    public int hashCode() {
        return this.userSetting.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserSettingCombineModel(userSetting=");
        sbLIZ.append(this.userSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PushSettings getUserSetting() {
        return this.userSetting;
    }

    public UserSettingCombineModel(PushSettings pushSettings) {
        this.userSetting = pushSettings;
    }

    public final void setUserSetting(PushSettings pushSettings) {
        this.userSetting = pushSettings;
    }
}
