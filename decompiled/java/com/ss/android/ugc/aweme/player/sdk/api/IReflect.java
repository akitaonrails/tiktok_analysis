package com.ss.android.ugc.aweme.player.sdk.api;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes24.dex */
public interface IReflect {
    Field getField(Class cls, String str);

    boolean updateField(Object obj, Field field, Object obj2);
}
