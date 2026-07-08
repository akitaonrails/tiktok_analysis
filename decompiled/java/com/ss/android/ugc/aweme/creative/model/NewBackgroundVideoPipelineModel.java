package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NewBackgroundVideoPipelineModel;

/* JADX INFO: loaded from: classes23.dex */
public final class NewBackgroundVideoPipelineModel implements Parcelable {
    public static final Parcelable.Creator<NewBackgroundVideoPipelineModel> CREATOR = new Parcelable.Creator<NewBackgroundVideoPipelineModel>() { // from class: X.0nWb
        @Override // android.os.Parcelable.Creator
        public final NewBackgroundVideoPipelineModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new NewBackgroundVideoPipelineModel(string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final NewBackgroundVideoPipelineModel[] newArray(int i) {
            return new NewBackgroundVideoPipelineModel[i];
        }
    };

    @C040H
    public boolean isNewVideoPipelineEnabled;

    @C040H
    public String outputPath;

    @C040H
    public String videoName;

    public NewBackgroundVideoPipelineModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.outputPath);
        parcel.writeString(this.videoName);
        parcel.writeInt(this.isNewVideoPipelineEnabled ? 1 : 0);
    }

    public /* synthetic */ NewBackgroundVideoPipelineModel(int i) {
        this("", "", false);
    }

    public NewBackgroundVideoPipelineModel(String str, String str2, boolean z) {
        this.outputPath = str;
        this.videoName = str2;
        this.isNewVideoPipelineEnabled = z;
    }
}
