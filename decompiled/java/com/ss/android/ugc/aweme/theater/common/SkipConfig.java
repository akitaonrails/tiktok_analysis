package com.ss.android.ugc.aweme.theater.common;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.SAALaunchParam;
import com.ss.android.ugc.aweme.theater.common.SkipConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class SkipConfig implements Parcelable {
    public static final Parcelable.Creator<SkipConfig> CREATOR = new Parcelable.Creator<SkipConfig>() { // from class: X.12o6
        @Override // android.os.Parcelable.Creator
        public final SkipConfig createFromParcel(Parcel parcel) {
            SAALaunchParam sAALaunchParamCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                sAALaunchParamCreateFromParcel = null;
            } else {
                sAALaunchParamCreateFromParcel = SAALaunchParam.CREATOR.createFromParcel(parcel);
            }
            return new SkipConfig(string, sAALaunchParamCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SkipConfig[] newArray(int i) {
            return new SkipConfig[i];
        }
    };
    public final SAALaunchParam launcherParam;
    public final String routeUrl;

    public SkipConfig() {
        this((SAALaunchParam) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipConfig)) {
            return false;
        }
        SkipConfig skipConfig = (SkipConfig) obj;
        return Intrinsics.LJFF(this.routeUrl, skipConfig.routeUrl) && Intrinsics.LJFF(this.launcherParam, skipConfig.launcherParam);
    }

    public final int hashCode() {
        String str = this.routeUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SAALaunchParam sAALaunchParam = this.launcherParam;
        return iHashCode + (sAALaunchParam != null ? sAALaunchParam.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkipConfig(routeUrl=");
        sbLIZ.append(this.routeUrl);
        sbLIZ.append(", launcherParam=");
        sbLIZ.append(this.launcherParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.routeUrl);
        SAALaunchParam sAALaunchParam = this.launcherParam;
        if (sAALaunchParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sAALaunchParam.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SkipConfig(SAALaunchParam sAALaunchParam, int i) {
        this((String) null, (i & 2) != 0 ? null : sAALaunchParam);
    }

    public SkipConfig(String str, SAALaunchParam sAALaunchParam) {
        this.routeUrl = str;
        this.launcherParam = sAALaunchParam;
    }
}
