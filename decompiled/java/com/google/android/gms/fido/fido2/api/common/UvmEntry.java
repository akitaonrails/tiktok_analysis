package com.google.android.gms.fido.fido2.api.common;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new Parcelable.Creator() { // from class: X.0W6M
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            short s = 0;
            short s2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            C0W6J.LJJIIJZLJL(parcel, i, 4);
                            s2 = (short) parcel.readInt();
                        }
                    } else {
                        C0W6J.LJJIIJZLJL(parcel, i, 4);
                        s = (short) parcel.readInt();
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new UvmEntry(iLJIJJLI, s, s2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new UvmEntry[i];
        }
    };
    public final int zza;
    public final short zzb;
    public final short zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        if (this.zza != uvmEntry.zza || this.zzb != uvmEntry.zzb || this.zzc != uvmEntry.zzc) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        short s = this.zzb;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public UvmEntry(int i, short s, short s2) {
        this.zza = i;
        this.zzb = s;
        this.zzc = s2;
    }
}
