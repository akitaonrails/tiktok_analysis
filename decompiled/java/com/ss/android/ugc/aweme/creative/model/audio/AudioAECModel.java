package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.AudioAECModel;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioAECModel implements Parcelable {
    public static final Parcelable.Creator<AudioAECModel> CREATOR = new Parcelable.Creator<AudioAECModel>() { // from class: X.0nWg
        @Override // android.os.Parcelable.Creator
        public final AudioAECModel createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AudioAECModel(i, j, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAECModel[] newArray(int i) {
            return new AudioAECModel[i];
        }
    };

    @C040H
    public long audioAecDelayTime;

    @C040H
    public int recordBgmDelay;

    @C040H
    public boolean successEnableAEC;

    public AudioAECModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.recordBgmDelay);
        parcel.writeLong(this.audioAecDelayTime);
        parcel.writeInt(this.successEnableAEC ? 1 : 0);
    }

    public /* synthetic */ AudioAECModel(int i) {
        this(0, 0L, false);
    }

    public AudioAECModel(int i, long j, boolean z) {
        this.recordBgmDelay = i;
        this.audioAecDelayTime = j;
        this.successEnableAEC = z;
    }
}
