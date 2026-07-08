package com.google.android.gms.fido.fido2.api.common;

import X.C0W3J;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.zzai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new Parcelable.Creator() { // from class: X.0W3I
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            while (true) {
                byte[][] bArr = null;
                while (parcel.dataPosition() < iLJJIII) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        C0W6J.LJJII(i, parcel);
                    } else {
                        int iLJJIFFI = C0W6J.LJJIFFI(i, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iLJJIFFI != 0) {
                            int i2 = parcel.readInt();
                            bArr = new byte[i2][];
                            for (int i3 = 0; i3 < i2; i3++) {
                                bArr[i3] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iLJJIFFI);
                        }
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new zzai(bArr);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new zzai[i];
        }
    };
    public final byte[][] zza;

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.zza) {
            iHashCode ^= Arrays.hashCode(new Object[]{bArr});
        }
        return iHashCode;
    }

    public zzai(byte[][] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZIZ(z);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C0W3J.LIZIZ(z2);
        for (int i = 0; i < bArr.length; i += 2) {
            if (i != 0 && bArr[i] == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            C0W3J.LIZIZ(z3);
            int i2 = i + 1;
            if (bArr[i2] != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            C0W3J.LIZIZ(z4);
            int length = bArr[i2].length;
            if (length != 32 && length != 64) {
                z5 = false;
            } else {
                z5 = true;
            }
            C0W3J.LIZIZ(z5);
        }
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzai)) {
            return false;
        }
        return Arrays.deepEquals(this.zza, ((zzai) obj).zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        byte[][] bArr = this.zza;
        if (bArr != null) {
            int iLJJ2 = C817940W6u.LJJ(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            C817940W6u.LJJI(iLJJ2, parcel);
        }
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
