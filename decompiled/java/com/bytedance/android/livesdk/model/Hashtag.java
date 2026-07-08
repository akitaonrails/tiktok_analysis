package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C0IUS;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class Hashtag implements Parcelable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("namespace")
    public int namespace;

    @C09CT("title")
    public String title;
    public static final C0IUS Companion = new Object() { // from class: X.0IUS
    };
    public static final Parcelable.Creator<Hashtag> CREATOR = new Parcelable.Creator<Hashtag>() { // from class: X.0IUR
        @Override // android.os.Parcelable.Creator
        public final Hashtag createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new Hashtag(lValueOf, parcel.readString(), (ImageModel) parcel.readParcelable(Hashtag.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Hashtag[] newArray(int i) {
            return new Hashtag[i];
        }
    };

    public Hashtag() {
        this(0L, "", null, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.title);
        parcel.writeParcelable(this.image, i);
        parcel.writeInt(this.namespace);
    }

    public final boolean isHotGaming() {
        return this.namespace == 1;
    }

    public final boolean isUseGameTagAsHashTag() {
        Long l = this.id;
        return (l != null && l.longValue() == 5) || this.namespace == 1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hashtag(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Hashtag(Long l, String str, ImageModel imageModel, int i) {
        this.id = l;
        this.title = str;
        this.image = imageModel;
        this.namespace = i;
    }
}
