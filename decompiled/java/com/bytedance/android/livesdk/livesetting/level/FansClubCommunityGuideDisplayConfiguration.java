package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCommunityGuideDisplayConfiguration {
    public static final TypeAdapter ADAPTER;

    @C09CT("channel_name")
    public String channelName;

    @C09CT("guide_lottie_file_name")
    public String guideLottieFileName;

    static {
        NormalGson.singleton();
        ADAPTER = new FansClubCommunityGuideDisplayConfiguration_OptTypeAdapter();
    }

    public FansClubCommunityGuideDisplayConfiguration() {
        this("", "");
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final String getGuideLottieFileName() {
        return this.guideLottieFileName;
    }

    public final void setChannelName(String str) {
        this.channelName = str;
    }

    public final void setGuideLottieFileName(String str) {
        this.guideLottieFileName = str;
    }

    public FansClubCommunityGuideDisplayConfiguration(String str, String str2) {
        this.channelName = str;
        this.guideLottieFileName = str2;
    }
}
