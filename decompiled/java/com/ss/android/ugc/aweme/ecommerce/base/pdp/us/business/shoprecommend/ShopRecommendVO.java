package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend;

import X.C04DW;
import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopRecommendVO implements InterfaceC746802vq, C04DW {
    public String LL = "undefined";

    @C09CT("enter_name")
    public final String enterName;

    @C09CT("enter_schema")
    public final String enterSchema;

    @C09CT("is_recommend")
    public final Boolean isRecommend;

    @C09CT("model_title")
    public final String modelTitle;

    @C09CT("shop_recommend_data")
    public final CommonFeedData shopRecommendData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRecommendVO)) {
            return false;
        }
        ShopRecommendVO shopRecommendVO = (ShopRecommendVO) obj;
        return Intrinsics.LJFF(this.modelTitle, shopRecommendVO.modelTitle) && Intrinsics.LJFF(this.enterName, shopRecommendVO.enterName) && Intrinsics.LJFF(this.enterSchema, shopRecommendVO.enterSchema) && Intrinsics.LJFF(this.shopRecommendData, shopRecommendVO.shopRecommendData) && Intrinsics.LJFF(this.isRecommend, shopRecommendVO.isRecommend);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        String str = this.modelTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterSchema;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommonFeedData commonFeedData = this.shopRecommendData;
        int iHashCode4 = (iHashCode3 + (commonFeedData == null ? 0 : commonFeedData.hashCode())) * 31;
        Boolean bool = this.isRecommend;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopRecommendVO(modelTitle=");
        sbLIZ.append(this.modelTitle);
        sbLIZ.append(", enterName=");
        sbLIZ.append(this.enterName);
        sbLIZ.append(", enterSchema=");
        sbLIZ.append(this.enterSchema);
        sbLIZ.append(", shopRecommendData=");
        sbLIZ.append(this.shopRecommendData);
        sbLIZ.append(", isRecommend=");
        sbLIZ.append(this.isRecommend);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LL = str;
    }

    public ShopRecommendVO(String str, String str2, String str3, CommonFeedData commonFeedData, Boolean bool) {
        this.modelTitle = str;
        this.enterName = str2;
        this.enterSchema = str3;
        this.shopRecommendData = commonFeedData;
        this.isRecommend = bool;
    }
}
