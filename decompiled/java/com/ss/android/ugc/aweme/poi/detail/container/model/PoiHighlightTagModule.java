package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PoiHighlightTagModule implements Serializable {

    @C09CT("icon_tags")
    public final List<IconTag> iconTags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiHighlightTagModule) && Intrinsics.LJFF(this.iconTags, ((PoiHighlightTagModule) obj).iconTags);
    }

    public int hashCode() {
        List<IconTag> list = this.iconTags;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiHighlightTagModule(iconTags=");
        sbLIZ.append(this.iconTags);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiHighlightTagModule(List<IconTag> list) {
        this.iconTags = list;
    }
}
