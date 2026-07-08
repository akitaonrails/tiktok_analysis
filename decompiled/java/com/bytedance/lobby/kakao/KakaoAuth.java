package com.bytedance.lobby.kakao;

import X.C19EG;
import X.C1AWO;
import X.C2193741AtQ;
import X.C2277811EDr;
import X.C834830Woz;
import X.C851480Xak;
import Y.AObjectS116S0000000_13;
import Y.AObjectS356S0100000_13;
import Y.AObjectS529S0100000_13;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.tpsw.api.kakao.IKakaoService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes14.dex */
public class KakaoAuth extends KakaoProvider<AuthResult> implements C1AWO {
    public static final /* synthetic */ int LLILZLL = 0;
    public final IKakaoService LLILZ;
    public LobbyViewModel LLILZIL;

    @Override // X.C1AWO
    public final void ID0(C19EG c19eg, int i, int i2, Intent intent) {
    }

    @Override // X.C1AWO
    public final /* synthetic */ void onDestroy() {
    }

    public KakaoAuth(C2277811EDr c2277811EDr) {
        Object service;
        super(c2277811EDr);
        try {
            service = ServiceManager.get().getService(IKakaoService.class, false, false, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            service = null;
        }
        IKakaoService iKakaoService = (IKakaoService) service;
        this.LLILZ = iKakaoService;
        if (iKakaoService != null) {
            iKakaoService.LIZ(LobbyCore.getApplication(), this.LLILLL.LIZJ);
        }
    }

    @Override // X.C1AWO
    public final void KY0(int i) {
        if (i == 2 || i == 3) {
            IKakaoService iKakaoService = this.LLILZ;
            if (iKakaoService == null) {
                C834830Woz.LIZIZ(this.LLILZIL, this.LLILLL.LIZIZ, i);
            } else {
                iKakaoService.LIZLLL(new AObjectS116S0000000_13(1));
            }
        }
    }

    public final void vQ2(C851480Xak c851480Xak) {
        C2193741AtQ c2193741AtQ = new C2193741AtQ(this.LLILLL.LIZIZ, 1);
        c2193741AtQ.LIZ = false;
        c2193741AtQ.LIZIZ = c851480Xak;
        this.LLILZIL.xQ2(new AuthResult(c2193741AtQ));
    }

    @Override // X.C1AWO
    public final void mQ(C19EG c19eg, Bundle bundle) {
        IKakaoService iKakaoService = this.LLILZ;
        if (iKakaoService == null) {
            C834830Woz.LIZIZ(this.LLILZIL, this.LLILLL.LIZIZ, 2);
        } else {
            iKakaoService.LIZLLL(new AObjectS356S0100000_13(this, 5));
        }
    }

    @Override // X.C1AWO
    public final void n20(C19EG c19eg, Bundle bundle) {
        LobbyViewModel lobbyViewModelVQ2 = LobbyViewModel.vQ2(c19eg);
        this.LLILZIL = lobbyViewModelVQ2;
        if (this.LLILZ == null) {
            C834830Woz.LIZIZ(lobbyViewModelVQ2, this.LLILLL.LIZIZ, 1);
            return;
        }
        if (!isAvailable()) {
            C834830Woz.LIZIZ(this.LLILZIL, this.LLILLL.LIZIZ, 1);
            return;
        }
        AObjectS529S0100000_13 aObjectS529S0100000_13 = new AObjectS529S0100000_13(this, 1);
        if (this.LLILZ.LIZJ(c19eg)) {
            this.LLILZ.LIZIZ(TokenCert.with("bpea-kakao_androidsdk_v2_8657"), c19eg, aObjectS529S0100000_13);
        } else {
            this.LLILZ.LJ(TokenCert.with("bpea-kakao_androidsdk_v2_787"), c19eg, aObjectS529S0100000_13);
        }
    }
}
