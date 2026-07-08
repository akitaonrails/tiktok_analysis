package com.google.android.gms.wallet;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new Parcelable.Creator() { // from class: X.0WAE
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ArrayList arrayListLJ = null;
            String strLJII = null;
            String strLJII2 = null;
            ArrayList arrayListLJ2 = null;
            String strLJII3 = null;
            boolean zLJIILIIL = false;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        arrayListLJ = C0W6J.LJ(i, parcel);
                        break;
                    case 3:
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                    case 4:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        arrayListLJ2 = C0W6J.LJ(i, parcel);
                        break;
                    case 7:
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                        break;
                    case '\b':
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new IsReadyToPayRequest(arrayListLJ, strLJII, strLJII2, arrayListLJ2, zLJIILIIL, strLJII3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new IsReadyToPayRequest[i];
        }
    };
    public final String LL;
    public final String LLILLJJLI;
    public ArrayList zza;
    public ArrayList zzd;
    public boolean zze;
    public String zzf;

    public IsReadyToPayRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIL(parcel, 2, this.zza);
        C817940W6u.LJIJ(parcel, 4, this.LL, false);
        C817940W6u.LJIJ(parcel, 5, this.LLILLJJLI, false);
        C817940W6u.LJIIL(parcel, 6, this.zzd);
        C817940W6u.LIZ(parcel, 7, this.zze);
        C817940W6u.LJIJ(parcel, 8, this.zzf, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.zza = arrayList;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.zzd = arrayList2;
        this.zze = z;
        this.zzf = str3;
    }
}
