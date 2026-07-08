package com.google.firebase.messaging;

import X.C812970Vup;
import X.C817940W6u;
import X.C830490Whz;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new Parcelable.Creator<RemoteMessage>() { // from class: X.0Vwy
        @Override // android.os.Parcelable.Creator
        public final RemoteMessage createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            Bundle bundleLIZIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                if (((char) i) != 2) {
                    C0W6J.LJJII(i, parcel);
                } else {
                    bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new RemoteMessage(bundleLIZIZ);
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteMessage[] newArray(int i) {
            return new RemoteMessage[i];
        }
    };
    public final Bundle LL;
    public Map<String, String> data;
    public C812970Vup notification;

    public final Map<String, String> LJLZ() {
        Object obj;
        if (this.data == null) {
            Bundle bundle = this.LL;
            C830490Whz c830490Whz = new C830490Whz();
            for (String str : bundle.keySet()) {
                try {
                    obj = bundle.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                if ((obj instanceof String) && !str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                    c830490Whz.put(str, obj);
                }
            }
            this.data = c830490Whz;
        }
        return this.data;
    }

    public RemoteMessage(Bundle bundle) {
        this.LL = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LIZJ(parcel, 2, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
    }
}
