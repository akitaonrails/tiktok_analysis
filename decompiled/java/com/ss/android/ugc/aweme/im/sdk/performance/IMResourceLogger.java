package com.ss.android.ugc.aweme.im.sdk.performance;

import X.C0I0B;
import X.C0PEM;
import X.C1512920pTO;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1493505sz;
import com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService;

/* JADX INFO: loaded from: classes15.dex */
public final class IMResourceLogger implements IMResourceLoggerService {
    public static final IMResourceLogger LIZIZ = new IMResourceLogger();

    public static final class Service implements IMResourceLoggerService {
        public final /* synthetic */ IMResourceLogger LIZIZ = IMResourceLogger.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
        public final void LIZ() {
            this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
        public final void LIZIZ() {
            this.LIZIZ.LIZIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
        public final void LIZJ() {
            this.LIZIZ.LIZJ();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
        public final void LIZLLL() {
            this.LIZIZ.LIZLLL();
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
        public final void LJ() {
            this.LIZIZ.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
    public final void LIZ() {
        LJFF(this, "click_inbox_tab");
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
    public final void LIZIZ() {
        LJFF(this, "enter_chat");
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
    public final void LIZJ() {
        LJFF(this, "inbox_hide");
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
    public final void LIZLLL() {
        LJFF(this, "inbox_show");
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService
    public final void LJ() {
        LJFF(this, "chat_rendered");
    }

    public static void LJFF(IMResourceLogger iMResourceLogger, String str) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        iMResourceLogger.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1512920pTO(interfaceC1493505szLIZIZ, str, null), 3);
    }
}
