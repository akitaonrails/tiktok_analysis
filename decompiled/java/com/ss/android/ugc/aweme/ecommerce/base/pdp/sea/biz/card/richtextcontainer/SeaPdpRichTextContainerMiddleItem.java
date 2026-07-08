package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vo.SeaPdpAction;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpRichTextContainerMiddleItem {

    @C09CT("action")
    public final Map<String, SeaPdpAction> action;

    @C09CT("rich_text")
    public final ECRichText richText;

    @C09CT("top_space")
    public final Float topSpace;

    public SeaPdpRichTextContainerMiddleItem() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpRichTextContainerMiddleItem)) {
            return false;
        }
        SeaPdpRichTextContainerMiddleItem seaPdpRichTextContainerMiddleItem = (SeaPdpRichTextContainerMiddleItem) obj;
        return Intrinsics.LJFF(this.richText, seaPdpRichTextContainerMiddleItem.richText) && Intrinsics.LJFF(this.topSpace, seaPdpRichTextContainerMiddleItem.topSpace) && Intrinsics.LJFF(this.action, seaPdpRichTextContainerMiddleItem.action);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.richText;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Float f = this.topSpace;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Map<String, SeaPdpAction> map = this.action;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpRichTextContainerMiddleItem(richText=");
        sbLIZ.append(this.richText);
        sbLIZ.append(", topSpace=");
        sbLIZ.append(this.topSpace);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpRichTextContainerMiddleItem(ECRichText eCRichText, Float f, Map<String, SeaPdpAction> map) {
        this.richText = eCRichText;
        this.topSpace = f;
        this.action = map;
    }
}
