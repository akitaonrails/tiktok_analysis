package com.ss.android.ugc.aweme.legoImp.task;

import X.C070Q;
import X.C0B2Y;
import X.C0CBW;
import X.C0CCZ;
import X.C0VZ0;
import X.C1492110ovp;
import X.C1BCF;
import X.C2206251BWl;
import X.C2206261BWm;
import X.C2206291BWp;
import X.C581900Ms0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@C1BCF(distinctId = 111, taskType = "preload")
public final class DeeplinkPrefetchTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DeeplinkPrefetchTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        boolean zBooleanValue;
        if (C0B2Y.LIZ && !C581900Ms0.LJI) {
            return EnumC799870VZh.BOOT_FINISH;
        }
        if (C070Q.LIZ()) {
            C0CBW c0cbw = C0CBW.LIZ;
            zBooleanValue = C0CBW.LIZIZ() && C070Q.LIZ();
        } else {
            C2206291BWp.LIZ.getClass();
            zBooleanValue = ((Boolean) C2206291BWp.LJIIZILJ.getValue()).booleanValue();
        }
        Object objLIZJ = C1492110ovp.LIZJ("DeeplinkPrefetch_bootfinish", new C2206251BWl(), new C2206261BWm(), zBooleanValue);
        if (objLIZJ != null) {
            return (EnumC799870VZh) objLIZJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        DeeplinkPrefetchImpl.LIZLLL().LIZJ(context);
    }
}
