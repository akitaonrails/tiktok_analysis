package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeDurationExtra;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CreativeDurationExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreativeDurationExtra> CREATOR = new Parcelable.Creator<CreativeDurationExtra>() { // from class: X.0nHH
        @Override // android.os.Parcelable.Creator
        public final CreativeDurationExtra createFromParcel(Parcel parcel) {
            return new CreativeDurationExtra(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CreativeDurationExtra[] newArray(int i) {
            return new CreativeDurationExtra[i];
        }
    };

    @C09CT("shoot_publish_duration")
    public long shootPublishDuration;

    @C09CT("start_edit_draft_time")
    public long startEditDraftTime;

    @C09CT("start_time")
    public long startTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.shootPublishDuration);
        parcel.writeLong(this.startEditDraftTime);
    }

    public CreativeDurationExtra() {
        this(0L, 0L, 0L);
    }

    public final long getShootPublishDuration() {
        return this.shootPublishDuration;
    }

    public final long getStartEditDraftTime() {
        return this.startEditDraftTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public CreativeDurationExtra(long j) {
        this(j, 0L, 0L);
    }

    public final void setShootPublishDuration(long j) {
        this.shootPublishDuration = j;
    }

    public final void setStartEditDraftTime(long j) {
        this.startEditDraftTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public CreativeDurationExtra(long j, long j2) {
        this(j, j2, 0L);
    }

    public CreativeDurationExtra(long j, long j2, long j3) {
        this.startTime = j;
        this.shootPublishDuration = j2;
        this.startEditDraftTime = j3;
    }
}
