package com.bytedance.ies.im.core.send;

import X.C01GW;
import X.C0Y3I;
import X.C0Y8T;
import X.C0YHX;
import X.C0YMW;
import X.C0YTK;
import X.C0YTZ;
import X.C1761806vA;
import X.C1762406vG;
import X.C1C7U;
import X.C2188811AlT;
import X.C452501pT;
import X.C869590Y9l;
import X.C882400YjW;
import X.C882690Yjz;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageQueue extends BPEAHandler {
    public static final /* synthetic */ int LLILLL = 0;
    public final C0YHX LL;
    public final C01GW LLILLJJLI;

    public MessageQueue(C0YHX c0yhx) {
        super(Looper.getMainLooper());
        this.LL = c0yhx;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(34));
    }

    public final void LJ(C0YTZ c0ytz) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelTimeOut[");
        sbLIZ.append(c0ytz.LJFF);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("MsgSender_MQ");
        removeMessages(c0ytz.LIZ);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("MessageQueue@ae6a.handleMessage");
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMessage[");
        sbLIZ.append(HandlerHook.getMessageObj(message.obj));
        sbLIZ.append(']');
        C882690Yjz.LJIIIZ("MsgSender_MQ", C2188811AlT.LIZIZ(sbLIZ));
        String str = (String) HandlerHook.getMessageObj(message.obj);
        C0YMW c0ymw = C0YMW.newBuilder().LIZ;
        c0ymw.statusMsg = "MQ timeout";
        LJFF(str, true, c0ymw);
        C1C7U.LIZIZ("MessageQueue@ae6a.handleMessage");
    }

    public final void LJII(Map<String, Set<C0YTZ>> map, C0Y8T c0y8t) {
        Set<C0YTZ> set;
        Integer numValueOf;
        synchronized (this) {
            try {
                set = map.get(c0y8t.getConversationId());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyPending[");
        sbLIZ.append(c0y8t.getConversationId());
        sbLIZ.append("]: ");
        Set<C0YTZ> set2 = set;
        if (set2 != null) {
            numValueOf = Integer.valueOf(set2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C882690Yjz.LJIIIZ("MsgSender_MQ", C2188811AlT.LIZIZ(sbLIZ));
        if (set2 != null) {
            for (C0YTZ c0ytz : set2) {
                C1762406vG c1762406vG = c0ytz.LJIJJLI;
                c1762406vG.getClass();
                c1762406vG.LIZ(C1761806vA.LIZ(new Pair("stage", "message_queue"), new Pair("step", "notify_pending"), new Pair("time", c1762406vG.LIZJ())));
                c0ytz.LJI(c0y8t);
            }
        }
    }

    public final void LJIIIIZZ(Map<String, Set<C0YTZ>> map, C0Y8T c0y8t) {
        Set<C0YTZ> setRemove;
        Integer numValueOf;
        synchronized (this) {
            try {
                setRemove = map.remove(c0y8t.getConversationId());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifySend[");
        sbLIZ.append(c0y8t.getConversationId());
        sbLIZ.append("]: ");
        Set<C0YTZ> set = setRemove;
        if (set != null) {
            numValueOf = Integer.valueOf(set.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C882690Yjz.LJIIIZ("MsgSender_MQ", C2188811AlT.LIZIZ(sbLIZ));
        if (set != null) {
            for (C0YTZ c0ytz : set) {
                LJ(c0ytz);
                C1762406vG c1762406vG = c0ytz.LJIJJLI;
                c1762406vG.getClass();
                c1762406vG.LIZ(C1761806vA.LIZ(new Pair("stage", "message_queue"), new Pair("step", "notify_send"), new Pair("time", c1762406vG.LIZJ())));
                c0ytz.LJFF(new C0Y3I("Message queue send OK"), c0y8t);
            }
        }
    }

    public final void LJFF(String str, boolean z, C0YMW c0ymw) {
        Boolean boolValueOf;
        Object objRemove;
        Integer numValueOf;
        C0YMW c0ymw2;
        String strLJIIJ;
        C0Y8T c0y8tLIZ = this.LL.LIZ().LIZ(str);
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dequeue[");
        sbLIZ.append(str);
        sbLIZ.append("], ");
        if (c0y8tLIZ != null) {
            boolValueOf = Boolean.valueOf(c0y8tLIZ.isTemp());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        C882690Yjz.LJIIIZ("MsgSender_MQ", C2188811AlT.LIZIZ(sbLIZ));
        if (c0y8tLIZ == null || (c0y8tLIZ.isTemp() && z)) {
            Map map = (Map) this.LLILLJJLI.getValue();
            synchronized (this) {
                try {
                    objRemove = map.remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("notifyError[");
            sbLIZ2.append(str);
            sbLIZ2.append("]: ");
            Set<C0YTZ> set = (Set) objRemove;
            if (set != null) {
                numValueOf = Integer.valueOf(set.size());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(", ");
            sbLIZ2.append(c0ymw);
            C882690Yjz.LJIIIZ("MsgSender_MQ", C2188811AlT.LIZIZ(sbLIZ2));
            if (set != null) {
                for (C0YTZ c0ytz : set) {
                    LJ(c0ytz);
                    C1762406vG c1762406vG = c0ytz.LJIJJLI;
                    c1762406vG.getClass();
                    c1762406vG.LIZ(C1761806vA.LIZ(new Pair("stage", "message_queue"), new Pair("step", "notify_error"), new Pair("time", c1762406vG.LIZJ())));
                    C0Y3I c0y3i = new C0Y3I("Message queue notifying error");
                    if (c0ymw == null) {
                        c0ymw2 = C0YMW.newBuilder().LIZ;
                        c0ymw2.statusMsg = "UnKnown error";
                    } else {
                        c0ymw2 = c0ymw;
                    }
                    C0Y8T c0y8tLIZ2 = c0ytz.LIZLLL.LIZ(c0ytz.LJFF);
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onConversationError: ");
                    if (c0y8tLIZ2 != null) {
                        strLJIIJ = C0YTZ.LJIIJ(c0y8tLIZ2);
                    } else {
                        strLJIIJ = null;
                    }
                    sbLIZ3.append(strLJIIJ);
                    sbLIZ3.append(", ");
                    sbLIZ3.append(c0ymw2);
                    C882690Yjz.LJFF("MsgSender_Task", C2188811AlT.LIZIZ(sbLIZ3));
                    List<C869590Y9l> list = c0ytz.LJJ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (c0ytz.LJIL == 0 && list != null && !list.isEmpty()) {
                        for (C869590Y9l c869590Y9l : list) {
                            C0YTK c0ytkLIZJ = c0ytz.LIZJ();
                            if (c0ytkLIZJ != null) {
                                c0ytkLIZJ.LIZLLL(c0y8tLIZ2, c869590Y9l);
                            }
                            c869590Y9l.setMsgStatus(3);
                            c869590Y9l.addLocalExt("s:log_id", c0ymw2.toString());
                            linkedHashMap.put(c869590Y9l, c0ymw2);
                            C0YTK c0ytkLIZJ2 = c0ytz.LIZJ();
                            if (c0ytkLIZJ2 != null) {
                                c0ytkLIZJ2.LJII(c0y8tLIZ2, c869590Y9l, c0ymw2);
                            }
                            c0ytz.LIZJ.LJJIZ(c0y3i, c869590Y9l, null, -100001, c0ymw2);
                        }
                    }
                    c0ytz.LJIL = 3;
                    C0YTK c0ytkLIZJ3 = c0ytz.LIZJ();
                    if (c0ytkLIZJ3 != null) {
                        c0ytkLIZJ3.LIZIZ(c0y8tLIZ2, null, linkedHashMap);
                    }
                }
                return;
            }
            return;
        }
        if (c0y8tLIZ.isTemp()) {
            LJII((Map) this.LLILLJJLI.getValue(), c0y8tLIZ);
        } else {
            LJIIIIZZ((Map) this.LLILLJJLI.getValue(), c0y8tLIZ);
        }
    }
}
