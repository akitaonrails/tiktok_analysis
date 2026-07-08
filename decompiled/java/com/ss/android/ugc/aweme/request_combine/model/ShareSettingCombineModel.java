package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ShareSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public ShareSettings shareSetting;

    public final ShareSettingCombineModel copy(ShareSettings shareSettings) {
        return new ShareSettingCombineModel(shareSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShareSettingCombineModel) && Intrinsics.LJFF(this.shareSetting, ((ShareSettingCombineModel) obj).shareSetting);
    }

    public int hashCode() {
        return this.shareSetting.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareSettingCombineModel(shareSetting=");
        sbLIZ.append(this.shareSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ShareSettings getShareSetting() {
        return this.shareSetting;
    }

    public ShareSettingCombineModel(ShareSettings shareSettings) {
        this.shareSetting = shareSettings;
    }

    public final void setShareSetting(ShareSettings shareSettings) {
        this.shareSetting = shareSettings;
    }
}
