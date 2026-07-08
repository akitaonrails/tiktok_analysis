package com.ss.android.ugc.aweme.mix.viewallplaylist;

import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragmentArg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewAllPlaylistFragmentArg implements IRouteArg {
    public final String enterFrom;
    public final int groupType;
    public final MixListResponse mixListResponse;
    public final int scene;
    public final String secUid;
    public final String uid;
    public static final Parcelable.Creator<ViewAllPlaylistFragmentArg> CREATOR = new Parcelable.Creator<ViewAllPlaylistFragmentArg>() { // from class: X.0gUm
        @Override // android.os.Parcelable.Creator
        public final ViewAllPlaylistFragmentArg createFromParcel(Parcel parcel) {
            return new ViewAllPlaylistFragmentArg((MixListResponse) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ViewAllPlaylistFragmentArg[] newArray(int i) {
            return new ViewAllPlaylistFragmentArg[i];
        }
    };
    public static final int $stable = 8;

    public ViewAllPlaylistFragmentArg() {
        this(null, null, null, -1, "", 0);
    }

    public final ViewAllPlaylistFragmentArg copy(MixListResponse mixListResponse, String str, String str2, int i, String str3, int i2) {
        return new ViewAllPlaylistFragmentArg(mixListResponse, str, str2, i, str3, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewAllPlaylistFragmentArg)) {
            return false;
        }
        ViewAllPlaylistFragmentArg viewAllPlaylistFragmentArg = (ViewAllPlaylistFragmentArg) obj;
        return Intrinsics.LJFF(this.mixListResponse, viewAllPlaylistFragmentArg.mixListResponse) && Intrinsics.LJFF(this.uid, viewAllPlaylistFragmentArg.uid) && Intrinsics.LJFF(this.secUid, viewAllPlaylistFragmentArg.secUid) && this.groupType == viewAllPlaylistFragmentArg.groupType && Intrinsics.LJFF(this.enterFrom, viewAllPlaylistFragmentArg.enterFrom) && this.scene == viewAllPlaylistFragmentArg.scene;
    }

    public int hashCode() {
        MixListResponse mixListResponse = this.mixListResponse;
        int iHashCode = (mixListResponse == null ? 0 : mixListResponse.hashCode()) * 31;
        String str = this.uid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secUid;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.groupType) * 31) + this.enterFrom.hashCode()) * 31) + this.scene;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewAllPlaylistFragmentArg(mixListResponse=");
        sbLIZ.append(this.mixListResponse);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.groupType);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mixListResponse);
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeInt(this.groupType);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.scene);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final int getGroupType() {
        return this.groupType;
    }

    public final MixListResponse getMixListResponse() {
        return this.mixListResponse;
    }

    public final int getScene() {
        return this.scene;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public ViewAllPlaylistFragmentArg(MixListResponse mixListResponse) {
        this(mixListResponse, null, null, -1, "", 0);
    }

    public static ViewAllPlaylistFragmentArg __fromBundle(Bundle bundle) {
        int i;
        MixListResponse mixListResponse;
        String str;
        String str2;
        Integer num;
        String str3;
        int iIntValue;
        Integer num2 = null;
        if (bundle == null) {
            return null;
        }
        int iIntValue2 = 0;
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
        if (bundle.containsKey("from_where")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("from_where"), Integer.class);
            if (num == null) {
                i += 8;
            }
        } else {
            i += 8;
            num = null;
        }
        if (bundle.containsKey("enter_from")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 16;
            str3 = null;
        }
        if (!bundle.containsKey(Scene.SCENE_SERVICE) || (num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get(Scene.SCENE_SERVICE), Integer.class)) == null) {
            i += 32;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        String str4 = null;
        String str5 = null;
        if ((i & 1) != 0) {
            mixListResponse = null;
        }
        if ((i & 2) == 0) {
            str4 = str;
        }
        if ((i & 4) == 0) {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            iIntValue = -1;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            iIntValue2 = 0;
        }
        return new ViewAllPlaylistFragmentArg(mixListResponse, str4, str5, iIntValue, str3, iIntValue2);
    }

    public ViewAllPlaylistFragmentArg(MixListResponse mixListResponse, String str) {
        this(mixListResponse, str, null, -1, "", 0);
    }

    public ViewAllPlaylistFragmentArg(MixListResponse mixListResponse, String str, String str2) {
        this(mixListResponse, str, str2, -1, "", 0);
    }

    public ViewAllPlaylistFragmentArg(MixListResponse mixListResponse, String str, String str2, int i) {
        this(mixListResponse, str, str2, i, "", 0);
    }

    public ViewAllPlaylistFragmentArg(MixListResponse mixListResponse, String str, String str2, int i, String str3) {
        this(mixListResponse, str, str2, i, str3, 0);
    }

    public ViewAllPlaylistFragmentArg(MixListResponse mixListResponse, String str, String str2, int i, String str3, int i2) {
        this.mixListResponse = mixListResponse;
        this.uid = str;
        this.secUid = str2;
        this.groupType = i;
        this.enterFrom = str3;
        this.scene = i2;
    }
}
