package com.bytedance.tiktok.creationmodel.nano.core;

import android.os.Parcelable;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes35.dex */
public final class ControlledModelDeserializer implements j<Controlled<Parcelable, Parcelable>> {
    @Override // com.google.gson.j
    public final Controlled<Parcelable, Parcelable> deserialize(k kVar, Type type, i iVar) {
        return new Controlled<>((Parcelable) ((TreeTypeAdapter.a) iVar).LIZ(kVar, ((ParameterizedType) type).getActualTypeArguments()[1]));
    }
}
