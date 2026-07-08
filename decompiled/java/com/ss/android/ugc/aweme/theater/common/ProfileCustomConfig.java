package com.ss.android.ugc.aweme.theater.common;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.AuthConfig;
import com.ss.android.ugc.aweme.theater.common.ContinueConfig;
import com.ss.android.ugc.aweme.theater.common.ProfileCustomConfig;
import com.ss.android.ugc.aweme.theater.common.SkipConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ProfileCustomConfig implements Parcelable {
    public static final Parcelable.Creator<ProfileCustomConfig> CREATOR = new Parcelable.Creator<ProfileCustomConfig>() { // from class: X.12o8
        @Override // android.os.Parcelable.Creator
        public final ProfileCustomConfig createFromParcel(Parcel parcel) {
            SkipConfig skipConfigCreateFromParcel;
            AuthConfig authConfigCreateFromParcel;
            ContinueConfig continueConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                skipConfigCreateFromParcel = null;
            } else {
                skipConfigCreateFromParcel = SkipConfig.CREATOR.createFromParcel(parcel);
            }
            SkipConfig skipConfig = skipConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                authConfigCreateFromParcel = null;
            } else {
                authConfigCreateFromParcel = AuthConfig.CREATOR.createFromParcel(parcel);
            }
            AuthConfig authConfig = authConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                continueConfigCreateFromParcel = ContinueConfig.CREATOR.createFromParcel(parcel);
            }
            return new ProfileCustomConfig(skipConfig, authConfig, continueConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileCustomConfig[] newArray(int i) {
            return new ProfileCustomConfig[i];
        }
    };
    public final AuthConfig authConfig;
    public final ContinueConfig continueConfig;
    public final SkipConfig skipConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileCustomConfig() {
        this((SkipConfig) null, (ContinueConfig) (0 == true ? 1 : 0), 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCustomConfig)) {
            return false;
        }
        ProfileCustomConfig profileCustomConfig = (ProfileCustomConfig) obj;
        return Intrinsics.LJFF(this.skipConfig, profileCustomConfig.skipConfig) && Intrinsics.LJFF(this.authConfig, profileCustomConfig.authConfig) && Intrinsics.LJFF(this.continueConfig, profileCustomConfig.continueConfig);
    }

    public final int hashCode() {
        SkipConfig skipConfig = this.skipConfig;
        int iHashCode = (skipConfig == null ? 0 : skipConfig.hashCode()) * 31;
        AuthConfig authConfig = this.authConfig;
        int iHashCode2 = (iHashCode + (authConfig == null ? 0 : authConfig.hashCode())) * 31;
        ContinueConfig continueConfig = this.continueConfig;
        return iHashCode2 + (continueConfig != null ? continueConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileCustomConfig(skipConfig=");
        sbLIZ.append(this.skipConfig);
        sbLIZ.append(", authConfig=");
        sbLIZ.append(this.authConfig);
        sbLIZ.append(", continueConfig=");
        sbLIZ.append(this.continueConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SkipConfig skipConfig = this.skipConfig;
        if (skipConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skipConfig.writeToParcel(parcel, i);
        }
        AuthConfig authConfig = this.authConfig;
        if (authConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authConfig.writeToParcel(parcel, i);
        }
        ContinueConfig continueConfig = this.continueConfig;
        if (continueConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            continueConfig.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ProfileCustomConfig(SkipConfig skipConfig, ContinueConfig continueConfig, int i) {
        this((i & 1) != 0 ? null : skipConfig, (AuthConfig) null, (i & 4) != 0 ? null : continueConfig);
    }

    public ProfileCustomConfig(SkipConfig skipConfig, AuthConfig authConfig, ContinueConfig continueConfig) {
        this.skipConfig = skipConfig;
        this.authConfig = authConfig;
        this.continueConfig = continueConfig;
    }
}
