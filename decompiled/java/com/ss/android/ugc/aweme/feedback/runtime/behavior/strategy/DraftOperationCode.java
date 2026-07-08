package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DraftOperationCode {
    public static final int $stable = 0;

    @C09CT("code")
    public final String code;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DraftOperationCode) && Intrinsics.LJFF(this.code, ((DraftOperationCode) obj).code);
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public DraftOperationCode() {
        this("");
    }

    public DraftOperationCode(String str) {
        this.code = str;
    }
}
