package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class UpdateStrategy {

    @C09CT("target_instance_id")
    public final String targetInstanceId;

    @C09CT("update_type")
    public final String updateType;

    public UpdateStrategy() {
        this(null, null);
    }

    public UpdateStrategy(String str, String str2) {
        this.updateType = str;
        this.targetInstanceId = str2;
    }
}
