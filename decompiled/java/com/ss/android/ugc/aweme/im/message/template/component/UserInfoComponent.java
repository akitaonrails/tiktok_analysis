package com.ss.android.ugc.aweme.im.message.template.component;

import X.C18ZU;
import X.C2188811AlT;
import X.C2243641Cri;
import X.C2243871Cs5;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class UserInfoComponent implements BaseComponent<C2243641Cri> {
    public final ImageComponent avatarThumb;
    public final String nickName;
    public final long userId;
    public static final C2243871Cs5 Companion = new Object() { // from class: X.1Cs5
    };
    public static final Parcelable.Creator<UserInfoComponent> CREATOR = new Parcelable.Creator<UserInfoComponent>() { // from class: X.1Cry
        @Override // android.os.Parcelable.Creator
        public final UserInfoComponent createFromParcel(Parcel parcel) {
            return new UserInfoComponent(parcel.readLong(), parcel.readString(), ImageComponent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UserInfoComponent[] newArray(int i) {
            return new UserInfoComponent[i];
        }
    };
    public static final UserInfoComponent EMPTY_USER_INFO = new UserInfoComponent(0, (String) null, 7);

    public UserInfoComponent() {
        this(0L, (String) null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfoComponent)) {
            return false;
        }
        UserInfoComponent userInfoComponent = (UserInfoComponent) obj;
        return this.userId == userInfoComponent.userId && Intrinsics.LJFF(this.nickName, userInfoComponent.nickName) && Intrinsics.LJFF(this.avatarThumb, userInfoComponent.avatarThumb);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.userId) * 31) + this.nickName.hashCode()) * 31) + this.avatarThumb.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInfoComponent(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.nickName);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.userId);
        parcel.writeString(this.nickName);
        this.avatarThumb.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserInfoComponent(long j, String str, int i) {
        ImageComponent imageComponentLIZ;
        j = (i & 1) != 0 ? -1L : j;
        str = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        } else {
            imageComponentLIZ = null;
        }
        this(j, str, imageComponentLIZ);
    }

    public UserInfoComponent(long j, String str, ImageComponent imageComponent) {
        this.userId = j;
        this.nickName = str;
        this.avatarThumb = imageComponent;
    }
}
