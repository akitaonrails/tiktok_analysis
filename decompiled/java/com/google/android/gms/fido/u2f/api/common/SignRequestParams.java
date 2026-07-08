package com.google.android.gms.fido.u2f.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new Parcelable.Creator() { // from class: X.12k9
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Integer numLJIL = null;
            Double dLJIIZILJ = null;
            Uri uri = null;
            byte[] bArrLIZJ = null;
            ArrayList arrayListLJIIJJI = null;
            ChannelIdValue channelIdValue = null;
            String strLJII = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 2:
                        numLJIL = C0W6J.LJIL(i, parcel);
                        break;
                    case 3:
                        dLJIIZILJ = C0W6J.LJIIZILJ(i, parcel);
                        break;
                    case 4:
                        uri = (Uri) C0W6J.LJI(parcel, i, Uri.CREATOR);
                        break;
                    case 5:
                        bArrLIZJ = C0W6J.LIZJ(i, parcel);
                        break;
                    case 6:
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, RegisteredKey.CREATOR);
                        break;
                    case 7:
                        channelIdValue = (ChannelIdValue) C0W6J.LJI(parcel, i, ChannelIdValue.CREATOR);
                        break;
                    case '\b':
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new SignRequestParams(numLJIL, dLJIIZILJ, uri, bArrLIZJ, arrayListLJIIJJI, channelIdValue, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SignRequestParams[i];
        }
    };
    public final Integer zza;
    public final Double zzb;
    public final Uri zzc;
    public final byte[] zzd;
    public final List zze;
    public final ChannelIdValue zzf;
    public final String zzg;
    public final Set zzh;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zzb, this.zze, this.zzf, this.zzg, Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (C0W0T.LIZIZ(this.zza, signRequestParams.zza) && C0W0T.LIZIZ(this.zzb, signRequestParams.zzb) && C0W0T.LIZIZ(this.zzc, signRequestParams.zzc) && Arrays.equals(this.zzd, signRequestParams.zzd) && this.zze.containsAll(signRequestParams.zze) && signRequestParams.zze.containsAll(this.zze) && C0W0T.LIZIZ(this.zzf, signRequestParams.zzf) && C0W0T.LIZIZ(this.zzg, signRequestParams.zzg)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIILIIL(parcel, 2, this.zza);
        C817940W6u.LJI(parcel, 3, this.zzb);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzc, i, false);
        C817940W6u.LJ(parcel, 5, this.zzd, false);
        C817940W6u.LJIL(parcel, 6, this.zze, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.zzf, i, false);
        C817940W6u.LJIJ(parcel, 8, this.zzg, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        this.zzd = bArr;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZ("registeredKeys must not be null or empty", z);
        this.zze = list;
        this.zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            if (registeredKey.zzc == null && uri == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C0W3J.LIZ("registered key has null appId and no request appId is provided", z2);
            String str2 = registeredKey.zzc;
            if (str2 != null) {
                hashSet.add(UriProtector.parse(str2));
            }
        }
        this.zzh = hashSet;
        C0W3J.LIZ("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.zzg = str;
    }
}
