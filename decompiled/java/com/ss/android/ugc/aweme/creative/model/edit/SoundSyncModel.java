package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.SoundSyncModel;

/* JADX INFO: loaded from: classes23.dex */
public final class SoundSyncModel implements Parcelable {
    public static final Parcelable.Creator<SoundSyncModel> CREATOR = new Parcelable.Creator<SoundSyncModel>() { // from class: X.0mc8
        @Override // android.os.Parcelable.Creator
        public final SoundSyncModel createFromParcel(Parcel parcel) {
            return new SoundSyncModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SoundSyncModel[] newArray(int i) {
            return new SoundSyncModel[i];
        }
    };

    @C09CT("sound_sync_from")
    public String soundSyncFrom;

    public SoundSyncModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.soundSyncFrom);
    }

    public SoundSyncModel(String str) {
        this.soundSyncFrom = str;
    }
}
