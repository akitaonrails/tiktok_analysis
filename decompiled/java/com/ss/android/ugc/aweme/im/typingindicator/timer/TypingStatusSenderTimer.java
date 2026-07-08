package com.ss.android.ugc.aweme.im.typingindicator.timer;

import X.C01GW;
import X.C054G;
import X.C0PEM;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C878700YdY;
import com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusSenderTimer;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class TypingStatusSenderTimer implements ITypingStatusSenderTimer {
    public static final TypingStatusSenderTimer LIZIZ = new TypingStatusSenderTimer();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(268));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(267));
    public static final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final Map<String, Long> LJFF = new LinkedHashMap();

    public static final class Service implements ITypingStatusSenderTimer {
        public final /* synthetic */ TypingStatusSenderTimer LIZIZ = TypingStatusSenderTimer.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusSenderTimer
        public final void LIZ(String str) {
            this.LIZIZ.LIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusSenderTimer
        public final void LIZIZ(String str) {
            this.LIZIZ.LIZIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusSenderTimer
    public final void LIZ(String str) {
        if (ChatRoomAdaptiveRequestManager.LIZ.LJLJLJ()) {
            return;
        }
        C23250099c.LIZLLL(LJ, null, null, new C878700YdY(str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusSenderTimer
    public final void LIZIZ(String str) {
        LJFF.put(str, 0L);
    }
}
