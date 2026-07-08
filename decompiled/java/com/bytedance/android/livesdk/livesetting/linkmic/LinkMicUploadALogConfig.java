package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicUploadALogConfig extends LinkMicUploadConfig {
    public static final TypeAdapter ADAPTER = new LinkMicUploadALogConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("upload_freq_threshold")
    public int uploadThreshold;

    public LinkMicUploadALogConfig() {
        this(null, null, null, null, null, 1, 0, 10);
    }

    public LinkMicUploadALogConfig(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int i, int i2, int i3) {
        super(iArr, iArr2, iArr3, iArr4, iArr5, i, i2);
        this.uploadThreshold = i3;
    }
}
