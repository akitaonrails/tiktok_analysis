package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.GreenScreenEffectModel;

/* JADX INFO: loaded from: classes23.dex */
public final class GreenScreenEffectModel implements Parcelable {
    public static final Parcelable.Creator<GreenScreenEffectModel> CREATOR = new Parcelable.Creator<GreenScreenEffectModel>() { // from class: X.0nWx
        @Override // android.os.Parcelable.Creator
        public final GreenScreenEffectModel createFromParcel(Parcel parcel) {
            return new GreenScreenEffectModel(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GreenScreenEffectModel[] newArray(int i) {
            return new GreenScreenEffectModel[i];
        }
    };

    @C09CT("prop_customized_pic_cnt")
    public int propCustomPicCnt;

    public GreenScreenEffectModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.propCustomPicCnt);
    }

    public GreenScreenEffectModel(int i) {
        this.propCustomPicCnt = i;
    }
}
