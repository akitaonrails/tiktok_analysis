package com.ss.android.tracker.event.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ParamDiffValue {

    @C09CT("key")
    public final String key;

    @C09CT("new_value")
    public final String newValue;

    @C09CT("old_value")
    public final String oldValue;

    public ParamDiffValue(String str, String str2, String str3) {
        this.key = str;
        this.newValue = str2;
        this.oldValue = str3;
    }
}
