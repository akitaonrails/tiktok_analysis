package com.ss.android.ugc.aweme.favorites.agents.abilities;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public interface ICollect {
    void collect(String str, Map<String, ? extends Object> map, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22);

    void unCollect(String str, Map<String, ? extends Object> map, Function2<? super String, ? super Throwable, Unit> function2, Function2<? super String, ? super Boolean, Unit> function22);
}
