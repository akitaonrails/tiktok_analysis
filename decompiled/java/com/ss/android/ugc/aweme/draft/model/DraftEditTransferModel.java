package com.ss.android.ugc.aweme.draft.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DraftEditTransferModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<DraftEditTransferModel> CREATOR = new Parcelable.Creator<DraftEditTransferModel>() { // from class: X.0mhV
        @Override // android.os.Parcelable.Creator
        public final DraftEditTransferModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(DraftEditTransferModel.class.getClassLoader()));
                }
            }
            return new DraftEditTransferModel(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DraftEditTransferModel[] newArray(int i) {
            return new DraftEditTransferModel[i];
        }
    };
    public final String primaryKey;
    public final List<EditVideoSegment> videoSegmentsCopy;

    public final DraftEditTransferModel copy(String str, List<? extends EditVideoSegment> list) {
        return new DraftEditTransferModel(str, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftEditTransferModel)) {
            return false;
        }
        DraftEditTransferModel draftEditTransferModel = (DraftEditTransferModel) obj;
        return Intrinsics.LJFF(this.primaryKey, draftEditTransferModel.primaryKey) && Intrinsics.LJFF(this.videoSegmentsCopy, draftEditTransferModel.videoSegmentsCopy);
    }

    public int hashCode() {
        String str = this.primaryKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftEditTransferModel(primaryKey=");
        sbLIZ.append(this.primaryKey);
        sbLIZ.append(", videoSegmentsCopy=");
        sbLIZ.append(this.videoSegmentsCopy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.primaryKey);
        List<EditVideoSegment> list = this.videoSegmentsCopy;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<EditVideoSegment> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final List<EditVideoSegment> getVideoSegmentsCopy() {
        return this.videoSegmentsCopy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraftEditTransferModel(String str, List<? extends EditVideoSegment> list) {
        this.primaryKey = str;
        this.videoSegmentsCopy = list;
    }
}
