package com.ss.android.ugc.aweme.socialavatar.view.v2;

import X.C2188811AlT;
import X.EnumC439310HKn;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarGenerateData implements Parcelable {
    public final float boyProb;
    public final EnumC439310HKn creationMethod;
    public final RectF faceRectF;
    public final String fileLocalUriPath;
    public final int generationScene;
    public final int noCenterFaceCount;
    public final String normImagePath;
    public final int notNeutralExpressionCount;
    public final String originalImagePath;
    public final int somethingWentWrongCount;
    public static final Parcelable.Creator<SocialAvatarGenerateData> CREATOR = new Parcelable.Creator<SocialAvatarGenerateData>() { // from class: X.0HKM
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarGenerateData createFromParcel(Parcel parcel) {
            return new SocialAvatarGenerateData(EnumC439310HKn.valueOf(parcel.readString()), parcel.readFloat(), parcel.readString(), parcel.readString(), (RectF) parcel.readParcelable(SocialAvatarGenerateData.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarGenerateData[] newArray(int i) {
            return new SocialAvatarGenerateData[i];
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
        if (!(obj instanceof SocialAvatarGenerateData)) {
            return false;
        }
        SocialAvatarGenerateData socialAvatarGenerateData = (SocialAvatarGenerateData) obj;
        return this.creationMethod == socialAvatarGenerateData.creationMethod && Float.compare(this.boyProb, socialAvatarGenerateData.boyProb) == 0 && Intrinsics.LJFF(this.originalImagePath, socialAvatarGenerateData.originalImagePath) && Intrinsics.LJFF(this.normImagePath, socialAvatarGenerateData.normImagePath) && Intrinsics.LJFF(this.faceRectF, socialAvatarGenerateData.faceRectF) && this.noCenterFaceCount == socialAvatarGenerateData.noCenterFaceCount && this.notNeutralExpressionCount == socialAvatarGenerateData.notNeutralExpressionCount && this.somethingWentWrongCount == socialAvatarGenerateData.somethingWentWrongCount && Intrinsics.LJFF(this.fileLocalUriPath, socialAvatarGenerateData.fileLocalUriPath) && this.generationScene == socialAvatarGenerateData.generationScene;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarGenerateData(creationMethod=");
        sbLIZ.append(this.creationMethod);
        sbLIZ.append(", boyProb=");
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
        sbLIZ.append(", generationScene=");
        sbLIZ.append(this.generationScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creationMethod.name());
        parcel.writeFloat(this.boyProb);
        parcel.writeString(this.originalImagePath);
        parcel.writeString(this.normImagePath);
        parcel.writeParcelable(this.faceRectF, i);
        parcel.writeInt(this.noCenterFaceCount);
        parcel.writeInt(this.notNeutralExpressionCount);
        parcel.writeInt(this.somethingWentWrongCount);
        parcel.writeString(this.fileLocalUriPath);
        parcel.writeInt(this.generationScene);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.creationMethod.hashCode() * 31) + Float.floatToIntBits(this.boyProb)) * 31) + this.originalImagePath.hashCode()) * 31) + this.normImagePath.hashCode()) * 31) + this.faceRectF.hashCode()) * 31) + this.noCenterFaceCount) * 31) + this.notNeutralExpressionCount) * 31) + this.somethingWentWrongCount) * 31;
        String str = this.fileLocalUriPath;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.generationScene;
    }

    public /* synthetic */ SocialAvatarGenerateData(EnumC439310HKn enumC439310HKn, float f, String str, String str2, RectF rectF, int i, int i2, int i3, int i4, int i5) {
        this(enumC439310HKn, f, str, str2, rectF, i, i2, i3, (String) null, (i5 & 512) != 0 ? 6 : i4);
    }

    public SocialAvatarGenerateData(EnumC439310HKn enumC439310HKn, float f, String str, String str2, RectF rectF, int i, int i2, int i3, String str3, int i4) {
        this.creationMethod = enumC439310HKn;
        this.boyProb = f;
        this.originalImagePath = str;
        this.normImagePath = str2;
        this.faceRectF = rectF;
        this.noCenterFaceCount = i;
        this.notNeutralExpressionCount = i2;
        this.somethingWentWrongCount = i3;
        this.fileLocalUriPath = str3;
        this.generationScene = i4;
    }
}
