package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes13.dex */
public final class SharedEffect {
    public final transient LiveEffect LIZ;

    @C09CT("backup_resource_id")
    public String backupResourceId;

    @C09CT("resource_id")
    public String id;

    public SharedEffect() {
        this("", "", null);
    }

    public SharedEffect(String str, String str2, LiveEffect liveEffect) {
        this.id = str;
        this.backupResourceId = str2;
        this.LIZ = liveEffect;
    }
}
