package com.ss.android.ugc.aweme.im.strategy.scene;

import X.C09CT;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class SceneConfigData {

    @C09CT("data")
    public final Map<String, IBusinessConfig> data;

    @C09CT("scene_type")
    public final String sceneType;

    /* JADX WARN: Multi-variable type inference failed */
    public SceneConfigData(String str, Map<String, ? extends IBusinessConfig> map) {
        this.sceneType = str;
        this.data = map;
    }
}
