package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpRichTextContainerLeftData {

    @C09CT("icon")
    public final Icon icon;

    @C09CT("layout")
    public final Integer layout;

    @C09CT("padding")
    public final List<Float> padding;

    public SeaPdpRichTextContainerLeftData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpRichTextContainerLeftData)) {
            return false;
        }
        SeaPdpRichTextContainerLeftData seaPdpRichTextContainerLeftData = (SeaPdpRichTextContainerLeftData) obj;
        return Intrinsics.LJFF(this.icon, seaPdpRichTextContainerLeftData.icon) && Intrinsics.LJFF(this.layout, seaPdpRichTextContainerLeftData.layout) && Intrinsics.LJFF(this.padding, seaPdpRichTextContainerLeftData.padding);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        Integer num = this.layout;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Float> list = this.padding;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpRichTextContainerLeftData(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpRichTextContainerLeftData(Icon icon, Integer num, List<Float> list) {
        this.icon = icon;
        this.layout = num;
        this.padding = list;
    }
}
