package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class EffectNotifyTypeNameMapping {
    public static final TypeAdapter ADAPTER = new EffectNotifyTypeNameMapping_OptTypeAdapter(NormalGson.singleton());

    @C09CT("component")
    public Map<String, String> component = new LinkedHashMap();

    @C09CT("biz")
    public Map<String, String> biz = new LinkedHashMap();

    @C09CT(Scene.SCENE_SERVICE)
    public Map<String, String> scene = new LinkedHashMap();

    @C09CT("consume_method")
    public Map<String, String> consumeMethod = new LinkedHashMap();

    @C09CT("anim")
    public Map<String, String> anim = new LinkedHashMap();

    @C09CT("feature")
    public Map<String, String> feature = new LinkedHashMap();
}
