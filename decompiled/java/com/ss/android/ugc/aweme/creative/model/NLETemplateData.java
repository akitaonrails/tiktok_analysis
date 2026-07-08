package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NLETemplateData;
import com.ss.android.ugc.aweme.creative.model.SingleTemplateData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class NLETemplateData implements Parcelable {
    public static final Parcelable.Creator<NLETemplateData> CREATOR = new Parcelable.Creator<NLETemplateData>() { // from class: X.0MQV
        @Override // android.os.Parcelable.Creator
        public final NLETemplateData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SingleTemplateData.CREATOR.createFromParcel(parcel));
            }
            return new NLETemplateData(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NLETemplateData[] newArray(int i) {
            return new NLETemplateData[i];
        }
    };

    @C09CT("music_id")
    public final String musicId;

    @C09CT("template_data_list")
    public final List<SingleTemplateData> templateDataList;

    public NLETemplateData() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SingleTemplateData> list = this.templateDataList;
        parcel.writeInt(list.size());
        Iterator<SingleTemplateData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.musicId);
    }

    public NLETemplateData(List<SingleTemplateData> list, String str) {
        this.templateDataList = list;
        this.musicId = str;
    }

    public NLETemplateData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : str);
    }
}
