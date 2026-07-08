package com.google.android.gms.tapandpay.globalactions;

import X.C0W0T;
import X.C817940W6u;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new Parcelable.Creator() { // from class: X.0W0W
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            Bitmap bitmap = null;
            String strLJII2 = null;
            String strLJII3 = null;
            String strLJII4 = null;
            Bitmap bitmap2 = null;
            PendingIntent pendingIntent = null;
            int iLJIJJLI = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                switch ((char) i) {
                    case 1:
                        iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                        break;
                    case 2:
                        strLJII = C0W6J.LJII(i, parcel);
                        break;
                    case 3:
                        bitmap = (Bitmap) C0W6J.LJI(parcel, i, Bitmap.CREATOR);
                        break;
                    case 4:
                        strLJII2 = C0W6J.LJII(i, parcel);
                        break;
                    case 5:
                        strLJII3 = C0W6J.LJII(i, parcel);
                        break;
                    case 6:
                        bitmap2 = (Bitmap) C0W6J.LJI(parcel, i, Bitmap.CREATOR);
                        break;
                    case 7:
                        pendingIntent = (PendingIntent) C0W6J.LJI(parcel, i, PendingIntent.CREATOR);
                        break;
                    case '\b':
                        strLJII4 = C0W6J.LJII(i, parcel);
                        break;
                    default:
                        C0W6J.LJJII(i, parcel);
                        break;
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new GlobalActionCard(iLJIJJLI, strLJII, bitmap, strLJII2, strLJII3, strLJII4, bitmap2, pendingIntent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GlobalActionCard[i];
        }
    };
    public int zza;
    public String zzb;
    public Bitmap zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public Bitmap zzg;
    public PendingIntent zzh;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh});
    }

    public GlobalActionCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (C0W0T.LIZIZ(Integer.valueOf(this.zza), Integer.valueOf(globalActionCard.zza)) && C0W0T.LIZIZ(this.zzb, globalActionCard.zzb) && C0W0T.LIZIZ(this.zzc, globalActionCard.zzc) && C0W0T.LIZIZ(this.zzd, globalActionCard.zzd) && C0W0T.LIZIZ(this.zze, globalActionCard.zze) && C0W0T.LIZIZ(this.zzf, globalActionCard.zzf) && C0W0T.LIZIZ(this.zzg, globalActionCard.zzg) && C0W0T.LIZIZ(this.zzh, globalActionCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.zza);
        C817940W6u.LJIJ(parcel, 2, this.zzb, false);
        C817940W6u.LJIIZILJ(parcel, 3, this.zzc, i, false);
        C817940W6u.LJIJ(parcel, 4, this.zzd, false);
        C817940W6u.LJIJ(parcel, 5, this.zze, false);
        C817940W6u.LJIIZILJ(parcel, 6, this.zzg, i, false);
        C817940W6u.LJIIZILJ(parcel, 7, this.zzh, i, false);
        C817940W6u.LJIJ(parcel, 8, this.zzf, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public GlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = bitmap;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = bitmap2;
        this.zzh = pendingIntent;
    }
}
