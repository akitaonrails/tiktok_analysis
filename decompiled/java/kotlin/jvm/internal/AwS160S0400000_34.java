package kotlin.jvm.internal;

import X.C09AY;
import X.C20338614i8;
import X.C2188811AlT;
import X.C2191641Aq2;
import X.C2218431Bs9;
import X.C2218461BsC;
import X.C2218471BsD;
import X.C2222001Bxu;
import X.C2222081By2;
import X.InterfaceC2191651Aq3;
import X.RunnableC2191761AqE;
import android.database.Cursor;
import android.os.SystemClock;
import com.bytedance.applog.priority.PriorityHttpResponse;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class AwS160S0400000_34 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS160S0400000_34 awS160S0400000_34) {
        Set<OnMessageListener> set = (Set) awS160S0400000_34.l0;
        IMessage iMessage = (IMessage) awS160S0400000_34.l1;
        C2222001Bxu c2222001Bxu = (C2222001Bxu) awS160S0400000_34.l2;
        List list = (List) awS160S0400000_34.l3;
        for (OnMessageListener onMessageListener : set) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            onMessageListener.onMessage(iMessage);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            C2222081By2 c2222081By2 = c2222001Bxu.LJIJJLI;
            if (c2222081By2 == null) {
                c2222081By2 = null;
            }
            if (jElapsedRealtime2 >= c2222081By2.LIZ()) {
                list.add(onMessageListener.getClass().getSimpleName());
                if (C20338614i8.LIZ) {
                    MessageMonitor messageMonitorLIZIZ = c2222001Bxu.LIZ.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("a message has timeout!!! ");
                    sbLIZ.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    sbLIZ.append("ms, method: ");
                    sbLIZ.append(iMessage.getMethodName());
                    sbLIZ.append(", from: ");
                    sbLIZ.append(onMessageListener.getClass());
                    messageMonitorLIZIZ.log("MessageDispatchDelegate", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS160S0400000_34 r8) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS160S0400000_34.invoke$1(kotlin.jvm.internal.AwS160S0400000_34):java.lang.Object");
    }

    public static final Object invoke$2(AwS160S0400000_34 awS160S0400000_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((RunnableC2191761AqE) awS160S0400000_34.l0);
        sbLIZ.append(' ');
        sbLIZ.append((InterfaceC2191651Aq3) awS160S0400000_34.l1);
        sbLIZ.append(" upload ");
        sbLIZ.append(((HashMap) awS160S0400000_34.l2).size());
        sbLIZ.append(" events failed for response: ");
        sbLIZ.append((PriorityHttpResponse) awS160S0400000_34.l3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS160S0400000_34(RunnableC2191761AqE runnableC2191761AqE, RunnableC2191761AqE runnableC2191761AqE2, InterfaceC2191651Aq3 interfaceC2191651Aq3, HashMap<C2191641Aq2, JSONObject> map, PriorityHttpResponse priorityHttpResponse) {
        super(0);
        this.$t = priorityHttpResponse;
        this.l0 = runnableC2191761AqE;
        this.l1 = runnableC2191761AqE2;
        this.l2 = interfaceC2191651Aq3;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0400000_34(C2218431Bs9 c2218431Bs9, Cursor cursor, C2218461BsC c2218461BsC, C2218471BsD c2218471BsD, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2218431Bs9;
        this.l1 = cursor;
        this.l2 = c2218461BsC;
        this.l3 = c2218471BsD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS160S0400000_34(Set set, Set<OnMessageListener> set2, IMessage iMessage, C2222001Bxu c2222001Bxu, List<String> list) {
        super(0);
        this.$t = list;
        this.l0 = set;
        this.l1 = set2;
        this.l2 = iMessage;
        this.l3 = c2222001Bxu;
    }
}
