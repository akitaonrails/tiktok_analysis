package com.ss.android.ugc.aweme.music;

import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC111300bX;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class OriginMusicArg implements IRouteArg, InterfaceC111300bX {
    public static final Parcelable.Creator<OriginMusicArg> CREATOR = new Parcelable.Creator<OriginMusicArg>() { // from class: X.0OAx
        @Override // android.os.Parcelable.Creator
        public final OriginMusicArg createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            User user = (User) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new OriginMusicArg(user, z, string, string2, i, string3, string4, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final OriginMusicArg[] newArray(int i) {
            return new OriginMusicArg[i];
        }
    };
    public final int bottomBarHeight;
    public final boolean isMe;
    public final boolean isNewTabEnabled;
    public final String previousPage;
    public final String profileEnterMethod;
    public final String secUserID;
    public final User user;
    public final String userId;

    public OriginMusicArg() {
        this(null, false, null, null, -1, null, null, false);
    }

    public final OriginMusicArg copy(User user, boolean z, String str, String str2, int i, String str3, String str4, boolean z2) {
        return new OriginMusicArg(user, z, str, str2, i, str3, str4, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginMusicArg)) {
            return false;
        }
        OriginMusicArg originMusicArg = (OriginMusicArg) obj;
        return Intrinsics.LJFF(this.user, originMusicArg.user) && this.isMe == originMusicArg.isMe && Intrinsics.LJFF(this.userId, originMusicArg.userId) && Intrinsics.LJFF(this.secUserID, originMusicArg.secUserID) && this.bottomBarHeight == originMusicArg.bottomBarHeight && Intrinsics.LJFF(this.previousPage, originMusicArg.previousPage) && Intrinsics.LJFF(this.profileEnterMethod, originMusicArg.profileEnterMethod) && this.isNewTabEnabled == originMusicArg.isNewTabEnabled;
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (((user == null ? 0 : user.hashCode()) * 31) + C786410Ut5.Z2(this.isMe)) * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secUserID;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.bottomBarHeight) * 31;
        String str3 = this.previousPage;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.profileEnterMethod;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isNewTabEnabled);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginMusicArg(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", isMe=");
        sbLIZ.append(this.isMe);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", secUserID=");
        sbLIZ.append(this.secUserID);
        sbLIZ.append(", bottomBarHeight=");
        sbLIZ.append(this.bottomBarHeight);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.previousPage);
        sbLIZ.append(", profileEnterMethod=");
        sbLIZ.append(this.profileEnterMethod);
        sbLIZ.append(", isNewTabEnabled=");
        sbLIZ.append(this.isNewTabEnabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.user);
        parcel.writeInt(this.isMe ? 1 : 0);
        parcel.writeString(this.userId);
        parcel.writeString(this.secUserID);
        parcel.writeInt(this.bottomBarHeight);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.profileEnterMethod);
        parcel.writeInt(this.isNewTabEnabled ? 1 : 0);
    }

    public final int getBottomBarHeight() {
        return this.bottomBarHeight;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getProfileEnterMethod() {
        return this.profileEnterMethod;
    }

    public final String getSecUserID() {
        return this.secUserID;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public final boolean isNewTabEnabled() {
        return this.isNewTabEnabled;
    }

    public OriginMusicArg(User user) {
        this(user, false, null, null, -1, null, null, false);
    }

    public static OriginMusicArg __fromBundle(Bundle bundle) {
        int i;
        User user;
        Boolean bool;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        boolean zBooleanValue;
        int iIntValue;
        Boolean bool2 = null;
        if (bundle == null) {
            return null;
        }
        boolean zBooleanValue2 = false;
        if (bundle.containsKey("user")) {
            user = (User) RouteParser.INSTANCE.parse(bundle.get("user"), User.class);
            i = 0;
        } else {
            i = 1;
            user = null;
        }
        if (bundle.containsKey("is_me")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_me"), Boolean.class);
            if (bool == null) {
                i += 2;
            }
        } else {
            i += 2;
            bool = null;
        }
        if (bundle.containsKey("user_id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("user_id"), String.class);
        } else {
            i += 4;
            str = null;
        }
        if (bundle.containsKey("sec_user_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_user_id"), String.class);
        } else {
            i += 8;
            str2 = null;
        }
        if (bundle.containsKey("bottom_bar_height")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("bottom_bar_height"), Integer.class);
            if (num == null) {
                i += 16;
            }
        } else {
            i += 16;
            num = null;
        }
        if (bundle.containsKey("previous_page")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page"), String.class);
        } else {
            i += 32;
            str3 = null;
        }
        if (bundle.containsKey("profile_enter_method")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("profile_enter_method"), String.class);
        } else {
            i += 64;
            str4 = null;
        }
        if (!bundle.containsKey("new_tab_enabled") || (bool2 = (Boolean) RouteParser.INSTANCE.parse(bundle.get("new_tab_enabled"), Boolean.class)) == null) {
            i += 128;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        String str5 = null;
        String str6 = null;
        if ((i & 1) != 0) {
            user = null;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            zBooleanValue = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            iIntValue = -1;
        }
        if ((i & 32) == 0) {
            str5 = str3;
        }
        if ((i & 64) == 0) {
            str6 = str4;
        }
        if ((i & 128) == 0) {
            z = zBooleanValue2;
        }
        return new OriginMusicArg(user, zBooleanValue, str, str2, iIntValue, str5, str6, z);
    }

    public OriginMusicArg(User user, boolean z) {
        this(user, z, null, null, -1, null, null, false);
    }

    public OriginMusicArg(User user, boolean z, String str) {
        this(user, z, str, null, -1, null, null, false);
    }

    public OriginMusicArg(User user, boolean z, String str, String str2) {
        this(user, z, str, str2, -1, null, null, false);
    }

    public OriginMusicArg(User user, boolean z, String str, String str2, int i) {
        this(user, z, str, str2, i, null, null, false);
    }

    public OriginMusicArg(User user, boolean z, String str, String str2, int i, String str3) {
        this(user, z, str, str2, i, str3, null, false);
    }

    public OriginMusicArg(User user, boolean z, String str, String str2, int i, String str3, String str4) {
        this(user, z, str, str2, i, str3, str4, false);
    }

    public OriginMusicArg(User user, boolean z, String str, String str2, int i, String str3, String str4, boolean z2) {
        this.user = user;
        this.isMe = z;
        this.userId = str;
        this.secUserID = str2;
        this.bottomBarHeight = i;
        this.previousPage = str3;
        this.profileEnterMethod = str4;
        this.isNewTabEnabled = z2;
    }
}
