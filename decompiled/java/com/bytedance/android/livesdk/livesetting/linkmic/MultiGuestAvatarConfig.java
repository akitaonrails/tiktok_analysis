package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAvatarConfig {
    public static final TypeAdapter ADAPTER = new MultiGuestAvatarConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("avatar_max_count")
    public int avatarMaxCount;

    @C09CT("cache_duration")
    public long cacheDuration;

    @C09CT("cache_enable")
    public boolean cacheEnable;

    @C09CT("create_avatar_timeout")
    public long createAvatarTimeout;

    @C09CT("download_max_count")
    public int downloadMaxCount;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_camera_picture_downsampling")
    public boolean enableCameraPictureDownSampling;

    @C09CT("fake_progress_timeout")
    public long fakeProgressTimeout;

    @C09CT("mock_avatar_download_fail")
    public int mockAvatarDownloadFail;

    @C09CT("mock_avatar_result_im")
    public int mockAvatarResultIM;

    @C09CT("mock_avatar_style_im")
    public int mockAvatarStyleIM;

    @C09CT("picture_aim_width")
    public int sample_picture_aim_width;

    @C09CT("stylized_timeout")
    public long stylizedTimeout;

    public MultiGuestAvatarConfig() {
        this(true, true, 180L, 30, 5, 20L, 60L, 180L, 0, 0, 0, true, 540);
    }

    public MultiGuestAvatarConfig(boolean z, boolean z2, long j, int i, int i2, long j2, long j3, long j4, int i3, int i4, int i5, boolean z3, int i6) {
        this.enable = z;
        this.cacheEnable = z2;
        this.cacheDuration = j;
        this.avatarMaxCount = i;
        this.downloadMaxCount = i2;
        this.fakeProgressTimeout = j2;
        this.stylizedTimeout = j3;
        this.createAvatarTimeout = j4;
        this.mockAvatarStyleIM = i3;
        this.mockAvatarResultIM = i4;
        this.mockAvatarDownloadFail = i5;
        this.enableCameraPictureDownSampling = z3;
        this.sample_picture_aim_width = i6;
    }
}
