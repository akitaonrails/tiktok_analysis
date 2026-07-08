package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class SessionInfo {
    public final transient String LIZ;
    public transient int LIZIZ;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("show_session")
    public final SessionShowInfo showSession;

    public static SessionInfo LIZ(SessionInfo sessionInfo, SessionShowInfo sessionShowInfo, int i) {
        String str;
        int i2;
        String str2 = null;
        if ((i & 1) != 0) {
            str = sessionInfo.sessionId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            sessionShowInfo = sessionInfo.showSession;
        }
        if ((i & 4) != 0) {
            str2 = sessionInfo.LIZ;
        }
        if ((i & 8) != 0) {
            i2 = sessionInfo.LIZIZ;
        } else {
            i2 = 0;
        }
        sessionInfo.getClass();
        return new SessionInfo(str, sessionShowInfo, str2, i2);
    }

    public SessionInfo(String str, SessionShowInfo sessionShowInfo, String str2, int i) {
        this.sessionId = str;
        this.showSession = sessionShowInfo;
        this.LIZ = str2;
        this.LIZIZ = i;
    }
}
