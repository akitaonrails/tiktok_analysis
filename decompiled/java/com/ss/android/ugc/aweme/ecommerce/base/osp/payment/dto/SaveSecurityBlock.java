package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SaveSecurityBlock {

    @C09CT("content")
    public ECRichText content;

    @C09CT("icon")
    public Icon icon;

    public SaveSecurityBlock() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveSecurityBlock)) {
            return false;
        }
        SaveSecurityBlock saveSecurityBlock = (SaveSecurityBlock) obj;
        return Intrinsics.LJFF(this.content, saveSecurityBlock.content) && Intrinsics.LJFF(this.icon, saveSecurityBlock.icon);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.content;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Icon icon = this.icon;
        return iHashCode + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveSecurityBlock(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SaveSecurityBlock(ECRichText eCRichText, Icon icon) {
        this.content = eCRichText;
        this.icon = icon;
    }
}
