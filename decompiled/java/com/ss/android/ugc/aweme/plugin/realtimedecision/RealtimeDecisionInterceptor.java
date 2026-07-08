package com.ss.android.ugc.aweme.plugin.realtimedecision;

import X.C01GW;
import X.C09CT;
import X.C0XK4;
import X.C10RN;
import X.C11NZ;
import X.C11S5;
import X.C13LP;
import X.C2188811AlT;
import X.C452501pT;
import X.C639040P4s;
import X.C786410Ut5;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC20685415wy;
import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class RealtimeDecisionInterceptor implements InterfaceC20685415wy {
    public boolean LJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(301));
    public final List<NewUserEvents.NewUserEvent> LIZJ = Collections.synchronizedList(new ArrayList());
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS109S0100000_9 LJFF = new ARunnableS109S0100000_9(this, 108);

    public interface NewUserEvents {
        @InterfaceC1501170pAR("tiktok/v1/new_user/events/")
        C11NZ<NewUserEventsResponse> reportNewUserEvents(@InterfaceC1485405rg NewUserEventsRequest newUserEventsRequest);

        /* JADX INFO: loaded from: classes.dex */
        public static final class NewUserEventsResponse extends BaseResponse {

            @C09CT("biz_status_code")
            public final Integer bizStatusCode;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NewUserEventsResponse) && Intrinsics.LJFF(this.bizStatusCode, ((NewUserEventsResponse) obj).bizStatusCode);
            }

            public final int hashCode() {
                Integer num = this.bizStatusCode;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NewUserEventsResponse(bizStatusCode=");
                sbLIZ.append(this.bizStatusCode);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public NewUserEventsResponse(Integer num) {
                this.bizStatusCode = num;
            }
        }

        public static final class NewUserEventsRequest {

            @C09CT("event_list")
            public final List<NewUserEvent> eventList;

            @C09CT("session_count")
            public final Integer sessionCount;

            public NewUserEventsRequest(Integer num, List<NewUserEvent> list) {
                this.sessionCount = num;
                this.eventList = list;
            }
        }

        public static final class NewUserEvent {

            @C09CT("event_name")
            public final String eventName;

            @C09CT("params")
            public final String params;

            @C09CT("timestamp")
            public final Integer timeStamp;

            public NewUserEvent(String str, Integer num, String str2) {
                this.eventName = str;
                this.timeStamp = num;
                this.params = str2;
            }
        }
    }

    public final void LIZIZ(NewUserEvents.NewUserEvent newUserEvent) {
        C10RN.LIZ.getClass();
        List<String> list = C10RN.LIZJ;
        if (list != null && C13LP.LJJJJ(newUserEvent.eventName, list)) {
            this.LIZJ.add(newUserEvent);
            if (!this.LJ && ((long) C10RN.LJ) * 1000 > 0) {
                C786410Ut5.LJJZZIII(this.LIZLLL, this.LJFF);
                this.LJ = true;
            }
        }
        List<String> list2 = C10RN.LIZLLL;
        if (list2 != null && C13LP.LJJJJ(newUserEvent.eventName, list2)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(newUserEvent);
            LIZJ(new NewUserEvents.NewUserEventsRequest(Integer.valueOf(((Number) this.LIZIZ.getValue()).intValue()), arrayList));
        }
    }

    public final void LIZJ(NewUserEvents.NewUserEventsRequest newUserEventsRequest) {
        ((NewUserEvents) this.LIZ.getValue()).reportNewUserEvents(newUserEventsRequest).LJL(C11S5.LIZ()).LJLIIL(1L).LIZIZ(new C639040P4s(1));
    }

    @Override // X.InterfaceC20685415wy
    public void onEvent(String str) {
        if (str == null) {
            return;
        }
        C10RN c10rn = C10RN.LIZ;
        c10rn.getClass();
        List<String> list = C10RN.LIZJ;
        if (list == null || !list.contains(str)) {
            c10rn.getClass();
            List<String> list2 = C10RN.LIZLLL;
            if (list2 == null || !list2.contains(str)) {
                return;
            }
        }
        LIZIZ(new NewUserEvents.NewUserEvent(str, Integer.valueOf(C0XK4.LIZ()), null));
    }

    @Override // X.InterfaceC20685415wy
    public final void LIZ(String str, Map<String, String> map) {
        List<String> list;
        JSONObject jSONObject;
        if (str == null) {
            return;
        }
        C10RN.LIZ.getClass();
        List<String> list2 = C10RN.LIZJ;
        if ((list2 != null && list2.contains(str)) || ((list = C10RN.LIZLLL) != null && list.contains(str))) {
            if (map != null) {
                jSONObject = new JSONObject(map);
            } else {
                jSONObject = null;
            }
            LIZIZ(new NewUserEvents.NewUserEvent(str, Integer.valueOf(C0XK4.LIZ()), String.valueOf(jSONObject)));
        }
    }

    @Override // X.InterfaceC20685415wy
    public final void onEvent(String str, JSONObject jSONObject) {
        List<String> list;
        if (str == null) {
            return;
        }
        C10RN.LIZ.getClass();
        List<String> list2 = C10RN.LIZJ;
        if ((list2 != null && list2.contains(str)) || ((list = C10RN.LIZLLL) != null && list.contains(str))) {
            LIZIZ(new NewUserEvents.NewUserEvent(str, Integer.valueOf(C0XK4.LIZ()), String.valueOf(jSONObject)));
        }
    }
}
