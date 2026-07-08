package com.bytedance.android.livesdk.chatroom.slide.v1;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveAnimationDegrade {
    public static final TypeAdapter ADAPTER = new LiveAnimationDegrade_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_entrance_anim")
    public boolean enableEntranceAnim;

    @C09CT("enable_guide")
    public boolean enableGuide;

    @C09CT("enable_mini_toplive")
    public boolean enableMiniTopLives;

    public LiveAnimationDegrade() {
        this(true, true, true);
    }

    public LiveAnimationDegrade(boolean z, boolean z2, boolean z3) {
        this.enableGuide = z;
        this.enableMiniTopLives = z2;
        this.enableEntranceAnim = z3;
    }
}
