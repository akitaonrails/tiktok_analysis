package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CLW;
import X.C0CO3;
import X.C0TKA;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class AbSdkCommonRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AbSdkCommonRequest";
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
        try {
            if (C0CLW.LIZIZ.LIZ.getDisableDelayAbSdkRequest().booleanValue()) {
                C0TKA.LIZ();
                JSONObject jSONObject = C0TKA.LIZIZ.LIZJ;
                return (jSONObject == null || jSONObject.length() <= 0) ? C0CO3.NORMAL : C0CO3.IDLE;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C0CO3.IDLE;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (C0TKA.LJ) {
            C0TKA.LJ();
        }
    }
}
