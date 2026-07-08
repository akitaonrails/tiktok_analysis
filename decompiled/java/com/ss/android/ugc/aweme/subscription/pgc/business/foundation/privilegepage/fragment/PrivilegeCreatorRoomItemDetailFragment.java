package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment;

import X.C0K76;
import X.C0K77;
import X.C0K79;
import X.C0K7D;
import X.C0K7H;
import X.C0K7S;
import X.C511520K4g;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeCreatorRoomItemDetailFragment extends AbsPrivilegeItemDetailFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiLyAmJiEtPSY8JmHELIOSs8OyYlISkpLiojKSIpZykhKSIhLCEnZhU+IDk6JCArLAwhLSQ4Jj0BJyohADs2JQEpPS46JAM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final String bS() {
        return "chatroom";
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final void dS() {
        String str;
        C0K76 c0k76 = C0K76.LIZ;
        C0K79 c0k79CS = cS();
        if (c0k79CS == null || (str = c0k79CS.LLILZLL) == null) {
            str = "";
        }
        c0k76.getClass();
        try {
            C0K77 c0k77LIZ = C0K76.LIZ();
            if (c0k77LIZ != null) {
                c0k77LIZ.ch(this, str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final String getTitle() {
        String strLJII = C511520K4g.LJII(2131849252);
        return strLJII == null ? "" : strLJII;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment
    public final String aS(C0K7H c0k7h) {
        if (!(c0k7h instanceof C0K7D)) {
            return "";
        }
        C0K7D c0k7d = (C0K7D) c0k7h;
        SubInfo subInfo = c0k7d.LIZ.subInfo;
        if (subInfo != null && Intrinsics.LJFF(subInfo.isSubscribing, Boolean.TRUE)) {
            String strLJII = C511520K4g.LJII(2131849251);
            if (strLJII == null) {
                return "";
            }
            return strLJII;
        }
        String strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131849250, C0K7S.LIZ(c0k7d.LIZ.anchorDetail));
        if (strLJIIIIZZ == null) {
            return "";
        }
        return strLJIIIIZZ;
    }
}
