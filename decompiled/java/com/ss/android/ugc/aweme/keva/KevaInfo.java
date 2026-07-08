package com.ss.android.ugc.aweme.keva;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class KevaInfo {

    @C09CT("isSync")
    public final boolean isSync;

    @C09CT("mode")
    public final int mode;

    @C09CT("repoName")
    public final String repoName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KevaInfo)) {
            return false;
        }
        KevaInfo kevaInfo = (KevaInfo) obj;
        return Intrinsics.LJFF(this.repoName, kevaInfo.repoName) && this.mode == kevaInfo.mode && this.isSync == kevaInfo.isSync;
    }

    public final int hashCode() {
        return (((this.repoName.hashCode() * 31) + this.mode) * 31) + C786410Ut5.Z2(this.isSync);
    }

    public KevaInfo(String str, int i, boolean z) {
        this.repoName = str;
        this.mode = i;
        this.isSync = z;
    }
}
