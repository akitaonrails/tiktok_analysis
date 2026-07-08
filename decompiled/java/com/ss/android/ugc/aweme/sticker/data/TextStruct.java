package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TextStruct implements Parcelable {
    public static final Parcelable.Creator<TextStruct> CREATOR = new Parcelable.Creator<TextStruct>() { // from class: X.0mcj
        @Override // android.os.Parcelable.Creator
        public final TextStruct createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CreateAnchorInfo.CREATOR.createFromParcel(parcel));
            }
            return new TextStruct(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStruct[] newArray(int i) {
            return new TextStruct[i];
        }
    };

    @C09CT("anchors")
    public final List<CreateAnchorInfo> anchors;

    public final TextStruct copy(List<CreateAnchorInfo> list) {
        return new TextStruct(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextStruct) && Intrinsics.LJFF(this.anchors, ((TextStruct) obj).anchors);
    }

    public int hashCode() {
        return this.anchors.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStruct(anchors=");
        sbLIZ.append(this.anchors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CreateAnchorInfo> list = this.anchors;
        parcel.writeInt(list.size());
        Iterator<CreateAnchorInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public TextStruct() {
        this(new ArrayList());
    }

    public final List<CreateAnchorInfo> getAnchors() {
        return this.anchors;
    }

    public TextStruct(List<CreateAnchorInfo> list) {
        this.anchors = list;
    }
}
