package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyAvoidPair {
    public static final TypeAdapter ADAPTER;

    @C09CT("after_feature")
    public int afterFeature;

    @C09CT("avoid_time_gap")
    public long avoidTimeGap;

    @C09CT("last_feature")
    public int lastFeature;

    @C09CT("user_type")
    public int userType;

    static {
        NormalGson.singleton();
        ADAPTER = new NotifyAvoidPair_OptTypeAdapter();
    }
}
