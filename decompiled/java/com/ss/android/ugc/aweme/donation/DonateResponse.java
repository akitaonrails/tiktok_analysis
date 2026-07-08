package com.ss.android.ugc.aweme.donation;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class DonateResponse extends BaseResponse {

    @C09CT("banner")
    public final BannerStruct banner;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("donation_summary")
    public final String donationSummary;

    @C09CT("donor_list")
    public final List<DonorStruct> donorList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("ngo_struct")
    public final NgoStruct ngo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonateResponse)) {
            return false;
        }
        DonateResponse donateResponse = (DonateResponse) obj;
        return Intrinsics.LJFF(this.ngo, donateResponse.ngo) && Intrinsics.LJFF(this.donorList, donateResponse.donorList) && Intrinsics.LJFF(this.cursor, donateResponse.cursor) && Intrinsics.LJFF(this.hasMore, donateResponse.hasMore) && Intrinsics.LJFF(this.banner, donateResponse.banner) && Intrinsics.LJFF(this.donationSummary, donateResponse.donationSummary);
    }

    public final int hashCode() {
        NgoStruct ngoStruct = this.ngo;
        int iHashCode = (ngoStruct == null ? 0 : ngoStruct.hashCode()) * 31;
        List<DonorStruct> list = this.donorList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.cursor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        BannerStruct bannerStruct = this.banner;
        int iHashCode5 = (iHashCode4 + (bannerStruct == null ? 0 : bannerStruct.hashCode())) * 31;
        String str = this.donationSummary;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonateResponse(ngo=");
        sbLIZ.append(this.ngo);
        sbLIZ.append(", donorList=");
        sbLIZ.append(this.donorList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", banner=");
        sbLIZ.append(this.banner);
        sbLIZ.append(", donationSummary=");
        sbLIZ.append(this.donationSummary);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DonateResponse(NgoStruct ngoStruct, List<DonorStruct> list, Integer num, Boolean bool, BannerStruct bannerStruct, String str) {
        this.ngo = ngoStruct;
        this.donorList = list;
        this.cursor = num;
        this.hasMore = bool;
        this.banner = bannerStruct;
        this.donationSummary = str;
    }
}
