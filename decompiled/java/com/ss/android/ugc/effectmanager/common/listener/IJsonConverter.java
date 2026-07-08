package com.ss.android.ugc.effectmanager.common.listener;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface IJsonConverter {
    <T> T convertJsonToObj(InputStream inputStream, Class<T> cls);

    <T> String convertObjToJson(T t);
}
