package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public final class SessionShowInfo {
    public transient int LIZ;
    public transient int LIZIZ;
    public transient int LIZJ;
    public transient int LIZLLL;
    public final transient int LJ;
    public transient SessionClickInfo LJFF;
    public transient String LJI;
    public transient Long LJII;

    @C09CT("click_session")
    public final SessionClickInfo clickSession;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int id;

    @C09CT("last_click_session")
    public SessionClickInfo lastClickSession;

    @C09CT("open_page_session")
    public final SessionOpenPageInfo openPageSession;

    @C09CT("open_search_detail_session")
    public final SessionDetailOpenInfo openSearchDetailSession;

    @C09CT("other_click_session")
    public final SessionClickInfo otherClickSession;

    @C09CT("play_session")
    public final SessionPlayInfo playSession;

    @C09CT("time_stamp")
    public final long timeStamp;

    public static SessionShowInfo LIZ(SessionShowInfo sessionShowInfo, SessionPlayInfo sessionPlayInfo, SessionClickInfo sessionClickInfo, SessionClickInfo sessionClickInfo2, SessionOpenPageInfo sessionOpenPageInfo, SessionDetailOpenInfo sessionDetailOpenInfo, SessionClickInfo sessionClickInfo3, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        SessionClickInfo sessionClickInfo4 = sessionClickInfo3;
        SessionDetailOpenInfo sessionDetailOpenInfo2 = sessionDetailOpenInfo;
        SessionOpenPageInfo sessionOpenPageInfo2 = sessionOpenPageInfo;
        SessionClickInfo sessionClickInfo5 = sessionClickInfo2;
        SessionClickInfo sessionClickInfo6 = sessionClickInfo;
        SessionPlayInfo sessionPlayInfo2 = sessionPlayInfo;
        int i7 = 0;
        if ((i & 1) != 0) {
            i2 = sessionShowInfo.id;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            j = sessionShowInfo.timeStamp;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            sessionPlayInfo2 = sessionShowInfo.playSession;
        }
        if ((i & 8) != 0) {
            sessionClickInfo6 = sessionShowInfo.clickSession;
        }
        if ((i & 16) != 0) {
            sessionClickInfo5 = sessionShowInfo.otherClickSession;
        }
        if ((i & 32) != 0) {
            sessionOpenPageInfo2 = sessionShowInfo.openPageSession;
        }
        if ((i & 64) != 0) {
            sessionDetailOpenInfo2 = sessionShowInfo.openSearchDetailSession;
        }
        if ((i & 128) != 0) {
            sessionClickInfo4 = sessionShowInfo.lastClickSession;
        }
        if ((i & 256) != 0) {
            i3 = sessionShowInfo.LIZ;
        } else {
            i3 = 0;
        }
        if ((i & 512) != 0) {
            i4 = sessionShowInfo.LIZIZ;
        } else {
            i4 = 0;
        }
        if ((i & 1024) != 0) {
            i5 = sessionShowInfo.LIZJ;
        } else {
            i5 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i6 = sessionShowInfo.LIZLLL;
        } else {
            i6 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i7 = sessionShowInfo.LJ;
        }
        sessionShowInfo.getClass();
        return new SessionShowInfo(i2, j, sessionPlayInfo2, sessionClickInfo6, sessionClickInfo5, sessionOpenPageInfo2, sessionDetailOpenInfo2, sessionClickInfo4, i3, i4, i5, i6, i7);
    }

    public SessionShowInfo(int i, long j, SessionPlayInfo sessionPlayInfo, SessionClickInfo sessionClickInfo, SessionClickInfo sessionClickInfo2, SessionOpenPageInfo sessionOpenPageInfo, SessionDetailOpenInfo sessionDetailOpenInfo, SessionClickInfo sessionClickInfo3, int i2, int i3, int i4, int i5, int i6) {
        this.id = i;
        this.timeStamp = j;
        this.playSession = sessionPlayInfo;
        this.clickSession = sessionClickInfo;
        this.otherClickSession = sessionClickInfo2;
        this.openPageSession = sessionOpenPageInfo;
        this.openSearchDetailSession = sessionDetailOpenInfo;
        this.lastClickSession = sessionClickInfo3;
        this.LIZ = i2;
        this.LIZIZ = i3;
        this.LIZJ = i4;
        this.LIZLLL = i5;
        this.LJ = i6;
    }
}
