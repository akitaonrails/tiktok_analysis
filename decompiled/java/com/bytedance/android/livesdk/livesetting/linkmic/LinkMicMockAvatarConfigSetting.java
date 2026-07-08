package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_mock_avatar_config")
public final class LinkMicMockAvatarConfigSetting {
    public static final LinkMicMockAvatarConfigSetting INSTANCE = new LinkMicMockAvatarConfigSetting();
    public static final Config DEFAULT = new Config(0, 15, 0, 0, 1.77f, 0, 0, "mouth_close.mp4", "", "", true, false, 1, 400, 1, 0.0f, 1.0f, 0.0f, 1.0f, 0.5f);

    /* JADX INFO: loaded from: classes35.dex */
    public static final class Config {
        public static final TypeAdapter ADAPTER = new LinkMicMockAvatarConfigSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("crop_height")
        public float cropHeight;

        @C09CT("crop_width")
        public float cropWidth;

        @C09CT("crop_x")
        public float cropX;

        @C09CT("crop_y")
        public float cropY;

        @C09CT("effect")
        public boolean effect;

        @C09CT("file_name")
        public String fileName;

        @C09CT("file_path")
        public String filePath;

        @C09CT("fill_layout")
        public int fillLayout;

        @C09CT("fps")
        public int fps;

        @C09CT("loop")
        public boolean loop;

        @C09CT("o_height")
        public int outputHeight;

        @C09CT("o_ratio")
        public float outputRatio;

        @C09CT("o_width")
        public int outputWidth;

        @C09CT("ratio")
        public float ratio;

        @C09CT("remote_url")
        public String remoteUrl;

        @C09CT("resource_type")
        public int resourceType;

        @C09CT("speak_interval")
        public long speakInterval;

        @C09CT("s_height")
        public int surfaceHeight;

        @C09CT("s_width")
        public int surfaceWidth;

        @C09CT("ues_texture")
        public int uesTexture;

        public Config() {
            this(0, 15, 0, 0, 1.77f, 0, 0, "mouth_close.mp4", "", "", true, false, 1, 400L, 1, 0.0f, 1.0f, 0.0f, 1.0f, 0.5f);
        }

        public Config(int i, int i2, int i3, int i4, float f, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, int i7, long j, int i8, float f2, float f3, float f4, float f5, float f6) {
            this.uesTexture = i;
            this.fps = i2;
            this.outputWidth = i3;
            this.outputHeight = i4;
            this.outputRatio = f;
            this.surfaceWidth = i5;
            this.surfaceHeight = i6;
            this.fileName = str;
            this.filePath = str2;
            this.remoteUrl = str3;
            this.loop = z;
            this.effect = z2;
            this.resourceType = i7;
            this.speakInterval = j;
            this.fillLayout = i8;
            this.cropX = f2;
            this.cropY = f3;
            this.cropWidth = f4;
            this.cropHeight = f5;
            this.ratio = f6;
        }
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("link_mic_mock_avatar_config", config);
        return config2 != null ? config2 : config;
    }
}
