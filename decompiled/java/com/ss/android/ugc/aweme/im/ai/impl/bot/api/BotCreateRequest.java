package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class BotCreateRequest implements Serializable {

    @C09CT("retry")
    public final boolean isRetry;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public final boolean isRetry() {
        return this.isRetry;
    }

    public BotCreateRequest(int i, boolean z) {
        this.scene = i;
        this.isRetry = z;
    }
}
