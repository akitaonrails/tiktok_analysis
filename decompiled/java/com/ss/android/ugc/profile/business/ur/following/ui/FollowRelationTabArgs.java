package com.ss.android.ugc.profile.business.ur.following.ui;

import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FollowRelationTabArgs implements IRouteArg {
    public String enterFrom;
    public String followRelationType;
    public String previousPage;
    public String secUid;
    public String uid;
    public static final Parcelable.Creator<FollowRelationTabArgs> CREATOR = new Parcelable.Creator<FollowRelationTabArgs>() { // from class: X.0P0W
        @Override // android.os.Parcelable.Creator
        public final FollowRelationTabArgs createFromParcel(Parcel parcel) {
            return new FollowRelationTabArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FollowRelationTabArgs[] newArray(int i) {
            return new FollowRelationTabArgs[i];
        }
    };
    public static final int $stable = 8;

    public FollowRelationTabArgs() {
        this(null, null, null, null, null);
    }

    public final FollowRelationTabArgs copy(String str, String str2, String str3, String str4, String str5) {
        return new FollowRelationTabArgs(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRelationTabArgs)) {
            return false;
        }
        FollowRelationTabArgs followRelationTabArgs = (FollowRelationTabArgs) obj;
        return Intrinsics.LJFF(this.uid, followRelationTabArgs.uid) && Intrinsics.LJFF(this.secUid, followRelationTabArgs.secUid) && Intrinsics.LJFF(this.followRelationType, followRelationTabArgs.followRelationType) && Intrinsics.LJFF(this.enterFrom, followRelationTabArgs.enterFrom) && Intrinsics.LJFF(this.previousPage, followRelationTabArgs.previousPage);
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.followRelationType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterFrom;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previousPage;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowRelationTabArgs(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", followRelationType=");
        sbLIZ.append(this.followRelationType);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.previousPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeString(this.followRelationType);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.previousPage);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFollowRelationType() {
        return this.followRelationType;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public static FollowRelationTabArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("uid")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("sec_uid")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_uid"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("follow_relation_type")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("follow_relation_type"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("extra_previous_page")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("extra_previous_page"), String.class);
        } else {
            i += 16;
        }
        String str6 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) == 0) {
            str6 = str5;
        }
        return new FollowRelationTabArgs(str, str2, str3, str4, str6);
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFollowRelationType(String str) {
        this.followRelationType = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public FollowRelationTabArgs(String str, String str2, String str3, String str4, String str5) {
        this.uid = str;
        this.secUid = str2;
        this.followRelationType = str3;
        this.enterFrom = str4;
        this.previousPage = str5;
    }
}
