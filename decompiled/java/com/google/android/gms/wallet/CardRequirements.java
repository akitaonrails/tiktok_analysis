package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.CardRequirements;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new Parcelable.Creator() { // from class: X.0WAD
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJ = null;
            boolean zLJIILIIL = false;
            boolean zLJIILIIL2 = true;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                            }
                        } else {
                            zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                    }
                } else {
                    arrayListLJ = C0W6J.LJ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CardRequirements(arrayListLJ, zLJIILIIL2, zLJIILIIL, iLJIJJLI);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CardRequirements[i];
        }
    };
    public ArrayList zza;
    public boolean zzb;
    public boolean zzc;
    public int zzd;

    public CardRequirements() {
        this.zzb = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIL(parcel, 1, this.zza);
        C817940W6u.LIZ(parcel, 2, this.zzb);
        C817940W6u.LIZ(parcel, 3, this.zzc);
        C817940W6u.LJIIJ(parcel, 4, this.zzd);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.zza = arrayList;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i;
    }
}
