package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TopBannerInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TopBannerInfo implements Parcelable {

    @C09CT("description")
    public final String description;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("is_display_campaign_banner")
    public final boolean isDisplayCampaignBanner;

    @C09CT("preview_image_url")
    public final String previewImageUrl;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<TopBannerInfo> CREATOR = new Parcelable.Creator<TopBannerInfo>() { // from class: X.0v7M
        @Override // android.os.Parcelable.Creator
        public final TopBannerInfo createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TopBannerInfo(z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopBannerInfo[] newArray(int i) {
            return new TopBannerInfo[i];
        }
    };
    public static final int $stable = 8;

    public TopBannerInfo() {
        this(false, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopBannerInfo)) {
            return false;
        }
        TopBannerInfo topBannerInfo = (TopBannerInfo) obj;
        return this.isDisplayCampaignBanner == topBannerInfo.isDisplayCampaignBanner && Intrinsics.LJFF(this.previewImageUrl, topBannerInfo.previewImageUrl) && Intrinsics.LJFF(this.title, topBannerInfo.title) && Intrinsics.LJFF(this.description, topBannerInfo.description) && Intrinsics.LJFF(this.imageUrl, topBannerInfo.imageUrl);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isDisplayCampaignBanner) * 31;
        String str = this.previewImageUrl;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopBannerInfo(isDisplayCampaignBanner=");
        sbLIZ.append(this.isDisplayCampaignBanner);
        sbLIZ.append(", previewImageUrl=");
        sbLIZ.append(this.previewImageUrl);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDisplayCampaignBanner ? 1 : 0);
        parcel.writeString(this.previewImageUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
    }

    public static TopBannerInfo LIZ(TopBannerInfo topBannerInfo, boolean z) {
        String str = topBannerInfo.previewImageUrl;
        String str2 = topBannerInfo.title;
        String str3 = topBannerInfo.description;
        String str4 = topBannerInfo.imageUrl;
        topBannerInfo.getClass();
        return new TopBannerInfo(z, str, str2, str3, str4);
    }

    public TopBannerInfo(boolean z, String str, String str2, String str3, String str4) {
        this.isDisplayCampaignBanner = z;
        this.previewImageUrl = str;
        this.title = str2;
        this.description = str3;
        this.imageUrl = str4;
    }
}
