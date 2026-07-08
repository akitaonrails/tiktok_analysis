package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenRessoLinks {

    @C09CT("app_link")
    public final String appLink = "https://www.resso.com/track?channel=tt&callback=snssdk1233%3A%2F%2F&entry_name=tt_dsp&channel_source=tt_synergy&channel_scene=tt_mini_ttm";

    @C09CT("deep_link")
    public final String deepLink = "resso://resso.com?channel=tt&callback=snssdk1233%3A%2F%2F&entry_name=tt_dsp&channel_source=tt_synergy&channel_scene=tt_mini_ttm";

    @C09CT("download_link")
    public final String downloadLink = "https://go.onelink.me/hDJ6?pid=tiktok_dsp&c=tiktok_dsp&af_dp=resso%3A%2F%2Fresso.com%3Fchannel%3Dtt%26callback%3Dsnssdk1233%253A%252F%252F%26entry_name%3Dtt_dsp%26channel_source%3Dtt_synergy%26channel_scene%3Dtt_mini_ttm&af_force_deeplink=true";

    @C09CT("resso_store_link")
    public final String ressoStoreLink = "https://play.google.com/store/apps/details?id=com.moonvideo.android.resso";

    public final String getAppLink() {
        return this.appLink;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDownloadLink() {
        return this.downloadLink;
    }

    public final String getRessoStoreLink() {
        return this.ressoStoreLink;
    }
}
