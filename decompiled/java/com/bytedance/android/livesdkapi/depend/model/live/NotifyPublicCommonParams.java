package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class NotifyPublicCommonParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("biz")
    public int biz;

    @C09CT("component")
    public int component;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("user_type")
    public int userType;

    static {
        NormalGson.singleton();
        ADAPTER = new NotifyPublicCommonParams_OptTypeAdapter();
    }
}
