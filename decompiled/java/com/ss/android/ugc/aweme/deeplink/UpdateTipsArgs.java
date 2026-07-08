package com.ss.android.ugc.aweme.deeplink;

import X.C2188811AlT;
import X.C446920Hfm;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class UpdateTipsArgs implements IRouteArg {
    public String urlToGo;
    public String versionRequire;
    public static final C446920Hfm Companion = new Object() { // from class: X.0Hfm
    };
    public static final Parcelable.Creator<UpdateTipsArgs> CREATOR = new Parcelable.Creator<UpdateTipsArgs>() { // from class: X.0Hfl
        @Override // android.os.Parcelable.Creator
        public final UpdateTipsArgs createFromParcel(Parcel parcel) {
            return new UpdateTipsArgs(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateTipsArgs[] newArray(int i) {
            return new UpdateTipsArgs[i];
        }
    };

    public final UpdateTipsArgs copy(String str, String str2) {
        return new UpdateTipsArgs(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateTipsArgs)) {
            return false;
        }
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) obj;
        return Intrinsics.LJFF(this.urlToGo, updateTipsArgs.urlToGo) && Intrinsics.LJFF(this.versionRequire, updateTipsArgs.versionRequire);
    }

    public int hashCode() {
        String str = this.urlToGo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.versionRequire;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateTipsArgs(urlToGo=");
        sbLIZ.append(this.urlToGo);
        sbLIZ.append(", versionRequire=");
        sbLIZ.append(this.versionRequire);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.urlToGo);
        parcel.writeString(this.versionRequire);
    }

    public UpdateTipsArgs() {
        this("", "");
    }

    public final String getUrlToGo() {
        return this.urlToGo;
    }

    public final String getVersionRequire() {
        return this.versionRequire;
    }

    public static UpdateTipsArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("debug_url")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("debug_url"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("version_required")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("version_required"), String.class);
        } else {
            i += 2;
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return new UpdateTipsArgs(str, str2);
    }

    public static final UpdateTipsArgs getOrNew(Activity activity) {
        Companion.getClass();
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) RouteArgExtension.INSTANCE.navArg(activity).getValue();
        if (updateTipsArgs == null) {
            return new UpdateTipsArgs("", "");
        }
        return updateTipsArgs;
    }

    public final void setUrlToGo(String str) {
        this.urlToGo = str;
    }

    public final void setVersionRequire(String str) {
        this.versionRequire = str;
    }

    public UpdateTipsArgs(String str, String str2) {
        this.urlToGo = str;
        this.versionRequire = str2;
    }
}
