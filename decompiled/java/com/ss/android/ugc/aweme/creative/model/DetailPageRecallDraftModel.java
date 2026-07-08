package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DetailPageRecallDraftModel;

/* JADX INFO: loaded from: classes23.dex */
public final class DetailPageRecallDraftModel implements Parcelable {
    public static final Parcelable.Creator<DetailPageRecallDraftModel> CREATOR = new Parcelable.Creator<DetailPageRecallDraftModel>() { // from class: X.0nWk
        @Override // android.os.Parcelable.Creator
        public final DetailPageRecallDraftModel createFromParcel(Parcel parcel) {
            return new DetailPageRecallDraftModel(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DetailPageRecallDraftModel[] newArray(int i) {
            return new DetailPageRecallDraftModel[i];
        }
    };

    @C040H
    public int isDetailPageRecallDraft;

    @C040H
    public int isDetailPageRecallPath;

    public DetailPageRecallDraftModel() {
        this(0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDetailPageRecallDraft);
        parcel.writeInt(this.isDetailPageRecallPath);
    }

    public /* synthetic */ DetailPageRecallDraftModel(int i) {
        this(0, 0);
    }

    public DetailPageRecallDraftModel(int i, int i2) {
        this.isDetailPageRecallDraft = i;
        this.isDetailPageRecallPath = i2;
    }
}
