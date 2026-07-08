package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C1200890hM7;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailTag implements Serializable {

    @C09CT("tag_content")
    public final PoiDetailTagContent tagContent;

    @C09CT("tag_style")
    public final int tagStyle;

    @C09CT("tag_type")
    public final int tagType;

    public PoiDetailTag() {
        this(0, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetailTag)) {
            return false;
        }
        PoiDetailTag poiDetailTag = (PoiDetailTag) obj;
        return this.tagType == poiDetailTag.tagType && this.tagStyle == poiDetailTag.tagStyle && Intrinsics.LJFF(this.tagContent, poiDetailTag.tagContent);
    }

    public int hashCode() {
        int i = ((this.tagType * 31) + this.tagStyle) * 31;
        PoiDetailTagContent poiDetailTagContent = this.tagContent;
        return i + (poiDetailTagContent == null ? 0 : poiDetailTagContent.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailTag(tagType=");
        sbLIZ.append(this.tagType);
        sbLIZ.append(", tagStyle=");
        sbLIZ.append(this.tagStyle);
        sbLIZ.append(", tagContent=");
        sbLIZ.append(this.tagContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean hasText() {
        PoiDetailTagContent poiDetailTagContent = this.tagContent;
        return C1200890hM7.LIZ(poiDetailTagContent != null ? poiDetailTagContent.commonText : null);
    }

    public PoiDetailTag(int i, int i2, PoiDetailTagContent poiDetailTagContent) {
        this.tagType = i;
        this.tagStyle = i2;
        this.tagContent = poiDetailTagContent;
    }
}
