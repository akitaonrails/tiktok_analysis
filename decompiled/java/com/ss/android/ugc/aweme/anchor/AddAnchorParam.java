package com.ss.android.ugc.aweme.anchor;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.anchor.AddAnchorParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AddAnchorParam implements IRouteArg, InterfaceC111300bX {
    public static final Parcelable.Creator<AddAnchorParam> CREATOR = new Parcelable.Creator<AddAnchorParam>() { // from class: X.0huY
        @Override // android.os.Parcelable.Creator
        public final AddAnchorParam createFromParcel(Parcel parcel) {
            return new AddAnchorParam(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddAnchorParam[] newArray(int i) {
            return new AddAnchorParam[i];
        }
    };
    public final String creationId;
    public final String enterFrom;
    public final String shootWay;

    public AddAnchorParam() {
        this(null, null, null);
    }

    public final AddAnchorParam copy(String str, String str2, String str3) {
        return new AddAnchorParam(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddAnchorParam)) {
            return false;
        }
        AddAnchorParam addAnchorParam = (AddAnchorParam) obj;
        return Intrinsics.LJFF(this.enterFrom, addAnchorParam.enterFrom) && Intrinsics.LJFF(this.shootWay, addAnchorParam.shootWay) && Intrinsics.LJFF(this.creationId, addAnchorParam.creationId);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shootWay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creationId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddAnchorParam(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.creationId);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public static AddAnchorParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("enter_from")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("shoot_way")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("shoot_way"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("creation_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("creation_id"), String.class);
        } else {
            i += 4;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return new AddAnchorParam(str, str2, str3);
    }

    public AddAnchorParam(String str, String str2, String str3) {
        this.enterFrom = str;
        this.shootWay = str2;
        this.creationId = str3;
    }
}
