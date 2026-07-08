package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SocialAvatarDynamicSettingResult extends BaseResponse {

    @C09CT("entrances")
    public final Map<String, Boolean> entranceSettings;

    @C09CT("polling_interval")
    public final Long pollingInterval;

    public SocialAvatarDynamicSettingResult() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarDynamicSettingResult)) {
            return false;
        }
        SocialAvatarDynamicSettingResult socialAvatarDynamicSettingResult = (SocialAvatarDynamicSettingResult) obj;
        return Intrinsics.LJFF(this.entranceSettings, socialAvatarDynamicSettingResult.entranceSettings) && Intrinsics.LJFF(this.pollingInterval, socialAvatarDynamicSettingResult.pollingInterval);
    }

    public final int hashCode() {
        Map<String, Boolean> map = this.entranceSettings;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Long l = this.pollingInterval;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarDynamicSettingResult(entranceSettings=");
        sbLIZ.append(this.entranceSettings);
        sbLIZ.append(", pollingInterval=");
        sbLIZ.append(this.pollingInterval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarDynamicSettingResult(Map<String, Boolean> map, Long l) {
        this.entranceSettings = map;
        this.pollingInterval = l;
    }
}
