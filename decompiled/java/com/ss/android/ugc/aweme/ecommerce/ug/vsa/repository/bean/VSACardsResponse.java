package com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VSACardsResponse extends BaseResponse {

    @C09CT("vsa_data_list")
    public final List<VSACardData> vsaDataList;

    public VSACardsResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VSACardsResponse) && Intrinsics.LJFF(this.vsaDataList, ((VSACardsResponse) obj).vsaDataList);
    }

    public final int hashCode() {
        List<VSACardData> list = this.vsaDataList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VSACardsResponse(vsaDataList=");
        sbLIZ.append(this.vsaDataList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VSACardsResponse(List<VSACardData> list) {
        this.vsaDataList = list;
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static final class VSACardData {

        @C09CT("aweme_id")
        public final String awemeId;

        @C09CT("button_text")
        public final String btnText;

        @C09CT("card_schema")
        public String cardSchema;

        @C09CT("disappear_delay_time")
        public final Integer delayCloseTime;

        @C09CT("show_delay_time")
        public final Integer delayShowTime;

        @C09CT("is_vsa_enter_shop")
        public final boolean enterShop;

        @C09CT("max_show_products_num")
        public final Integer maxShowNum;

        @C09CT("product_list")
        public final List<EcUgProduct> productList;

        @C09CT("server_time")
        public final Long serverTime;

        public VSACardData() {
            this("", "", 0, 0, 1, null, null, null, false);
        }

        public VSACardData(String str, String str2, Integer num, Integer num2, Integer num3, List<EcUgProduct> list, String str3, Long l, boolean z) {
            this.awemeId = str;
            this.btnText = str2;
            this.delayShowTime = num;
            this.delayCloseTime = num2;
            this.maxShowNum = num3;
            this.productList = list;
            this.cardSchema = str3;
            this.serverTime = l;
            this.enterShop = z;
        }
    }
}
