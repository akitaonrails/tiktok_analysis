package com.bytedance.router.monitor.page;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FragmentOp {
    public final String fragmentId;
    public final String sysMethod;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentOp)) {
            return false;
        }
        FragmentOp fragmentOp = (FragmentOp) obj;
        return Intrinsics.LJFF(this.fragmentId, fragmentOp.fragmentId) && Intrinsics.LJFF(this.sysMethod, fragmentOp.sysMethod);
    }

    public FragmentOp(String str, String str2) {
        this.fragmentId = str;
        this.sysMethod = str2;
    }
}
