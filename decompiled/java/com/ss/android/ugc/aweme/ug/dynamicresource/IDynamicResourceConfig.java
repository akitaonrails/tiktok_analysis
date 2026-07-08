package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.EnumC1487630oob;
import X.EnumC19356010o2;

/* JADX INFO: loaded from: classes31.dex */
public interface IDynamicResourceConfig<T> {
    boolean enable();

    T fallback();

    String key();

    EnumC1487630oob priority();

    EnumC19356010o2 type();
}
