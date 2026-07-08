package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionExperimentInformation;

/* JADX INFO: loaded from: classes23.dex */
public final class InlineCaptionExperimentInformation implements Parcelable {
    public static final Parcelable.Creator<InlineCaptionExperimentInformation> CREATOR = new Parcelable.Creator<InlineCaptionExperimentInformation>() { // from class: X.0nX7
        @Override // android.os.Parcelable.Creator
        public final InlineCaptionExperimentInformation createFromParcel(Parcel parcel) {
            return new InlineCaptionExperimentInformation(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InlineCaptionExperimentInformation[] newArray(int i) {
            return new InlineCaptionExperimentInformation[i];
        }
    };

    @C09CT("experiment_group")
    public final int experimentType;

    public InlineCaptionExperimentInformation() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.experimentType);
    }

    public InlineCaptionExperimentInformation(int i) {
        this.experimentType = i;
    }
}
