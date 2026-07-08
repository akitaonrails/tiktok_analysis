package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class Flag {

    @C09CT("key")
    public final String key;

    @C09CT("value")
    public final String value;

    public Flag() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) obj;
        return Intrinsics.LJFF(this.key, flag.key) && Intrinsics.LJFF(this.value, flag.value);
    }

    public Flag(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
