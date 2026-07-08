package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoPushText {

    @C09CT("content")
    public final String content;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoPushText) && Intrinsics.LJFF(this.content, ((TakoPushText) obj).content);
    }

    public final int hashCode() {
        return this.content.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPushText(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoPushText() {
        this("");
    }

    public TakoPushText(String str) {
        this.content = str;
    }
}
