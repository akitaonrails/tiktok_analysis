package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VariantDto implements Serializable {

    @C09CT("availability")
    public final VariantAvailabilityDto availability;

    @C09CT("description")
    public final VariantDescriptionDto description;

    @C09CT("eligible")
    public final VariantEligibleDto eligible;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("media")
    public final List<RemoteImageDto> media;

    @C09CT("options")
    public final List<VariantOptionDto> options;

    @C09CT("price")
    public final PriceAmountDto price;

    @C09CT("title")
    public final String title;

    public VariantDto() {
        this(null, null, null, null, null, null, null, null);
    }

    public final VariantDto copy(String str, String str2, VariantDescriptionDto variantDescriptionDto, List<VariantOptionDto> list, VariantAvailabilityDto variantAvailabilityDto, PriceAmountDto priceAmountDto, List<RemoteImageDto> list2, VariantEligibleDto variantEligibleDto) {
        return new VariantDto(str, str2, variantDescriptionDto, list, variantAvailabilityDto, priceAmountDto, list2, variantEligibleDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariantDto)) {
            return false;
        }
        VariantDto variantDto = (VariantDto) obj;
        return Intrinsics.LJFF(this.id, variantDto.id) && Intrinsics.LJFF(this.title, variantDto.title) && Intrinsics.LJFF(this.description, variantDto.description) && Intrinsics.LJFF(this.options, variantDto.options) && Intrinsics.LJFF(this.availability, variantDto.availability) && Intrinsics.LJFF(this.price, variantDto.price) && Intrinsics.LJFF(this.media, variantDto.media) && Intrinsics.LJFF(this.eligible, variantDto.eligible);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VariantDescriptionDto variantDescriptionDto = this.description;
        int iHashCode3 = (iHashCode2 + (variantDescriptionDto == null ? 0 : variantDescriptionDto.hashCode())) * 31;
        List<VariantOptionDto> list = this.options;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        VariantAvailabilityDto variantAvailabilityDto = this.availability;
        int iHashCode5 = (iHashCode4 + (variantAvailabilityDto == null ? 0 : variantAvailabilityDto.hashCode())) * 31;
        PriceAmountDto priceAmountDto = this.price;
        int iHashCode6 = (iHashCode5 + (priceAmountDto == null ? 0 : priceAmountDto.hashCode())) * 31;
        List<RemoteImageDto> list2 = this.media;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VariantEligibleDto variantEligibleDto = this.eligible;
        return iHashCode7 + (variantEligibleDto != null ? variantEligibleDto.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VariantDto(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(", availability=");
        sbLIZ.append(this.availability);
        sbLIZ.append(", price=");
        sbLIZ.append(this.price);
        sbLIZ.append(", media=");
        sbLIZ.append(this.media);
        sbLIZ.append(", eligible=");
        sbLIZ.append(this.eligible);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VariantDto(String str, String str2, VariantDescriptionDto variantDescriptionDto, List<VariantOptionDto> list, VariantAvailabilityDto variantAvailabilityDto, PriceAmountDto priceAmountDto, List<RemoteImageDto> list2, VariantEligibleDto variantEligibleDto) {
        this.id = str;
        this.title = str2;
        this.description = variantDescriptionDto;
        this.options = list;
        this.availability = variantAvailabilityDto;
        this.price = priceAmountDto;
        this.media = list2;
        this.eligible = variantEligibleDto;
    }
}
