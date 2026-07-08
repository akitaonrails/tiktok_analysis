package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class BeautifySegmentInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<BeautifySegmentInfo> CREATOR = new Parcelable.Creator<BeautifySegmentInfo>() { // from class: X.0Mln
        @Override // android.os.Parcelable.Creator
        public final BeautifySegmentInfo createFromParcel(Parcel parcel) {
            return new BeautifySegmentInfo(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BeautifySegmentInfo[] newArray(int i) {
            return new BeautifySegmentInfo[i];
        }
    };

    @C09CT("beautify_used")
    public int beautifyUsed;

    public BeautifySegmentInfo() {
        this(-1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.beautifyUsed);
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    public BeautifySegmentInfo(int i) {
        this.beautifyUsed = i;
    }

    public final void setBeautifyUsed(int i) {
        this.beautifyUsed = i;
    }
}
