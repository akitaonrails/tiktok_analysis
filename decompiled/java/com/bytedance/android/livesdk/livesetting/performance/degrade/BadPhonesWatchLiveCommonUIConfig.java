package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class BadPhonesWatchLiveCommonUIConfig {
    public static final TypeAdapter ADAPTER = new BadPhonesWatchLiveCommonUIConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disable_gauss_blurred")
    public boolean disableGaussBlurred;

    @C09CT("remove_bottom_shadow")
    public boolean removeBottomShadow;

    @C09CT("remove_insert_message_animation")
    public boolean removeInsertMessageAnimation;

    @C09CT("remove_top_shadow")
    public boolean removeTopShadow;
}
