package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class RequestData implements Serializable {

    @C09CT("container_inputs")
    public final Map<String, ContainerInput> containerInputs;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("server_version")
    public final String serverVersion;

    @C09CT("strategies")
    public final Map<String, String> strategiesVersion;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("sdk_version")
    public final String version;

    public RequestData() {
        this(null, null, null, null, "2.9.0", null);
    }

    public RequestData(String str, Map<String, String> map, Long l, String str2, String str3, Map<String, ContainerInput> map2) {
        this.scene = str;
        this.strategiesVersion = map;
        this.timestamp = l;
        this.serverVersion = str2;
        this.version = str3;
        this.containerInputs = map2;
    }
}
