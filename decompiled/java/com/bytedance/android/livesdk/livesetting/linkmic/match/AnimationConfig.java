package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class AnimationConfig {
    public static final TypeAdapter ADAPTER = new AnimationConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("punish_anim_use_lottie")
    public boolean punish_anim_use_lottie;

    @C09CT("start_anim_opt")
    public boolean start_anim_opt;

    public AnimationConfig() {
        this(false, false);
    }

    public AnimationConfig(boolean z, boolean z2) {
        this.start_anim_opt = z;
        this.punish_anim_use_lottie = z2;
    }
}
