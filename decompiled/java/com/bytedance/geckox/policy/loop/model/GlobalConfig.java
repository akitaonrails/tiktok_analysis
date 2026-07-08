package com.bytedance.geckox.policy.loop.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class GlobalConfig {

    @C09CT("check_update")
    public Map<String, LoopInterval> checkUpdate;

    public GlobalConfig() {
    }

    public Map<String, LoopInterval> getCheckUpdate() {
        return this.checkUpdate;
    }

    public GlobalConfig(Map<String, LoopInterval> map) {
        this.checkUpdate = map;
    }
}
