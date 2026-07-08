package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCardContent {

    @C09CT("image")
    public final List<ImageBlock> image;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageCardContent) && Intrinsics.LJFF(this.image, ((ImageCardContent) obj).image);
    }

    public final int hashCode() {
        List<ImageBlock> list = this.image;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageCardContent(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ImageCardContent(List<ImageBlock> list) {
        this.image = list;
    }
}
