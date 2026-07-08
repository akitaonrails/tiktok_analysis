package com.ss.android.ugc.aweme.theater.common;

import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.ContinueConfig;
import com.ss.android.ugc.aweme.theater.common.MobConfig;
import com.ss.android.ugc.aweme.theater.common.SAALaunchParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ContinueConfig implements Parcelable {
    public static final Parcelable.Creator<ContinueConfig> CREATOR = new Parcelable.Creator<ContinueConfig>() { // from class: X.12o7
        @Override // android.os.Parcelable.Creator
        public final ContinueConfig createFromParcel(Parcel parcel) {
            SAALaunchParam sAALaunchParamCreateFromParcel;
            String string = parcel.readString();
            Bundle bundle = parcel.readBundle(ContinueConfig.class.getClassLoader());
            MobConfig mobConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                sAALaunchParamCreateFromParcel = null;
            } else {
                sAALaunchParamCreateFromParcel = SAALaunchParam.CREATOR.createFromParcel(parcel);
            }
            SAALaunchParam sAALaunchParam = sAALaunchParamCreateFromParcel;
            if (parcel.readInt() != 0) {
                mobConfigCreateFromParcel = MobConfig.CREATOR.createFromParcel(parcel);
            }
            return new ContinueConfig(string, bundle, sAALaunchParam, mobConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ContinueConfig[] newArray(int i) {
            return new ContinueConfig[i];
        }
    };
    public final Bundle bundle;
    public final SAALaunchParam launcherParam;
    public final MobConfig mobConfig;
    public final String routeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinueConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContinueConfig)) {
            return false;
        }
        ContinueConfig continueConfig = (ContinueConfig) obj;
        return Intrinsics.LJFF(this.routeUrl, continueConfig.routeUrl) && Intrinsics.LJFF(this.bundle, continueConfig.bundle) && Intrinsics.LJFF(this.launcherParam, continueConfig.launcherParam) && Intrinsics.LJFF(this.mobConfig, continueConfig.mobConfig);
    }

    public final int hashCode() {
        String str = this.routeUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bundle bundle = this.bundle;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        SAALaunchParam sAALaunchParam = this.launcherParam;
        int iHashCode3 = (iHashCode2 + (sAALaunchParam == null ? 0 : sAALaunchParam.hashCode())) * 31;
        MobConfig mobConfig = this.mobConfig;
        return iHashCode3 + (mobConfig != null ? mobConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContinueConfig(routeUrl=");
        sbLIZ.append(this.routeUrl);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.bundle);
        sbLIZ.append(", launcherParam=");
        sbLIZ.append(this.launcherParam);
        sbLIZ.append(", mobConfig=");
        sbLIZ.append(this.mobConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.routeUrl);
        parcel.writeBundle(this.bundle);
        SAALaunchParam sAALaunchParam = this.launcherParam;
        if (sAALaunchParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sAALaunchParam.writeToParcel(parcel, i);
        }
        MobConfig mobConfig = this.mobConfig;
        if (mobConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mobConfig.writeToParcel(parcel, i);
        }
    }

    public ContinueConfig(String str, Bundle bundle, SAALaunchParam sAALaunchParam, MobConfig mobConfig) {
        this.routeUrl = str;
        this.bundle = bundle;
        this.launcherParam = sAALaunchParam;
        this.mobConfig = mobConfig;
    }

    public /* synthetic */ ContinueConfig(String str, Bundle bundle, SAALaunchParam sAALaunchParam, MobConfig mobConfig, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : sAALaunchParam, (i & 8) != 0 ? null : mobConfig);
    }
}
