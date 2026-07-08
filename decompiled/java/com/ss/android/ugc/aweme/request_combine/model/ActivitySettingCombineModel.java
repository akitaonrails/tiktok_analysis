package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.kpro.KproActivityResponse;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ActivitySettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public KproActivityResponse activitySetting;

    public final ActivitySettingCombineModel copy(KproActivityResponse kproActivityResponse) {
        return new ActivitySettingCombineModel(kproActivityResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActivitySettingCombineModel) && Intrinsics.LJFF(this.activitySetting, ((ActivitySettingCombineModel) obj).activitySetting);
    }

    public int hashCode() {
        return this.activitySetting.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivitySettingCombineModel(activitySetting=");
        sbLIZ.append(this.activitySetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final KproActivityResponse getActivitySetting() {
        return this.activitySetting;
    }

    public ActivitySettingCombineModel(KproActivityResponse kproActivityResponse) {
        this.activitySetting = kproActivityResponse;
    }

    public final void setActivitySetting(KproActivityResponse kproActivityResponse) {
        this.activitySetting = kproActivityResponse;
    }
}
