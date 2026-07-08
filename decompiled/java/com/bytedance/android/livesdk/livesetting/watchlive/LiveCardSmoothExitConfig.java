package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCardSmoothExitConfig {
    public static final TypeAdapter ADAPTER = new LiveCardSmoothExitConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("preview_card_duration")
    public long previewCardDuration;

    @C09CT("room_duration")
    public long roomExitDuration;

    public LiveCardSmoothExitConfig() {
        this(false, 300L, 0L);
    }

    public LiveCardSmoothExitConfig(boolean z, long j, long j2) {
        this.enable = z;
        this.roomExitDuration = j;
        this.previewCardDuration = j2;
    }
}
