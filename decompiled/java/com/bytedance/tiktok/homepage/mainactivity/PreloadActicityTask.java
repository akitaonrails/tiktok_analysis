package com.bytedance.tiktok.homepage.mainactivity;

import X.C0CCZ;
import X.C0CLW;
import X.C0VZ0;
import X.C316660CbA;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class PreloadActicityTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadActicityTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
        if (iMainService != null) {
            iMainService.isInActivity();
        }
        try {
            C0CLW.LIZIZ.LIZ.getAwemeActivitySetting();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
