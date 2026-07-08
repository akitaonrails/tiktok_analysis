package com.ss.android.ugc.aweme.theater.common;

import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.SAALaunchParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class SAALaunchParam implements Parcelable {
    public static final Parcelable.Creator<SAALaunchParam> CREATOR = new Parcelable.Creator<SAALaunchParam>() { // from class: X.12o5
        @Override // android.os.Parcelable.Creator
        public final SAALaunchParam createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Bundle bundle = parcel.readBundle(SAALaunchParam.class.getClassLoader());
            String string = parcel.readString();
            Bundle bundle2 = parcel.readBundle(SAALaunchParam.class.getClassLoader());
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
            return new SAALaunchParam(bundle, string, bundle2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SAALaunchParam[] newArray(int i) {
            return new SAALaunchParam[i];
        }
    };
    public final Bundle bundle;
    public final Boolean ignoreVEPluginCheck;
    public final Bundle options;
    public final String sceneName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SAALaunchParam)) {
            return false;
        }
        SAALaunchParam sAALaunchParam = (SAALaunchParam) obj;
        return Intrinsics.LJFF(this.bundle, sAALaunchParam.bundle) && Intrinsics.LJFF(this.sceneName, sAALaunchParam.sceneName) && Intrinsics.LJFF(this.options, sAALaunchParam.options) && Intrinsics.LJFF(this.ignoreVEPluginCheck, sAALaunchParam.ignoreVEPluginCheck);
    }

    public final int hashCode() {
        int iHashCode = ((this.bundle.hashCode() * 31) + this.sceneName.hashCode()) * 31;
        Bundle bundle = this.options;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Boolean bool = this.ignoreVEPluginCheck;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SAALaunchParam(bundle=");
        sbLIZ.append(this.bundle);
        sbLIZ.append(", sceneName=");
        sbLIZ.append(this.sceneName);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(", ignoreVEPluginCheck=");
        sbLIZ.append(this.ignoreVEPluginCheck);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeBundle(this.bundle);
        parcel.writeString(this.sceneName);
        parcel.writeBundle(this.options);
        Boolean bool = this.ignoreVEPluginCheck;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public /* synthetic */ SAALaunchParam(Bundle bundle, String str) {
        this(bundle, str, null, Boolean.FALSE);
    }

    public SAALaunchParam(Bundle bundle, String str, Bundle bundle2, Boolean bool) {
        this.bundle = bundle;
        this.sceneName = str;
        this.options = bundle2;
        this.ignoreVEPluginCheck = bool;
    }
}
