package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AvatarUpdateInfoStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AvatarUpdateInfoStruct implements Serializable, Parcelable {
    public static final Parcelable.Creator<AvatarUpdateInfoStruct> CREATOR = new Parcelable.Creator<AvatarUpdateInfoStruct>() { // from class: X.0nfd
        @Override // android.os.Parcelable.Creator
        public final AvatarUpdateInfoStruct createFromParcel(Parcel parcel) {
            return new AvatarUpdateInfoStruct(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AvatarUpdateInfoStruct[] newArray(int i) {
            return new AvatarUpdateInfoStruct[i];
        }
    };

    @C09CT("new_avatar_uri")
    public String newAvatarUri;

    @C09CT("origin_avatar_uri")
    public String originAvatarUri;

    public final AvatarUpdateInfoStruct copy(String str, String str2) {
        return new AvatarUpdateInfoStruct(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarUpdateInfoStruct)) {
            return false;
        }
        AvatarUpdateInfoStruct avatarUpdateInfoStruct = (AvatarUpdateInfoStruct) obj;
        return Intrinsics.LJFF(this.originAvatarUri, avatarUpdateInfoStruct.originAvatarUri) && Intrinsics.LJFF(this.newAvatarUri, avatarUpdateInfoStruct.newAvatarUri);
    }

    public int hashCode() {
        return (this.originAvatarUri.hashCode() * 31) + this.newAvatarUri.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarUpdateInfoStruct(originAvatarUri=");
        sbLIZ.append(this.originAvatarUri);
        sbLIZ.append(", newAvatarUri=");
        sbLIZ.append(this.newAvatarUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originAvatarUri);
        parcel.writeString(this.newAvatarUri);
    }

    public AvatarUpdateInfoStruct() {
        this("", "");
    }

    public final String getNewAvatarUri() {
        return this.newAvatarUri;
    }

    public final String getOriginAvatarUri() {
        return this.originAvatarUri;
    }

    public final void setNewAvatarUri(String str) {
        this.newAvatarUri = str;
    }

    public final void setOriginAvatarUri(String str) {
        this.originAvatarUri = str;
    }

    public AvatarUpdateInfoStruct(String str, String str2) {
        this.originAvatarUri = str;
        this.newAvatarUri = str2;
    }
}
