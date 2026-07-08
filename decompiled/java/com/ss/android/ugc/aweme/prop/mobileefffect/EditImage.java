package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C2188811AlT;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EditImage implements Parcelable {
    public final EditImageEffectImgCreatorData effectImgCreatorData;
    public final long time;
    public final Uri url;
    public static final Parcelable.Creator<EditImage> CREATOR = new Parcelable.Creator<EditImage>() { // from class: X.0vIW
        @Override // android.os.Parcelable.Creator
        public final EditImage createFromParcel(Parcel parcel) {
            EditImageEffectImgCreatorData editImageEffectImgCreatorDataCreateFromParcel;
            Uri uri = (Uri) parcel.readParcelable(EditImage.class.getClassLoader());
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                editImageEffectImgCreatorDataCreateFromParcel = null;
            } else {
                editImageEffectImgCreatorDataCreateFromParcel = EditImageEffectImgCreatorData.CREATOR.createFromParcel(parcel);
            }
            return new EditImage(uri, j, editImageEffectImgCreatorDataCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EditImage[] newArray(int i) {
            return new EditImage[i];
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
        if (!(obj instanceof EditImage)) {
            return false;
        }
        EditImage editImage = (EditImage) obj;
        return Intrinsics.LJFF(this.url, editImage.url) && this.time == editImage.time && Intrinsics.LJFF(this.effectImgCreatorData, editImage.effectImgCreatorData);
    }

    public final int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + C786410Ut5.Y2(this.time)) * 31;
        EditImageEffectImgCreatorData editImageEffectImgCreatorData = this.effectImgCreatorData;
        return iHashCode + (editImageEffectImgCreatorData == null ? 0 : editImageEffectImgCreatorData.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditImage(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", time=");
        sbLIZ.append(this.time);
        sbLIZ.append(", effectImgCreatorData=");
        sbLIZ.append(this.effectImgCreatorData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.url, i);
        parcel.writeLong(this.time);
        EditImageEffectImgCreatorData editImageEffectImgCreatorData = this.effectImgCreatorData;
        if (editImageEffectImgCreatorData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editImageEffectImgCreatorData.writeToParcel(parcel, i);
        }
    }

    public static EditImage LIZ(EditImage editImage, Uri uri) {
        long j = editImage.time;
        EditImageEffectImgCreatorData editImageEffectImgCreatorData = editImage.effectImgCreatorData;
        editImage.getClass();
        return new EditImage(uri, j, editImageEffectImgCreatorData);
    }

    public EditImage(Uri uri, long j, EditImageEffectImgCreatorData editImageEffectImgCreatorData) {
        this.url = uri;
        this.time = j;
        this.effectImgCreatorData = editImageEffectImgCreatorData;
    }
}
