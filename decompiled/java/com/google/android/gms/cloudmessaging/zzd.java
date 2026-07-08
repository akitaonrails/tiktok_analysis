package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.cloudmessaging.zzd;

/* JADX INFO: loaded from: classes14.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new Parcelable.Creator<zzd>() { // from class: X.0Vty
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzd createFromParcel(Parcel parcel) {
            return new zzd(parcel.readStrongBinder());
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ zzd[] newArray(int i) {
            return new zzd[i];
        }
    };
    public final Messenger LL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        Messenger messenger = this.LL;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    public zzd(IBinder iBinder) {
        this.LL = new Messenger(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.LL;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((zzd) obj).LL;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.LL;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
