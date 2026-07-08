package com.ss.android.ugc.aweme.challenge.data;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class LocalHashTag {

    @C09CT("is_private")
    public Boolean isPrivate;

    @C09CT("name")
    public final String name;

    public final int hashCode() {
        String str = this.name;
        return ((str != null ? str.hashCode() : 0) * 31) + (Intrinsics.LJFF(this.isPrivate, Boolean.TRUE) ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(LocalHashTag.class, cls)) {
            return false;
        }
        LocalHashTag localHashTag = (LocalHashTag) obj;
        if (Intrinsics.LJFF(this.name, localHashTag.name) && Intrinsics.LJFF(this.isPrivate, localHashTag.isPrivate)) {
            return true;
        }
        return false;
    }

    public LocalHashTag(String str, Boolean bool) {
        this.name = str;
        this.isPrivate = bool;
    }
}
