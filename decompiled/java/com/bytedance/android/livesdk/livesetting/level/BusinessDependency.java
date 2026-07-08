package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class BusinessDependency {
    public static final TypeAdapter ADAPTER;

    @C09CT("fans_entrance_status")
    public int fansEntranceStatus;

    static {
        NormalGson.singleton();
        ADAPTER = new BusinessDependency_OptTypeAdapter();
    }

    public BusinessDependency() {
        this(0);
    }

    public BusinessDependency(int i) {
        this.fansEntranceStatus = i;
    }
}
