package com.ss.android.ugc.aweme.socialavatar.view.v2;

import X.C2188811AlT;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarPhotoDetectResultItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarPhotoDetectResultItem implements Parcelable {
    public final float boyProb;
    public final Boolean changeInputPhoto;
    public final RectF faceRectF;
    public final String fileLocalUriPath;
    public final int noCenterFaceCount;
    public final String normImagePath;
    public final int notNeutralExpressionCount;
    public final String originalImagePath;
    public final int somethingWentWrongCount;
    public static final Parcelable.Creator<SocialAvatarPhotoDetectResultItem> CREATOR = new Parcelable.Creator<SocialAvatarPhotoDetectResultItem>() { // from class: X.0HKL
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarPhotoDetectResultItem createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            float f = parcel.readFloat();
            String string = parcel.readString();
            String string2 = parcel.readString();
            RectF rectF = (RectF) parcel.readParcelable(SocialAvatarPhotoDetectResultItem.class.getClassLoader());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string3 = parcel.readString();
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
            return new SocialAvatarPhotoDetectResultItem(f, string, string2, rectF, i, i2, i3, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarPhotoDetectResultItem[] newArray(int i) {
            return new SocialAvatarPhotoDetectResultItem[i];
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
        if (!(obj instanceof SocialAvatarPhotoDetectResultItem)) {
            return false;
        }
        SocialAvatarPhotoDetectResultItem socialAvatarPhotoDetectResultItem = (SocialAvatarPhotoDetectResultItem) obj;
        return Float.compare(this.boyProb, socialAvatarPhotoDetectResultItem.boyProb) == 0 && Intrinsics.LJFF(this.originalImagePath, socialAvatarPhotoDetectResultItem.originalImagePath) && Intrinsics.LJFF(this.normImagePath, socialAvatarPhotoDetectResultItem.normImagePath) && Intrinsics.LJFF(this.faceRectF, socialAvatarPhotoDetectResultItem.faceRectF) && this.noCenterFaceCount == socialAvatarPhotoDetectResultItem.noCenterFaceCount && this.notNeutralExpressionCount == socialAvatarPhotoDetectResultItem.notNeutralExpressionCount && this.somethingWentWrongCount == socialAvatarPhotoDetectResultItem.somethingWentWrongCount && Intrinsics.LJFF(this.fileLocalUriPath, socialAvatarPhotoDetectResultItem.fileLocalUriPath) && Intrinsics.LJFF(this.changeInputPhoto, socialAvatarPhotoDetectResultItem.changeInputPhoto);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarPhotoDetectResultItem(boyProb=");
        sbLIZ.append(this.boyProb);
        sbLIZ.append(", originalImagePath=");
        sbLIZ.append(this.originalImagePath);
        sbLIZ.append(", normImagePath=");
        sbLIZ.append(this.normImagePath);
        sbLIZ.append(", faceRectF=");
        sbLIZ.append(this.faceRectF);
        sbLIZ.append(", noCenterFaceCount=");
        sbLIZ.append(this.noCenterFaceCount);
        sbLIZ.append(", notNeutralExpressionCount=");
        sbLIZ.append(this.notNeutralExpressionCount);
        sbLIZ.append(", somethingWentWrongCount=");
        sbLIZ.append(this.somethingWentWrongCount);
        sbLIZ.append(", fileLocalUriPath=");
        sbLIZ.append(this.fileLocalUriPath);
        sbLIZ.append(", changeInputPhoto=");
        sbLIZ.append(this.changeInputPhoto);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeFloat(this.boyProb);
        parcel.writeString(this.originalImagePath);
        parcel.writeString(this.normImagePath);
        parcel.writeParcelable(this.faceRectF, i);
        parcel.writeInt(this.noCenterFaceCount);
        parcel.writeInt(this.notNeutralExpressionCount);
        parcel.writeInt(this.somethingWentWrongCount);
        parcel.writeString(this.fileLocalUriPath);
        Boolean bool = this.changeInputPhoto;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((((((Float.floatToIntBits(this.boyProb) * 31) + this.originalImagePath.hashCode()) * 31) + this.normImagePath.hashCode()) * 31) + this.faceRectF.hashCode()) * 31) + this.noCenterFaceCount) * 31) + this.notNeutralExpressionCount) * 31) + this.somethingWentWrongCount) * 31;
        String str = this.fileLocalUriPath;
        int iHashCode = (iFloatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.changeInputPhoto;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public SocialAvatarPhotoDetectResultItem(float f, String str, String str2, RectF rectF, int i, int i2, int i3, String str3, Boolean bool) {
        this.boyProb = f;
        this.originalImagePath = str;
        this.normImagePath = str2;
        this.faceRectF = rectF;
        this.noCenterFaceCount = i;
        this.notNeutralExpressionCount = i2;
        this.somethingWentWrongCount = i3;
        this.fileLocalUriPath = str3;
        this.changeInputPhoto = bool;
    }
}
