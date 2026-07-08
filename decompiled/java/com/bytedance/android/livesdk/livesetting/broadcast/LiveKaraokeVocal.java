package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveKaraokeVocal {
    public static final TypeAdapter ADAPTER;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public float f27default;

    @C09CT("max")
    public float max;

    @C09CT("min")
    public float min;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveKaraokeVocal_OptTypeAdapter();
    }

    public LiveKaraokeVocal() {
        this(1.0f, 0.0f, 0.5f);
    }

    public LiveKaraokeVocal(float f, float f2, float f3) {
        this.max = f;
        this.min = f2;
        this.f27default = f3;
    }
}
