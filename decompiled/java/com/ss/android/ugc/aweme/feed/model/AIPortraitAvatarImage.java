package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AIPortraitAvatarImage implements Serializable, Parcelable {
    public static final Parcelable.Creator<AIPortraitAvatarImage> CREATOR = new Creator();

    @C09CT("image_thumb")
    public final UrlStruct imageThumb;

    public static final class Creator implements Parcelable.Creator<AIPortraitAvatarImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitAvatarImage createFromParcel(Parcel parcel) {
            return new AIPortraitAvatarImage(parcel.readInt() == 0 ? null : UrlStruct.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitAvatarImage[] newArray(int i) {
            return new AIPortraitAvatarImage[i];
        }
    }

    public AIPortraitAvatarImage() {
        this(null);
    }

    public final AIPortraitAvatarImage copy(UrlStruct urlStruct) {
        return new AIPortraitAvatarImage(urlStruct);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIPortraitAvatarImage) && Intrinsics.LJFF(this.imageThumb, ((AIPortraitAvatarImage) obj).imageThumb);
    }

    public int hashCode() {
        UrlStruct urlStruct = this.imageThumb;
        if (urlStruct == null) {
            return 0;
        }
        return urlStruct.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitAvatarImage(imageThumb=");
        sbLIZ.append(this.imageThumb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UrlStruct urlStruct = this.imageThumb;
        if (urlStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            urlStruct.writeToParcel(parcel, i);
        }
    }

    public final UrlStruct getImageThumb() {
        return this.imageThumb;
    }

    public AIPortraitAvatarImage(UrlStruct urlStruct) {
        this.imageThumb = urlStruct;
    }
}
