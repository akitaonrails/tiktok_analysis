package com.ss.android.ugc.aweme.mix.manageplaylist;

import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistActivityArg;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ManagePlaylistActivityArg implements IRouteArg {
    public final String enterMethod;
    public final MixListResponse mixListResponse;
    public final String secUid;
    public final String uid;
    public static final Parcelable.Creator<ManagePlaylistActivityArg> CREATOR = new Parcelable.Creator<ManagePlaylistActivityArg>() { // from class: X.0HdL
        @Override // android.os.Parcelable.Creator
        public final ManagePlaylistActivityArg createFromParcel(Parcel parcel) {
            return new ManagePlaylistActivityArg((MixListResponse) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ManagePlaylistActivityArg[] newArray(int i) {
            return new ManagePlaylistActivityArg[i];
        }
    };
    public static final int $stable = 8;

    public ManagePlaylistActivityArg() {
        this(null, null, null, "");
    }

    public final ManagePlaylistActivityArg copy(MixListResponse mixListResponse, String str, String str2, String str3) {
        return new ManagePlaylistActivityArg(mixListResponse, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagePlaylistActivityArg)) {
            return false;
        }
        ManagePlaylistActivityArg managePlaylistActivityArg = (ManagePlaylistActivityArg) obj;
        return Intrinsics.LJFF(this.mixListResponse, managePlaylistActivityArg.mixListResponse) && Intrinsics.LJFF(this.uid, managePlaylistActivityArg.uid) && Intrinsics.LJFF(this.secUid, managePlaylistActivityArg.secUid) && Intrinsics.LJFF(this.enterMethod, managePlaylistActivityArg.enterMethod);
    }

    public int hashCode() {
        MixListResponse mixListResponse = this.mixListResponse;
        int iHashCode = (mixListResponse == null ? 0 : mixListResponse.hashCode()) * 31;
        String str = this.uid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secUid;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.enterMethod.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManagePlaylistActivityArg(mixListResponse=");
        sbLIZ.append(this.mixListResponse);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mixListResponse);
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeString(this.enterMethod);
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final MixListResponse getMixListResponse() {
        return this.mixListResponse;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public ManagePlaylistActivityArg(MixListResponse mixListResponse) {
        this(mixListResponse, null, null, "");
    }

    public static ManagePlaylistActivityArg __fromBundle(Bundle bundle) {
        int i;
        MixListResponse mixListResponse;
        String str;
        String str2;
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("mixListResponse")) {
            mixListResponse = (MixListResponse) RouteParser.INSTANCE.parse(bundle.get("mixListResponse"), MixListResponse.class);
            i = 0;
        } else {
            i = 1;
            mixListResponse = null;
        }
        if (bundle.containsKey("uid")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("uid"), String.class);
        } else {
            i += 2;
            str = null;
        }
        if (bundle.containsKey("sec_uid")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_uid"), String.class);
        } else {
            i += 4;
            str2 = null;
        }
        if (bundle.containsKey("enter_method")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 8;
        }
        if ((i & 1) != 0) {
            mixListResponse = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return new ManagePlaylistActivityArg(mixListResponse, str, str2, str3);
    }

    public ManagePlaylistActivityArg(MixListResponse mixListResponse, String str) {
        this(mixListResponse, str, null, "");
    }

    public ManagePlaylistActivityArg(MixListResponse mixListResponse, String str, String str2) {
        this(mixListResponse, str, str2, "");
    }

    public ManagePlaylistActivityArg(MixListResponse mixListResponse, String str, String str2, String str3) {
        this.mixListResponse = mixListResponse;
        this.uid = str;
        this.secUid = str2;
        this.enterMethod = str3;
    }
}
