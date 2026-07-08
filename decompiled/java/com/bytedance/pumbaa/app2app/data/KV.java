package com.bytedance.pumbaa.app2app.data;

import X.C09CT;
import X.C825710WaH;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class KV {

    @C09CT("key")
    public String key;

    @C09CT("value")
    public String value;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof KV)) {
            return false;
        }
        KV kv = (KV) obj;
        if (!Intrinsics.LJFF(kv.key, this.key) || !Intrinsics.LJFF(kv.value, this.value)) {
            return false;
        }
        return true;
    }

    public KV(String str, String str2) {
        this.key = str;
        if (C825710WaH.LIZLLL) {
            this.value = str2;
        }
    }
}
