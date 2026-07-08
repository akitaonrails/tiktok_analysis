package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionAdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItemExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionItem implements Parcelable {

    @C09CT("addon_link")
    public final LinkText addonLink;

    @C09CT("button_schema")
    public final String buttonSchema;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("extra_info")
    public final PromotionItemExtraInfo extraInfo;

    @C09CT("extra_promotion_text_lines")
    public final List<String> extraPromotionTextLines;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("next_request_scene")
    public final List<NextRequestScene> nextRequestScenes;

    @C09CT("promotion_type")
    public final Integer promotionType;

    @C09CT("sub_promotion_link")
    public final ECRichText subPromotionLink;

    @C09CT("sub_promotion_text")
    public final String subTitle;

    @C09CT("terms_position")
    public final Integer termsPosition;

    @C09CT("promotion_text")
    public final String title;

    @C09CT("promotion_addition_info")
    public final PromotionAdditionInfo titleDetailInfo;

    @C09CT("vap_text")
    public final String vapText;

    @C09CT("voucher_info")
    public Voucher voucherInfo;
    public static final Parcelable.Creator<PromotionItem> CREATOR = new Parcelable.Creator<PromotionItem>() { // from class: X.02sd
        @Override // android.os.Parcelable.Creator
        public final PromotionItem createFromParcel(Parcel parcel) {
            Voucher voucherCreateFromParcel;
            Integer numValueOf;
            PromotionAdditionInfo promotionAdditionInfoCreateFromParcel;
            LinkText linkTextCreateFromParcel;
            Integer numValueOf2;
            ArrayList arrayList;
            PromotionItemExtraInfo promotionItemExtraInfoCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                voucherCreateFromParcel = null;
            } else {
                voucherCreateFromParcel = Voucher.CREATOR.createFromParcel(parcel);
            }
            Voucher voucher = voucherCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                promotionAdditionInfoCreateFromParcel = null;
            } else {
                promotionAdditionInfoCreateFromParcel = PromotionAdditionInfo.CREATOR.createFromParcel(parcel);
            }
            PromotionAdditionInfo promotionAdditionInfo = promotionAdditionInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkTextCreateFromParcel = null;
            } else {
                linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
            }
            LinkText linkText = linkTextCreateFromParcel;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(NextRequestScene.CREATOR.createFromParcel(parcel));
                }
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PromotionItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                promotionItemExtraInfoCreateFromParcel = null;
            } else {
                promotionItemExtraInfoCreateFromParcel = PromotionItemExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new PromotionItem(string, string2, string3, string4, voucher, numValueOf, string5, promotionAdditionInfo, linkText, arrayListCreateStringArrayList, numValueOf2, string6, arrayList, eCRichText, promotionItemExtraInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionItem[] newArray(int i) {
            return new PromotionItem[i];
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
        if (!(obj instanceof PromotionItem)) {
            return false;
        }
        PromotionItem promotionItem = (PromotionItem) obj;
        return Intrinsics.LJFF(this.id, promotionItem.id) && Intrinsics.LJFF(this.title, promotionItem.title) && Intrinsics.LJFF(this.subTitle, promotionItem.subTitle) && Intrinsics.LJFF(this.vapText, promotionItem.vapText) && Intrinsics.LJFF(this.voucherInfo, promotionItem.voucherInfo) && Intrinsics.LJFF(this.promotionType, promotionItem.promotionType) && Intrinsics.LJFF(this.daInfo, promotionItem.daInfo) && Intrinsics.LJFF(this.titleDetailInfo, promotionItem.titleDetailInfo) && Intrinsics.LJFF(this.addonLink, promotionItem.addonLink) && Intrinsics.LJFF(this.extraPromotionTextLines, promotionItem.extraPromotionTextLines) && Intrinsics.LJFF(this.termsPosition, promotionItem.termsPosition) && Intrinsics.LJFF(this.buttonSchema, promotionItem.buttonSchema) && Intrinsics.LJFF(this.nextRequestScenes, promotionItem.nextRequestScenes) && Intrinsics.LJFF(this.subPromotionLink, promotionItem.subPromotionLink) && Intrinsics.LJFF(this.extraInfo, promotionItem.extraInfo);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vapText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Voucher voucher = this.voucherInfo;
        int iHashCode5 = (iHashCode4 + (voucher == null ? 0 : voucher.hashCode())) * 31;
        Integer num = this.promotionType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.daInfo;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PromotionAdditionInfo promotionAdditionInfo = this.titleDetailInfo;
        int iHashCode8 = (iHashCode7 + (promotionAdditionInfo == null ? 0 : promotionAdditionInfo.hashCode())) * 31;
        LinkText linkText = this.addonLink;
        int iHashCode9 = (iHashCode8 + (linkText == null ? 0 : linkText.hashCode())) * 31;
        List<String> list = this.extraPromotionTextLines;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.termsPosition;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.buttonSchema;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<NextRequestScene> list2 = this.nextRequestScenes;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ECRichText eCRichText = this.subPromotionLink;
        int iHashCode14 = (iHashCode13 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        PromotionItemExtraInfo promotionItemExtraInfo = this.extraInfo;
        return iHashCode14 + (promotionItemExtraInfo != null ? promotionItemExtraInfo.hashCode() : 0);
    }

    public final String toString() {
        return "PromotionItem(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", vapText=" + this.vapText + ", voucherInfo=" + this.voucherInfo + ", promotionType=" + this.promotionType + ", daInfo=" + this.daInfo + ", titleDetailInfo=" + this.titleDetailInfo + ", addonLink=" + this.addonLink + ", extraPromotionTextLines=" + this.extraPromotionTextLines + ", termsPosition=" + this.termsPosition + ", buttonSchema=" + this.buttonSchema + ", nextRequestScenes=" + this.nextRequestScenes + ", subPromotionLink=" + this.subPromotionLink + ", extraInfo=" + this.extraInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.vapText);
        Voucher voucher = this.voucherInfo;
        if (voucher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucher.writeToParcel(parcel, i);
        }
        Integer num = this.promotionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.daInfo);
        PromotionAdditionInfo promotionAdditionInfo = this.titleDetailInfo;
        if (promotionAdditionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionAdditionInfo.writeToParcel(parcel, i);
        }
        LinkText linkText = this.addonLink;
        if (linkText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.extraPromotionTextLines);
        Integer num2 = this.termsPosition;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.buttonSchema);
        List<NextRequestScene> list = this.nextRequestScenes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NextRequestScene> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.subPromotionLink, i);
        PromotionItemExtraInfo promotionItemExtraInfo = this.extraInfo;
        if (promotionItemExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionItemExtraInfo.writeToParcel(parcel, i);
        }
    }

    public PromotionItem(String str, String str2, String str3, String str4, Voucher voucher, Integer num, String str5, PromotionAdditionInfo promotionAdditionInfo, LinkText linkText, List<String> list, Integer num2, String str6, List<NextRequestScene> list2, ECRichText eCRichText, PromotionItemExtraInfo promotionItemExtraInfo) {
        this.id = str;
        this.title = str2;
        this.subTitle = str3;
        this.vapText = str4;
        this.voucherInfo = voucher;
        this.promotionType = num;
        this.daInfo = str5;
        this.titleDetailInfo = promotionAdditionInfo;
        this.addonLink = linkText;
        this.extraPromotionTextLines = list;
        this.termsPosition = num2;
        this.buttonSchema = str6;
        this.nextRequestScenes = list2;
        this.subPromotionLink = eCRichText;
        this.extraInfo = promotionItemExtraInfo;
    }
}
