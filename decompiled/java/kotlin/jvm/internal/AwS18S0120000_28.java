package kotlin.jvm.internal;

import X.AbstractC1899090zWF;
import X.C01U6;
import X.C09AY;
import X.C1619720sFe;
import X.C1893680zNW;
import X.C1894310zOX;
import X.C1894320zOY;
import X.C1899080zWE;
import X.EnumC1899140zWK;
import X.InterfaceC1897260zTI;
import com.bytedance.touchpoint.api.model.StartCondition;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class AwS18S0120000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS18S0120000_28 awS18S0120000_28) {
        String str;
        C1899080zWE c1899080zWE = (C1899080zWE) awS18S0120000_28.l0;
        c1899080zWE.LJII = EnumC1899140zWK.START;
        c1899080zWE.LJIIIIZZ = true;
        c1899080zWE.LIZIZ.getClass();
        AbstractC1899090zWF abstractC1899090zWF = ((C1899080zWE) awS18S0120000_28.l0).LIZ;
        abstractC1899090zWF.LLILLJJLI = true;
        abstractC1899090zWF.LJII();
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager = abstractC1899090zWF.LLILZLL;
        if (baseTaskEventTimerPendantManager != null) {
            baseTaskEventTimerPendantManager.LJJLIIIJ(abstractC1899090zWF.LL);
        }
        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
        TaskEvent taskEvent = ((C1899080zWE) awS18S0120000_28.l0).LIZIZ;
        boolean z = awS18S0120000_28.z1;
        c1893680zNW.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_id", taskEvent.id);
            String str2 = taskEvent.taskEventKey;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("event_key", str2);
            jSONObject.put("event_type", taskEvent.userActionType);
            jSONObject.put("event_name", taskEvent.taskEventName);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
            if (z) {
                str3 = "restore";
            } else {
                StartCondition startCondition = taskEvent.startCondition;
                if (startCondition != null && (str = startCondition.startMode) != null) {
                    str3 = str;
                }
            }
            jSONObject.put("start_mode", str3);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("campaign_task_event_start_monitor", jSONObject);
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent2 = ((C1899080zWE) awS18S0120000_28.l0).LIZIZ;
        boolean z2 = awS18S0120000_28.z1;
        c1894320zOY.getClass();
        C01U6.LIZJ(new AwS18S0120000_28(taskEvent2, z2, 1));
        if (awS18S0120000_28.z2) {
            ((C1899080zWE) awS18S0120000_28.l0).getClass();
        }
        C1899080zWE c1899080zWE2 = (C1899080zWE) awS18S0120000_28.l0;
        if (c1899080zWE2.LJ > 0) {
            c1899080zWE2.LIZJ.storeLong(C1894310zOX.LIZ(c1899080zWE2.LJIIL(c1899080zWE2.LIZIZ)), ((C1899080zWE) awS18S0120000_28.l0).LJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS18S0120000_28 awS18S0120000_28) {
        String str;
        String str2;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            HashMap map = new HashMap();
            TaskEvent taskEvent = (TaskEvent) awS18S0120000_28.l0;
            boolean z = awS18S0120000_28.z1;
            boolean z2 = awS18S0120000_28.z2;
            map.put("event_id", String.valueOf(taskEvent.id));
            String str3 = taskEvent.taskEventKey;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            map.put("event_key", str3);
            map.put("event_type", taskEvent.userActionType);
            map.put("event_name", taskEvent.taskEventName);
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            if (z2) {
                str4 = "restore";
            } else {
                StartCondition startCondition = taskEvent.startCondition;
                if (startCondition != null && (str2 = startCondition.startMode) != null) {
                    str4 = str2;
                }
            }
            map.put("start_mode", str4);
            interfaceC1897260zTILIZIZ.LIZ("campaign_task_event_start", map);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0120000_28(TaskEvent taskEvent, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = taskEvent;
        this.z1 = true;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0120000_28(C1899080zWE c1899080zWE, boolean z, boolean z2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1899080zWE;
        this.z1 = z;
        this.z2 = z2;
    }
}
