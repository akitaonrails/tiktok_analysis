package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BFFCardConfig {

    @C09CT("card_schema")
    public final String cardSchema;

    @C09CT("product_ids")
    public final List<String> productIds;

    @C09CT("product_page_expression_info")
    public final n productPageExpressionInfo;

    public BFFCardConfig() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BFFCardConfig)) {
            return false;
        }
        BFFCardConfig bFFCardConfig = (BFFCardConfig) obj;
        return Intrinsics.LJFF(this.cardSchema, bFFCardConfig.cardSchema) && Intrinsics.LJFF(this.productPageExpressionInfo, bFFCardConfig.productPageExpressionInfo) && Intrinsics.LJFF(this.productIds, bFFCardConfig.productIds);
    }

    public final int hashCode() {
        String str = this.cardSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        n nVar = this.productPageExpressionInfo;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        List<String> list = this.productIds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BFFCardConfig(cardSchema=");
        sbLIZ.append(this.cardSchema);
        sbLIZ.append(", productPageExpressionInfo=");
        sbLIZ.append(this.productPageExpressionInfo);
        sbLIZ.append(", productIds=");
        sbLIZ.append(this.productIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BFFCardConfig(String str, n nVar, List<String> list) {
        this.cardSchema = str;
        this.productPageExpressionInfo = nVar;
        this.productIds = list;
    }
}
