package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LinkCommonBean {

    @C09CT("app_id")
    public long appId;

    @C09CT("extra")
    public Map<String, String> extraMap;

    @C09CT("live_id")
    public long live_id;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    public LinkCommonBean() {
        this(0, 0L, 0L, null);
    }

    public LinkCommonBean(int i, long j, long j2, Map<String, String> map) {
        this.scene = i;
        this.appId = j;
        this.live_id = j2;
        this.extraMap = map;
    }
}
