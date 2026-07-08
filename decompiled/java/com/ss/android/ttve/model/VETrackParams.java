package com.ss.android.ttve.model;

import X.C1D40;
import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class VETrackParams implements Parcelable {
    public static final Parcelable.Creator<VETrackParams> CREATOR = new C2325341G0m(9);
    public int extFlag;
    public int layer;
    public List<String> paths;
    public List<Integer> seqIns;
    public List<Integer> seqOuts;
    public List<VESize> sizes;
    public List<Double> speeds;
    public C1D40 trackPriority;
    public List<Integer> trimIns;
    public List<Integer> trimOuts;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VETrackParams() {
        this.layer = -1;
        this.trackPriority = C1D40.DEFAULT;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VETrackParams{paths=");
        sbLIZ.append(this.paths);
        sbLIZ.append(", trimIns=");
        sbLIZ.append(this.trimIns);
        sbLIZ.append(", trimOuts=");
        sbLIZ.append(this.trimOuts);
        sbLIZ.append(", seqIns=");
        sbLIZ.append(this.seqIns);
        sbLIZ.append(", seqOuts=");
        sbLIZ.append(this.seqOuts);
        sbLIZ.append(", speeds=");
        sbLIZ.append(this.speeds);
        sbLIZ.append(", layer=");
        sbLIZ.append(this.layer);
        sbLIZ.append(", trackPriority=");
        sbLIZ.append(this.trackPriority);
        sbLIZ.append(", extFlag=");
        sbLIZ.append(this.extFlag);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VETrackParams(Parcel parcel) {
        C1D40 c1d40;
        this.layer = -1;
        this.trackPriority = C1D40.DEFAULT;
        this.paths = parcel.createStringArrayList();
        ArrayList arrayList = new ArrayList();
        this.trimIns = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.trimOuts = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.seqIns = arrayList3;
        parcel.readList(arrayList3, Integer.class.getClassLoader());
        ArrayList arrayList4 = new ArrayList();
        this.seqOuts = arrayList4;
        parcel.readList(arrayList4, Integer.class.getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        this.speeds = arrayList5;
        parcel.readList(arrayList5, Double.class.getClassLoader());
        this.layer = parcel.readInt();
        int i = parcel.readInt();
        if (i == -1) {
            c1d40 = null;
        } else {
            c1d40 = C1D40.values()[i];
        }
        this.trackPriority = c1d40;
        this.extFlag = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOrdinal;
        parcel.writeStringList(this.paths);
        parcel.writeList(this.trimIns);
        parcel.writeList(this.trimOuts);
        parcel.writeList(this.seqIns);
        parcel.writeList(this.seqOuts);
        parcel.writeList(this.speeds);
        parcel.writeInt(this.layer);
        C1D40 c1d40 = this.trackPriority;
        if (c1d40 == null) {
            iOrdinal = -1;
        } else {
            iOrdinal = c1d40.ordinal();
        }
        parcel.writeInt(iOrdinal);
        parcel.writeInt(this.extFlag);
    }
}
