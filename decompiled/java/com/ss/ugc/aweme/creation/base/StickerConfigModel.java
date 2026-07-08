package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.StickerConfigModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class StickerConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StickerConfigModel> CREATOR = new Parcelable.Creator<StickerConfigModel>() { // from class: X.0mg4
        @Override // android.os.Parcelable.Creator
        public final StickerConfigModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(StickerConfigModel.class.getClassLoader()));
                i--;
            }
            return new StickerConfigModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerConfigModel[] newArray(int i) {
            return new StickerConfigModel[i];
        }
    };

    @C09CT("infoStickerConfigModel")
    public List<InfoStickerConfigModel> infostickerconfigmodel;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<InfoStickerConfigModel> list = this.infostickerconfigmodel;
        parcel.writeInt(list.size());
        Iterator<InfoStickerConfigModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public StickerConfigModel() {
        this(new ArrayList());
    }

    public final List<InfoStickerConfigModel> getInfostickerconfigmodel() {
        return this.infostickerconfigmodel;
    }

    public StickerConfigModel(List<InfoStickerConfigModel> list) {
        this.infostickerconfigmodel = list;
    }

    public final void setInfostickerconfigmodel(List<InfoStickerConfigModel> list) {
        this.infostickerconfigmodel = list;
    }
}
