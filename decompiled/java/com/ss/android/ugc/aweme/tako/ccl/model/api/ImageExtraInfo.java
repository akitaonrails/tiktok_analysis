package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageExtraInfo implements Serializable {

    @C09CT("is_visible")
    public final boolean isVisible;

    @C09CT("tag_name")
    public final List<String> tagName;

    public ImageExtraInfo() {
        this(false, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageExtraInfo)) {
            return false;
        }
        ImageExtraInfo imageExtraInfo = (ImageExtraInfo) obj;
        return this.isVisible == imageExtraInfo.isVisible && Intrinsics.LJFF(this.tagName, imageExtraInfo.tagName);
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.isVisible) * 31) + this.tagName.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageExtraInfo(isVisible=");
        sbLIZ.append(this.isVisible);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.tagName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public ImageExtraInfo(boolean z, List<String> list) {
        this.isVisible = z;
        this.tagName = list;
    }

    public ImageExtraInfo(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
