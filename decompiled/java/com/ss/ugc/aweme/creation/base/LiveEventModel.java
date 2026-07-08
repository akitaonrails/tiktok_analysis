package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.LiveEventModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class LiveEventModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<LiveEventModel> CREATOR = new Parcelable.Creator<LiveEventModel>() { // from class: X.0MiP
        @Override // android.os.Parcelable.Creator
        public final LiveEventModel createFromParcel(Parcel parcel) {
            return new LiveEventModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveEventModel[] newArray(int i) {
            return new LiveEventModel[i];
        }
    };

    @C09CT("live_event_data")
    public String liveEventData;

    public LiveEventModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.liveEventData);
    }

    public final String getLiveEventData() {
        return this.liveEventData;
    }

    public LiveEventModel(String str) {
        this.liveEventData = str;
    }

    public final void setLiveEventData(String str) {
        this.liveEventData = str;
    }
}
