package com.ss.android.ugc.aweme.profile.aigc;

import X.C1221610htX;
import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAIGCMainArg implements IRouteArg {
    public static final Parcelable.Creator<ProfileAIGCMainArg> CREATOR = new Parcelable.Creator<ProfileAIGCMainArg>() { // from class: X.0huX
        @Override // android.os.Parcelable.Creator
        public final ProfileAIGCMainArg createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ProfileAIGCMainArg(string, string2, boolValueOf, parcel.readString(), parcel.readString(), (C1221610htX) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileAIGCMainArg[] newArray(int i) {
            return new ProfileAIGCMainArg[i];
        }
    };
    public final String aigcEntrance;
    public final String aigcStatus;
    public final C1221610htX avatarResult;
    public final String enterFrom;
    public final String enterMethod;
    public final Boolean introPageWithNavBar;

    public ProfileAIGCMainArg() {
        this(null, null, null, null, null, null);
    }

    public final ProfileAIGCMainArg copy(String str, String str2, Boolean bool, String str3, String str4, C1221610htX c1221610htX) {
        return new ProfileAIGCMainArg(str, str2, bool, str3, str4, c1221610htX);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAIGCMainArg)) {
            return false;
        }
        ProfileAIGCMainArg profileAIGCMainArg = (ProfileAIGCMainArg) obj;
        return Intrinsics.LJFF(this.aigcEntrance, profileAIGCMainArg.aigcEntrance) && Intrinsics.LJFF(this.aigcStatus, profileAIGCMainArg.aigcStatus) && Intrinsics.LJFF(this.introPageWithNavBar, profileAIGCMainArg.introPageWithNavBar) && Intrinsics.LJFF(this.enterFrom, profileAIGCMainArg.enterFrom) && Intrinsics.LJFF(this.enterMethod, profileAIGCMainArg.enterMethod) && Intrinsics.LJFF(this.avatarResult, profileAIGCMainArg.avatarResult);
    }

    public int hashCode() {
        String str = this.aigcEntrance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.aigcStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.introPageWithNavBar;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.enterFrom;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C1221610htX c1221610htX = this.avatarResult;
        return iHashCode5 + (c1221610htX != null ? c1221610htX.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileAIGCMainArg(aigcEntrance=");
        sbLIZ.append(this.aigcEntrance);
        sbLIZ.append(", aigcStatus=");
        sbLIZ.append(this.aigcStatus);
        sbLIZ.append(", introPageWithNavBar=");
        sbLIZ.append(this.introPageWithNavBar);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", avatarResult=");
        sbLIZ.append(this.avatarResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.aigcEntrance);
        parcel.writeString(this.aigcStatus);
        Boolean bool = this.introPageWithNavBar;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeSerializable(this.avatarResult);
    }

    public final String getAigcEntrance() {
        return this.aigcEntrance;
    }

    public final String getAigcStatus() {
        return this.aigcStatus;
    }

    public final C1221610htX getAvatarResult() {
        return this.avatarResult;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Boolean getIntroPageWithNavBar() {
        return this.introPageWithNavBar;
    }

    public ProfileAIGCMainArg(String str) {
        this(str, null, null, null, null, null);
    }

    public static ProfileAIGCMainArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        C1221610htX c1221610htX = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("aigc_entrance")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("aigc_entrance"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("aigc_status")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("aigc_status"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("intro_page_nav_bar")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("intro_page_nav_bar"), Boolean.class);
        } else {
            i += 4;
            bool = null;
        }
        if (bundle.containsKey("enter_from")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 8;
            str3 = null;
        }
        if (bundle.containsKey("enter_method")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("avatar_result")) {
            c1221610htX = (C1221610htX) RouteParser.INSTANCE.parse(bundle.get("avatar_result"), C1221610htX.class);
        } else {
            i += 32;
        }
        C1221610htX c1221610htX2 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) == 0) {
            c1221610htX2 = c1221610htX;
        }
        return new ProfileAIGCMainArg(str, str2, bool, str3, str4, c1221610htX2);
    }

    public ProfileAIGCMainArg(String str, String str2) {
        this(str, str2, null, null, null, null);
    }

    public ProfileAIGCMainArg(String str, String str2, Boolean bool) {
        this(str, str2, bool, null, null, null);
    }

    public ProfileAIGCMainArg(String str, String str2, Boolean bool, String str3) {
        this(str, str2, bool, str3, null, null);
    }

    public ProfileAIGCMainArg(String str, String str2, Boolean bool, String str3, String str4) {
        this(str, str2, bool, str3, str4, null);
    }

    public ProfileAIGCMainArg(String str, String str2, Boolean bool, String str3, String str4, C1221610htX c1221610htX) {
        this.aigcEntrance = str;
        this.aigcStatus = str2;
        this.introPageWithNavBar = bool;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.avatarResult = c1221610htX;
    }
}
