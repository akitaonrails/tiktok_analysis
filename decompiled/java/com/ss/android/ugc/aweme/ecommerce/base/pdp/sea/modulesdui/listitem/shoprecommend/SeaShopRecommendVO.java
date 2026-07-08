package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shoprecommend;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaShopRecommendVO {

    @C09CT("enter_name")
    public final String enterName;

    @C09CT("enter_schema")
    public final String enterSchema;

    @C09CT("model_title")
    public final String modelTitle;

    @C09CT("shop_recommend_data")
    public final CommonFeedData shopRecommendData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaShopRecommendVO)) {
            return false;
        }
        SeaShopRecommendVO seaShopRecommendVO = (SeaShopRecommendVO) obj;
        return Intrinsics.LJFF(this.modelTitle, seaShopRecommendVO.modelTitle) && Intrinsics.LJFF(this.enterName, seaShopRecommendVO.enterName) && Intrinsics.LJFF(this.enterSchema, seaShopRecommendVO.enterSchema) && Intrinsics.LJFF(this.shopRecommendData, seaShopRecommendVO.shopRecommendData);
    }

    public final int hashCode() {
        String str = this.modelTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterSchema;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommonFeedData commonFeedData = this.shopRecommendData;
        return iHashCode3 + (commonFeedData != null ? commonFeedData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaShopRecommendVO(modelTitle=");
        sbLIZ.append(this.modelTitle);
        sbLIZ.append(", enterName=");
        sbLIZ.append(this.enterName);
        sbLIZ.append(", enterSchema=");
        sbLIZ.append(this.enterSchema);
        sbLIZ.append(", shopRecommendData=");
        sbLIZ.append(this.shopRecommendData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaShopRecommendVO(String str, String str2, String str3, CommonFeedData commonFeedData) {
        this.modelTitle = str;
        this.enterName = str2;
        this.enterSchema = str3;
        this.shopRecommendData = commonFeedData;
    }
}
