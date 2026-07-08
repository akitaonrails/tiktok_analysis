package com.ss.android.ugc.aweme.creative.model.countdown;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.countdown.CountDownModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public final class CountDownModel implements Parcelable {
    public static final Parcelable.Creator<CountDownModel> CREATOR = new Parcelable.Creator<CountDownModel>() { // from class: X.0nWR
        @Override // android.os.Parcelable.Creator
        public final CountDownModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new CountDownModel(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final CountDownModel[] newArray(int i) {
            return new CountDownModel[i];
        }
    };

    @C09CT("count_down_modes")
    public ArrayList<Integer> countDownModes;

    @C09CT("recording_limit_list")
    public ArrayList<Integer> recordingLimitList;

    public CountDownModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList<Integer> arrayList = this.countDownModes;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Integer> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        ArrayList<Integer> arrayList2 = this.recordingLimitList;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList2.size());
        Iterator<Integer> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            parcel.writeInt(it3.next().intValue());
        }
    }

    public CountDownModel(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        this.countDownModes = arrayList;
        this.recordingLimitList = arrayList2;
    }
}
