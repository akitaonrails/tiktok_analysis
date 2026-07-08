package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.PublishConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<PublishConfig> CREATOR = new Parcelable.Creator<PublishConfig>() { // from class: X.0nWF
        @Override // android.os.Parcelable.Creator
        public final PublishConfig createFromParcel(Parcel parcel) {
            return new PublishConfig(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishConfig[] newArray(int i) {
            return new PublishConfig[i];
        }
    };

    @C09CT("mature_theme")
    public int matureTheme;

    public PublishConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.matureTheme);
    }

    public final int getMatureTheme() {
        return this.matureTheme;
    }

    public PublishConfig(int i) {
        this.matureTheme = i;
    }

    public final void setMatureTheme(int i) {
        this.matureTheme = i;
    }
}
