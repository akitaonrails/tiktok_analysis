package com.ss.android.ugc.aweme.creative.model.beauty;

import X.C040H;
import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.beauty.BeautyModel;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class BeautyModel implements Parcelable {
    public static final Parcelable.Creator<BeautyModel> CREATOR = new Parcelable.Creator<BeautyModel>() { // from class: X.0MpC
        @Override // android.os.Parcelable.Creator
        public final BeautyModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(BeautyModel.class.getClassLoader()));
                }
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(parcel.readParcelable(BeautyModel.class.getClassLoader()));
            }
            return new BeautyModel(string, string2, string3, string4, arrayList, i3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeautyModel[] newArray(int i) {
            return new BeautyModel[i];
        }
    };

    @C09CT("record_beautify_used_segments")
    public List<BeautifySegmentInfo> beautifyUsedSegments;

    @C040H
    public ArrayList<BeautyMetadata> beautyMetadatas;

    @C040H
    public String eyesLabels;

    @C040H
    public int faceBeauty;

    @C040H
    public String reshapeLabels;

    @C040H
    public String smoothSkinLabels;

    @C040H
    public String tanningLabels;

    public BeautyModel() {
        this(null, null, null, null, null, 0, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.smoothSkinLabels);
        parcel.writeString(this.reshapeLabels);
        parcel.writeString(this.eyesLabels);
        parcel.writeString(this.tanningLabels);
        ArrayList<BeautyMetadata> arrayList = this.beautyMetadatas;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<BeautyMetadata> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeInt(this.faceBeauty);
        List<BeautifySegmentInfo> list = this.beautifyUsedSegments;
        parcel.writeInt(list.size());
        Iterator<BeautifySegmentInfo> it3 = list.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i);
        }
    }

    public BeautyModel(String str, String str2, String str3, String str4, ArrayList<BeautyMetadata> arrayList, int i, List<BeautifySegmentInfo> list) {
        this.smoothSkinLabels = str;
        this.reshapeLabels = str2;
        this.eyesLabels = str3;
        this.tanningLabels = str4;
        this.beautyMetadatas = arrayList;
        this.faceBeauty = i;
        this.beautifyUsedSegments = list;
    }

    public BeautyModel(String str, String str2, String str3, String str4, ArrayList arrayList, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) == 0 ? str4 : null, (i2 & 16) != 0 ? new ArrayList() : arrayList, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? C13BV.INSTANCE : list);
    }
}
