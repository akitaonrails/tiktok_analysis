package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AYCacheUnit;
import com.ss.android.ugc.aweme.creative.model.AYMobCacheModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class AYMobCacheModel implements Parcelable {
    public static final Parcelable.Creator<AYMobCacheModel> CREATOR = new Parcelable.Creator<AYMobCacheModel>() { // from class: X.0mds
        @Override // android.os.Parcelable.Creator
        public final AYMobCacheModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AYCacheUnit.CREATOR.createFromParcel(parcel));
            }
            return new AYMobCacheModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AYMobCacheModel[] newArray(int i) {
            return new AYMobCacheModel[i];
        }
    };

    @C09CT("ay_effect_list")
    public final List<AYCacheUnit> ayEffectList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AYCacheUnit> list = this.ayEffectList;
        parcel.writeInt(list.size());
        Iterator<AYCacheUnit> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public AYMobCacheModel() {
        this(new ArrayList());
    }

    public AYMobCacheModel(List<AYCacheUnit> list) {
        this.ayEffectList = list;
    }
}
