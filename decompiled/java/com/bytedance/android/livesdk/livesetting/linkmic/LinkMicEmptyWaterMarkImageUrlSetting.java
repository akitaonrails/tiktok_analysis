package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_empty_watermark_image_url")
public final class LinkMicEmptyWaterMarkImageUrlSetting {
    public static final LinkMicEmptyWaterMarkImageUrlSetting INSTANCE = new LinkMicEmptyWaterMarkImageUrlSetting();
    public static final EmptyWaterUrlInfo DEFAULT = new EmptyWaterUrlInfo("https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/video_live_empty_20240104.jpeg~tplv-0gv1ynv35u-image.png", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/audio_chat_image.png~tplv-0gv1ynv35u-image.png", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/empty_mic_image_171717.png~tplv-0gv1ynv35u-image.png", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/audio_chat_image_black_url.png~tplv-0gv1ynv35u-image.png", "https://p16-linkmic-img.tiktokcdn-us.com/tos-alisg-i-0gv1ynv35u-sg/blackgradient.png~tplv-0gv1ynv35u-image.png");

    public static final class EmptyWaterUrlInfo {
        public static final TypeAdapter ADAPTER;

        @C09CT("audio_chat_image_black_url")
        public String audioChatImageBlackUrl;

        @C09CT("audio_chat_image_url")
        public String audioChatImageUrl;

        @C09CT("empty_mic_image_black_url")
        public String emptyMicImageBlackUrl;

        @C09CT("empty_mic_image_gradient_black_url")
        public String emptyMicImageGradientBlackUrl;

        @C09CT("empty_mic_image_url")
        public String emptyMicImageUrl;

        static {
            NormalGson.singleton();
            ADAPTER = new LinkMicEmptyWaterMarkImageUrlSetting_EmptyWaterUrlInfo_OptTypeAdapter();
        }

        public EmptyWaterUrlInfo() {
            this("", "", "", "", "");
        }

        public EmptyWaterUrlInfo(String str, String str2, String str3, String str4, String str5) {
            this.emptyMicImageUrl = str;
            this.audioChatImageUrl = str2;
            this.emptyMicImageBlackUrl = str3;
            this.audioChatImageBlackUrl = str4;
            this.emptyMicImageGradientBlackUrl = str5;
        }
    }

    public final EmptyWaterUrlInfo getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        EmptyWaterUrlInfo emptyWaterUrlInfo = DEFAULT;
        EmptyWaterUrlInfo emptyWaterUrlInfo2 = (EmptyWaterUrlInfo) settingsManager.getValueSafely("linkmic_empty_watermark_image_url", emptyWaterUrlInfo);
        return emptyWaterUrlInfo2 != null ? emptyWaterUrlInfo2 : emptyWaterUrlInfo;
    }

    private final String getMultiGuestEmptyMicImageBlackUrl() {
        String str = getValue().emptyMicImageBlackUrl;
        return str == null ? "" : str;
    }

    private final String getMultiGuestEmptyMicImageGradientBlackUrl() {
        String str = getValue().emptyMicImageGradientBlackUrl;
        return str == null ? "" : str;
    }

    private final String getVoiceChatEmptyMicImageBlackUrl() {
        String str = getValue().audioChatImageBlackUrl;
        return str == null ? "" : str;
    }

    public final String getEmptyMicImageUrlByLiveType(String str, boolean z) {
        if (z) {
            if (Intrinsics.LJFF(str, "live_voice")) {
                return getVoiceChatEmptyMicImageBlackUrl();
            }
            if (!Intrinsics.LJFF(str, "video_live")) {
                return "";
            }
            return getMultiGuestEmptyMicImageGradientBlackUrl();
        }
        if (Intrinsics.LJFF(str, "live_voice")) {
            return getVoiceChatEmptyMicImageBlackUrl();
        }
        if (!Intrinsics.LJFF(str, "video_live")) {
            return "";
        }
        return getMultiGuestEmptyMicImageBlackUrl();
    }
}
