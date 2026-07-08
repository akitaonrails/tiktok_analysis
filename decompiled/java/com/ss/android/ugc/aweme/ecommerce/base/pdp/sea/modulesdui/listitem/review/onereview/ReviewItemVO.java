package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1752690vi7;
import X.InterfaceC997603vC;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview.ReviewItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewItemVO implements Parcelable, InterfaceC997603vC {
    public int brickName = EnumC1752690vi7.REVIEW.getValue();
    public final int gapFromUserInfoViewToContentBody;
    public final int index;
    public final int lastIndex;
    public final boolean needDivider;
    public final ReviewItemStruct reviewItemStruct;
    public static final Parcelable.Creator<ReviewItemVO> CREATOR = new Parcelable.Creator<ReviewItemVO>() { // from class: X.04Ik
        @Override // android.os.Parcelable.Creator
        public final ReviewItemVO createFromParcel(Parcel parcel) {
            boolean z;
            ReviewItemStruct reviewItemStructCreateFromParcel = ReviewItemStruct.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ReviewItemVO(reviewItemStructCreateFromParcel, z, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewItemVO[] newArray(int i) {
            return new ReviewItemVO[i];
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
        if (!(obj instanceof ReviewItemVO)) {
            return false;
        }
        ReviewItemVO reviewItemVO = (ReviewItemVO) obj;
        return Intrinsics.LJFF(this.reviewItemStruct, reviewItemVO.reviewItemStruct) && this.needDivider == reviewItemVO.needDivider && this.index == reviewItemVO.index && this.lastIndex == reviewItemVO.lastIndex && this.gapFromUserInfoViewToContentBody == reviewItemVO.gapFromUserInfoViewToContentBody;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        return (((((((this.reviewItemStruct.hashCode() * 31) + C786410Ut5.Z2(this.needDivider)) * 31) + this.index) * 31) + this.lastIndex) * 31) + this.gapFromUserInfoViewToContentBody;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewItemVO(reviewItemStruct=");
        sbLIZ.append(this.reviewItemStruct);
        sbLIZ.append(", needDivider=");
        sbLIZ.append(this.needDivider);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", lastIndex=");
        sbLIZ.append(this.lastIndex);
        sbLIZ.append(", gapFromUserInfoViewToContentBody=");
        sbLIZ.append(this.gapFromUserInfoViewToContentBody);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.reviewItemStruct.writeToParcel(parcel, i);
        parcel.writeInt(this.needDivider ? 1 : 0);
        parcel.writeInt(this.index);
        parcel.writeInt(this.lastIndex);
        parcel.writeInt(this.gapFromUserInfoViewToContentBody);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.brickName;
    }

    public ReviewItemVO(ReviewItemStruct reviewItemStruct, boolean z, int i, int i2, int i3) {
        this.reviewItemStruct = reviewItemStruct;
        this.needDivider = z;
        this.index = i;
        this.lastIndex = i2;
        this.gapFromUserInfoViewToContentBody = i3;
    }
}
