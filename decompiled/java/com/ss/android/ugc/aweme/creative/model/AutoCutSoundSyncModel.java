package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutSoundSyncModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutSoundSyncModel> CREATOR = new Parcelable.Creator<AutoCutSoundSyncModel>() { // from class: X.0MZ4
        @Override // android.os.Parcelable.Creator
        public final AutoCutSoundSyncModel createFromParcel(Parcel parcel) {
            return new AutoCutSoundSyncModel(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutSoundSyncModel[] newArray(int i) {
            return new AutoCutSoundSyncModel[i];
        }
    };

    @C040H
    public String soundSyncNleData;

    @C09CT("sound_sync_nlemodel_data_path")
    @C0MY0
    public String soundSyncNleDataPath;

    @C09CT("sound_sync_nlemodel_data_version")
    public int soundSyncNleDataVersion;

    public AutoCutSoundSyncModel() {
        this(null, null, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.soundSyncNleData);
        parcel.writeString(this.soundSyncNleDataPath);
        parcel.writeInt(this.soundSyncNleDataVersion);
    }

    public AutoCutSoundSyncModel(String str, String str2, int i) {
        this.soundSyncNleData = str;
        this.soundSyncNleDataPath = str2;
        this.soundSyncNleDataVersion = i;
    }
}
