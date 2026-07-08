package com.ss.android.ugc.aweme.gsonopt;

import X.C2334009Co;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes.dex */
public class BaseAdapterFactory implements v {
    public final C2334009Co LL;

    public BaseAdapter LIZ(String str) {
        return null;
    }

    public BaseAdapterFactory(C2334009Co c2334009Co) {
        this.LL = c2334009Co;
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        BaseAdapter baseAdapterLIZ;
        if (typeToken != null && (typeToken.getType() instanceof Class) && (baseAdapterLIZ = LIZ(((Class) typeToken.getType()).getName().replace(e3.d, "/"))) != null) {
            return baseAdapterLIZ;
        }
        return null;
    }
}
