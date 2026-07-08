package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.live.settings.LiveSDKSettingResponseV2;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveSettingCombineModelV2 extends BaseCombineMode {

    @C09CT("body")
    public LiveSDKSettingResponseV2 liveSetting;

    public final LiveSettingCombineModelV2 copy(LiveSDKSettingResponseV2 liveSDKSettingResponseV2) {
        return new LiveSettingCombineModelV2(liveSDKSettingResponseV2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveSettingCombineModelV2) && Intrinsics.LJFF(this.liveSetting, ((LiveSettingCombineModelV2) obj).liveSetting);
    }

    public int hashCode() {
        LiveSDKSettingResponseV2 liveSDKSettingResponseV2 = this.liveSetting;
        if (liveSDKSettingResponseV2 == null) {
            return 0;
        }
        return liveSDKSettingResponseV2.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveSettingCombineModelV2(liveSetting=");
        sbLIZ.append(this.liveSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LiveSDKSettingResponseV2 getLiveSetting() {
        return this.liveSetting;
    }

    public LiveSettingCombineModelV2(LiveSDKSettingResponseV2 liveSDKSettingResponseV2) {
        this.liveSetting = liveSDKSettingResponseV2;
    }

    public final void setLiveSetting(LiveSDKSettingResponseV2 liveSDKSettingResponseV2) {
        this.liveSetting = liveSDKSettingResponseV2;
    }
}
