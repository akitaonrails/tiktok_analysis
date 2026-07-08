package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.AudioLoudnessModel;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public final class AudioLoudnessModel implements Parcelable {
    public static final Parcelable.Creator<AudioLoudnessModel> CREATOR = new Parcelable.Creator<AudioLoudnessModel>() { // from class: X.0nWP
        @Override // android.os.Parcelable.Creator
        public final AudioLoudnessModel createFromParcel(Parcel parcel) {
            LoudnessBalanceParam loudnessBalanceParamCreateFromParcel;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                loudnessBalanceParamCreateFromParcel = null;
            } else {
                loudnessBalanceParamCreateFromParcel = LoudnessBalanceParam.CREATOR.createFromParcel(parcel);
            }
            LoudnessBalanceParam loudnessBalanceParam = loudnessBalanceParamCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new AudioLoudnessModel(loudnessBalanceParam, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioLoudnessModel[] newArray(int i) {
            return new AudioLoudnessModel[i];
        }
    };

    @C040H
    public LoudnessBalanceParam loudnessBalanceParam;

    @C040H
    public ArrayList<Integer> segmentLoudness;

    public AudioLoudnessModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LoudnessBalanceParam loudnessBalanceParam = this.loudnessBalanceParam;
        if (loudnessBalanceParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loudnessBalanceParam.writeToParcel(parcel, i);
        }
        ArrayList<Integer> arrayList = this.segmentLoudness;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<Integer> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
    }

    public /* synthetic */ AudioLoudnessModel(int i) {
        this(new LoudnessBalanceParam(0.0d, 0.0d, 0.0d), new ArrayList());
    }

    public AudioLoudnessModel(LoudnessBalanceParam loudnessBalanceParam, ArrayList<Integer> arrayList) {
        this.loudnessBalanceParam = loudnessBalanceParam;
        this.segmentLoudness = arrayList;
    }
}
