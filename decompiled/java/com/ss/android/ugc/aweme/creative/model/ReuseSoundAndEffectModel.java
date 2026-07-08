package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class ReuseSoundAndEffectModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ReuseSoundAndEffectModel> CREATOR = new Parcelable.Creator<ReuseSoundAndEffectModel>() { // from class: X.0nWd
        @Override // android.os.Parcelable.Creator
        public final ReuseSoundAndEffectModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ReuseSoundAndEffectModel(string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ReuseSoundAndEffectModel[] newArray(int i) {
            return new ReuseSoundAndEffectModel[i];
        }
    };

    @C040H
    public String effectId;

    @C040H
    public boolean isMusicFromDiscoveryPage;

    @C040H
    public String soundId;

    public ReuseSoundAndEffectModel() {
        this(null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.soundId);
        parcel.writeString(this.effectId);
        parcel.writeInt(this.isMusicFromDiscoveryPage ? 1 : 0);
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getSoundId() {
        return this.soundId;
    }

    public final boolean isMusicFromDiscoveryPage() {
        return this.isMusicFromDiscoveryPage;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setMusicFromDiscoveryPage(boolean z) {
        this.isMusicFromDiscoveryPage = z;
    }

    public final void setSoundId(String str) {
        this.soundId = str;
    }

    public ReuseSoundAndEffectModel(String str, String str2, boolean z) {
        this.soundId = str;
        this.effectId = str2;
        this.isMusicFromDiscoveryPage = z;
    }
}
