package com.ss.android.ugc.aweme.im.service.analytics;

import X.C06Q7;
import X.C09JN;
import X.C0I0B;
import X.C0PEM;
import X.C0V15;
import X.C0Z7V;
import X.C1668706g9;
import X.C1906580ziK;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C314201Js;
import X.C451130HmZ;
import X.C786410Ut5;
import X.C789620UyG;
import X.C830490Whz;
import X.C869590Y9l;
import X.C886400Ypy;
import X.C903690Zcl;
import X.C903700Zcm;
import X.C903720Zco;
import X.C903740Zcq;
import X.C903750Zcr;
import X.C903760Zcs;
import X.EnumC903710Zcn;
import X.InterfaceC903730Zcp;
import android.os.Looper;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatPerfLogger implements IIMChatPerfLogger {
    public static String LIZJ;
    public static EnumC903710Zcn LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static int LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static final IMChatPerfLogger LIZIZ = new IMChatPerfLogger();
    public static final C789620UyG LJIIIIZZ = new C789620UyG();

    public static final class Service implements IIMChatPerfLogger {
        public final /* synthetic */ IMChatPerfLogger LIZIZ = IMChatPerfLogger.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LIZ() {
            this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LIZJ(SessionInfo sessionInfo, List<? extends C869590Y9l> list, long j, int i, List<? extends RecyclerView.ViewHolder> list2) {
            this.LIZIZ.LIZJ(sessionInfo, list, j, i, list2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LIZLLL() {
            this.LIZIZ.LIZLLL();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJFF() {
            this.LIZIZ.LJFF();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJI() {
            this.LIZIZ.LJI();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJIIIIZZ(String str) {
            this.LIZIZ.LJIIIIZZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJIIIZ() {
            this.LIZIZ.LJIIIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJIIJ() {
            this.LIZIZ.LJIIJ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJIIJJI() {
            this.LIZIZ.LJIIJJI();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJIIL() {
            this.LIZIZ.LJIIL();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJIILIIL() {
            this.LIZIZ.LJIILIIL();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LIZIZ() {
            this.LIZIZ.getClass();
            IMChatPerfLogger.LJI = true;
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final long LJII() {
            this.LIZIZ.getClass();
            return IMChatPerfLogger.LJ;
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final boolean LJIILJJIL() {
            this.LIZIZ.getClass();
            return IMChatPerfLogger.LJI;
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJ(long j) {
            this.LIZIZ.getClass();
            IMChatPerfLogger.LJFF = j;
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
        public final void LJIILL(boolean z) {
            this.LIZIZ.getClass();
            IMChatPerfLogger.LJII = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LIZIZ() {
        LJI = true;
    }

    static {
        final C903700Zcm c903700Zcm = new C903700Zcm();
        final C903750Zcr c903750Zcr = new C903750Zcr();
        C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.05O3
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMChatPerfLogger@ec48.initSubscribe$1");
                c903700Zcm.invoke(Boolean.valueOf(((C606810Nr5) obj).LIZIZ));
                C1C7U.LIZIZ("IMChatPerfLogger@ec48.initSubscribe$1");
            }
        });
        C1906580ziK.LIZJ().LJIIIIZZ().LJLLLLLL(new C09JN() { // from class: X.0MzK
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("IMChatPerfLogger@ec48.initSubscribe$2");
                c903750Zcr.invoke();
                C1C7U.LIZIZ("IMChatPerfLogger@ec48.initSubscribe$2");
            }
        });
    }

    public static String LJIILLIIL() {
        if (TextUtils.isEmpty(LIZJ)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ);
        sbLIZ.append('_');
        EnumC903710Zcn enumC903710Zcn = LIZLLL;
        sbLIZ.append(enumC903710Zcn != null ? enumC903710Zcn.LL : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LIZ() {
        if (LJ <= 0) {
            return;
        }
        LJIIZILJ();
        IIMChatFunnelAnalytics.LIZ.getClass();
        IIMChatFunnelAnalytics value = C903720Zco.LIZIZ.getValue();
        if (value != null) {
            value.LIZIZ("end_df_loading", C0I0B.LJFF.LIZIZ());
        }
        LJ = 0L;
        LIZJ = null;
        LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJFF() {
        IMInfraService.LIZ.getClass();
        IMInfraService iMInfraServiceLIZ = C451130HmZ.LIZ();
        if (iMInfraServiceLIZ != null) {
            iMInfraServiceLIZ.stopFpsMonitor("chat_room_keyboard");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJIIJJI() {
        C0V15 c0v15 = new C0V15();
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            c0v15.invoke();
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C314201Js(c0v15, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJIIL() {
        IMInfraService.LIZ.getClass();
        IMInfraService iMInfraServiceLIZ = C451130HmZ.LIZ();
        if (iMInfraServiceLIZ != null) {
            iMInfraServiceLIZ.LIZJ("chat_room_keyboard");
        }
    }

    public static void LJIIZILJ() {
        String strLJIILLIIL = LJIILLIIL();
        if (!a0.LJJJIL(strLJIILLIIL)) {
            IMInfraService.LIZ.getClass();
            IMInfraService iMInfraServiceLIZ = C451130HmZ.LIZ();
            if (iMInfraServiceLIZ != null) {
                iMInfraServiceLIZ.stopFpsMonitor(strLJIILLIIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LIZLLL() {
        LJIIZILJ();
        LIZLLL = EnumC903710Zcn.LLILLL;
        String strLJIILLIIL = LJIILLIIL();
        IMInfraService.LIZ.getClass();
        IMInfraService iMInfraServiceLIZ = C451130HmZ.LIZ();
        if (iMInfraServiceLIZ != null) {
            iMInfraServiceLIZ.LIZJ(strLJIILLIIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJI() {
        C903760Zcs.LIZ = System.currentTimeMillis();
        LJIIIZ = 2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJIIIZ() {
        C903760Zcs.LIZ = System.currentTimeMillis();
        LJIIIZ = (LJIIJ || LJIIJJI) ? LJIIJJI ? 1 : 2 : 0;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJIIJ() {
        C903760Zcs.LIZ = System.currentTimeMillis();
        LJIIIZ = 2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJIILIIL() {
        C903760Zcs.LIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final long LJII() {
        return LJ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final boolean LJIILJJIL() {
        return LJI;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJ(long j) {
        LJFF = j;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJIIIIZZ(String str) {
        LJIIZILJ();
        LIZLLL = EnumC903710Zcn.LLILLJJLI;
        LIZJ = str;
        long jCurrentTimeMillis = C903760Zcs.LIZ;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        LJ = jCurrentTimeMillis;
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null) {
            C0Z7V c0z7vLJIILJJIL = iIMBusinessChatService.LJIILJJIL();
            if (c0z7vLJIILJJIL != null) {
                c0z7vLJIILJJIL.LJFF(System.currentTimeMillis());
            }
            C0Z7V c0z7vLJIILJJIL2 = iIMBusinessChatService.LJIILJJIL();
            if (c0z7vLJIILJJIL2 != null) {
                c0z7vLJIILJJIL2.LIZ(LJ);
            }
        }
        String strLJIILLIIL = LJIILLIIL();
        IMInfraService.LIZ.getClass();
        IMInfraService iMInfraServiceLIZ = C451130HmZ.LIZ();
        if (iMInfraServiceLIZ != null) {
            iMInfraServiceLIZ.LIZJ(strLJIILLIIL);
        }
        IMResourceLoggerService.LIZ.getClass();
        IMResourceLoggerService value = C886400Ypy.LIZIZ.getValue();
        if (value != null) {
            value.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LJIILL(boolean z) {
        LJII = z;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger
    public final void LIZJ(SessionInfo sessionInfo, List<? extends C869590Y9l> list, long j, int i, List<? extends RecyclerView.ViewHolder> list2) {
        int i2;
        String strLIZJ;
        String str;
        Boolean boolValueOf;
        boolean z;
        String str2;
        boolean z2;
        LJIIZILJ();
        if (LJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis - LJ;
            IIMChatFunnelAnalytics.LIZ.getClass();
            IIMChatFunnelAnalytics value = C903720Zco.LIZIZ.getValue();
            if (value != null) {
                value.LIZIZ("end_success", C0I0B.LJFF.LIZIZ());
            }
            if (!sessionInfo.isChatroomAnalyticsBlocked()) {
                IIMChatRoomAnalytics.LIZ.getClass();
                IIMChatRoomAnalytics iIMChatRoomAnalyticsLIZ = C06Q7.LIZ();
                if (iIMChatRoomAnalyticsLIZ != null) {
                    int size = list.size();
                    if (sessionInfo.getMsgIdFromPush() != 0) {
                        if (!list.isEmpty()) {
                            Iterator<? extends C869590Y9l> it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().getMsgId() == sessionInfo.getMsgIdFromPush()) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            boolValueOf = Boolean.valueOf(z2);
                        } else {
                            z2 = false;
                            boolValueOf = Boolean.valueOf(z2);
                        }
                    } else if (sessionInfo.getMsgIdFromInAppPush() != 0) {
                        if (!list.isEmpty()) {
                            Iterator<? extends C869590Y9l> it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (it3.next().getMsgId() == sessionInfo.getMsgIdFromInAppPush()) {
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                            boolValueOf = Boolean.valueOf(z);
                        } else {
                            z = false;
                            boolValueOf = Boolean.valueOf(z);
                        }
                    } else {
                        boolValueOf = null;
                    }
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                        str2 = "1";
                    } else if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str2 = "-1";
                    }
                    i2 = 1;
                    iIMChatRoomAnalyticsLIZ.LIZIZ(j2, sessionInfo, size, j, i, list2, str2, LJI, LJII, C0I0B.LJFF.LIZIZ());
                } else {
                    i2 = 1;
                }
                InterfaceC903730Zcp.LIZ.getClass();
                InterfaceC903730Zcp value2 = C903740Zcq.LIZIZ.getValue();
                if (value2 != null) {
                    value2.LIZ();
                }
                if (Intrinsics.LJFF(sessionInfo.getEnterFromForMob(), "outer_push")) {
                    C830490Whz c830490Whz = new C830490Whz();
                    c830490Whz.put("duration", String.valueOf(jCurrentTimeMillis - LJFF));
                    IIMChatRoomAnalytics.LIZ.getClass();
                    IIMChatRoomAnalytics iIMChatRoomAnalyticsLIZ2 = C06Q7.LIZ();
                    if (iIMChatRoomAnalyticsLIZ2 != null) {
                        strLIZJ = iIMChatRoomAnalyticsLIZ2.LIZJ(sessionInfo);
                    } else {
                        strLIZJ = null;
                    }
                    c830490Whz.put("chat_type", strLIZJ);
                    int i3 = LJIIIZ;
                    if (i3 != 0) {
                        if (i3 != i2) {
                            str = "hot";
                        } else {
                            str = "warm";
                        }
                    } else {
                        str = "cold";
                    }
                    c830490Whz.put("start_type", str);
                    C0I0B.LJFF.LIZIZ();
                    C20684815ws.LJIILLIIL("out_push_to_chat_latency", c830490Whz);
                }
            }
        }
        IIMClickOutPushAnalytics.LIZ.getClass();
        IIMClickOutPushAnalytics value3 = C903690Zcl.LIZIZ.getValue();
        if (value3 != null) {
            value3.LIZJ(sessionInfo, list);
        }
        IMResourceLoggerService.LIZ.getClass();
        IMResourceLoggerService value4 = C886400Ypy.LIZIZ.getValue();
        if (value4 != null) {
            value4.LJ();
        }
        LIZJ = null;
        LIZLLL = null;
        LJ = 0L;
        LJI = false;
        LJII = false;
    }
}
