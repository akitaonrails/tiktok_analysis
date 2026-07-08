package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import X.C0MY0;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;

/* JADX INFO: loaded from: classes23.dex */
public final class LoudnessDetectResult implements Parcelable {
    public static final Parcelable.Creator<LoudnessDetectResult> CREATOR = new Parcelable.Creator<LoudnessDetectResult>() { // from class: X.0mj5
        @Override // android.os.Parcelable.Creator
        public final LoudnessDetectResult createFromParcel(Parcel parcel) {
            return new LoudnessDetectResult(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LoudnessDetectResult[] newArray(int i) {
            return new LoudnessDetectResult[i];
        }
    };

    @InterfaceC2270908v5
    @C09CT("audio_path")
    @C0MY0
    public String audioPath;

    @C09CT("avg_loudness")
    public double avgLoudness;

    @C09CT("peak_loudness")
    public double peakLoudness;

    @C09CT("result")
    public int result;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.result);
        parcel.writeDouble(this.avgLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeString(this.audioPath);
    }

    public LoudnessDetectResult() {
        this(-1, 0.0d, 0.0d, "");
    }

    public LoudnessDetectResult(int i, double d, double d2, String str) {
        this.result = i;
        this.avgLoudness = d;
        this.peakLoudness = d2;
        this.audioPath = str;
    }
}
