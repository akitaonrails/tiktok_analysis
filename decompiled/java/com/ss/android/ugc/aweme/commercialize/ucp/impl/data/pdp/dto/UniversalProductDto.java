package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.UcpOptionDto;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UniversalProductDto implements Serializable {

    @C09CT("description")
    public final ProductDescriptionDto description;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("media")
    public final List<RemoteImageDto> media;

    @C09CT("options")
    public final List<UcpOptionDto> options;

    @C09CT("price_range")
    public final PriceRangeDto priceRange;

    @C09CT("selected")
    public final List<VariantOptionDto> selected;

    @C09CT("title")
    public final String title;

    @C09CT("variants")
    public final List<VariantDto> variants;

    public UniversalProductDto() {
        this(null, null, null, null, null, null, null, null);
    }

    public final UniversalProductDto copy(String str, String str2, ProductDescriptionDto productDescriptionDto, PriceRangeDto priceRangeDto, List<RemoteImageDto> list, List<VariantOptionDto> list2, List<UcpOptionDto> list3, List<VariantDto> list4) {
        return new UniversalProductDto(str, str2, productDescriptionDto, priceRangeDto, list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalProductDto)) {
            return false;
        }
        UniversalProductDto universalProductDto = (UniversalProductDto) obj;
        return Intrinsics.LJFF(this.id, universalProductDto.id) && Intrinsics.LJFF(this.title, universalProductDto.title) && Intrinsics.LJFF(this.description, universalProductDto.description) && Intrinsics.LJFF(this.priceRange, universalProductDto.priceRange) && Intrinsics.LJFF(this.media, universalProductDto.media) && Intrinsics.LJFF(this.selected, universalProductDto.selected) && Intrinsics.LJFF(this.options, universalProductDto.options) && Intrinsics.LJFF(this.variants, universalProductDto.variants);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductDescriptionDto productDescriptionDto = this.description;
        int iHashCode3 = (iHashCode2 + (productDescriptionDto == null ? 0 : productDescriptionDto.hashCode())) * 31;
        PriceRangeDto priceRangeDto = this.priceRange;
        int iHashCode4 = (iHashCode3 + (priceRangeDto == null ? 0 : priceRangeDto.hashCode())) * 31;
        List<RemoteImageDto> list = this.media;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<VariantOptionDto> list2 = this.selected;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UcpOptionDto> list3 = this.options;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VariantDto> list4 = this.variants;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UniversalProductDto(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", priceRange=");
        sbLIZ.append(this.priceRange);
        sbLIZ.append(", media=");
        sbLIZ.append(this.media);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.selected);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(", variants=");
        sbLIZ.append(this.variants);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UniversalProductDto(String str, String str2, ProductDescriptionDto productDescriptionDto, PriceRangeDto priceRangeDto, List<RemoteImageDto> list, List<VariantOptionDto> list2, List<UcpOptionDto> list3, List<VariantDto> list4) {
        this.id = str;
        this.title = str2;
        this.description = productDescriptionDto;
        this.priceRange = priceRangeDto;
        this.media = list;
        this.selected = list2;
        this.options = list3;
        this.variants = list4;
    }
}
