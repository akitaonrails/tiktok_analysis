package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TextCardContent {

    @C09CT("text")
    public final List<TextBlock> text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextCardContent) && Intrinsics.LJFF(this.text, ((TextCardContent) obj).text);
    }

    public final int hashCode() {
        List<TextBlock> list = this.text;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextCardContent(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextCardContent(List<TextBlock> list) {
        this.text = list;
    }
}
