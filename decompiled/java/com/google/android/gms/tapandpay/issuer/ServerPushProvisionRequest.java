package com.google.android.gms.tapandpay.issuer;

import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;

/* JADX INFO: loaded from: classes14.dex */
public final class ServerPushProvisionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ServerPushProvisionRequest> CREATOR = new Parcelable.Creator() { // from class: X.0Ws1
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            ServerPushProvisionRequest.ExtraOptions extraOptions = new ServerPushProvisionRequest.ExtraOptions(false, false);
            PushProvisionSessionContext pushProvisionSessionContext = null;
            String strLJII = null;
            UserAddress userAddress = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                C0W6J.LJJII(i, parcel);
                            } else {
                                extraOptions = (ServerPushProvisionRequest.ExtraOptions) C0W6J.LJI(parcel, i, ServerPushProvisionRequest.ExtraOptions.CREATOR);
                            }
                        } else {
                            userAddress = (UserAddress) C0W6J.LJI(parcel, i, UserAddress.CREATOR);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    pushProvisionSessionContext = (PushProvisionSessionContext) C0W6J.LJI(parcel, i, PushProvisionSessionContext.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ServerPushProvisionRequest(pushProvisionSessionContext, strLJII, userAddress, extraOptions);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ServerPushProvisionRequest[i];
        }
    };
    public final PushProvisionSessionContext zza;
    public final String zzb;
    public final UserAddress zzc;
    public final ExtraOptions zzd;

    public static class ExtraOptions extends AbstractSafeParcelable implements ReflectedParcelable {
        public static final Parcelable.Creator<ExtraOptions> CREATOR = new Parcelable.Creator() { // from class: X.0Ws2
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int iLJJIII = C0W6J.LJJIII(parcel);
                boolean zLJIILIIL = false;
                boolean zLJIILIIL2 = false;
                while (parcel.dataPosition() < iLJJIII) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c != 1) {
                        if (c != 2) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            zLJIILIIL2 = C0W6J.LJIILIIL(i, parcel);
                        }
                    } else {
                        zLJIILIIL = C0W6J.LJIILIIL(i, parcel);
                    }
                }
                C0W6J.LJIIL(iLJJIII, parcel);
                return new ServerPushProvisionRequest.ExtraOptions(zLJIILIIL, zLJIILIIL2);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new ServerPushProvisionRequest.ExtraOptions[i];
            }
        };
        public boolean zza;
        public boolean zzb;

        public ExtraOptions(boolean z, boolean z2) {
            this.zza = z;
            this.zzb = z2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iLJJ = C817940W6u.LJJ(20293, parcel);
            C817940W6u.LIZ(parcel, 1, this.zza);
            C817940W6u.LIZ(parcel, 2, this.zzb);
            C817940W6u.LJJI(iLJJ, parcel);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zza, i, false);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzc, i, false);
        C817940W6u.LJIIZILJ(parcel, 4, this.zzd, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public ServerPushProvisionRequest(PushProvisionSessionContext pushProvisionSessionContext, String str, UserAddress userAddress, ExtraOptions extraOptions) {
        this.zza = pushProvisionSessionContext;
        this.zzb = str;
        this.zzc = userAddress;
        this.zzd = extraOptions;
    }
}
