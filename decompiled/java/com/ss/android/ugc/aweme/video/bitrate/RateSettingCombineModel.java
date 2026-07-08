package com.ss.android.ugc.aweme.video.bitrate;

import X.C09CT;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;

/* JADX INFO: loaded from: classes5.dex */
public final class RateSettingCombineModel extends BaseCombineMode {

    @C09CT("body")
    public RateSettingsResponse<PlayerTypeAbConfigV2> rateSetting;

    public final RateSettingsResponse<PlayerTypeAbConfigV2> getRateSetting() {
        return this.rateSetting;
    }

    public RateSettingCombineModel(RateSettingsResponse<PlayerTypeAbConfigV2> rateSettingsResponse) {
        this.rateSetting = rateSettingsResponse;
    }

    public final void setRateSetting(RateSettingsResponse<PlayerTypeAbConfigV2> rateSettingsResponse) {
        this.rateSetting = rateSettingsResponse;
    }
}
