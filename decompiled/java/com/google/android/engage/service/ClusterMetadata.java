package com.google.android.engage.service;

import X.AbstractC19875512pd;
import X.C19864312np;
import X.C811870Vt3;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.engage.service.ClusterMetadata;

/* JADX INFO: loaded from: classes14.dex */
public class ClusterMetadata implements Parcelable {
    public static final Parcelable.Creator<ClusterMetadata> CREATOR = new Parcelable.Creator() { // from class: X.0Vt1
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            C811870Vt3 c811870Vt3 = new C811870Vt3();
            int i = parcel.readInt();
            if (i > 0) {
                int i2 = 0;
                do {
                    c811870Vt3.LIZ.LIZLLL(Integer.valueOf(parcel.readInt()));
                    i2++;
                } while (i2 < i);
            }
            return new ClusterMetadata(c811870Vt3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ClusterMetadata[i];
        }
    };
    public final AbstractC19875512pd zza;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ClusterMetadata(C811870Vt3 c811870Vt3) {
        this.zza = c811870Vt3.LIZ.LJI();
        C19864312np.LIZLLL("Cluster Type list cannot be empty", !r0.isEmpty());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.zza.isEmpty()) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(this.zza.size());
        AbstractC19875512pd abstractC19875512pd = this.zza;
        int size = abstractC19875512pd.size();
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) ListProtector.get(abstractC19875512pd, i2)).intValue());
        }
    }
}
