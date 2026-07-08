package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentReuseItemExtra extends PopupExtra {

    @C09CT("inconsistent_count")
    public final int inconsistentCount;

    @C09CT("no_pa_content_reuse_permission")
    public final int noPaContentReusePermission;

    public ContentReuseItemExtra() {
        this(0, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentReuseItemExtra)) {
            return false;
        }
        ContentReuseItemExtra contentReuseItemExtra = (ContentReuseItemExtra) obj;
        return this.inconsistentCount == contentReuseItemExtra.inconsistentCount && this.noPaContentReusePermission == contentReuseItemExtra.noPaContentReusePermission;
    }

    public final int hashCode() {
        return (this.inconsistentCount * 31) + this.noPaContentReusePermission;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentReuseItemExtra(inconsistentCount=");
        sbLIZ.append(this.inconsistentCount);
        sbLIZ.append(", noPaContentReusePermission=");
        sbLIZ.append(this.noPaContentReusePermission);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ContentReuseItemExtra(int i, int i2) {
        super(0);
        this.inconsistentCount = i;
        this.noPaContentReusePermission = i2;
    }
}
