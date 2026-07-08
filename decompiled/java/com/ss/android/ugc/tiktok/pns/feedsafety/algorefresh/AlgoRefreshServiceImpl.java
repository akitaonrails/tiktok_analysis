package com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh;

import X.C01GW;
import X.C0X9S;
import X.C13LE;
import X.C1593970ra7;
import X.C19719912Dl;
import X.C297270Bkz;
import X.C452501pT;
import X.C696580RUa;
import X.EnumC1567080qsk;
import X.InterfaceC594300NSq;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingBean;
import com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh.AlgoRefreshResponse;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes25.dex */
public final class AlgoRefreshServiceImpl implements IAlgoRefreshService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(752));

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(AlgoRefreshAssem.class);
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService
    public final void LIZ() {
        C0X9S<AlgoRefreshResponse> c0x9sStopAlgoRefresh;
        AlgoRefreshApi algoRefreshApi = (AlgoRefreshApi) this.LIZ.getValue();
        if (algoRefreshApi == null || (c0x9sStopAlgoRefresh = algoRefreshApi.stopAlgoRefresh(1)) == null) {
            return;
        }
        c0x9sStopAlgoRefresh.enqueue(new InterfaceC594300NSq<AlgoRefreshResponse>() { // from class: X.0ra8
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<AlgoRefreshResponse> c0x9s, Throwable th) {
                C1440005kM.LIZ(new C1567020qse(false));
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<AlgoRefreshResponse> c0x9s, C0X52<AlgoRefreshResponse> c0x52) {
                if (c0x52.LIZJ()) {
                    AlgoRefreshResponse algoRefreshResponse = c0x52.LIZIZ;
                    if (algoRefreshResponse != null && algoRefreshResponse.statusCode == 0) {
                        C1440005kM.LIZ(new C1588880rRu("algo_refresh", false));
                        C1440005kM.LIZ(new C1567020qse(true));
                        return;
                    } else {
                        C1440005kM.LIZ(new C1567020qse(false));
                        return;
                    }
                }
                C1440005kM.LIZ(new C1567020qse(false));
            }
        });
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService
    public final void LIZIZ() {
        C1593970ra7.LIZ.getClass();
        C1593970ra7.LIZLLL(false);
        EnumC1567080qsk enumC1567080qsk = EnumC1567080qsk.DEFAULT;
        C696580RUa.LIZ.getClass();
        if (C696580RUa.LIZ() != 0) {
            C1593970ra7.LJ(enumC1567080qsk);
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService
    public final boolean LIZJ() {
        C1593970ra7.LIZ.getClass();
        C696580RUa.LIZ.getClass();
        int iLIZ = C696580RUa.LIZ();
        return (iLIZ == 1 || iLIZ == 3) && LJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService
    public final boolean LJ() {
        C1593970ra7.LIZ.getClass();
        return C1593970ra7.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService
    public final void LJFF(DigitalWellbeingBean digitalWellbeingBean) {
        boolean zBooleanValue;
        Boolean bool;
        C1593970ra7 c1593970ra7 = C1593970ra7.LIZ;
        if (!(digitalWellbeingBean instanceof DigitalWellbeingBean)) {
            digitalWellbeingBean = null;
        }
        c1593970ra7.getClass();
        if (!C297270Bkz.LIZ()) {
            if (digitalWellbeingBean != null && (bool = digitalWellbeingBean.algoRefreshStatus) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1593970ra7.LIZLLL(zBooleanValue);
        }
    }
}
