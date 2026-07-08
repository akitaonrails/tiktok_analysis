package com.google.android.gms.fido.u2f.api.common;

import X.C0W0T;
import X.C0W3J;
import X.C817940W6u;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new Parcelable.Creator() { // from class: X.12kA
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Integer numLJIL = null;
            Double dLJIIZILJ = null;
            Uri uri = null;
            ArrayList arrayListLJIIJJI = null;
            ArrayList arrayListLJIIJJI2 = null;
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
                        arrayListLJIIJJI = C0W6J.LJIIJJI(parcel, i, RegisterRequest.CREATOR);
                        break;
                    case 6:
                        arrayListLJIIJJI2 = C0W6J.LJIIJJI(parcel, i, RegisteredKey.CREATOR);
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
            return new RegisterRequestParams(numLJIL, dLJIIZILJ, uri, arrayListLJIIJJI, arrayListLJIIJJI2, channelIdValue, strLJII);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new RegisterRequestParams[i];
        }
    };
    public final Integer zza;
    public final Double zzb;
    public final Uri zzc;
    public final List zzd;
    public final List zze;
    public final ChannelIdValue zzf;
    public final String zzg;
    public Set zzh;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg});
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (C0W0T.LIZIZ(this.zza, registerRequestParams.zza) && C0W0T.LIZIZ(this.zzb, registerRequestParams.zzb) && C0W0T.LIZIZ(this.zzc, registerRequestParams.zzc) && C0W0T.LIZIZ(this.zzd, registerRequestParams.zzd) && ((list = this.zze) != null ? !((list2 = registerRequestParams.zze) == null || !list.containsAll(list2) || !registerRequestParams.zze.containsAll(this.zze)) : registerRequestParams.zze == null) && C0W0T.LIZIZ(this.zzf, registerRequestParams.zzf) && C0W0T.LIZIZ(this.zzg, registerRequestParams.zzg)) {
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
        C817940W6u.LJIL(parcel, 5, this.zzd, false);
        C817940W6u.LJIL(parcel, 6, this.zze, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.zzf, i, false);
        C817940W6u.LJIJ(parcel, 8, this.zzg, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.zza = num;
        this.zzb = d;
        this.zzc = uri;
        if (list != null && !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZ("empty list of register requests is provided", z);
        this.zzd = list;
        this.zze = list2;
        this.zzf = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it2.next();
            if (uri == null && registerRequest.zzd == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            C0W3J.LIZ("register request has null appId and no request appId is provided", z3);
            String str2 = registerRequest.zzd;
            if (str2 != null) {
                hashSet.add(UriProtector.parse(str2));
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it3.next();
            if (uri == null && registeredKey.zzc == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C0W3J.LIZ("registered key has null appId and no request appId is provided", z2);
            String str3 = registeredKey.zzc;
            if (str3 != null) {
                hashSet.add(UriProtector.parse(str3));
            }
        }
        this.zzh = hashSet;
        C0W3J.LIZ("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.zzg = str;
    }
}
