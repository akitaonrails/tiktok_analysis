package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Avatar implements Serializable, Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new Creator();

    @C09CT("image_thumb")
    public ImageThumb imageThumb;

    public static final class Creator implements Parcelable.Creator<Avatar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Avatar createFromParcel(Parcel parcel) {
            return new Avatar(parcel.readInt() == 0 ? null : ImageThumb.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Avatar[] newArray(int i) {
            return new Avatar[i];
        }
    }

    public Avatar() {
    }

    public final Avatar copy(ImageThumb imageThumb) {
        return new Avatar(imageThumb);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Avatar) && Intrinsics.LJFF(this.imageThumb, ((Avatar) obj).imageThumb);
    }

    public int hashCode() {
        ImageThumb imageThumb = this.imageThumb;
        if (imageThumb == null) {
            return 0;
        }
        return imageThumb.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Avatar(imageThumb=");
        sbLIZ.append(this.imageThumb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImageThumb imageThumb = this.imageThumb;
        if (imageThumb == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageThumb.writeToParcel(parcel, i);
        }
    }

    public final ImageThumb getImageThumb() {
        return this.imageThumb;
    }

    public Avatar(ImageThumb imageThumb) {
        this.imageThumb = imageThumb;
    }
}
