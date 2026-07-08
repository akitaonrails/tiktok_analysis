package com.ss.android.ugc.aweme.account.login.trustedfriends;

import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C04TD;
import X.C0PEM;
import X.C19316610hg;
import X.C19316810hi;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C238400w2;
import X.C452501pT;
import X.C848760XRi;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.IRecoveryStatusPollingService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class RecoveryStatusPollingService implements IRecoveryStatusPollingService {
    public AnonymousClass0956 LIZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public boolean LIZLLL = true;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 107));

    public static IRecoveryStatusPollingService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IRecoveryStatusPollingService.class, false);
        if (objLIZ != null) {
            return (IRecoveryStatusPollingService) objLIZ;
        }
        if (C04TD.LJLIL == null) {
            synchronized (IRecoveryStatusPollingService.class) {
                if (C04TD.LJLIL == null) {
                    C04TD.LJLIL = new RecoveryStatusPollingService();
                }
            }
        }
        return C04TD.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.IRecoveryStatusPollingService
    public final void LIZIZ() {
        this.LIZIZ = C19316810hi.LIZIZ().getString("polling_passport_ticket", "");
        this.LIZJ = C19316810hi.LIZIZ().getString("pseudo_id", "");
        AnonymousClass0956 anonymousClass0956 = this.LIZ;
        if (anonymousClass0956 == null || anonymousClass0956.isCancelled()) {
            LIZ("webview");
        }
    }

    @Override // com.ss.android.ugc.aweme.IRecoveryStatusPollingService
    public final void LIZ(String str) {
        boolean z;
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver((RecoveryStatusPollingService$appLifecycleListener$2$1) this.LJ.getValue());
        if (!C848760XRi.LIZ().isEnabled) {
            C19316810hi.LIZ();
            return;
        }
        int i = C848760XRi.LIZ().pollingIntervalSeconds;
        int i2 = C848760XRi.LIZ().expireTimeMinutes;
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j = C19316810hi.LIZIZ().getLong("start_timestamp_seconds", -1L);
        C013C c013c = new C013C();
        if (c238400w2.element <= ((long) (i2 * 60)) + j) {
            z = true;
        } else {
            z = false;
        }
        c013c.element = z;
        this.LIZIZ = C19316810hi.LIZIZ().getString("polling_passport_ticket", "");
        this.LIZJ = C19316810hi.LIZIZ().getString("pseudo_id", "");
        if (i > 0 && c013c.element && this.LIZIZ.length() > 0 && this.LIZJ.length() > 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("trigger_source", str);
            c2344009Gk.LJIIIIZZ("action", "checkFriendsVerificationStatus");
            C20684815ws.LJIILLIIL("start_account_recovery_status_polling", c2344009Gk.LIZ);
            AnonymousClass0956 anonymousClass0956 = this.LIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LIZ = null;
            this.LIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C19316610hg(this, c238400w2, c013c, j, i2, str, i, null), 3);
            return;
        }
        C19316810hi.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    @Override // com.ss.android.ugc.aweme.IRecoveryStatusPollingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("trigger_source", str);
        c2344009Gk.LJIIIIZZ("action", "checkFriendsVerificationStatus");
        c2344009Gk.LJIIIIZZ("result", str2);
        c2344009Gk.LJIIIIZZ("error_code", str3);
        C20684815ws.LJIILLIIL("account_recovery_status_polling_result", c2344009Gk.LIZ);
    }
}
