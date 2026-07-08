package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveLikeDegrade {
    public static final TypeAdapter ADAPTER = new LiveLikeDegrade_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_self_like")
    public boolean enableSelflike = true;

    @C09CT("enable_other_like")
    public boolean enableOtherlike = true;

    @C09CT("enable_lottie_anim")
    public boolean enableLottieAnim = true;

    @C09CT("enable_avatar_anim")
    public boolean enableAvatarAnim = true;

    @C09CT("enable_easter_eggs")
    public boolean enableEasterEggs = true;
}
