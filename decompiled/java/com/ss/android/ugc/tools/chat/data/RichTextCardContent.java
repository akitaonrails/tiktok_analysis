package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RichTextCardContent {

    @C09CT("blocks")
    public final List<ContentBlock> blocks;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RichTextCardContent) && Intrinsics.LJFF(this.blocks, ((RichTextCardContent) obj).blocks);
    }

    public final int hashCode() {
        List<ContentBlock> list = this.blocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RichTextCardContent(blocks=");
        sbLIZ.append(this.blocks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RichTextCardContent(List<ContentBlock> list) {
        this.blocks = list;
    }
}
