package com.bytedance.router.autowire;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public interface ISerializationService {
    String object2Json(Object obj);

    <T> T parseObject(String str, Type type);
}
