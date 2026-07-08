package com.google.android.gms.cloudmessaging;

import X.C817940W6u;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new Parcelable.Creator<CloudMessage>() { // from class: X.0Vwz
        @Override // android.os.Parcelable.Creator
        public final CloudMessage createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Intent intent = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    intent = (Intent) C0W6J.LJI(parcel, i, Intent.CREATOR);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new CloudMessage(intent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CloudMessage[] newArray(int i) {
            return new CloudMessage[i];
        }
    };
    public Intent zza;
    public Map<String, String> zzb;

    public CloudMessage(Intent intent) {
        this.zza = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIZILJ(parcel, 1, this.zza, i, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
