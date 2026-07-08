package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.model.AvatarModel;
import com.ss.android.ugc.aweme.theater.model.ImageThumbModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AvatarModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AvatarModel> CREATOR = new Parcelable.Creator<AvatarModel>() { // from class: X.02ts
        @Override // android.os.Parcelable.Creator
        public final AvatarModel createFromParcel(Parcel parcel) {
            ImageThumbModel imageThumbModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                imageThumbModelCreateFromParcel = null;
            } else {
                imageThumbModelCreateFromParcel = ImageThumbModel.CREATOR.createFromParcel(parcel);
            }
            return new AvatarModel(imageThumbModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarModel[] newArray(int i) {
            return new AvatarModel[i];
        }
    };

    @C09CT("image_thumb")
    public final ImageThumbModel imageThumb;

    public AvatarModel() {
        this(null);
    }

    public final AvatarModel copy(ImageThumbModel imageThumbModel) {
        return new AvatarModel(imageThumbModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvatarModel) && Intrinsics.LJFF(this.imageThumb, ((AvatarModel) obj).imageThumb);
    }

    public int hashCode() {
        ImageThumbModel imageThumbModel = this.imageThumb;
        if (imageThumbModel == null) {
            return 0;
        }
        return imageThumbModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarModel(imageThumb=");
        sbLIZ.append(this.imageThumb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImageThumbModel imageThumbModel = this.imageThumb;
        if (imageThumbModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageThumbModel.writeToParcel(parcel, i);
        }
    }

    public final ImageThumbModel getImageThumb() {
        return this.imageThumb;
    }

    public AvatarModel(ImageThumbModel imageThumbModel) {
        this.imageThumb = imageThumbModel;
    }
}
