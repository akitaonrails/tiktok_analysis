package com.ss.android.ugc.aweme.setting.ui;

import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SettingsNewVersionActivityArgs implements IRouteArg {
    public final String enterFrom;
    public final String enterMethod;
    public static final Parcelable.Creator<SettingsNewVersionActivityArgs> CREATOR = new Parcelable.Creator<SettingsNewVersionActivityArgs>() { // from class: X.0Hdp
        @Override // android.os.Parcelable.Creator
        public final SettingsNewVersionActivityArgs createFromParcel(Parcel parcel) {
            return new SettingsNewVersionActivityArgs(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsNewVersionActivityArgs[] newArray(int i) {
            return new SettingsNewVersionActivityArgs[i];
        }
    };
    public static final int $stable = 8;

    public final SettingsNewVersionActivityArgs copy(String str, String str2) {
        return new SettingsNewVersionActivityArgs(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsNewVersionActivityArgs)) {
            return false;
        }
        SettingsNewVersionActivityArgs settingsNewVersionActivityArgs = (SettingsNewVersionActivityArgs) obj;
        return Intrinsics.LJFF(this.enterFrom, settingsNewVersionActivityArgs.enterFrom) && Intrinsics.LJFF(this.enterMethod, settingsNewVersionActivityArgs.enterMethod);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterMethod;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingsNewVersionActivityArgs(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
    }

    public SettingsNewVersionActivityArgs() {
        this("", "");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public static SettingsNewVersionActivityArgs __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2 = null;
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
        if (bundle.containsKey("enter_method")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 2;
        }
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return new SettingsNewVersionActivityArgs(str, str2);
    }

    public SettingsNewVersionActivityArgs(String str, String str2) {
        this.enterFrom = str;
        this.enterMethod = str2;
    }
}
