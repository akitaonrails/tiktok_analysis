package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.C0CLW;
import X.C0CO3;
import X.C0CPW;
import X.C1BVK;
import X.C313130CPf;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import Y.ACallableS412S0100000_4;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchShareSettingRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchShareSettingRequest";
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
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        if (!C0CPW.LIZ.getBoolean("key_has_setting", false)) {
            return C0CO3.NORMAL;
        }
        try {
            if (C0CLW.LIZIZ.LIZ.getDisableDelayFetchShareSettingRequest().booleanValue()) {
                return C0CO3.NORMAL;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C0CO3.IDLE;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C313130CPf c313130CPfLIZIZ = C313130CPf.LIZIZ();
        c313130CPfLIZIZ.getClass();
        C1BVK.LIZIZ().LIZ(c313130CPfLIZIZ.LLILLJJLI, new ACallableS412S0100000_4(c313130CPfLIZIZ, 0), 0);
    }
}
