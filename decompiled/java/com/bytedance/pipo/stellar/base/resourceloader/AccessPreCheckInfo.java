package com.bytedance.pipo.stellar.base.resourceloader;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AccessPreCheckInfo implements Serializable {

    @C09CT("access_pre_check_scene")
    public final String accessPreCheckScene;

    @C09CT("pre_check_data")
    public final Map<String, String> preCheckData;

    public AccessPreCheckInfo() {
        this(null, null);
    }

    public AccessPreCheckInfo(String str, Map<String, String> map) {
        this.accessPreCheckScene = str;
        this.preCheckData = map;
    }
}
