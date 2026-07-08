package com.ss.android.ugc.aweme.creative.model.live;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveRecordModel implements Parcelable {
    public static final Parcelable.Creator<LiveRecordModel> CREATOR = new Parcelable.Creator<LiveRecordModel>() { // from class: X.0KlU
        @Override // android.os.Parcelable.Creator
        public final LiveRecordModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new LiveRecordModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveRecordModel[] newArray(int i) {
            return new LiveRecordModel[i];
        }
    };

    @C09CT("record_room_ids")
    public final List<Long> roomIdList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Long> list = this.roomIdList;
        parcel.writeInt(list.size());
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
    }

    public LiveRecordModel() {
        this(new ArrayList());
    }

    public LiveRecordModel(List<Long> list) {
        this.roomIdList = list;
    }
}
