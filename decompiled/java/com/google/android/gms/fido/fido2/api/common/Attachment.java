package com.google.android.gms.fido.fido2.api.common;

import X.C08FF;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.fido.fido2.api.common.Attachment;

/* JADX INFO: loaded from: classes31.dex */
public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<Attachment> CREATOR = new Parcelable.Creator() { // from class: X.12kQ
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Attachment.fromString(parcel.readString());
            } catch (C19843112kP e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Attachment[i];
        }
    };
    public final String zzb;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    public static Attachment fromString(final String str) throws Exception {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.zzb)) {
                return attachment;
            }
        }
        throw new Exception(str) { // from class: X.12kP
            {
                super(C786410Ut5.j4("Attachment %s not supported", new Object[]{str}));
            }
        };
    }

    public static Attachment valueOf(String str) {
        return (Attachment) C08FF.LIZ(Attachment.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    Attachment(String str) {
        this.zzb = str;
    }
}
