package com.stripe.android.pushProvisioning;

import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.pipo.googlepay.pushprovisioning.EphemeralKeyProvider;
import com.bytedance.pipo.googlepay.pushprovisioning.TokenizeGooglePayFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.stripe.android.pushProvisioning.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class PushProvisioningActivityStarter extends a<PushProvisioningActivity, Args> {

    public static final class Args implements a.InterfaceC0033a {
        public static final Parcelable.Creator<Args> CREATOR = new C854630Xfp(20);
        public final String LL;
        public final PushProvisioningEphemeralKeyProvider LLILLJJLI;
        public final boolean LLILLL;

        public Args(Parcel parcel) {
            String string = parcel.readString();
            Objects.requireNonNull(string);
            this.LL = string;
            String string2 = parcel.readString();
            Objects.requireNonNull(string2);
            try {
                this.LLILLJJLI = (PushProvisioningEphemeralKeyProvider) parcel.readParcelable(Class.forName(string2).getClassLoader());
                this.LLILLL = parcel.readInt() > 0;
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }

        public Args(String str, EphemeralKeyProvider ephemeralKeyProvider) {
            Objects.requireNonNull(str);
            this.LL = str;
            this.LLILLJJLI = ephemeralKeyProvider;
            this.LLILLL = true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.LL);
            parcel.writeString(this.LLILLJJLI.getClass().getName());
            parcel.writeParcelable(this.LLILLJJLI, i);
            parcel.writeInt(this.LLILLL ? 1 : 0);
        }
    }

    public PushProvisioningActivityStarter(TokenizeGooglePayFragment tokenizeGooglePayFragment, Args args) {
        super(tokenizeGooglePayFragment, PushProvisioningActivity.class, args);
    }
}
