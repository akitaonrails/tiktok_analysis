package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ShopReviewItemStruct implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("item_position")
    public final int itemPosition;

    @C09CT("main_review_expand")
    public final boolean mainReviewExpand;

    @C09CT("main_review_reply_expand")
    public final boolean mainReviewReplyExpand;

    @C09CT("product_card")
    public final ShopReviewProductCard productCard;

    @C09CT("review_item")
    public final ReviewItemStruct reviewItemStruct;
    public static final Parcelable.Creator<ShopReviewItemStruct> CREATOR = new Parcelable.Creator<ShopReviewItemStruct>() { // from class: X.0mhi
        @Override // android.os.Parcelable.Creator
        public final ShopReviewItemStruct createFromParcel(Parcel parcel) {
            ReviewItemStruct reviewItemStructCreateFromParcel;
            boolean z;
            ShopReviewProductCard shopReviewProductCardCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                reviewItemStructCreateFromParcel = null;
            } else {
                reviewItemStructCreateFromParcel = ReviewItemStruct.CREATOR.createFromParcel(parcel);
            }
            ReviewItemStruct reviewItemStruct = reviewItemStructCreateFromParcel;
            if (parcel.readInt() != 0) {
                shopReviewProductCardCreateFromParcel = ShopReviewProductCard.CREATOR.createFromParcel(parcel);
            }
            ShopReviewProductCard shopReviewProductCard = shopReviewProductCardCreateFromParcel;
            String string = parcel.readString();
            int i = parcel.readInt();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new ShopReviewItemStruct(reviewItemStruct, shopReviewProductCard, string, i, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ShopReviewItemStruct[] newArray(int i) {
            return new ShopReviewItemStruct[i];
        }
    };
    public static final int $stable = 8;

    public ShopReviewItemStruct() {
        this(null, null, null, 0, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopReviewItemStruct)) {
            return false;
        }
        ShopReviewItemStruct shopReviewItemStruct = (ShopReviewItemStruct) obj;
        return Intrinsics.LJFF(this.reviewItemStruct, shopReviewItemStruct.reviewItemStruct) && Intrinsics.LJFF(this.productCard, shopReviewItemStruct.productCard) && Intrinsics.LJFF(this.daInfo, shopReviewItemStruct.daInfo) && this.itemPosition == shopReviewItemStruct.itemPosition && this.mainReviewExpand == shopReviewItemStruct.mainReviewExpand && this.mainReviewReplyExpand == shopReviewItemStruct.mainReviewReplyExpand;
    }

    public final int hashCode() {
        ReviewItemStruct reviewItemStruct = this.reviewItemStruct;
        int iHashCode = (reviewItemStruct == null ? 0 : reviewItemStruct.hashCode()) * 31;
        ShopReviewProductCard shopReviewProductCard = this.productCard;
        int iHashCode2 = (iHashCode + (shopReviewProductCard == null ? 0 : shopReviewProductCard.hashCode())) * 31;
        String str = this.daInfo;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.itemPosition) * 31) + C786410Ut5.Z2(this.mainReviewExpand)) * 31) + C786410Ut5.Z2(this.mainReviewReplyExpand);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopReviewItemStruct(reviewItemStruct=");
        sbLIZ.append(this.reviewItemStruct);
        sbLIZ.append(", productCard=");
        sbLIZ.append(this.productCard);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", itemPosition=");
        sbLIZ.append(this.itemPosition);
        sbLIZ.append(", mainReviewExpand=");
        sbLIZ.append(this.mainReviewExpand);
        sbLIZ.append(", mainReviewReplyExpand=");
        sbLIZ.append(this.mainReviewReplyExpand);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ReviewItemStruct reviewItemStruct = this.reviewItemStruct;
        if (reviewItemStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewItemStruct.writeToParcel(parcel, i);
        }
        ShopReviewProductCard shopReviewProductCard = this.productCard;
        if (shopReviewProductCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopReviewProductCard.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        parcel.writeInt(this.itemPosition);
        parcel.writeInt(this.mainReviewExpand ? 1 : 0);
        parcel.writeInt(this.mainReviewReplyExpand ? 1 : 0);
    }

    public ShopReviewItemStruct(ReviewItemStruct reviewItemStruct, ShopReviewProductCard shopReviewProductCard, String str, int i, boolean z, boolean z2) {
        this.reviewItemStruct = reviewItemStruct;
        this.productCard = shopReviewProductCard;
        this.daInfo = str;
        this.itemPosition = i;
        this.mainReviewExpand = z;
        this.mainReviewReplyExpand = z2;
    }
}
