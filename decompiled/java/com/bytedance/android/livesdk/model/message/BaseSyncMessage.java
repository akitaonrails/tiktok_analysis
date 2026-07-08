package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class BaseSyncMessage {

    @C09CT("common")
    public Common common;

    @C09CT("data")
    public byte[] data;

    @C09CT("data_type")
    public int dataType;

    @C09CT("method_type")
    public int methodType;

    @C09CT("group")
    public String group = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";
}
