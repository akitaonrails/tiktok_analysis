package com.bytedance.lobby.internal;

import X.C19GS;
import X.C1ATR;
import X.C1AWO;
import X.C21614219iO;
import X.C2188811AlT;
import X.C2193741AtQ;
import X.C851480Xak;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public class LobbyInvisibleActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWsgJi0xMWslJzs2OiHELIOSstJWEfJycuMAY9Piw/IC0/LQQvPSYlITE1";
    public boolean LL;
    public boolean LLILLJJLI;
    public C1AWO LLILLL;
    public int LLILZ;

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1AWO c1awo = this.LLILLL;
        if (c1awo != null) {
            c1awo.onDestroy();
        }
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.LL || this.LLILLJJLI) {
            this.LL = true;
        } else {
            finish();
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.j8);
        Intent intent = getIntent();
        Bundle extras = null;
        try {
            stringExtra = intent.getStringExtra("provider_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLILZ = intent.getIntExtra("action_type", 0);
        C1AWO c1awoLIZ = C1ATR.LIZIZ().LIZ(stringExtra);
        this.LLILLL = c1awoLIZ;
        if (c1awoLIZ == null) {
            C21614219iO c21614219iOLIZ = C21614219iO.LIZ();
            int i = this.LLILZ;
            C2193741AtQ c2193741AtQ = new C2193741AtQ(stringExtra, i);
            c2193741AtQ.LIZ = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No provider found for ");
            sbLIZ.append(stringExtra);
            c2193741AtQ.LIZIZ = new C851480Xak(1, C2188811AlT.LIZIZ(sbLIZ), "before_goto_URL");
            c21614219iOLIZ.LIZIZ(i, new AuthResult(c2193741AtQ), stringExtra);
            finish();
            return;
        }
        LobbyViewModel.vQ2(this).LL.observe(this, new Observer<AuthResult>() { // from class: X.1A65
            @Override // androidx.lifecycle.Observer
            public final void onChanged(AuthResult authResult) {
                C21614219iO c21614219iOLIZ2 = C21614219iO.LIZ();
                String str = stringExtra;
                c21614219iOLIZ2.LIZIZ(this.LLILLJJLI.LLILZ, authResult, str);
                this.LLILLJJLI.finish();
            }
        });
        this.LLILLJJLI = true;
        int i2 = this.LLILZ;
        if (i2 != 1) {
            if (i2 != 2) {
                C21614219iO c21614219iOLIZ2 = C21614219iO.LIZ();
                int i3 = this.LLILZ;
                C2193741AtQ c2193741AtQ2 = new C2193741AtQ(stringExtra, i3);
                c2193741AtQ2.LIZ = false;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unknown action type: ");
                sbLIZ2.append(this.LLILZ);
                c2193741AtQ2.LIZIZ = new C851480Xak(1, C2188811AlT.LIZIZ(sbLIZ2));
                c21614219iOLIZ2.LIZIZ(i3, new AuthResult(c2193741AtQ2), stringExtra);
                finish();
                return;
            }
            C1AWO c1awo = this.LLILLL;
            try {
                extras = intent.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            c1awo.mQ(this, extras);
            return;
        }
        C1AWO c1awo2 = this.LLILLL;
        try {
            extras = intent.getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        c1awo2.n20(this, extras);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C1AWO c1awo = this.LLILLL;
        if (c1awo != null) {
            c1awo.ID0(this, i, i2, intent);
        }
    }
}
