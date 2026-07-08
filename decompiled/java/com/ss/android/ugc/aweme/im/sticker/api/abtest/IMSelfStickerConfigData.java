package com.ss.android.ugc.aweme.im.sticker.api.abtest;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes36.dex */
public final class IMSelfStickerConfigData {

    @C09CT("icon_match_key")
    public final String iconKey;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("panel_icon_url")
    public final String panelUrl;

    @C09CT("polling_interval")
    public final long pollingIntervalMs;

    @C09CT("waiting_threshold")
    public final long waitingThresholdMs;

    public IMSelfStickerConfigData() {
        this("https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/aiself_icon_latina_self.png", "https://sf16-muse-va.tiktokcdn-us.com/obj/im-resource-muse/aiself_panel_latina_SA.png", Mp4ScreenVideoLoadTimeout.CONTROL, 3600000L, "yo");
    }

    public IMSelfStickerConfigData(String str, String str2, long j, long j2, String str3) {
        this.iconUrl = str;
        this.panelUrl = str2;
        this.pollingIntervalMs = j;
        this.waitingThresholdMs = j2;
        this.iconKey = str3;
    }
}
