package com.bytedance.lobby.line;

import X.C0WZX;
import X.C1701330uNH;
import X.C19EG;
import X.C1AWO;
import X.C2193741AtQ;
import X.C2204961BRm;
import X.C2277811EDr;
import X.C814380Vx6;
import X.C834830Woz;
import X.C851190XaH;
import X.C851210XaJ;
import X.C851480Xak;
import X.EnumC851200XaI;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tpsw.api.line.ILineService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes14.dex */
public class LineAuth extends LineProvider<AuthResult> implements C1AWO {
    public final ILineService LLILZ;
    public LobbyViewModel LLILZIL;

    @Override // X.C1AWO
    public final /* synthetic */ void KY0(int i) {
    }

    @Override // X.C1AWO
    public final /* synthetic */ void onDestroy() {
    }

    public final void vQ2() {
        Bundle bundle = new Bundle();
        bundle.putInt("line_response_ordinal", EnumC851200XaI.INTERNAL_ERROR.ordinal());
        C2193741AtQ c2193741AtQ = new C2193741AtQ("line", 1);
        c2193741AtQ.LIZ = false;
        c2193741AtQ.LIZIZ = new C851480Xak(3, "Line login is blocked");
        c2193741AtQ.LJIIIZ = bundle;
        AuthResult authResult = new AuthResult(c2193741AtQ);
        LobbyViewModel lobbyViewModel = this.LLILZIL;
        if (lobbyViewModel != null) {
            lobbyViewModel.xQ2(authResult);
        }
    }

    public LineAuth(C2277811EDr c2277811EDr) {
        Object service;
        super(LobbyCore.getApplication(), c2277811EDr);
        try {
            service = ServiceManager.get().getService(ILineService.class, false, false, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            service = null;
        }
        this.LLILZ = (ILineService) service;
    }

    @Override // X.C1AWO
    public final void mQ(C19EG c19eg, Bundle bundle) {
        C834830Woz.LIZ(this.LLILZIL, this.LLILLL.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1AWO
    public final void n20(C19EG c19eg, Bundle bundle) {
        this.LLILZIL = (LobbyViewModel) ViewModelProviders.of(c19eg).get(LobbyViewModel.class);
        if (!isAvailable()) {
            C834830Woz.LIZIZ(this.LLILZIL, "line", 1);
            return;
        }
        try {
            ILineService iLineService = this.LLILZ;
            if (iLineService == null) {
                C834830Woz.LIZIZ(this.LLILZIL, this.LLILLL.LIZIZ, 1);
                return;
            }
            C814380Vx6 c814380Vx6LIZ = iLineService.LIZ(c19eg, this.LLILLL.LIZJ, TokenCert.with("bpea-line_androidsdk_2005"));
            if (c814380Vx6LIZ.LIZ == 0) {
                Intent intent = (Intent) c814380Vx6LIZ.LIZJ;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, c19eg);
                C2204961BRm.LLJJJJJIL(1, intent, c19eg, new C0WZX("dzBzEgAjS8/YVFkiQFyIaW1ZwJwhoSJ/oo0ThBE94Hqw", null));
                return;
            }
            vQ2();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2193741AtQ c2193741AtQ = new C2193741AtQ(this.LLILLL.LIZIZ, 1);
            c2193741AtQ.LIZ = false;
            c2193741AtQ.LIZIZ = new C851480Xak(6, th.getMessage());
            AuthResult authResult = new AuthResult(c2193741AtQ);
            LobbyViewModel lobbyViewModel = this.LLILZIL;
            if (lobbyViewModel != null) {
                lobbyViewModel.xQ2(authResult);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1AWO
    public final void ID0(C19EG c19eg, int i, int i2, Intent intent) {
        ILineService iLineService = this.LLILZ;
        if (iLineService == null) {
            C834830Woz.LIZIZ(this.LLILZIL, this.LLILLL.LIZIZ, 1);
            return;
        }
        C814380Vx6 c814380Vx6LIZIZ = iLineService.LIZIZ(intent, TokenCert.with("bpea-line_androidsdk_2006"));
        C851210XaJ c851210XaJ = (C851210XaJ) c814380Vx6LIZIZ.LIZJ;
        if (c814380Vx6LIZIZ.LIZ == 0 && c851210XaJ != null) {
            int i3 = C851190XaH.LIZ[c851210XaJ.LIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("line_response_ordinal", c851210XaJ.LIZ.ordinal());
                    C2193741AtQ c2193741AtQ = new C2193741AtQ("line", 1);
                    c2193741AtQ.LIZ = false;
                    c2193741AtQ.LIZIZ = new C851480Xak(3, c851210XaJ.LIZLLL);
                    c2193741AtQ.LJIIIZ = bundle;
                    AuthResult authResult = new AuthResult(c2193741AtQ);
                    LobbyViewModel lobbyViewModel = this.LLILZIL;
                    if (lobbyViewModel != null) {
                        lobbyViewModel.xQ2(authResult);
                        return;
                    }
                    return;
                }
                C2193741AtQ c2193741AtQ2 = new C2193741AtQ("line", 1);
                c2193741AtQ2.LIZ = false;
                c2193741AtQ2.LIZIZ = new C851480Xak(4, "Line login cancelled by user");
                AuthResult authResult2 = new AuthResult(c2193741AtQ2);
                LobbyViewModel lobbyViewModel2 = this.LLILZIL;
                if (lobbyViewModel2 == null) {
                    return;
                }
                lobbyViewModel2.xQ2(authResult2);
                return;
            }
            if (c851210XaJ.LJFF || c851210XaJ.LJI) {
                return;
            }
            C2193741AtQ c2193741AtQ3 = new C2193741AtQ("line", 1);
            c2193741AtQ3.LIZ = true;
            c2193741AtQ3.LJI = c851210XaJ.LIZJ;
            c2193741AtQ3.LJ = c851210XaJ.LIZIZ;
            c2193741AtQ3.LIZLLL = c851210XaJ.LJ;
            AuthResult authResult3 = new AuthResult(c2193741AtQ3);
            LobbyViewModel lobbyViewModel3 = this.LLILZIL;
            if (lobbyViewModel3 == null) {
                return;
            }
            lobbyViewModel3.xQ2(authResult3);
            return;
        }
        vQ2();
    }
}
