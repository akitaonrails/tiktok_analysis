package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareInfo implements Parcelable {

    @C09CT("can_share")
    public final Boolean canShare;

    @C09CT("share_cover")
    public final Image cover;

    @C09CT("share_deep_link")
    public final String deepLink;

    @C09CT("formatted_target_price")
    public final String formattedTargetPrice;

    @C09CT("pdp_share_benefit_info")
    public final PDPBenefitInfo pdpShareBenefitInfo;

    @C09CT("share_campaign_id")
    public final String shareCampaignId;

    @C09CT("share_scene")
    public final Integer shareScene;
    public static final Parcelable.Creator<ShareInfo> CREATOR = new Parcelable.Creator<ShareInfo>() { // from class: X.03zL
        @Override // android.os.Parcelable.Creator
        public final ShareInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            PDPBenefitInfo pDPBenefitInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(ShareInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                pDPBenefitInfoCreateFromParcel = PDPBenefitInfo.CREATOR.createFromParcel(parcel);
            }
            return new ShareInfo(boolValueOf, string, image, numValueOf, string2, string3, pDPBenefitInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareInfo[] newArray(int i) {
            return new ShareInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareInfo)) {
            return false;
        }
        ShareInfo shareInfo = (ShareInfo) obj;
        return Intrinsics.LJFF(this.canShare, shareInfo.canShare) && Intrinsics.LJFF(this.deepLink, shareInfo.deepLink) && Intrinsics.LJFF(this.cover, shareInfo.cover) && Intrinsics.LJFF(this.shareScene, shareInfo.shareScene) && Intrinsics.LJFF(this.formattedTargetPrice, shareInfo.formattedTargetPrice) && Intrinsics.LJFF(this.shareCampaignId, shareInfo.shareCampaignId) && Intrinsics.LJFF(this.pdpShareBenefitInfo, shareInfo.pdpShareBenefitInfo);
    }

    public final int hashCode() {
        Boolean bool = this.canShare;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.deepLink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.cover;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.shareScene;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.formattedTargetPrice;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shareCampaignId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PDPBenefitInfo pDPBenefitInfo = this.pdpShareBenefitInfo;
        return iHashCode6 + (pDPBenefitInfo != null ? pDPBenefitInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareInfo(canShare=");
        sbLIZ.append(this.canShare);
        sbLIZ.append(", deepLink=");
        sbLIZ.append(this.deepLink);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", shareScene=");
        sbLIZ.append(this.shareScene);
        sbLIZ.append(", formattedTargetPrice=");
        sbLIZ.append(this.formattedTargetPrice);
        sbLIZ.append(", shareCampaignId=");
        sbLIZ.append(this.shareCampaignId);
        sbLIZ.append(", pdpShareBenefitInfo=");
        sbLIZ.append(this.pdpShareBenefitInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canShare;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.deepLink);
        parcel.writeParcelable(this.cover, i);
        Integer num = this.shareScene;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.formattedTargetPrice);
        parcel.writeString(this.shareCampaignId);
        PDPBenefitInfo pDPBenefitInfo = this.pdpShareBenefitInfo;
        if (pDPBenefitInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPBenefitInfo.writeToParcel(parcel, i);
        }
    }

    public ShareInfo(Boolean bool, String str, Image image, Integer num, String str2, String str3, PDPBenefitInfo pDPBenefitInfo) {
        this.canShare = bool;
        this.deepLink = str;
        this.cover = image;
        this.shareScene = num;
        this.formattedTargetPrice = str2;
        this.shareCampaignId = str3;
        this.pdpShareBenefitInfo = pDPBenefitInfo;
    }
}
