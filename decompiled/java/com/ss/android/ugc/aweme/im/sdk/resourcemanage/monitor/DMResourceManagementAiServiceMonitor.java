package com.ss.android.ugc.aweme.im.sdk.resourcemanage.monitor;

import X.C01GW;
import X.C0Z38;
import X.C20535115Wz;
import X.C289120BUw;
import X.C452501pT;
import X.C563400M7u;
import X.C823170WQx;
import X.C893470Z3h;
import X.InterfaceC1664506fT;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class DMResourceManagementAiServiceMonitor implements IDMResourceManagementAIServiceMonitor {
    public static InterfaceC1664506fT LIZIZ;
    public static final DMResourceManagementAiServiceMonitor LIZ = new DMResourceManagementAiServiceMonitor();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(204));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(205));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(199));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(201));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(203));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(208));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(207));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(209));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(202));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(206));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(200));

    public static final class DMResourceManagementAiServiceMonitorImpl implements IDMResourceManagementAIServiceMonitor {
        public final /* synthetic */ DMResourceManagementAiServiceMonitor LIZ = DMResourceManagementAiServiceMonitor.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor
        public final void LIZ(long j, String str) {
            this.LIZ.LIZ(j, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor
        public final void LIZIZ(String str) {
            this.LIZ.LIZIZ(str);
        }
    }

    public static ConcurrentHashMap LIZJ() {
        return (ConcurrentHashMap) LJIIJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor
    public final void LIZIZ(String str) {
        C893470Z3h c893470Z3h;
        if (!C20535115Wz.LIZIZ()) {
            return;
        }
        if (((C823170WQx) LJIIIZ.getValue()).contains(str)) {
            InterfaceC1664506fT interfaceC1664506fT = LIZIZ;
            if (interfaceC1664506fT != null) {
                interfaceC1664506fT.LIZ("enter_chat_predict_with_ai_v1", str);
            }
            InterfaceC1664506fT interfaceC1664506fT2 = LIZIZ;
            if (interfaceC1664506fT2 != null) {
                interfaceC1664506fT2.LIZIZ("enter_chat_predict_with_ai_v1", str, C0Z38.MODE_FIRST_ONLY, ((C823170WQx) LJIIIIZZ.getValue()).contains(str));
            }
        }
        if (C289120BUw.LIZ() && (c893470Z3h = (C893470Z3h) LIZJ().get(Integer.valueOf(((C563400M7u) LJIIJ.getValue()).LIZJ()))) != null && ((C823170WQx) c893470Z3h.LIZIZ.getValue()).contains(str)) {
            ((C823170WQx) c893470Z3h.LIZJ.getValue()).add(str);
        }
    }

    public static void LIZLLL(DMResourceManagementAiServiceMonitor dMResourceManagementAiServiceMonitor, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        dMResourceManagementAiServiceMonitor.getClass();
        if (C20535115Wz.LIZ()) {
            C01GW c01gw = LJI;
            if (((ConcurrentHashMap) c01gw.getValue()).get(str) == null) {
                ((ConcurrentHashMap) c01gw.getValue()).put(str, Long.valueOf(jCurrentTimeMillis));
            }
        }
        if (C20535115Wz.LIZIZ()) {
            ((C823170WQx) LJIIIZ.getValue()).add(str);
        }
        if (C289120BUw.LIZ()) {
            for (C893470Z3h c893470Z3h : LIZJ().values()) {
                if (((C823170WQx) c893470Z3h.LIZIZ.getValue()).contains(str)) {
                    ((C823170WQx) c893470Z3h.LJ.getValue()).add(str);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor
    public final void LIZ(long j, String str) {
        if (!C20535115Wz.LIZ()) {
            return;
        }
        C01GW c01gw = LJFF;
        if (((ConcurrentHashMap) c01gw.getValue()).get(str) != null) {
            return;
        }
        ((ConcurrentHashMap) c01gw.getValue()).put(str, Long.valueOf(j));
        if (C289120BUw.LIZ()) {
            C01GW c01gw2 = LJIIL;
            if (!((C823170WQx) c01gw2.getValue()).contains(str)) {
                C893470Z3h c893470Z3h = (C893470Z3h) LIZJ().get(Integer.valueOf(((C563400M7u) LJIIJ.getValue()).LIZJ()));
                if (c893470Z3h != null) {
                    ((C823170WQx) c893470Z3h.LIZIZ.getValue()).add(str);
                }
                ((C823170WQx) c01gw2.getValue()).add(str);
            }
        }
    }
}
