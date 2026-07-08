package com.google.gson;

import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public interface v {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
