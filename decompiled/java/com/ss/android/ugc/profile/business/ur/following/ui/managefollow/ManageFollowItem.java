package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC20602315jZ;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ManageFollowItem implements InterfaceC1891350zJl, Parcelable {
    public final UserVerify avatarUrl;
    public final String content;
    public final boolean enabled;
    public final boolean isChecked;
    public final SimpleUser simpleUser;
    public final String title;
    public static final Parcelable.Creator<ManageFollowItem> CREATOR = new Parcelable.Creator<ManageFollowItem>() { // from class: X.15jY
        @Override // android.os.Parcelable.Creator
        public final ManageFollowItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            SimpleUser simpleUserCreateFromParcel = SimpleUser.CREATOR.createFromParcel(parcel);
            UserVerify userVerify = (UserVerify) parcel.readParcelable(ManageFollowItem.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new ManageFollowItem(z, simpleUserCreateFromParcel, userVerify, string, string2, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ManageFollowItem[] newArray(int i) {
            return new ManageFollowItem[i];
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
        if (!(obj instanceof ManageFollowItem)) {
            return false;
        }
        ManageFollowItem manageFollowItem = (ManageFollowItem) obj;
        return this.enabled == manageFollowItem.enabled && Intrinsics.LJFF(this.simpleUser, manageFollowItem.simpleUser) && Intrinsics.LJFF(this.avatarUrl, manageFollowItem.avatarUrl) && Intrinsics.LJFF(this.title, manageFollowItem.title) && Intrinsics.LJFF(this.content, manageFollowItem.content) && this.isChecked == manageFollowItem.isChecked;
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enabled) * 31) + this.simpleUser.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + C786410Ut5.Z2(this.isChecked);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageFollowItem(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", simpleUser=");
        sbLIZ.append(this.simpleUser);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.avatarUrl);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.isChecked);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        this.simpleUser.writeToParcel(parcel, i);
        parcel.writeParcelable(this.avatarUrl, i);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeInt(this.isChecked ? 1 : 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        ManageFollowItem manageFollowItem;
        if (interfaceC1891350zJl instanceof ManageFollowItem) {
            manageFollowItem = (ManageFollowItem) interfaceC1891350zJl;
        } else {
            manageFollowItem = null;
        }
        if (manageFollowItem == null || !Intrinsics.LJFF(this.title, manageFollowItem.title) || !Intrinsics.LJFF(this.content, manageFollowItem.content) || this.isChecked != manageFollowItem.isChecked || this.enabled != manageFollowItem.enabled || !Intrinsics.LJFF(this.avatarUrl.getAvatarThumb(), manageFollowItem.avatarUrl.getAvatarThumb())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        ManageFollowItem manageFollowItem;
        SimpleUser simpleUser;
        String str = this.simpleUser.uid;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof ManageFollowItem) && (manageFollowItem = (ManageFollowItem) interfaceC1891350zJl) != null && (simpleUser = manageFollowItem.simpleUser) != null) {
            str2 = simpleUser.uid;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        ManageFollowItem manageFollowItem;
        if (!(interfaceC1891350zJl instanceof ManageFollowItem) || (manageFollowItem = (ManageFollowItem) interfaceC1891350zJl) == null) {
            return null;
        }
        if (this.enabled != manageFollowItem.enabled) {
            return EnumC20602315jZ.ENABLED;
        }
        if (!Intrinsics.LJFF(this.title, manageFollowItem.title)) {
            return EnumC20602315jZ.TITLE;
        }
        if (!Intrinsics.LJFF(this.content, manageFollowItem.content)) {
            return EnumC20602315jZ.CONTENT;
        }
        if (this.isChecked != manageFollowItem.isChecked) {
            return EnumC20602315jZ.CHECK_BOX;
        }
        if (Intrinsics.LJFF(this.avatarUrl.getAvatarThumb(), manageFollowItem.avatarUrl.getAvatarThumb())) {
            return null;
        }
        return EnumC20602315jZ.AVATAR_URL;
    }

    public static ManageFollowItem LIZ(ManageFollowItem manageFollowItem, boolean z, String str, boolean z2, int i) {
        SimpleUser simpleUser;
        UserVerify userVerify;
        boolean z3 = z2;
        String str2 = str;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = manageFollowItem.enabled;
        }
        String str3 = null;
        if ((i & 2) != 0) {
            simpleUser = manageFollowItem.simpleUser;
        } else {
            simpleUser = null;
        }
        if ((i & 4) != 0) {
            userVerify = manageFollowItem.avatarUrl;
        } else {
            userVerify = null;
        }
        if ((i & 8) != 0) {
            str2 = manageFollowItem.title;
        }
        if ((i & 16) != 0) {
            str3 = manageFollowItem.content;
        }
        if ((i & 32) != 0) {
            z3 = manageFollowItem.isChecked;
        }
        manageFollowItem.getClass();
        return new ManageFollowItem(z4, simpleUser, userVerify, str2, str3, z3);
    }

    public ManageFollowItem(boolean z, SimpleUser simpleUser, UserVerify userVerify, String str, String str2, boolean z2) {
        this.enabled = z;
        this.simpleUser = simpleUser;
        this.avatarUrl = userVerify;
        this.title = str;
        this.content = str2;
        this.isChecked = z2;
    }
}
