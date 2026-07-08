package com.ss.android.ugc.aweme.shortvideo.mapping;

import X.C09FO;
import com.bytedance.creativex.model.mapping.OnlySerializableModelExtraAdapter;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class AVChallengeExtrasAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!HashMap.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        return new OnlySerializableModelExtraAdapter(gson, C09FO.LIZ);
    }
}
