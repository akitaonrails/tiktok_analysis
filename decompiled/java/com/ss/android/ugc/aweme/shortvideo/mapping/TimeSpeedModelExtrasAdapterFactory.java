package com.ss.android.ugc.aweme.shortvideo.mapping;

import X.C09FN;
import android.os.Bundle;
import com.bytedance.creativex.model.mapping.SimpleBundleModelExtraAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeSpeedModelExtrasAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!Bundle.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        return new SimpleBundleModelExtraAdapter(gson, C09FN.LIZ);
    }
}
