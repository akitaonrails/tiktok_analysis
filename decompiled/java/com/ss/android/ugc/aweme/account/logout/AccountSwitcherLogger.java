package com.ss.android.ugc.aweme.account.logout;

import X.C1BV6;
import com.ss.android.ugc.aweme.IAccountSwitcherLogger;

/* JADX INFO: loaded from: classes35.dex */
public final class AccountSwitcherLogger implements IAccountSwitcherLogger {
    public static long LIZ;
    public static long LIZIZ;

    static {
        new C1BV6();
        LIZ = -1L;
        LIZIZ = -1L;
    }

    @Override // com.ss.android.ugc.aweme.IAccountSwitcherLogger
    public final void LIZ() {
        C1BV6.LIZ("restart", "false");
    }

    @Override // com.ss.android.ugc.aweme.IAccountSwitcherLogger
    public final void LIZIZ() {
        C1BV6.LIZ("notify_business", "false");
    }

    @Override // com.ss.android.ugc.aweme.IAccountSwitcherLogger
    public final void LIZJ() {
        C1BV6.LIZ("update_session", "false");
    }

    @Override // com.ss.android.ugc.aweme.IAccountSwitcherLogger
    public final void LJ() {
        C1BV6.LIZ("update_profile_user", "false");
    }

    @Override // com.ss.android.ugc.aweme.IAccountSwitcherLogger
    public final void reset() {
        LIZ = -1L;
        LIZIZ = -1L;
    }

    @Override // com.ss.android.ugc.aweme.IAccountSwitcherLogger
    public final void start() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZ = jCurrentTimeMillis;
        LIZIZ = jCurrentTimeMillis;
    }

    @Override // com.ss.android.ugc.aweme.IAccountSwitcherLogger
    public final void LIZLLL(boolean z) {
        String str;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        C1BV6.LIZ("feed_reload", str);
        reset();
    }
}
