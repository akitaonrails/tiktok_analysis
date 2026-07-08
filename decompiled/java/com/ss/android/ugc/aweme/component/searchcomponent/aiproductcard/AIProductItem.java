package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AIProductItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("button")
    public final AIProductButton button;

    @C09CT("image")
    public final AIProductImage image;

    @C09CT("jump_data")
    public final CRouterCoreModel jumpData;

    @C09CT("product_id")
    public final String productId;

    @C09CT("second_line")
    public final AITagLine secondLine;

    @C09CT("summary")
    public final String summary;

    @C09CT("summary_height")
    public final List<HighlightRange> summaryHighlight;

    @C09CT("third_line")
    public final AITagLine thirdLine;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIProductItem)) {
            return false;
        }
        AIProductItem aIProductItem = (AIProductItem) obj;
        return Intrinsics.LJFF(this.type, aIProductItem.type) && Intrinsics.LJFF(this.title, aIProductItem.title) && Intrinsics.LJFF(this.image, aIProductItem.image) && Intrinsics.LJFF(this.secondLine, aIProductItem.secondLine) && Intrinsics.LJFF(this.thirdLine, aIProductItem.thirdLine) && Intrinsics.LJFF(this.button, aIProductItem.button) && Intrinsics.LJFF(this.jumpData, aIProductItem.jumpData) && Intrinsics.LJFF(this.productId, aIProductItem.productId) && Intrinsics.LJFF(this.summary, aIProductItem.summary) && Intrinsics.LJFF(this.summaryHighlight, aIProductItem.summaryHighlight);
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AIProductImage aIProductImage = this.image;
        int iHashCode3 = (iHashCode2 + (aIProductImage == null ? 0 : aIProductImage.hashCode())) * 31;
        AITagLine aITagLine = this.secondLine;
        int iHashCode4 = (iHashCode3 + (aITagLine == null ? 0 : aITagLine.hashCode())) * 31;
        AITagLine aITagLine2 = this.thirdLine;
        int iHashCode5 = (iHashCode4 + (aITagLine2 == null ? 0 : aITagLine2.hashCode())) * 31;
        AIProductButton aIProductButton = this.button;
        int iHashCode6 = (iHashCode5 + (aIProductButton == null ? 0 : aIProductButton.hashCode())) * 31;
        CRouterCoreModel cRouterCoreModel = this.jumpData;
        int iHashCode7 = (iHashCode6 + (cRouterCoreModel == null ? 0 : cRouterCoreModel.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.summary;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<HighlightRange> list = this.summaryHighlight;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIProductItem(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", secondLine=");
        sbLIZ.append(this.secondLine);
        sbLIZ.append(", thirdLine=");
        sbLIZ.append(this.thirdLine);
        sbLIZ.append(", button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", jumpData=");
        sbLIZ.append(this.jumpData);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.summary);
        sbLIZ.append(", summaryHighlight=");
        sbLIZ.append(this.summaryHighlight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIProductItem(String str, String str2, AIProductImage aIProductImage, AITagLine aITagLine, AITagLine aITagLine2, AIProductButton aIProductButton, CRouterCoreModel cRouterCoreModel, String str3, String str4, List<HighlightRange> list) {
        this.type = str;
        this.title = str2;
        this.image = aIProductImage;
        this.secondLine = aITagLine;
        this.thirdLine = aITagLine2;
        this.button = aIProductButton;
        this.jumpData = cRouterCoreModel;
        this.productId = str3;
        this.summary = str4;
        this.summaryHighlight = list;
    }
}
