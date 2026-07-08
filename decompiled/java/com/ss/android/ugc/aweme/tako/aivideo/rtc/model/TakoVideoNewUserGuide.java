package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoVideoNewUserGuide {

    @C09CT("content")
    public final String content;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoVideoNewUserGuide) && Intrinsics.LJFF(this.content, ((TakoVideoNewUserGuide) obj).content);
    }

    public final int hashCode() {
        return this.content.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoVideoNewUserGuide(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoVideoNewUserGuide() {
        this("");
    }

    public TakoVideoNewUserGuide(String str) {
        this.content = str;
    }
}
