package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.richtextcontainer;

import X.AbstractC1066304Ez;
import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpRichTextContainerBffVO extends AbstractC1066304Ez {

    @C09CT("left")
    public final SeaPdpRichTextContainerLeftData left;

    @C09CT("middle")
    public final SeaPdpRichTextContainerMiddleData middle;

    @C09CT("right")
    public final SeaPdpRichTextContainerRightData right;

    public SeaPdpRichTextContainerBffVO() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpRichTextContainerBffVO)) {
            return false;
        }
        SeaPdpRichTextContainerBffVO seaPdpRichTextContainerBffVO = (SeaPdpRichTextContainerBffVO) obj;
        return Intrinsics.LJFF(this.left, seaPdpRichTextContainerBffVO.left) && Intrinsics.LJFF(this.middle, seaPdpRichTextContainerBffVO.middle) && Intrinsics.LJFF(this.right, seaPdpRichTextContainerBffVO.right);
    }

    public final int hashCode() {
        SeaPdpRichTextContainerLeftData seaPdpRichTextContainerLeftData = this.left;
        int iHashCode = (seaPdpRichTextContainerLeftData == null ? 0 : seaPdpRichTextContainerLeftData.hashCode()) * 31;
        SeaPdpRichTextContainerMiddleData seaPdpRichTextContainerMiddleData = this.middle;
        int iHashCode2 = (iHashCode + (seaPdpRichTextContainerMiddleData == null ? 0 : seaPdpRichTextContainerMiddleData.hashCode())) * 31;
        SeaPdpRichTextContainerRightData seaPdpRichTextContainerRightData = this.right;
        return iHashCode2 + (seaPdpRichTextContainerRightData != null ? seaPdpRichTextContainerRightData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpRichTextContainerBffVO(left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", middle=");
        sbLIZ.append(this.middle);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpRichTextContainerBffVO(SeaPdpRichTextContainerLeftData seaPdpRichTextContainerLeftData, SeaPdpRichTextContainerMiddleData seaPdpRichTextContainerMiddleData, SeaPdpRichTextContainerRightData seaPdpRichTextContainerRightData) {
        this.left = seaPdpRichTextContainerLeftData;
        this.middle = seaPdpRichTextContainerMiddleData;
        this.right = seaPdpRichTextContainerRightData;
    }
}
