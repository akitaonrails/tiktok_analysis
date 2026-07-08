package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Avatar {

    @C09CT("image_thumb")
    public final ImageThumb imageThumb;

    public Avatar() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Avatar) && Intrinsics.LJFF(this.imageThumb, ((Avatar) obj).imageThumb);
    }

    public final int hashCode() {
        ImageThumb imageThumb = this.imageThumb;
        if (imageThumb == null) {
            return 0;
        }
        return imageThumb.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Avatar(imageThumb=");
        sbLIZ.append(this.imageThumb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Avatar(ImageThumb imageThumb) {
        this.imageThumb = imageThumb;
    }
}
