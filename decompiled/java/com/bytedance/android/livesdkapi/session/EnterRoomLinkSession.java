package com.bytedance.android.livesdkapi.session;

import X.C08D5;
import X.C0IK5;
import X.C0IL2;
import X.C1127020fQy;
import X.C1161920gLG;
import X.C1C7U;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C501590Jll;
import X.C521760KdC;
import X.C786410Ut5;
import Y.ARunnableS14S0201000_7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.other.LiveChainMonitorExcludeErrorCodesSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class EnterRoomLinkSession implements ILinkSession {
    public List<Event> mBuilders;
    public JSONObject mCommonExtraParams;
    public EnterRoomConfig mEnterRoomConfig;
    public final String mSessionId;
    public List<String> mUniqueKeys;
    public static List<Integer> mExcludeEnterRoomCodes = new ArrayList();
    public static boolean isInited = false;
    public static final Parcelable.Creator<EnterRoomLinkSession> CREATOR = new C521760KdC(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LIZJ() {
        LJFF("event_session_id", this.mSessionId, this.mCommonExtraParams);
        EnterRoomConfig enterRoomConfig = this.mEnterRoomConfig;
        if (enterRoomConfig != null) {
            LJFF("enter_from", enterRoomConfig.mRoomsData.enterFromMerge, this.mCommonExtraParams);
            JSONObject jSONObject = this.mCommonExtraParams;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mEnterRoomConfig.mRoomsData.roomId);
            sbLIZ.append("");
            LJFF("room_id", C2188811AlT.LIZIZ(sbLIZ), jSONObject);
            JSONObject jSONObject2 = this.mCommonExtraParams;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.mEnterRoomConfig.mRoomsData.userId);
            sbLIZ2.append("");
            LJFF("user_id", C2188811AlT.LIZIZ(sbLIZ2), jSONObject2);
            JSONObject jSONObject3 = this.mCommonExtraParams;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.mEnterRoomConfig.mRoomsData.userId);
            sbLIZ3.append("");
            LJFF("anchor_id", C2188811AlT.LIZIZ(sbLIZ3), jSONObject3);
            LJFF("enter_method", this.mEnterRoomConfig.mRoomsData.enterMethod, this.mCommonExtraParams);
            LJFF("action_type", this.mEnterRoomConfig.mRoomsData.enterType, this.mCommonExtraParams);
            LJFF("live_window_mode", this.mEnterRoomConfig.mRoomsData.windowMode, this.mCommonExtraParams);
            LJFF("from_auto_jump", String.valueOf(this.mEnterRoomConfig.mRoomsData.fromAutoJump ? 1 : 0), this.mCommonExtraParams);
        }
        for (Event event : this.mBuilders) {
            Iterator<String> itKeys = event.params.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!this.mCommonExtraParams.has(next) && (!this.mUniqueKeys.contains(next))) {
                    LJFF(next, event.params.optString(next), this.mCommonExtraParams);
                }
            }
        }
        if (this.mBuilders.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.mBuilders.size(); i++) {
                LJFF("event_session_id", this.mSessionId, ((Event) ListProtector.get(this.mBuilders, i)).params);
                try {
                    jSONArray.put(i, ((Event) ListProtector.get(this.mBuilders, i)).params);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJ("EnterRoomLinkSession", e.getMessage());
                }
            }
            try {
                this.mCommonExtraParams.put("event_list", jSONArray);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJ("EnterRoomLinkSession", e2.getMessage());
            }
        }
        return this.mCommonExtraParams;
    }

    public final String LIZLLL() {
        return this.mSessionId;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[PHI: r3
      0x00bf: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v7 java.lang.String), (r3v7 java.lang.String) binds: [B:23:0x00bb, B:8:0x003b, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EnterRoomLinkSession(com.bytedance.android.livesdkapi.session.EnterRoomConfig r22) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.session.EnterRoomLinkSession.<init>(com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public static EnterRoomLinkSession LJ(EnterRoomConfig enterRoomConfig) {
        EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
        C0IL2.LIZ.LIZLLL(enterRoomLinkSession);
        return enterRoomLinkSession;
    }

    public static void LJI(List<Integer> list) {
        if (list != null && list.size() > 0) {
            mExcludeEnterRoomCodes = list;
        }
    }

    public final void LIZIZ(Event event) {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            this.mBuilders.add(event);
            C20441214yg.LIZIZ("ttlive_room_enter_link_monitor", C786410Ut5.J3(event.params));
        }
        int iIntValue = CastIntegerProtector.valueOf(event.params.optString("status_code")).intValue();
        if (iIntValue <= 32768 || !C1127020fQy.LIZ(0.1f, "ttlive_room_enter_link_monitor") || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_room_enter_link_monitor", 0.01d)) {
            return;
        }
        this.mBuilders.add(event);
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null) {
            C08D5.LIZIZ(C0IK5.LIZ(), new ARunnableS14S0201000_7(iIntValue, this, enterRoomLinkSessionLIZ, 6), null, 0L);
        }
    }

    public EnterRoomLinkSession(Parcel parcel) {
        this.mBuilders = new CopyOnWriteArrayList();
        this.mCommonExtraParams = new JSONObject();
        this.mUniqueKeys = Arrays.asList("service", "timestamp", "event_module", "event_type", "status_code", "status_msg", "extra", "parent_id");
        this.mSessionId = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.mBuilders = arrayList;
        parcel.readList(arrayList, Event.class.getClassLoader());
        this.mEnterRoomConfig = (EnterRoomConfig) parcel.readParcelable(EnterRoomConfig.class.getClassLoader());
        try {
            this.mCommonExtraParams = new JSONObject(parcel.readString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mCommonExtraParams = new JSONObject();
        }
        this.mUniqueKeys = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSessionId);
        parcel.writeList(this.mBuilders);
        parcel.writeParcelable(this.mEnterRoomConfig, i);
        try {
            parcel.writeString(C786410Ut5.J3(this.mCommonExtraParams));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("EnterRoomLinkSession", e);
        }
        parcel.writeStringList(this.mUniqueKeys);
    }

    public static void LIZ(EnterRoomLinkSession enterRoomLinkSession, EnterRoomLinkSession enterRoomLinkSession2, int i) {
        boolean zContains;
        String str;
        enterRoomLinkSession.getClass();
        C1C7U.LIZ("EnterRoomLinkSession@fae5.addEvent$1L");
        JSONObject jSONObjectLIZJ = enterRoomLinkSession2.LIZJ();
        if (jSONObjectLIZJ == null) {
            jSONObjectLIZJ = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i), jSONObject);
        if (!isInited) {
            List<Integer> value = LiveChainMonitorExcludeErrorCodesSetting.INSTANCE.getValue();
            if (value != null && value.size() > 0) {
                mExcludeEnterRoomCodes = value;
            }
            isInited = true;
        }
        List<Integer> list = mExcludeEnterRoomCodes;
        if (list != null) {
            zContains = list.contains(Integer.valueOf(i));
        } else {
            zContains = false;
        }
        if (!zContains) {
            str = "ttlive_room_enter_link_monitor";
        } else {
            str = "ttlive_room_enter_link_monitor_error";
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            C20441214yg.LIZIZ("ttlive_room_enter_link_monitor", C786410Ut5.J3(jSONObjectLIZJ));
        }
        C501590Jll.LJFF(jSONObjectLIZJ);
        C1CC2.LJI(str, jSONObject, null, jSONObjectLIZJ);
        C1C7U.LIZIZ("EnterRoomLinkSession@fae5.addEvent$1L");
    }

    public static void LJFF(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("EnterRoomLinkSession", e.getMessage());
        }
    }
}
