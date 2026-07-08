package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC19860912nH;
import X.C0W3J;
import X.C19843512kT;
import X.C19844112kZ;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public final PublicKeyCredentialType zzb;
    public final byte[] zzc;
    public final List zzd;
    public static final AbstractC19860912nH zza = AbstractC19860912nH.zzk(C19844112kZ.LIZ, C19844112kZ.LIZIZ);
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new Parcelable.Creator() { // from class: X.12k8
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            byte[] bArrLIZJ = null;
            ArrayList arrayListLJIIJJI = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, Transport.CREATOR);
                        }
                    } else {
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                    }
                } else {
                    strLJII = C0W6J.LJII(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new PublicKeyCredentialDescriptor(strLJII, arrayListLJIIJJI, bArrLIZJ);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new PublicKeyCredentialDescriptor[i];
        }
    };

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !Arrays.equals(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        List list = this.zzd;
        if (list == null) {
            if (publicKeyCredentialDescriptor.zzd == null) {
                return true;
            }
        } else {
            List list2 = publicKeyCredentialDescriptor.zzd;
            if (list2 != null && list.containsAll(list2) && publicKeyCredentialDescriptor.zzd.containsAll(this.zzd)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJ(parcel, 2, this.zzb.toString(), false);
        C817940W6u.LJ(parcel, 3, this.zzc, false);
        C817940W6u.LJIL(parcel, 4, this.zzd, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public PublicKeyCredentialDescriptor(String str, List list, byte[] bArr) {
        C0W3J.LJIIIIZZ(str);
        try {
            this.zzb = PublicKeyCredentialType.fromString(str);
            C0W3J.LJIIIIZZ(bArr);
            this.zzc = bArr;
            this.zzd = list;
        } catch (C19843512kT e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
