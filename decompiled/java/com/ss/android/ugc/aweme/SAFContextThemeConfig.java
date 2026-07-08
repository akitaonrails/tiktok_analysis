package com.ss.android.ugc.aweme;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;

/* JADX INFO: loaded from: classes32.dex */
public final class SAFContextThemeConfig implements Parcelable {
    public static final Parcelable.Creator<SAFContextThemeConfig> CREATOR = new Parcelable.Creator<SAFContextThemeConfig>() { // from class: X.15is
        @Override // android.os.Parcelable.Creator
        public final SAFContextThemeConfig createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SAFContextThemeConfig(z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SAFContextThemeConfig[] newArray(int i) {
            return new SAFContextThemeConfig[i];
        }
    };
    public final boolean enableUnifyFragmentContextAndInflater;
    public final int themeForSAFThemeWrapper;

    public SAFContextThemeConfig() {
        this(false, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enableUnifyFragmentContextAndInflater ? 1 : 0);
        parcel.writeInt(this.themeForSAFThemeWrapper);
    }

    public final boolean getEnableUnifyFragmentContextAndInflater() {
        return this.enableUnifyFragmentContextAndInflater;
    }

    public final int getThemeForSAFThemeWrapper() {
        return this.themeForSAFThemeWrapper;
    }

    public SAFContextThemeConfig(boolean z, int i) {
        this.enableUnifyFragmentContextAndInflater = z;
        this.themeForSAFThemeWrapper = i;
    }
}
