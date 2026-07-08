package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MatchPeriod;

/* JADX INFO: loaded from: classes15.dex */
public final class MatchPeriod implements Parcelable {
    public static final Parcelable.Creator<MatchPeriod> CREATOR = new Parcelable.Creator<MatchPeriod>() { // from class: X.0ZBj
        @Override // android.os.Parcelable.Creator
        public final MatchPeriod createFromParcel(Parcel parcel) {
            return new MatchPeriod(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final MatchPeriod[] newArray(int i) {
            return new MatchPeriod[i];
        }
    };

    @C040H
    @C09CT("match_duration")
    public final double matchDuration;

    @C040H
    @C09CT("match_offset")
    public final double matchOffset;

    @C040H
    @C09CT("start_offset")
    public double startOffset;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.startOffset);
        parcel.writeDouble(this.matchOffset);
        parcel.writeDouble(this.matchDuration);
    }

    public MatchPeriod() {
        this(0.0d, 0.0d, 0.0d);
    }

    public MatchPeriod(double d, double d2, double d3) {
        this.startOffset = d;
        this.matchOffset = d2;
        this.matchDuration = d3;
    }
}
