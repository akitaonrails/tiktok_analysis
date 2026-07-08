package com.bytedance.android.livesdkapi.session;

import X.C0IIR;
import X.C20441214yg;
import X.C2188811AlT;
import X.C521760KdC;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new C521760KdC(4);
    public JSONObject params;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Event(Parcel parcel) {
        this.params = new JSONObject();
        try {
            this.params = new JSONObject(parcel.readString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            this.params = new JSONObject();
        }
    }

    public final void LIZIZ(String str) {
        LIZ("status_msg", str, this.params);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C786410Ut5.J3(this.params));
    }

    public Event(String str, int i, C0IIR c0iir) {
        this.params = new JSONObject();
        if (!str.startsWith("ttlive_")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZ("service", str, this.params);
        LIZ("timestamp", String.valueOf(SystemClock.elapsedRealtime()), this.params);
        LIZ("event_module", "enter_room", this.params);
        LIZ("status_code", String.valueOf(i), this.params);
        LIZ("event_type", c0iir.getType(), this.params);
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("Event", e.getMessage());
        }
    }
}
