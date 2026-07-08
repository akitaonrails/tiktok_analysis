package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C753602ww;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalWaistBanner implements Parcelable {

    @C09CT("banner_img")
    public final Image bannerImg;

    @C09CT("count_down")
    public final Long countDown;

    @C09CT("countdown_color")
    public final CommonColor countDownColor;

    @C09CT("dark_banner_img")
    public final Image darkBannerImg;

    @C09CT("desc_text")
    public final String descText;

    @C09CT("promotion_da_info")
    public final String logExtra;

    @C09CT("promotion_type")
    public final Integer promotionType;

    @C09CT("rich_text_sub_title")
    public final LinkRichText richTextSubTitle;

    @C09CT("rich_text_title")
    public final LinkRichText richTextTitle;

    @C09CT("tail_component_type")
    public final Integer tailComponentType;

    @C09CT("title")
    public final String title;
    public static final C753602ww Companion = new Object() { // from class: X.02ww
    };
    public static final Parcelable.Creator<GlobalWaistBanner> CREATOR = new Parcelable.Creator<GlobalWaistBanner>() { // from class: X.02wv
        @Override // android.os.Parcelable.Creator
        public final GlobalWaistBanner createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            Integer numValueOf2;
            LinkRichText linkRichTextCreateFromParcel;
            LinkRichText linkRichTextCreateFromParcel2;
            CommonColor commonColorCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(GlobalWaistBanner.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(GlobalWaistBanner.class.getClassLoader());
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel2 = null;
            } else {
                linkRichTextCreateFromParcel2 = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText2 = linkRichTextCreateFromParcel2;
            if (parcel.readInt() != 0) {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            return new GlobalWaistBanner(numValueOf, string, string2, image, image2, lValueOf, string3, numValueOf2, linkRichText, linkRichText2, commonColorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GlobalWaistBanner[] newArray(int i) {
            return new GlobalWaistBanner[i];
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
        if (!(obj instanceof GlobalWaistBanner)) {
            return false;
        }
        GlobalWaistBanner globalWaistBanner = (GlobalWaistBanner) obj;
        return Intrinsics.LJFF(this.promotionType, globalWaistBanner.promotionType) && Intrinsics.LJFF(this.title, globalWaistBanner.title) && Intrinsics.LJFF(this.descText, globalWaistBanner.descText) && Intrinsics.LJFF(this.bannerImg, globalWaistBanner.bannerImg) && Intrinsics.LJFF(this.darkBannerImg, globalWaistBanner.darkBannerImg) && Intrinsics.LJFF(this.countDown, globalWaistBanner.countDown) && Intrinsics.LJFF(this.logExtra, globalWaistBanner.logExtra) && Intrinsics.LJFF(this.tailComponentType, globalWaistBanner.tailComponentType) && Intrinsics.LJFF(this.richTextTitle, globalWaistBanner.richTextTitle) && Intrinsics.LJFF(this.richTextSubTitle, globalWaistBanner.richTextSubTitle) && Intrinsics.LJFF(this.countDownColor, globalWaistBanner.countDownColor);
    }

    public final int hashCode() {
        Integer num = this.promotionType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.descText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.bannerImg;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.darkBannerImg;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Long l = this.countDown;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.logExtra;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.tailComponentType;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        LinkRichText linkRichText = this.richTextTitle;
        int iHashCode9 = (iHashCode8 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        LinkRichText linkRichText2 = this.richTextSubTitle;
        int iHashCode10 = (iHashCode9 + (linkRichText2 == null ? 0 : linkRichText2.hashCode())) * 31;
        CommonColor commonColor = this.countDownColor;
        return iHashCode10 + (commonColor != null ? commonColor.hashCode() : 0);
    }

    public final String toString() {
        return "GlobalWaistBanner(promotionType=" + this.promotionType + ", title=" + this.title + ", descText=" + this.descText + ", bannerImg=" + this.bannerImg + ", darkBannerImg=" + this.darkBannerImg + ", countDown=" + this.countDown + ", logExtra=" + this.logExtra + ", tailComponentType=" + this.tailComponentType + ", richTextTitle=" + this.richTextTitle + ", richTextSubTitle=" + this.richTextSubTitle + ", countDownColor=" + this.countDownColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.promotionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.descText);
        parcel.writeParcelable(this.bannerImg, i);
        parcel.writeParcelable(this.darkBannerImg, i);
        Long l = this.countDown;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.logExtra);
        Integer num2 = this.tailComponentType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        LinkRichText linkRichText = this.richTextTitle;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        LinkRichText linkRichText2 = this.richTextSubTitle;
        if (linkRichText2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText2.writeToParcel(parcel, i);
        }
        CommonColor commonColor = this.countDownColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
    }

    public GlobalWaistBanner(Integer num, String str, String str2, Image image, Image image2, Long l, String str3, Integer num2, LinkRichText linkRichText, LinkRichText linkRichText2, CommonColor commonColor) {
        this.promotionType = num;
        this.title = str;
        this.descText = str2;
        this.bannerImg = image;
        this.darkBannerImg = image2;
        this.countDown = l;
        this.logExtra = str3;
        this.tailComponentType = num2;
        this.richTextTitle = linkRichText;
        this.richTextSubTitle = linkRichText2;
        this.countDownColor = commonColor;
    }
}
