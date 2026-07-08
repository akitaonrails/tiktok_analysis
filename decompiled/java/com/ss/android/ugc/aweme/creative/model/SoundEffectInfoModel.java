package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SoundEffectInfoModel implements Parcelable {
    public static final Parcelable.Creator<SoundEffectInfoModel> CREATOR = new Parcelable.Creator<SoundEffectInfoModel>() { // from class: X.0nXX
        @Override // android.os.Parcelable.Creator
        public final SoundEffectInfoModel createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z2 = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SoundEffect.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new SoundEffectInfoModel(arrayList, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final SoundEffectInfoModel[] newArray(int i) {
            return new SoundEffectInfoModel[i];
        }
    };

    @C040H
    public boolean enableStatus;

    @C040H
    public boolean shouldShowRemoveToast;

    @C09CT("sound_effect_list")
    public List<SoundEffect> soundEffectList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SoundEffect> list = this.soundEffectList;
        parcel.writeInt(list.size());
        Iterator<SoundEffect> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.shouldShowRemoveToast ? 1 : 0);
        parcel.writeInt(this.enableStatus ? 1 : 0);
    }

    public SoundEffectInfoModel() {
        this(new ArrayList(), false, true);
    }

    public SoundEffectInfoModel(List<SoundEffect> list, boolean z, boolean z2) {
        this.soundEffectList = list;
        this.shouldShowRemoveToast = z;
        this.enableStatus = z2;
    }
}
