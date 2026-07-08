package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponse;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public LiveSDKSettingResponse liveSetting;

    public final LiveSettingCombineModel copy(LiveSDKSettingResponse liveSDKSettingResponse) {
        return new LiveSettingCombineModel(liveSDKSettingResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveSettingCombineModel) && Intrinsics.LJFF(this.liveSetting, ((LiveSettingCombineModel) obj).liveSetting);
    }

    public int hashCode() {
        LiveSDKSettingResponse liveSDKSettingResponse = this.liveSetting;
        if (liveSDKSettingResponse == null) {
            return 0;
        }
        return liveSDKSettingResponse.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveSettingCombineModel(liveSetting=");
        sbLIZ.append(this.liveSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LiveSDKSettingResponse getLiveSetting() {
        return this.liveSetting;
    }

    public LiveSettingCombineModel(LiveSDKSettingResponse liveSDKSettingResponse) {
        this.liveSetting = liveSDKSettingResponse;
    }

    public final void setLiveSetting(LiveSDKSettingResponse liveSDKSettingResponse) {
        this.liveSetting = liveSDKSettingResponse;
    }
}
