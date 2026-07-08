package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;

/* JADX INFO: loaded from: classes15.dex */
public final class MatchDetail implements Parcelable {
    public static final Parcelable.Creator<MatchDetail> CREATOR = new Parcelable.Creator<MatchDetail>() { // from class: X.0XkE
        @Override // android.os.Parcelable.Creator
        public final MatchDetail createFromParcel(Parcel parcel) {
            return new MatchDetail(parcel.readLong(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final MatchDetail[] newArray(int i) {
            return new MatchDetail[i];
        }
    };

    @C040H
    @C09CT("duration")
    public final double duration;

    @C040H
    @C09CT("music_id")
    public final long musicId;

    @C040H
    @C09CT("start")
    public final double start;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.musicId);
        parcel.writeDouble(this.start);
        parcel.writeDouble(this.duration);
    }

    public MatchDetail() {
        this(0L, 0.0d, 0.0d);
    }

    public MatchDetail(long j, double d, double d2) {
        this.musicId = j;
        this.start = d;
        this.duration = d2;
    }
}
