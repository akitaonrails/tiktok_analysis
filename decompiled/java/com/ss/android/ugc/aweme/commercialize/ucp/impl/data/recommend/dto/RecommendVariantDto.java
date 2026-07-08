package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementPrice;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementVariant;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendVariantDto implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String _id;

    @C09CT("compare_at_price")
    public final RecommendVariantPriceDto compareAtPrice;

    @C09CT("title")
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendVariantDto)) {
            return false;
        }
        RecommendVariantDto recommendVariantDto = (RecommendVariantDto) obj;
        return Intrinsics.LJFF(this._id, recommendVariantDto._id) && Intrinsics.LJFF(this.title, recommendVariantDto.title) && Intrinsics.LJFF(this.compareAtPrice, recommendVariantDto.compareAtPrice);
    }

    public int hashCode() {
        String str = this._id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RecommendVariantPriceDto recommendVariantPriceDto = this.compareAtPrice;
        return iHashCode2 + (recommendVariantPriceDto != null ? recommendVariantPriceDto.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendVariantDto(_id=");
        sbLIZ.append(this._id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", compareAtPrice=");
        sbLIZ.append(this.compareAtPrice);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getId() {
        String str = this._id;
        if (str != null) {
            return a0.LJJLL('?', str, str);
        }
        return null;
    }

    public final SupplementVariant toSupplement() {
        String str = this._id;
        String str2 = this.title;
        RecommendVariantPriceDto recommendVariantPriceDto = this.compareAtPrice;
        return new SupplementVariant(str, str2, recommendVariantPriceDto != null ? new SupplementPrice(recommendVariantPriceDto.amount, recommendVariantPriceDto.currency) : null);
    }

    public final boolean match(String str) {
        if (str != null && getId() != null) {
            return Intrinsics.LJFF(getId(), a0.LJJLL('?', str, str));
        }
        return false;
    }

    public RecommendVariantDto(String str, String str2, RecommendVariantPriceDto recommendVariantPriceDto) {
        this._id = str;
        this.title = str2;
        this.compareAtPrice = recommendVariantPriceDto;
    }
}
