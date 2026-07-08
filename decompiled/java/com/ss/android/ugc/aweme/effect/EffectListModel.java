package com.ss.android.ugc.aweme.effect;

import X.C580950MqT;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class EffectListModel implements Parcelable {
    public static final Parcelable.Creator<EffectListModel> CREATOR = new C580950MqT(0);
    public ArrayList<EffectPointModel> mEffectPointModels;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        ArrayList<EffectPointModel> arrayList = this.mEffectPointModels;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public EffectListModel() {
    }

    public EffectListModel(Parcel parcel) {
        ArrayList<EffectPointModel> arrayList = new ArrayList<>();
        this.mEffectPointModels = arrayList;
        parcel.readList(arrayList, EffectPointModel.class.getClassLoader());
    }

    public void setEffectPointModels(ArrayList<EffectPointModel> arrayList) {
        this.mEffectPointModels = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mEffectPointModels);
    }
}
