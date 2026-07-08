package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.AnonymousClass0956;
import X.C054G;
import X.C06Q6;
import X.C0I0B;
import X.C0PEM;
import X.C0YSQ;
import X.C13LP;
import X.C1906580ziK;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C830490Whz;
import X.C869590Y9l;
import X.C892080Yz8;
import X.C892140YzE;
import X.C892150YzF;
import X.C907030Zi9;
import X.C907050ZiB;
import X.InterfaceC1493505sz;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.experiment.IMClickPushXSecConfig;
import com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMClickOutPushAnalytics implements IIMClickOutPushAnalytics {
    public static AnonymousClass0956 LIZJ;
    public static final IMClickOutPushAnalytics LIZIZ = new IMClickOutPushAnalytics();
    public static final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final C830490Whz<Long, Long> LJ = new C830490Whz<>();
    public static final Set<Long> LJFF = new LinkedHashSet();

    public static final class Service implements IIMClickOutPushAnalytics {
        public final /* synthetic */ IMClickOutPushAnalytics LIZIZ = IMClickOutPushAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
        public final void LIZ() {
            this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
        public final void LIZIZ(SessionInfo sessionInfo, List list) {
            this.LIZIZ.LIZIZ(sessionInfo, list);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
        public final void LIZJ(SessionInfo sessionInfo, List<? extends C869590Y9l> list) {
            this.LIZIZ.LIZJ(sessionInfo, list);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
        public final void LIZLLL(SessionInfo sessionInfo, List<? extends C869590Y9l> list) {
            this.LIZIZ.LIZLLL(sessionInfo, list);
        }
    }

    public static String LJI(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
    public final void LIZ() {
        LJ.clear();
        LJFF.clear();
        AnonymousClass0956 anonymousClass0956 = LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZJ = null;
        C23118094a.LJ(LIZLLL.LL);
    }

    public static long LJ(long j, Long l) {
        if (l != null && l.longValue() >= 0) {
            return j - l.longValue();
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
    public final void LIZIZ(SessionInfo sessionInfo, List list) {
        if (!C1906580ziK.LJI()) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZJ = null;
        Set<Long> set = LJFF;
        if (set.contains(Long.valueOf(sessionInfo.getMsgIdFromPush()))) {
            return;
        }
        set.add(Long.valueOf(sessionInfo.getMsgIdFromPush()));
        LJFF(this, "leave", sessionInfo, list);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
    public final void LIZJ(SessionInfo sessionInfo, List<? extends C869590Y9l> list) {
        LJ.put(Long.valueOf(sessionInfo.getMsgIdFromPush()), Long.valueOf(System.currentTimeMillis()));
        LJFF(this, "enter", sessionInfo, list);
        if (((IMClickPushXSecConfig) C892150YzF.LIZIZ.getValue()).isEnabled()) {
            LIZJ = C23250099c.LIZLLL(LIZLLL, null, null, new C892140YzE(sessionInfo, list, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics
    public final void LIZLLL(SessionInfo sessionInfo, List<? extends C869590Y9l> list) {
        LJFF(this, "leave", sessionInfo, list);
        AnonymousClass0956 anonymousClass0956 = LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZJ = null;
    }

    public static void LJFF(IMClickOutPushAnalytics iMClickOutPushAnalytics, String str, SessionInfo sessionInfo, List list) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        C06Q6 c06q6 = C06Q6.LIZ;
        iMClickOutPushAnalytics.getClass();
        if (Intrinsics.LJFF(sessionInfo.getEnterFromForMob(), "outer_push")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List listLLIIII = C13LP.LLIIII(list);
            C907030Zi9.LJFF.getClass();
            C23250099c.LIZLLL(LIZLLL, null, null, new C892080Yz8(sessionInfo, str, listLLIIII, C907050ZiB.LIZ().LIZ(sessionInfo, true).LIZLLL(), C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId()), jCurrentTimeMillis, c06q6, interfaceC1493505szLIZIZ, null), 3);
        }
    }
}
