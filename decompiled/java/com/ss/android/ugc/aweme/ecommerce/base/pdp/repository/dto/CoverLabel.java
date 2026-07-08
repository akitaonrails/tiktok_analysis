package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CoverLabel {

    @C09CT("background_color")
    public final CommonColor backgroundColor;

    @C09CT("corner")
    public final CornerModel corner;

    @C09CT("ec_rich_text")
    public final ECRichText ecRichText;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public CoverLabel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverLabel)) {
            return false;
        }
        CoverLabel coverLabel = (CoverLabel) obj;
        return Intrinsics.LJFF(this.id, coverLabel.id) && Intrinsics.LJFF(this.ecRichText, coverLabel.ecRichText) && Intrinsics.LJFF(this.backgroundColor, coverLabel.backgroundColor) && Intrinsics.LJFF(this.corner, coverLabel.corner);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.ecRichText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        CornerModel cornerModel = this.corner;
        return iHashCode3 + (cornerModel != null ? cornerModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverLabel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", ecRichText=");
        sbLIZ.append(this.ecRichText);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", corner=");
        sbLIZ.append(this.corner);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CoverLabel(String str, ECRichText eCRichText, CommonColor commonColor, CornerModel cornerModel) {
        this.id = str;
        this.ecRichText = eCRichText;
        this.backgroundColor = commonColor;
        this.corner = cornerModel;
    }
}
