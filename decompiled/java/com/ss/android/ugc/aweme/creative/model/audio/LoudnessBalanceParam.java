package com.ss.android.ugc.aweme.creative.model.audio;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class LoudnessBalanceParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<LoudnessBalanceParam> CREATOR = new Parcelable.Creator<LoudnessBalanceParam>() { // from class: X.0nXb
        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceParam createFromParcel(Parcel parcel) {
            return new LoudnessBalanceParam(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final LoudnessBalanceParam[] newArray(int i) {
            return new LoudnessBalanceParam[i];
        }
    };

    @C09CT("avg_loudness")
    public double avgLoudness;

    @C09CT("bgm_loudness")
    public double bgmLoudness;

    @C09CT("peak_loudness")
    public double peakLoudness;

    public final LoudnessBalanceParam copy(double d, double d2, double d3) {
        return new LoudnessBalanceParam(d, d2, d3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoudnessBalanceParam)) {
            return false;
        }
        LoudnessBalanceParam loudnessBalanceParam = (LoudnessBalanceParam) obj;
        return Double.compare(this.bgmLoudness, loudnessBalanceParam.bgmLoudness) == 0 && Double.compare(this.peakLoudness, loudnessBalanceParam.peakLoudness) == 0 && Double.compare(this.avgLoudness, loudnessBalanceParam.avgLoudness) == 0;
    }

    public int hashCode() {
        return (((C786410Ut5.X2(this.bgmLoudness) * 31) + C786410Ut5.X2(this.peakLoudness)) * 31) + C786410Ut5.X2(this.avgLoudness);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoudnessBalanceParam(bgmLoudness=");
        sbLIZ.append(this.bgmLoudness);
        sbLIZ.append(", peakLoudness=");
        sbLIZ.append(this.peakLoudness);
        sbLIZ.append(", avgLoudness=");
        sbLIZ.append(this.avgLoudness);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.bgmLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.avgLoudness);
    }

    public LoudnessBalanceParam() {
        this(0.0d, 0.0d, 0.0d);
    }

    public final double getAvgLoudness() {
        return this.avgLoudness;
    }

    public final double getBgmLoudness() {
        return this.bgmLoudness;
    }

    public final double getPeakLoudness() {
        return this.peakLoudness;
    }

    public final void setAvgLoudness(double d) {
        this.avgLoudness = d;
    }

    public final void setBgmLoudness(double d) {
        this.bgmLoudness = d;
    }

    public final void setPeakLoudness(double d) {
        this.peakLoudness = d;
    }

    public LoudnessBalanceParam(double d, double d2, double d3) {
        this.bgmLoudness = d;
        this.peakLoudness = d2;
        this.avgLoudness = d3;
    }
}
