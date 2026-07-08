package com.google.android.gms.fido.u2f.api.common;

import X.C08FF;
import X.C19842012kE;
import X.C817940W6u;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* JADX INFO: loaded from: classes31.dex */
public class ChannelIdValue extends AbstractSafeParcelable {
    public final ChannelIdValueType zza;
    public final String zzb;
    public final String zzc;
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new Parcelable.Creator() { // from class: X.12kC
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String strLJII = null;
            int iLJIJJLI = 0;
            String strLJII2 = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            strLJII2 = C0W6J.LJII(i, parcel);
                        }
                    } else {
                        strLJII = C0W6J.LJII(i, parcel);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new ChannelIdValue(iLJIJJLI, strLJII, strLJII2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ChannelIdValue[i];
        }
    };
    public static final ChannelIdValue ABSENT = new ChannelIdValue();
    public static final ChannelIdValue UNAVAILABLE = new ChannelIdValue("unavailable");
    public static final ChannelIdValue UNUSED = new ChannelIdValue("unused");

    public final int hashCode() {
        int i;
        int iHashCode;
        int iHashCode2 = this.zza.hashCode() + 31;
        int iOrdinal = this.zza.ordinal();
        if (iOrdinal == 1) {
            i = iHashCode2 * 31;
            iHashCode = this.zzb.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i = iHashCode2 * 31;
            iHashCode = this.zzc.hashCode();
        }
        return i + iHashCode;
    }

    public ChannelIdValue() {
        this.zza = ChannelIdValueType.ABSENT;
    }

    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new Parcelable.Creator() { // from class: X.12kD
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i = parcel.readInt();
                try {
                    for (ChannelIdValue.ChannelIdValueType channelIdValueType : ChannelIdValue.ChannelIdValueType.values()) {
                        if (i == channelIdValueType.zzb) {
                            return channelIdValueType;
                        }
                    }
                    throw new C19842012kE(i);
                } catch (C19842012kE e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return new ChannelIdValue.ChannelIdValueType[i];
            }
        };
        public final int zzb;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static ChannelIdValueType valueOf(String str) {
            return (ChannelIdValueType) C08FF.LIZ(ChannelIdValueType.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.zzb);
        }

        ChannelIdValueType(int i) {
            this.zzb = i;
        }
    }

    public ChannelIdValue(String str) {
        this.zzb = str;
        this.zza = ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.zza.equals(channelIdValue.zza)) {
            return false;
        }
        int iOrdinal = this.zza.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return false;
            }
            return this.zzc.equals(channelIdValue.zzc);
        }
        return this.zzb.equals(channelIdValue.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 2, this.zza.zzb);
        C817940W6u.LJIJ(parcel, 3, this.zzb, false);
        C817940W6u.LJIJ(parcel, 4, this.zzc, false);
        C817940W6u.LJJI(iLJJ, parcel);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
                if (i == channelIdValueType.zzb) {
                    this.zza = channelIdValueType;
                    this.zzb = str;
                    this.zzc = str2;
                    return;
                }
            }
            throw new C19842012kE(i);
        } catch (C19842012kE e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
