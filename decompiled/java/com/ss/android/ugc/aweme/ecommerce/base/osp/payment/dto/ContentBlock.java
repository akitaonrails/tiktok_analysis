package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentBlock {

    @C09CT("prefix_icon")
    public Icon prefixIcon;

    @C09CT("text")
    public String text;

    public ContentBlock() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentBlock)) {
            return false;
        }
        ContentBlock contentBlock = (ContentBlock) obj;
        return Intrinsics.LJFF(this.text, contentBlock.text) && Intrinsics.LJFF(this.prefixIcon, contentBlock.prefixIcon);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.prefixIcon;
        return iHashCode + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentBlock(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", prefixIcon=");
        sbLIZ.append(this.prefixIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ContentBlock(String str, Icon icon) {
        this.text = str;
        this.prefixIcon = icon;
    }
}
