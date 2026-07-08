package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.SparkPublishModel;

/* JADX INFO: loaded from: classes23.dex */
public final class SparkPublishModel implements Parcelable {
    public static final Parcelable.Creator<SparkPublishModel> CREATOR = new Parcelable.Creator<SparkPublishModel>() { // from class: X.0nX1
        @Override // android.os.Parcelable.Creator
        public final SparkPublishModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new SparkPublishModel(z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final SparkPublishModel[] newArray(int i) {
            return new SparkPublishModel[i];
        }
    };

    @C09CT("has_spark_anchor")
    public boolean hasSparkAnchor;

    @C09CT("spark_channel_selected")
    public boolean sparkChannelSelected;

    public SparkPublishModel() {
        this(false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sparkChannelSelected ? 1 : 0);
        parcel.writeInt(this.hasSparkAnchor ? 1 : 0);
    }

    public SparkPublishModel(boolean z, boolean z2) {
        this.sparkChannelSelected = z;
        this.hasSparkAnchor = z2;
    }
}
