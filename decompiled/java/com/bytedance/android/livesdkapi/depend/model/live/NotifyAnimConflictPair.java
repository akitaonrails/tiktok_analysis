package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyAnimConflictPair {
    public static final TypeAdapter ADAPTER;

    @C09CT("after_anim_type")
    public int afterAnimType;

    @C09CT("before_anim_type")
    public int beforeAnimType;

    static {
        NormalGson.singleton();
        ADAPTER = new NotifyAnimConflictPair_OptTypeAdapter();
    }
}
