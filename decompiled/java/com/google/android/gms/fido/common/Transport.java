package com.google.android.gms.fido.common;

import X.C08FF;
import X.C19844212ka;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes31.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable");

    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator() { // from class: X.12kb
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Transport.fromString(parcel.readString());
            } catch (C19844212ka e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new Transport[i];
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

    public static Transport fromString(String str) throws Exception {
        for (Transport transport : values()) {
            if (str.equals(transport.zzb)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        final String strJ4 = C786410Ut5.j4("Transport %s not supported", new Object[]{str});
        throw new Exception(strJ4) { // from class: X.12ka
        };
    }

    public static List<Transport> parseTransports(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = JSONArrayProtectorUtils.getString(jSONArray, i);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(fromString(string));
                } catch (C19844212ka e) {
                    TryCatchGuardChecker.doCheck(e);
                    "Ignoring unrecognized transport ".concat(string);
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public static Transport valueOf(String str) {
        return (Transport) C08FF.LIZ(Transport.class, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    Transport(String str) {
        this.zzb = str;
    }
}
