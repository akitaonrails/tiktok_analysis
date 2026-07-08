package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import X.C1AF0;
import X.C799710VYr;
import X.C800330VaR;
import X.EnumC799980VZs;
import X.InterfaceC799850VZf;
import android.app.Activity;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SplashBgInflate implements InterfaceC799850VZf {
    @Override // X.InterfaceC799850VZf
    public final Class<? extends Activity> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC799850VZf
    public final int LIZJ() {
        return R.style.xm;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SplashBgInflate";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C799710VYr.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final EnumC799980VZs triggerType() {
        return EnumC799980VZs.INFLATE;
    }

    @Override // X.InterfaceC799850VZf
    public final void LJII(Activity activity, Context context) {
        try {
            C800330VaR.LIZIZ(context, R.drawable.splash_bg_normal);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
