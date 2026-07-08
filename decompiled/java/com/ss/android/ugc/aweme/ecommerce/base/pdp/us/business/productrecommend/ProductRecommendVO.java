package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend;

import X.C04DW;
import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendFeedData;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductRecommendVO implements InterfaceC746802vq, C04DW {
    public String LL = "undefined";

    @C09CT("recommend_data")
    public final RecommendFeedData recommendData;

    @C09CT("module_rich_title")
    public final ECRichText richTextTitle;

    @C09CT("recommendation_scene")
    public final String scene;

    @C09CT("module_title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductRecommendVO)) {
            return false;
        }
        ProductRecommendVO productRecommendVO = (ProductRecommendVO) obj;
        return Intrinsics.LJFF(this.scene, productRecommendVO.scene) && Intrinsics.LJFF(this.title, productRecommendVO.title) && Intrinsics.LJFF(this.richTextTitle, productRecommendVO.richTextTitle) && Intrinsics.LJFF(this.recommendData, productRecommendVO.recommendData);
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
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ECRichText eCRichText = this.richTextTitle;
        int iHashCode3 = (iHashCode2 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        RecommendFeedData recommendFeedData = this.recommendData;
        return iHashCode3 + (recommendFeedData != null ? recommendFeedData.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductRecommendVO(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", richTextTitle=");
        sbLIZ.append(this.richTextTitle);
        sbLIZ.append(", recommendData=");
        sbLIZ.append(this.recommendData);
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

    public ProductRecommendVO(String str, String str2, ECRichText eCRichText, RecommendFeedData recommendFeedData) {
        this.scene = str;
        this.title = str2;
        this.richTextTitle = eCRichText;
        this.recommendData = recommendFeedData;
    }
}
