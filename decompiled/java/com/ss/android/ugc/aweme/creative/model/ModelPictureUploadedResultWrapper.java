package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ModelPictureUploadedResultWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ModelPictureUploadedResultWrapper implements Parcelable {
    public static final Parcelable.Creator<ModelPictureUploadedResultWrapper> CREATOR = new Parcelable.Creator<ModelPictureUploadedResultWrapper>() { // from class: X.0MI8
        @Override // android.os.Parcelable.Creator
        public final ModelPictureUploadedResultWrapper createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            float f = parcel.readFloat();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new ModelPictureUploadedResultWrapper(string, f, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final ModelPictureUploadedResultWrapper[] newArray(int i) {
            return new ModelPictureUploadedResultWrapper[i];
        }
    };

    @C09CT("ai_self_model_picture_gender")
    public final float gender;

    @C09CT("ai_self_model_picture_image_type")
    public Integer imageType;

    @C09CT("ai_self_model_picture_skin")
    public final Integer skin;

    @C09CT("ai_self_model_picture_uri")
    public final String uri;

    public ModelPictureUploadedResultWrapper() {
        this("", 0.0f, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelPictureUploadedResultWrapper)) {
            return false;
        }
        ModelPictureUploadedResultWrapper modelPictureUploadedResultWrapper = (ModelPictureUploadedResultWrapper) obj;
        return Intrinsics.LJFF(this.uri, modelPictureUploadedResultWrapper.uri) && Float.compare(this.gender, modelPictureUploadedResultWrapper.gender) == 0 && Intrinsics.LJFF(this.skin, modelPictureUploadedResultWrapper.skin) && Intrinsics.LJFF(this.imageType, modelPictureUploadedResultWrapper.imageType);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModelPictureUploadedResultWrapper(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", gender=");
        sbLIZ.append(this.gender);
        sbLIZ.append(", skin=");
        sbLIZ.append(this.skin);
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.imageType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeFloat(this.gender);
        Integer num = this.skin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.imageType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public final int hashCode() {
        int iHashCode = ((this.uri.hashCode() * 31) + Float.floatToIntBits(this.gender)) * 31;
        Integer num = this.skin;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.imageType;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public ModelPictureUploadedResultWrapper(String str, float f, Integer num, Integer num2) {
        this.uri = str;
        this.gender = f;
        this.skin = num;
        this.imageType = num2;
    }
}
