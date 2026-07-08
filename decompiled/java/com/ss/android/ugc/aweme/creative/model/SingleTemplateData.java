package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InfoStickerInfo;
import com.ss.android.ugc.aweme.creative.model.SingleTemplateData;
import com.ss.android.ugc.aweme.creative.model.TextStickerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class SingleTemplateData implements Parcelable {
    public static final Parcelable.Creator<SingleTemplateData> CREATOR = new Parcelable.Creator<SingleTemplateData>() { // from class: X.0MQW
        @Override // android.os.Parcelable.Creator
        public final SingleTemplateData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TextStickerInfo.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InfoStickerInfo.CREATOR.createFromParcel(parcel));
            }
            return new SingleTemplateData(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SingleTemplateData[] newArray(int i) {
            return new SingleTemplateData[i];
        }
    };

    @C09CT("info_sticker_list")
    public final List<InfoStickerInfo> infoStickerList;

    @C09CT("text_sticker_list")
    public final List<TextStickerInfo> textStickerList;

    public SingleTemplateData() {
        this(null, null, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SingleTemplateData(List<TextStickerInfo> list, List<InfoStickerInfo> list2) {
        this.textStickerList = list;
        this.infoStickerList = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<TextStickerInfo> list = this.textStickerList;
        parcel.writeInt(list.size());
        Iterator<TextStickerInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().textStr);
        }
        List<InfoStickerInfo> list2 = this.infoStickerList;
        parcel.writeInt(list2.size());
        Iterator<InfoStickerInfo> it3 = list2.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next().effectId);
        }
    }

    public SingleTemplateData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
