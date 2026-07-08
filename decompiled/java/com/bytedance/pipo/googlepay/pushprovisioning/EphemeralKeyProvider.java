package com.bytedance.pipo.googlepay.pushprovisioning;

import X.C0PEM;
import X.C2296808zG;
import X.C23250099c;
import X.C834560WoY;
import X.C836100Wr2;
import X.InterfaceC834570WoZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.pipo.googlepay.pushprovisioning.EphemeralKeyProvider;
import com.stripe.android.pushProvisioning.PushProvisioningEphemeralKeyProvider;

/* JADX INFO: loaded from: classes14.dex */
public final class EphemeralKeyProvider implements PushProvisioningEphemeralKeyProvider {
    public static final C834560WoY CREATOR = new Parcelable.Creator<EphemeralKeyProvider>() { // from class: X.0WoY
        @Override // android.os.Parcelable.Creator
        public final EphemeralKeyProvider createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = parcel.readString();
            if (string3 == null) {
                string3 = "";
            }
            String string4 = parcel.readString();
            if (string4 == null) {
                string4 = "";
            }
            String string5 = parcel.readString();
            if (string5 == null) {
                string5 = "";
            }
            String string6 = parcel.readString();
            if (string6 == null) {
                string6 = "";
            }
            return new EphemeralKeyProvider(string, string2, string3, string4, string5, string6);
        }

        @Override // android.os.Parcelable.Creator
        public final EphemeralKeyProvider[] newArray(int i) {
            return new EphemeralKeyProvider[i];
        }
    };
    public final String host;
    public final String merchantId;
    public final String oneTimeToken;
    public final String sessionId;
    public final String stripeCardId;
    public final String wuid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // com.stripe.android.pushProvisioning.PushProvisioningEphemeralKeyProvider
    public final void Cz(String str, InterfaceC834570WoZ interfaceC834570WoZ) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C836100Wr2(this, str, interfaceC834570WoZ, null), 3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stripeCardId);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.wuid);
        parcel.writeString(this.oneTimeToken);
        parcel.writeString(this.host);
        parcel.writeString(this.merchantId);
    }

    public EphemeralKeyProvider(String str, String str2, String str3, String str4, String str5, String str6) {
        this.stripeCardId = str;
        this.sessionId = str2;
        this.wuid = str3;
        this.oneTimeToken = str4;
        this.host = str5;
        this.merchantId = str6;
    }
}
