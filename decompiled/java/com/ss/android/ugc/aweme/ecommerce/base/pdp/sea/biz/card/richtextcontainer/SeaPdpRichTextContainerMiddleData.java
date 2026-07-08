package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaPdpRichTextContainerMiddleData {

    @C09CT("items")
    public final List<SeaPdpRichTextContainerMiddleItem> items;

    @C09CT("padding")
    public final List<Float> padding;

    public SeaPdpRichTextContainerMiddleData() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpRichTextContainerMiddleData)) {
            return false;
        }
        SeaPdpRichTextContainerMiddleData seaPdpRichTextContainerMiddleData = (SeaPdpRichTextContainerMiddleData) obj;
        return Intrinsics.LJFF(this.padding, seaPdpRichTextContainerMiddleData.padding) && Intrinsics.LJFF(this.items, seaPdpRichTextContainerMiddleData.items);
    }

    public final int hashCode() {
        List<Float> list = this.padding;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SeaPdpRichTextContainerMiddleItem> list2 = this.items;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpRichTextContainerMiddleData(padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpRichTextContainerMiddleData(List<Float> list, List<SeaPdpRichTextContainerMiddleItem> list2) {
        this.padding = list;
        this.items = list2;
    }
}
